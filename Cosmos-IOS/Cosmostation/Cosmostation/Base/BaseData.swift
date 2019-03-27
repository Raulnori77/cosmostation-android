//
//  BaseData.swift
//  Cosmostation
//
//  Created by yongjoo on 07/03/2019.
//  Copyright © 2019 wannabit. All rights reserved.
//

import Foundation
import SQLite
import SwiftKeychainWrapper


final class BaseData : NSObject{
    
    static let instance = BaseData()
    
    var database: Connection!
    
    public override init() {
        super.init();
        if database == nil {
            self.initdb();
        }
    }
    
    
    func initdb() {
        do {
            let documentDirectory = try FileManager.default.url(for: .documentDirectory, in: .userDomainMask, appropriateFor: nil, create: true)
            let fileUrl = documentDirectory.appendingPathComponent("cosmostation").appendingPathExtension("sqlite3")
            let database = try Connection(fileUrl.path)
            self.database = database
            
            let createAccountTable = DB_ACCOUNT.create { (table) in
                table.column(DB_ACCOUNT_ID, primaryKey: true)
                table.column(DB_ACCOUNT_UUID)
                table.column(DB_ACCOUNT_NICKNAME)
                table.column(DB_ACCOUNT_FAVO)
                table.column(DB_ACCOUNT_ADDRESS)
                table.column(DB_ACCOUNT_BASECHAIN)
                table.column(DB_ACCOUNT_HAS_PRIVATE)
                table.column(DB_ACCOUNT_RESOURCE)
                table.column(DB_ACCOUNT_FROM_MNEMONIC)
                table.column(DB_ACCOUNT_PATH)
                table.column(DB_ACCOUNT_IS_VALIDATOR)
                table.column(DB_ACCOUNT_SEQUENCE_NUMBER)
                table.column(DB_ACCOUNT_ACCOUNT_NUMBER)
                table.column(DB_ACCOUNT_FETCH_TIME)
                table.column(DB_ACCOUNT_M_SIZE)
                table.column(DB_ACCOUNT_IMPORT_TIME)
            }
            
//            let createPasswordTable = DB_PASSWORD.create { (table) in
//                table.column(DB_PASSWORD_ID, primaryKey: true)
//                table.column(DB_PASSWORD_RESOURCE)
//            }
            
            let createBalanceTable = DB_BALANCE.create { (table) in
                table.column(DB_BALANCE_ID, primaryKey: true)
                table.column(DB_BALANCE_ACCOUNT_ID)
                table.column(DB_BALANCE_DENOM)
                table.column(DB_BALANCE_AMOUNT)
                table.column(DB_BALANCE_FETCH_TIME)
            }
            
            let createBondingTable = DB_BONDING.create { (table) in
                table.column(DB_BONDING_ID, primaryKey: true)
                table.column(DB_BONDING_ACCOUNT_ID)
                table.column(DB_BONDING_V_Address)
                table.column(DB_BONDING_SHARES)
                table.column(DB_BONDING_FETCH_TIME)
            }
            
            let createUnBondingTable = DB_UNBONDING.create { (table) in
                table.column(DB_UNBONDING_ID, primaryKey: true)
                table.column(DB_UNBONDING_ACCOUNT_ID)
                table.column(DB_UNBONDING_V_Address)
                table.column(DB_UNBONDING_CREATE_HEIGHT)
                table.column(DB_UNBONDING_COMPLETE_TIME)
                table.column(DB_UNBONDING_INITIAL_BALANCE)
                table.column(DB_UNBONDING_BALANCE)
                table.column(DB_UNBONDING_FETCH_TIME)
            }
            
            do {
                try self.database.run(createAccountTable)
//                try self.database.run(createPasswordTable)
                try self.database.run(createBalanceTable)
                try self.database.run(createBondingTable)
                try self.database.run(createUnBondingTable)
                
            } catch {
                if(SHOW_LOG) { print(error) }
            }
            
        } catch {
            if(SHOW_LOG) { print(error) }
        }
    }
    
    
    public func selectAllAccounts() -> Array<Account> {
        var result = Array<Account>()
        do {
            for accountBD in try database.prepare(DB_ACCOUNT) {
                let account = Account(accountBD[DB_ACCOUNT_ID], accountBD[DB_ACCOUNT_UUID], accountBD[DB_ACCOUNT_NICKNAME], accountBD[DB_ACCOUNT_FAVO], accountBD[DB_ACCOUNT_ADDRESS], accountBD[DB_ACCOUNT_BASECHAIN], accountBD[DB_ACCOUNT_HAS_PRIVATE],  accountBD[DB_ACCOUNT_RESOURCE], accountBD[DB_ACCOUNT_FROM_MNEMONIC], accountBD[DB_ACCOUNT_PATH], accountBD[DB_ACCOUNT_IS_VALIDATOR], accountBD[DB_ACCOUNT_SEQUENCE_NUMBER], accountBD[DB_ACCOUNT_ACCOUNT_NUMBER], accountBD[DB_ACCOUNT_FETCH_TIME], accountBD[DB_ACCOUNT_M_SIZE], accountBD[DB_ACCOUNT_IMPORT_TIME]);
                result.append(account);
            }
        } catch {
            if(SHOW_LOG) { print(error) }
        }
        return result;
    }
    
