//
//  MainTabSendViewController.swift
//  Cosmostation
//
//  Created by yongjoo on 05/03/2019.
//  Copyright © 2019 wannabit. All rights reserved.
//

import UIKit
import Alamofire
import Floaty
import DropDown
import QRCode
import SafariServices

class MainTabSendViewController: BaseViewController , FloatyDelegate{
    
    @IBOutlet weak var mainScrollView: UIScrollView!
    @IBOutlet weak var titleView: UIView!
    @IBOutlet weak var titleChainImg: UIImageView!
    @IBOutlet weak var titleWalletName: UILabel!
    @IBOutlet weak var titleChainName: UILabel!
    @IBOutlet weak var titleAccountBtn: UIButton!
    
    @IBOutlet weak var keyCard: CardView!
    @IBOutlet weak var keyTypeImg: UIImageView!
    @IBOutlet weak var keyAddressLabel: UILabel!
    @IBOutlet weak var keyQrcodeBtn: UIButton!
    
    @IBOutlet weak var denomCard: CardView!
    @IBOutlet weak var denomImg: UIImageView!
    @IBOutlet weak var denomTitleLabel: UILabel!
    @IBOutlet weak var denomTotalAmountLabel: UILabel!
    @IBOutlet weak var denomtotalPriceLabel: UILabel!
    @IBOutlet weak var denomAvailableAmountLabel: UILabel!
    @IBOutlet weak var denomDelegatedAmountLabel: UILabel!
    @IBOutlet weak var denomUnbondingAmountLabel: UILabel!
    @IBOutlet weak var denomRewardAmountLabel: UILabel!
    
    @IBOutlet weak var priceCard: CardView!
    @IBOutlet weak var pricePerAtom: UILabel!
    @IBOutlet weak var priceUpDownLabel: UILabel!
    @IBOutlet weak var priceUpDownImg: UIImageView!
    
    @IBOutlet weak var inflationLabel: UILabel!
    @IBOutlet weak var yieldLabel: UILabel!
    
    @IBOutlet weak var rewardCard: CardView!
    
    var mainTabVC: MainTabViewController!
    var refresher: UIRefreshControl!
    var userChain: ChainType?
    
    @IBOutlet weak var addPopupView: UIView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        mainTabVC = (self.parent)?.parent as? MainTabViewController
        userChain = WUtils.getChainType(mainTabVC.mAccount.account_base_chain)
        
        refresher = UIRefreshControl()
        refresher.addTarget(self, action: #selector(onRequestFetch), for: .valueChanged)
        refresher.tintColor = UIColor.white
        mainScrollView.addSubview(refresher)
        
        self.updateTitle()
        self.updateFloaty()
        self.updateView()
    }
    
    func updateFloaty() {
        let floaty = Floaty()
        floaty.buttonImage = UIImage.init(named: "sendImg")
        if (userChain! == ChainType.CHAIN_COSMOS) {
            floaty.buttonColor = COLOR_ATOM
        } else if (userChain! == ChainType.CHAIN_IRIS) {
            floaty.buttonColor = COLOR_IRIS
        }
        floaty.fabDelegate = self
        self.view.addSubview(floaty)
    }
    
    func updateTitle() {
        if (mainTabVC.mAccount.account_nick_name == "") {
            titleWalletName.text = NSLocalizedString("wallet_dash", comment: "") + String(mainTabVC.mAccount.account_id)
        } else {
            titleWalletName.text = mainTabVC.mAccount.account_nick_name
        }
        
        titleChainName.textColor = WUtils.getChainColor(userChain!)
        if (mainTabVC.mAccount.account_base_chain == CHAIN_COSMOS_S) {
            titleChainImg.image = UIImage(named: "cosmosWhMain")
            titleChainName.text = "(Cosmos Hub)"
        } else if (mainTabVC.mAccount.account_base_chain == CHAIN_IRIS_S) {
            titleChainImg.image = UIImage(named: "irisWh")
            titleChainName.text = "(Iris Hub)"
        }
    }
    