    public func selectAccountById(id: Int64) -> Account? {
        do {
            let query = DB_ACCOUNT.filter(DB_ACCOUNT_ID == id)
            if let accountBD = try database.pluck(query) {
                return Account(accountBD[DB_ACCOUNT_ID], accountBD[DB_ACCOUNT_UUID], accountBD[DB_ACCOUNT_NICKNAME], accountBD[DB_ACCOUNT_FAVO], accountBD[DB_ACCOUNT_ADDRESS], accountBD[DB_ACCOUNT_BASECHAIN], accountBD[DB_ACCOUNT_HAS_PRIVATE],  accountBD[DB_ACCOUNT_RESOURCE], accountBD[DB_ACCOUNT_FROM_MNEMONIC], accountBD[DB_ACCOUNT_PATH], accountBD[DB_ACCOUNT_IS_VALIDATOR], accountBD[DB_ACCOUNT_SEQUENCE_NUMBER], accountBD[DB_ACCOUNT_ACCOUNT_NUMBER], accountBD[DB_ACCOUNT_FETCH_TIME], accountBD[DB_ACCOUNT_M_SIZE], accountBD[DB_ACCOUNT_IMPORT_TIME])
            }
            return nil
        } catch {
            if(SHOW_LOG) { print(error) }
        }
        return nil
    }
    
    public func selectExistAccount(address: String, chain: String ) -> Account? {
        do {
            let query = DB_ACCOUNT.filter(DB_ACCOUNT_ADDRESS == address && DB_ACCOUNT_BASECHAIN == chain)
            if let accountBD = try database.pluck(query) {
                return Account(accountBD[DB_ACCOUNT_ID], accountBD[DB_ACCOUNT_UUID], accountBD[DB_ACCOUNT_NICKNAME], accountBD[DB_ACCOUNT_FAVO], accountBD[DB_ACCOUNT_ADDRESS], accountBD[DB_ACCOUNT_BASECHAIN], accountBD[DB_ACCOUNT_HAS_PRIVATE],  accountBD[DB_ACCOUNT_RESOURCE], accountBD[DB_ACCOUNT_FROM_MNEMONIC], accountBD[DB_ACCOUNT_PATH], accountBD[DB_ACCOUNT_IS_VALIDATOR], accountBD[DB_ACCOUNT_SEQUENCE_NUMBER], accountBD[DB_ACCOUNT_ACCOUNT_NUMBER], accountBD[DB_ACCOUNT_FETCH_TIME], accountBD[DB_ACCOUNT_M_SIZE], accountBD[DB_ACCOUNT_IMPORT_TIME])
            }
            return nil
        } catch {
            if(SHOW_LOG) { print(error) }
        }
        return nil
    }
    
    //TODO double check
    public func isDupleAccount(address: String, chain: String ) -> Bool? {
        do {
            let query = DB_ACCOUNT.filter(DB_ACCOUNT_ADDRESS == address && DB_ACCOUNT_BASECHAIN == chain)
            if (try database.pluck(query)) != nil {
                return true
            } else {
                return false
            }
            
        } catch {
             if(SHOW_LOG) { print(error) }
        }
        return true;
    }
    