    func updateView() {
        if(mainTabVC.mAccount.account_has_private) {
            if (mainTabVC.mAccount.account_base_chain == CHAIN_COSMOS_S) {
                keyTypeImg.image = keyTypeImg.image?.withRenderingMode(.alwaysTemplate)
                keyTypeImg.tintColor = COLOR_ATOM
            } else if (mainTabVC.mAccount.account_base_chain == CHAIN_IRIS_S) {
                keyTypeImg.image = keyTypeImg.image?.withRenderingMode(.alwaysTemplate)
                keyTypeImg.tintColor = COLOR_IRIS
            }
        }
        keyAddressLabel.text = mainTabVC.mAccount.account_address
        
        denomCard.backgroundColor = WUtils.getChainBg(userChain!)
        WUtils.setDenomTitle(userChain!, denomTitleLabel)
        if (mainTabVC.mAccount.account_base_chain == CHAIN_COSMOS_S) {
            denomImg.image = UIImage(named: "atom_ic")
            if (mainTabVC.mRewardList.count > 0) {
                denomRewardAmountLabel.attributedText = WUtils.displayAllAtomReward(mainTabVC.mRewardList, denomRewardAmountLabel.font, 6)
            } else {
                denomRewardAmountLabel.attributedText = WUtils.displayAmount("0", denomRewardAmountLabel.font, 6, userChain!)
            }
            let totalSum = WUtils.getAllAtom(mainTabVC.mBalances, mainTabVC.mBondingList, mainTabVC.mUnbondingList, mainTabVC.mRewardList, mainTabVC.mAllValidator)
            denomTotalAmountLabel.attributedText = WUtils.displayAmount(totalSum.stringValue, denomTotalAmountLabel.font, 6, userChain!)
            
        } else if (mainTabVC.mAccount.account_base_chain == CHAIN_IRIS_S) {
            denomImg.image = UIImage(named: "irisTokenImg")
            if (mainTabVC.mIrisRewards != nil && (mainTabVC.mIrisRewards?.delegations.count)! > 0) {
                denomRewardAmountLabel.attributedText = WUtils.displayAmount((mainTabVC.mIrisRewards?.getSimpleIrisReward().stringValue)!, denomRewardAmountLabel.font, 6, userChain!)
            } else {
                denomRewardAmountLabel.attributedText = WUtils.displayAmount("0", denomRewardAmountLabel.font, 6, userChain!)
            }
            let totalSum = WUtils.getAllIris(mainTabVC.mBalances, mainTabVC.mBondingList, mainTabVC.mUnbondingList, mainTabVC.mIrisRewards, mainTabVC.mAllValidator)
            denomTotalAmountLabel.attributedText = WUtils.displayAmount(totalSum.stringValue, denomTotalAmountLabel.font, 6, userChain!)

        }
        
        if(mainTabVC.mBalances.count > 0) {
            denomAvailableAmountLabel.attributedText = WUtils.displayAmount(mainTabVC.mBalances[0].balance_amount, denomAvailableAmountLabel.font, 6, userChain!)
        } else {
            denomAvailableAmountLabel.attributedText = WUtils.displayAmount("0", denomDelegatedAmountLabel.font, 6, userChain!)
        }
        
        if(mainTabVC.mBondingList.count > 0) {
            var sum = NSDecimalNumber.zero
            for bonding in mainTabVC.mBondingList {
                sum = sum.adding(bonding.getBondingAmount(mainTabVC.mAllValidator))
            }
            denomDelegatedAmountLabel.attributedText = WUtils.displayAmount(sum.stringValue, denomDelegatedAmountLabel.font, 6, userChain!)
            
        } else {
            denomDelegatedAmountLabel.attributedText = WUtils.displayAmount("0", denomDelegatedAmountLabel.font, 6, userChain!)
        }
        
        if(mainTabVC.mUnbondingList.count > 0) {
            var sum = NSDecimalNumber.zero
            for unbonding in mainTabVC.mUnbondingList {
                sum = sum.adding(WUtils.stringToDecimal(unbonding.unbonding_balance))
            }
            denomUnbondingAmountLabel.attributedText = WUtils.displayAmount(sum.stringValue, denomUnbondingAmountLabel.font, 6, userChain!)
            
        } else {
            denomUnbondingAmountLabel.attributedText = WUtils.displayAmount("0", denomUnbondingAmountLabel.font, 6, userChain!)
        }
        
        
        
        
        
        
        
        self.updatePrice()
        
        var provisions = NSDecimalNumber.zero
        var inflation = NSDecimalNumber.zero
        var bonded_tokens = NSDecimalNumber.zero
        
        if(mainTabVC!.mInflation != nil) {
            inflation = NSDecimalNumber.init(string: mainTabVC.mInflation)
            inflationLabel.attributedText = WUtils.displayInflation(inflation, font: inflationLabel.font)
        }
        if(mainTabVC!.mStakingPool != nil && mainTabVC!.mProvision != nil) {
            provisions = NSDecimalNumber.init(string: mainTabVC.mProvision)
            bonded_tokens = NSDecimalNumber.init(string: mainTabVC.mStakingPool?.object(forKey: "bonded_tokens") as! String)
            yieldLabel.attributedText = WUtils.displayYield(bonded_tokens, provisions, NSDecimalNumber.zero, font: inflationLabel.font)
        }
        self.refresher.endRefreshing()
    }
    