    public func insertAccount(account: Account) -> Int64 {
        let insertAccount = DB_ACCOUNT.insert(DB_ACCOUNT_UUID <- account.account_uuid,
                                              DB_ACCOUNT_NICKNAME <- account.account_nick_name,
                                              DB_ACCOUNT_FAVO <- account.account_favo,
                                              DB_ACCOUNT_ADDRESS <- account.account_address,
                                              DB_ACCOUNT_BASECHAIN <- account.account_base_chain,
                                              DB_ACCOUNT_HAS_PRIVATE <- account.account_has_private,
                                              DB_ACCOUNT_RESOURCE <- account.account_resource,
                                              DB_ACCOUNT_FROM_MNEMONIC <- account.account_from_mnemonic,
                                              DB_ACCOUNT_PATH <- account.account_path,
                                              DB_ACCOUNT_IS_VALIDATOR <- account.account_is_validator,
                                              DB_ACCOUNT_SEQUENCE_NUMBER <- account.account_sequence_number,
                                              DB_ACCOUNT_ACCOUNT_NUMBER <- account.account_account_numner,
                                              DB_ACCOUNT_FETCH_TIME <- account.account_fetch_time,
                                              DB_ACCOUNT_M_SIZE <- account.account_m_size,
                                              DB_ACCOUNT_IMPORT_TIME <- account.account_import_time)
        do {
            return try database.run(insertAccount)
        } catch {
            if(SHOW_LOG) { print(error) }
            return -1
        }
    }
    
    public func updateAccount(_ account: Account) -> Int64 {
        let target = DB_ACCOUNT.filter(DB_ACCOUNT_ID == account.account_id)
        do {
            return try Int64(database.run(target.update(DB_ACCOUNT_NICKNAME <- account.account_nick_name,
                                                        DB_ACCOUNT_FAVO <- account.account_favo,
                                                        DB_ACCOUNT_SEQUENCE_NUMBER <- account.account_sequence_number,
                                                        DB_ACCOUNT_ACCOUNT_NUMBER <- account.account_account_numner,
                                                        DB_ACCOUNT_RESOURCE <- account.account_resource,
                                                        DB_ACCOUNT_FETCH_TIME <- account.account_fetch_time)))
        } catch {
            if(SHOW_LOG) { print(error) }
            return -1
        }
    }
    
    public func deleteAccount(account: Account) -> Int {
        //TODO delete Balance, Bonding, unBonding
        let query = DB_ACCOUNT.filter(DB_ACCOUNT_ID == account.account_id)
        do {
            return  try database.run(query.delete())
        } catch {
            if(SHOW_LOG) { print(error) }
            return -1
        }
    }
    
    
    
    
    public func hasPassword() -> Bool{
        if(KeychainWrapper.standard.string(forKey: "password") == nil) {
            return false;
        } else {
            return true;
        }
    }
    
    /*
    public func selectPassword() -> Password? {
        do {
            for passwordBD in try database.prepare(DB_PASSWORD) {
                return Password(passwordBD[DB_PASSWORD_ID], passwordBD[DB_PASSWORD_RESOURCE])
            }
        } catch {
            if(SHOW_LOG) { print(error) }
        }
        return nil;
    }
    
    public func hasPassword() -> Bool{
        do {
            for _ in try database.prepare(DB_PASSWORD) {
                return true;
            }
            return false;
        } catch {
            if(SHOW_LOG) { print(error) }
        }
        return false;
    }
    
    
    public func insertPassword(password: Password) -> Int64 {
        if(hasPassword()) { return -1; }
        let insertPassword = DB_PASSWORD.insert(DB_PASSWORD_ID <- password.password_id,
                                              DB_PASSWORD_RESOURCE <- password.password_resource)
        do {
            return try database.run(insertPassword)
        } catch {
            if(SHOW_LOG) { print(error) }
            return -1
        }
    }
    */
    
    
    
    
    
    public func selectAllBalances() -> Array<Balance> {
        var result = Array<Balance>()
        do {
            for balanceBD in try database.prepare(DB_BALANCE) {
                let balance = Balance(balanceBD[DB_BALANCE_ID], balanceBD[DB_BALANCE_ACCOUNT_ID],
                                      balanceBD[DB_BALANCE_DENOM], balanceBD[DB_BALANCE_AMOUNT],
                                      balanceBD[DB_BALANCE_FETCH_TIME])
                result.append(balance);
            }
        } catch {
            if(SHOW_LOG) { print(error) }
        }
        return result;
    }
    