    func updatePrice() {
        let totalSum = WUtils.getAllAtom(mainTabVC.mBalances, mainTabVC.mBondingList, mainTabVC.mUnbondingList, mainTabVC.mRewardList, mainTabVC.mAllValidator)
        if let change = mainTabVC.mAtomTic?.value(forKeyPath: getPrice24hPath()) as? Double,
            let price = mainTabVC.mAtomTic?.value(forKeyPath: getPricePath()) as? Double {
            let changeValue = NSDecimalNumber(value: change)
            let priceValue = NSDecimalNumber(value: price)
            var dpPrice = NSDecimalNumber.zero
            if(BaseData.instance.getCurrency() == 5) {
                dpPrice = priceValue.dividing(by: NSDecimalNumber(string: "1000000")).multiplying(by: totalSum, withBehavior: WUtils.handler8)
            } else {
                dpPrice = priceValue.dividing(by: NSDecimalNumber(string: "1000000")).multiplying(by: totalSum, withBehavior: WUtils.handler2)
            }
            
            denomtotalPriceLabel.attributedText = WUtils.displayPrice(dpPrice, BaseData.instance.getCurrency(), BaseData.instance.getCurrencySymbol(), font: denomtotalPriceLabel.font)
            pricePerAtom.attributedText = WUtils.displayPrice(priceValue, BaseData.instance.getCurrency(), BaseData.instance.getCurrencySymbol(), font: pricePerAtom.font)
            
            if(changeValue.compare(NSDecimalNumber.zero).rawValue > 0) {
                priceUpDownImg.image = UIImage(named: "priceUp")
                priceUpDownLabel.attributedText = WUtils.displayPriceUPdown(changeValue, font: priceUpDownLabel.font)
            } else if (changeValue.compare(NSDecimalNumber.zero).rawValue < 0) {
                priceUpDownImg.image = UIImage(named: "priceDown")
                priceUpDownLabel.attributedText = WUtils.displayPriceUPdown(changeValue, font: priceUpDownLabel.font)
            } else {
                priceUpDownImg.image = nil
                priceUpDownLabel.text = ""
            }
        }
    }
    
    func emptyFloatySelected(_ floaty: Floaty) {
        if(!mainTabVC.mAccount.account_has_private) {
            self.onShowAddMenomicDialog()
            return
        }
        
        if(self.mainTabVC.mBalances.count <= 0 || WUtils.stringToDecimal(self.mainTabVC.mBalances[0].balance_amount).compare(NSDecimalNumber(string: "1")).rawValue <= 0) {
            self.onShowToast(NSLocalizedString("error_not_enough_balance_to_send", comment: ""))
            return
        }
        
        let stakingVC = UIStoryboard(name: "GenTx", bundle: nil).instantiateViewController(withIdentifier: "StakingViewController") as! StakingViewController
        stakingVC.mType = COSMOS_MSG_TYPE_TRANSFER2
        stakingVC.hidesBottomBarWhenPushed = true
        self.navigationItem.title = ""
        self.navigationController?.pushViewController(stakingVC, animated: true)
    }
    
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(animated)
        self.navigationController?.setNavigationBarHidden(true, animated: animated)
        self.navigationController?.navigationBar.topItem?.title = "";
        self.updateTitle()
        self.updatePrice()
        NotificationCenter.default.addObserver(self, selector: #selector(self.onFetchDone(_:)), name: Notification.Name("onFetchDone"), object: nil)
        
    }
    

    override func viewWillDisappear(_ animated: Bool) {
        super.viewWillAppear(animated)
        NotificationCenter.default.removeObserver(self, name: Notification.Name("onFetchDone"), object: nil)
    }
    
    
    @objc func onFetchDone(_ notification: NSNotification) {
        updateView();
    }
    
    @objc func onRequestFetch() {
        if(!mainTabVC.onFetchAccountData()) {
            self.refresher.endRefreshing()
        }
    }
    
    @IBAction func onClickSwitchAccount(_ sender: Any) {
        self.mainTabVC.dropDown.show()
    }
    
    @IBAction func onClickCheckWeb(_ sender: UIButton) {
        guard let url = URL(string: "https://www.mintscan.io/account/" + mainTabVC.mAccount.account_address) else { return }
        let safariViewController = SFSafariViewController(url: url)
        present(safariViewController, animated: true, completion: nil)
    }
    