    public func selectBalanceById(accountId: Int64) -> Array<Balance> {
        var result = Array<Balance>()
        do {
            for balanceBD in try database.prepare(DB_BALANCE.filter(DB_BALANCE_ACCOUNT_ID == accountId)) {
                let balance = Balance(balanceBD[DB_BALANCE_ID], balanceBD[DB_BALANCE_ACCOUNT_ID],
                                      balanceBD[DB_BALANCE_DENOM], balanceBD[DB_BALANCE_AMOUNT],
                                      balanceBD[DB_BALANCE_FETCH_TIME])
                result.append(balance);
            }
        } catch {
            if(SHOW_LOG) { print(error) }
        }
        return result
    }
    
    public func deleteBalance(account: Account) -> Int {
        let query = DB_BALANCE.filter(DB_BALANCE_ACCOUNT_ID == account.account_id)
        do {
            return  try database.run(query.delete())
        } catch {
            if(SHOW_LOG) { print(error) }
            return -1
        }
    }
    
    public func deleteBalanceById(accountId: Int64) -> Int {
        let query = DB_BALANCE.filter(DB_BALANCE_ACCOUNT_ID == accountId)
        do {
            return  try database.run(query.delete())
        } catch {
            if(SHOW_LOG) { print(error) }
            return -1
        }
    }
    
    public func insertBalance(balance: Balance) -> Int64 {
        let insertBalance = DB_BALANCE.insert(DB_BALANCE_ID <- balance.balance_id,
                                               DB_BALANCE_ACCOUNT_ID <- balance.balance_account_id,
                                               DB_BALANCE_DENOM <- balance.balance_denom,
                                               DB_BALANCE_AMOUNT <- balance.balance_amount,
                                               DB_BALANCE_FETCH_TIME <- balance.balance_fetch_time)
        do {
            return try database.run(insertBalance)
        } catch {
            if(SHOW_LOG) { print(error) }
            return -1
        }
    }
    
    public func updateBalances(_ newBalances: Array<Balance>) {
        _ = deleteBalanceById(accountId: newBalances[0].balance_account_id)
        for balance in newBalances {
            _ = self.insertBalance(balance: balance)
        }
    }
    
    
    
    
    public func selectAllBondings() -> Array<Bonding> {
        var result = Array<Bonding>()
        do {
            for bondingBD in try database.prepare(DB_BONDING) {
                let bonding = Bonding(bondingBD[DB_BONDING_ID], bondingBD[DB_BONDING_ACCOUNT_ID],
                                      bondingBD[DB_BONDING_V_Address], bondingBD[DB_BONDING_SHARES],
                                      bondingBD[DB_BONDING_FETCH_TIME])
                result.append(bonding);
            }
        } catch {
            if(SHOW_LOG) { print(error) }
        }
        return result;
    }
    
    public func selectBondingById(accountId: Int64) -> Array<Bonding> {
        var result = Array<Bonding>()
        do {
            for bondingBD in try database.prepare(DB_BONDING.filter(DB_BONDING_ACCOUNT_ID == accountId)) {
                let bonding = Bonding(bondingBD[DB_BONDING_ID], bondingBD[DB_BONDING_ACCOUNT_ID],
                                      bondingBD[DB_BONDING_V_Address], bondingBD[DB_BONDING_SHARES],
                                      bondingBD[DB_BONDING_FETCH_TIME])
                result.append(bonding);
            }
        } catch {
            if(SHOW_LOG) { print(error) }
        }
        return result
    }
    
    public func deleteBonding(account: Account) -> Int {
        let query = DB_BONDING.filter(DB_BONDING_ACCOUNT_ID == account.account_id)
        do {
            return  try database.run(query.delete())
        } catch {
            if(SHOW_LOG) { print(error) }
            return -1
        }
    }
    
    public func deleteBondingById(accountId: Int64) -> Int {
        let query = DB_BONDING.filter(DB_BONDING_ACCOUNT_ID == accountId)
        do {
            return  try database.run(query.delete())
        } catch {
            if(SHOW_LOG) { print(error) }
            return -1
        }
    }
    
    public func insertBonding(bonding: Bonding) -> Int64 {
        let insertBonding = DB_BONDING.insert(DB_BONDING_ACCOUNT_ID <- bonding.bonding_account_id,
                                              DB_BONDING_V_Address <- bonding.bonding_v_address,
                                              DB_BONDING_SHARES <- bonding.bonding_shares,
                                              DB_BONDING_FETCH_TIME <- bonding.bonding_fetch_time)
        do {
            return try database.run(insertBonding)
        } catch {
            if(SHOW_LOG) { print(error) }
            return -1
        }
    }
    
    public func updateBondings(_ newBondings: Array<Bonding>) {
        _ = deleteBondingById(accountId: newBondings[0].bonding_account_id)
        for bonding in newBondings {
            _ = self.insertBonding(bonding: bonding)
        }
    }
    
    
    
    
    public func selectAllUnbondings() -> Array<Unbonding> {
        var result = Array<Unbonding>()
        do {
            for unbondingBD in try database.prepare(DB_UNBONDING) {
                let unbonding = Unbonding(unbondingBD[DB_UNBONDING_ID], unbondingBD[DB_UNBONDING_ACCOUNT_ID],
                                      unbondingBD[DB_UNBONDING_V_Address], unbondingBD[DB_UNBONDING_CREATE_HEIGHT],
                                      unbondingBD[DB_UNBONDING_COMPLETE_TIME], unbondingBD[DB_UNBONDING_INITIAL_BALANCE],
                                      unbondingBD[DB_UNBONDING_BALANCE], unbondingBD[DB_UNBONDING_FETCH_TIME])
                result.append(unbonding);
            }
        } catch {
            if(SHOW_LOG) { print(error) }
        }
        return result;
    }
    
    public func selectUnbondingById(accountId: Int64) -> Array<Unbonding> {
        var result = Array<Unbonding>()
        do {
            for unbondingBD in try database.prepare(DB_UNBONDING.filter(DB_UNBONDING_ACCOUNT_ID == accountId)) {
                let unbonding = Unbonding(unbondingBD[DB_UNBONDING_ID], unbondingBD[DB_UNBONDING_ACCOUNT_ID],
                                          unbondingBD[DB_UNBONDING_V_Address], unbondingBD[DB_UNBONDING_CREATE_HEIGHT],
                                          unbondingBD[DB_UNBONDING_COMPLETE_TIME], unbondingBD[DB_UNBONDING_INITIAL_BALANCE],
                                          unbondingBD[DB_UNBONDING_BALANCE], unbondingBD[DB_UNBONDING_FETCH_TIME])
                result.append(unbonding);
            }
        } catch {
            if(SHOW_LOG) { print(error) }
        }
        return result
    }
    
    public func deleteUnbonding(account: Account) -> Int {
        let query = DB_UNBONDING.filter(DB_UNBONDING_ACCOUNT_ID == account.account_id)
        do {
            return  try database.run(query.delete())
        } catch {
            if(SHOW_LOG) { print(error) }
            return -1
        }
    }
    
    public func deleteUnbondingById(accountId: Int64) -> Int {
        let query = DB_UNBONDING.filter(DB_UNBONDING_ACCOUNT_ID == accountId)
        do {
            return  try database.run(query.delete())
        } catch {
            if(SHOW_LOG) { print(error) }
            return -1
        }
    }
    
    public func insertUnbonding(unbonding: Unbonding) -> Int64 {
        let insertUnbonding = DB_UNBONDING.insert(DB_UNBONDING_ACCOUNT_ID <- unbonding.unbonding_account_id,
                                                  DB_UNBONDING_V_Address <- unbonding.unbonding_v_address,
                                                  DB_UNBONDING_CREATE_HEIGHT <- unbonding.unbonding_create_height,
                                                  DB_UNBONDING_COMPLETE_TIME <- unbonding.unbonding_complete_time,
                                                  DB_UNBONDING_INITIAL_BALANCE <- unbonding.unbonding_inital_balance,
                                                  DB_UNBONDING_BALANCE <- unbonding.unbonding_balance,
                                                  DB_UNBONDING_FETCH_TIME <- unbonding.unbonding_fetch_time)
        do {
            return try database.run(insertUnbonding)
        } catch {
            if(SHOW_LOG) { print(error) }
            return -1
        }
    }
    
    public func updateUnbondings(_ newUnbondings: Array<Unbonding>) {
        _ = deleteUnbondingById(accountId: newUnbondings[0].unbonding_account_id)
        for unbonding in newUnbondings {
            _ = self.insertUnbonding(unbonding: unbonding)
        }
    }
    
}