    @IBAction func onClickMyAddressShare(_ sender: UIButton) {
        var qrCode = QRCode(self.mainTabVC.mAccount.account_address)
        qrCode?.backgroundColor = CIColor(rgba: "EEEEEE")
        qrCode?.size = CGSize(width: 200, height: 200)
        
        var walletName: String?
        if (mainTabVC.mAccount.account_nick_name == "") {
            walletName = NSLocalizedString("wallet_dash", comment: "") + String(mainTabVC.mAccount.account_id)
        } else {
            walletName = mainTabVC.mAccount.account_nick_name
        }
        
        let alert = UIAlertController(title: walletName, message: "\n\n\n\n\n\n\n\n", preferredStyle: .alert)
        alert.view.subviews.first?.subviews.first?.subviews.first?.backgroundColor = UIColor.init(hexString: "EEEEEE")
        alert.addAction(UIAlertAction(title: NSLocalizedString("share", comment: ""), style: .default, handler:  { [weak alert] (_) in
            let shareTypeAlert = UIAlertController(title: nil, message: nil, preferredStyle: .alert)
            shareTypeAlert.addAction(UIAlertAction(title: NSLocalizedString("share_text", comment: ""), style: .default, handler: { [weak shareTypeAlert] (_) in
                let text = self.mainTabVC.mAccount.account_address
                let textToShare = [ text ]
                let activityViewController = UIActivityViewController(activityItems: textToShare, applicationActivities: nil)
                activityViewController.popoverPresentationController?.sourceView = self.view
                self.present(activityViewController, animated: true, completion: nil)
            }))
            shareTypeAlert.addAction(UIAlertAction(title: NSLocalizedString("share_qr", comment: ""), style: .default, handler: { [weak shareTypeAlert] (_) in
                let image = qrCode?.image
                let imageToShare = [ image! ]
                let activityViewController = UIActivityViewController(activityItems: imageToShare, applicationActivities: nil)
                activityViewController.popoverPresentationController?.sourceView = self.view
                self.present(activityViewController, animated: true, completion: nil)
            }))
            self.present(shareTypeAlert, animated: true) {
                let tapGesture = UITapGestureRecognizer(target: self, action: #selector(self.dismissAlertController))
                shareTypeAlert.view.superview?.subviews[0].addGestureRecognizer(tapGesture)
            }
        }))
        
        alert.addAction(UIAlertAction(title: NSLocalizedString("copy", comment: ""), style: .default, handler: { [weak alert] (_) in
            UIPasteboard.general.string = self.mainTabVC.mAccount.account_address
            self.onShowToast(NSLocalizedString("address_copied", comment: ""))
        }))
        
        let image = UIImageView(image: qrCode?.image)
        image.contentMode = .scaleAspectFit
        alert.view.addSubview(image)
        image.translatesAutoresizingMaskIntoConstraints = false
        alert.view.addConstraint(NSLayoutConstraint(item: image, attribute: .centerX, relatedBy: .equal, toItem: alert.view, attribute: .centerX, multiplier: 1, constant: 0))
        alert.view.addConstraint(NSLayoutConstraint(item: image, attribute: .centerY, relatedBy: .equal, toItem: alert.view, attribute: .centerY, multiplier: 1, constant: 0))
        alert.view.addConstraint(NSLayoutConstraint(item: image, attribute: .width, relatedBy: .equal, toItem: nil, attribute: .notAnAttribute, multiplier: 1.0, constant: 140.0))
        alert.view.addConstraint(NSLayoutConstraint(item: image, attribute: .height, relatedBy: .equal, toItem: nil, attribute: .notAnAttribute, multiplier: 1.0, constant: 140.0))
        self.present(alert, animated: true) {
            let tapGesture = UITapGestureRecognizer(target: self, action: #selector(self.dismissAlertController))
            alert.view.superview?.subviews[0].addGestureRecognizer(tapGesture)
        }
        
    }
    
    @objc func dismissAlertController(){
        self.dismiss(animated: true, completion: nil)
    }
    
    func onShowAddMenomicDialog() {
        let alert = UIAlertController(title: NSLocalizedString("alert_title_no_private_key", comment: ""), message: NSLocalizedString("alert_msg_no_private_key", comment: ""), preferredStyle: .alert)
        alert.addAction(UIAlertAction(title: NSLocalizedString("add_mnemonic", comment: ""), style: .default, handler: { [weak alert] (_) in
            self.onStartImportMnemonic()
        }))
        alert.addAction(UIAlertAction(title: NSLocalizedString("cancel", comment: ""), style: .cancel, handler: nil))
        self.present(alert, animated: true, completion: nil)
    }
    
    
    @IBAction func onClickGuide(_ sender: UIButton) {
        if(Locale.current.languageCode == "ko") {
            guard let url = URL(string: "https://www.cosmostation.io/files/guide_KO.pdf") else { return }
            let safariViewController = SFSafariViewController(url: url)
            present(safariViewController, animated: true, completion: nil)
        } else {
            guard let url = URL(string: "https://www.cosmostation.io/files/guide_EN.pdf") else { return }
            let safariViewController = SFSafariViewController(url: url)
            present(safariViewController, animated: true, completion: nil)
        }
    }
    
    @IBAction func onClickFaq(_ sender: UIButton) {
        if(Locale.current.languageCode == "ko") {
            guard let url = URL(string: "https://guide.cosmostation.io/app_wallet_ko.html") else { return }
            let safariViewController = SFSafariViewController(url: url)
            present(safariViewController, animated: true, completion: nil)
        } else {
            guard let url = URL(string: "https://guide.cosmostation.io/app_wallet_en.html") else { return }
            let safariViewController = SFSafariViewController(url: url)
            present(safariViewController, animated: true, completion: nil)
        }
    }
}
