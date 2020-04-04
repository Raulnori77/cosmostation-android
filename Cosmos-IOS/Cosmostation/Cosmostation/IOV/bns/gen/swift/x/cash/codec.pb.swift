// DO NOT EDIT.
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: x/cash/codec.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that your are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

/// Set may contain Coin of many different currencies.
/// It handles adding and subtracting sets of currencies.
struct Cash_Set {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var metadata: Weave_Metadata {
    get {return _storage._metadata ?? Weave_Metadata()}
    set {_uniqueStorage()._metadata = newValue}
  }
  /// Returns true if `metadata` has been explicitly set.
  var hasMetadata: Bool {return _storage._metadata != nil}
  /// Clears the value of `metadata`. Subsequent reads from it will return its default value.
  mutating func clearMetadata() {_uniqueStorage()._metadata = nil}

  var coins: [Coin_Coin] {
    get {return _storage._coins}
    set {_uniqueStorage()._coins = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

/// SendMsg is a request to move these coins from the given
/// source to the given destination address.
/// memo is an optional human-readable message
/// ref is optional binary data, that can refer to another
/// eg. tx hash
struct Cash_SendMsg {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var metadata: Weave_Metadata {
    get {return _storage._metadata ?? Weave_Metadata()}
    set {_uniqueStorage()._metadata = newValue}
  }
  /// Returns true if `metadata` has been explicitly set.
  var hasMetadata: Bool {return _storage._metadata != nil}
  /// Clears the value of `metadata`. Subsequent reads from it will return its default value.
  mutating func clearMetadata() {_uniqueStorage()._metadata = nil}

  var source: Data {
    get {return _storage._source}
    set {_uniqueStorage()._source = newValue}
  }

  var destination: Data {
    get {return _storage._destination}
    set {_uniqueStorage()._destination = newValue}
  }

  var amount: Coin_Coin {
    get {return _storage._amount ?? Coin_Coin()}
    set {_uniqueStorage()._amount = newValue}
  }
  /// Returns true if `amount` has been explicitly set.
  var hasAmount: Bool {return _storage._amount != nil}
  /// Clears the value of `amount`. Subsequent reads from it will return its default value.
  mutating func clearAmount() {_uniqueStorage()._amount = nil}

  /// max length 128 character
  var memo: String {
    get {return _storage._memo}
    set {_uniqueStorage()._memo = newValue}
  }

  /// max length 64 bytes
  var ref: Data {
    get {return _storage._ref}
    set {_uniqueStorage()._ref = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

/// FeeInfo records who pays what fees to have this
/// message processed
struct Cash_FeeInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Payer represents an address that will pay the fee. A fee fund will be
  /// withdrawn from that account in order to process a transaction.
  /// Warning: This field is optional and when not set it will default to any
  /// signer. It is recommended to always explicitely set the value of this
  /// field, as the signer order is not guaranteed.
  var payer: Data {
    get {return _storage._payer}
    set {_uniqueStorage()._payer = newValue}
  }

  var fees: Coin_Coin {
    get {return _storage._fees ?? Coin_Coin()}
    set {_uniqueStorage()._fees = newValue}
  }
  /// Returns true if `fees` has been explicitly set.
  var hasFees: Bool {return _storage._fees != nil}
  /// Clears the value of `fees`. Subsequent reads from it will return its default value.
  mutating func clearFees() {_uniqueStorage()._fees = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

struct Cash_Configuration {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var metadata: Weave_Metadata {
    get {return _storage._metadata ?? Weave_Metadata()}
    set {_uniqueStorage()._metadata = newValue}
  }
  /// Returns true if `metadata` has been explicitly set.
  var hasMetadata: Bool {return _storage._metadata != nil}
  /// Clears the value of `metadata`. Subsequent reads from it will return its default value.
  mutating func clearMetadata() {_uniqueStorage()._metadata = nil}

  /// Owner is present to implement gconf.OwnedConfig interface
  /// This defines the Address that is allowed to update the Configuration object and is
  /// needed to make use of gconf.NewUpdateConfigurationHandler
  var owner: Data {
    get {return _storage._owner}
    set {_uniqueStorage()._owner = newValue}
  }

  var collectorAddress: Data {
    get {return _storage._collectorAddress}
    set {_uniqueStorage()._collectorAddress = newValue}
  }

  var minimalFee: Coin_Coin {
    get {return _storage._minimalFee ?? Coin_Coin()}
    set {_uniqueStorage()._minimalFee = newValue}
  }
  /// Returns true if `minimalFee` has been explicitly set.
  var hasMinimalFee: Bool {return _storage._minimalFee != nil}
  /// Clears the value of `minimalFee`. Subsequent reads from it will return its default value.
  mutating func clearMinimalFee() {_uniqueStorage()._minimalFee = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

struct Cash_UpdateConfigurationMsg {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var metadata: Weave_Metadata {
    get {return _storage._metadata ?? Weave_Metadata()}
    set {_uniqueStorage()._metadata = newValue}
  }
  /// Returns true if `metadata` has been explicitly set.
  var hasMetadata: Bool {return _storage._metadata != nil}
  /// Clears the value of `metadata`. Subsequent reads from it will return its default value.
  mutating func clearMetadata() {_uniqueStorage()._metadata = nil}

  var patch: Cash_Configuration {
    get {return _storage._patch ?? Cash_Configuration()}
    set {_uniqueStorage()._patch = newValue}
  }
  /// Returns true if `patch` has been explicitly set.
  var hasPatch: Bool {return _storage._patch != nil}
  /// Clears the value of `patch`. Subsequent reads from it will return its default value.
  mutating func clearPatch() {_uniqueStorage()._patch = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "cash"

extension Cash_Set: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Set"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "metadata"),
    2: .same(proto: "coins"),
  ]

  fileprivate class _StorageClass {
    var _metadata: Weave_Metadata? = nil
    var _coins: [Coin_Coin] = []

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _metadata = source._metadata
      _coins = source._coins
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 1: try decoder.decodeSingularMessageField(value: &_storage._metadata)
        case 2: try decoder.decodeRepeatedMessageField(value: &_storage._coins)
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if let v = _storage._metadata {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      }
      if !_storage._coins.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._coins, fieldNumber: 2)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cash_Set, rhs: Cash_Set) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._metadata != rhs_storage._metadata {return false}
        if _storage._coins != rhs_storage._coins {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cash_SendMsg: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SendMsg"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "metadata"),
    2: .same(proto: "source"),
    3: .same(proto: "destination"),
    4: .same(proto: "amount"),
    5: .same(proto: "memo"),
    6: .same(proto: "ref"),
  ]

  fileprivate class _StorageClass {
    var _metadata: Weave_Metadata? = nil
    var _source: Data = SwiftProtobuf.Internal.emptyData
    var _destination: Data = SwiftProtobuf.Internal.emptyData
    var _amount: Coin_Coin? = nil
    var _memo: String = String()
    var _ref: Data = SwiftProtobuf.Internal.emptyData

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _metadata = source._metadata
      _source = source._source
      _destination = source._destination
      _amount = source._amount
      _memo = source._memo
      _ref = source._ref
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 1: try decoder.decodeSingularMessageField(value: &_storage._metadata)
        case 2: try decoder.decodeSingularBytesField(value: &_storage._source)
        case 3: try decoder.decodeSingularBytesField(value: &_storage._destination)
        case 4: try decoder.decodeSingularMessageField(value: &_storage._amount)
        case 5: try decoder.decodeSingularStringField(value: &_storage._memo)
        case 6: try decoder.decodeSingularBytesField(value: &_storage._ref)
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if let v = _storage._metadata {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      }
      if !_storage._source.isEmpty {
        try visitor.visitSingularBytesField(value: _storage._source, fieldNumber: 2)
      }
      if !_storage._destination.isEmpty {
        try visitor.visitSingularBytesField(value: _storage._destination, fieldNumber: 3)
      }
      if let v = _storage._amount {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
      }
      if !_storage._memo.isEmpty {
        try visitor.visitSingularStringField(value: _storage._memo, fieldNumber: 5)
      }
      if !_storage._ref.isEmpty {
        try visitor.visitSingularBytesField(value: _storage._ref, fieldNumber: 6)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cash_SendMsg, rhs: Cash_SendMsg) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._metadata != rhs_storage._metadata {return false}
        if _storage._source != rhs_storage._source {return false}
        if _storage._destination != rhs_storage._destination {return false}
        if _storage._amount != rhs_storage._amount {return false}
        if _storage._memo != rhs_storage._memo {return false}
        if _storage._ref != rhs_storage._ref {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cash_FeeInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FeeInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    2: .same(proto: "payer"),
    3: .same(proto: "fees"),
  ]

  fileprivate class _StorageClass {
    var _payer: Data = SwiftProtobuf.Internal.emptyData
    var _fees: Coin_Coin? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _payer = source._payer
      _fees = source._fees
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 2: try decoder.decodeSingularBytesField(value: &_storage._payer)
        case 3: try decoder.decodeSingularMessageField(value: &_storage._fees)
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if !_storage._payer.isEmpty {
        try visitor.visitSingularBytesField(value: _storage._payer, fieldNumber: 2)
      }
      if let v = _storage._fees {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cash_FeeInfo, rhs: Cash_FeeInfo) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._payer != rhs_storage._payer {return false}
        if _storage._fees != rhs_storage._fees {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cash_Configuration: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Configuration"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "metadata"),
    2: .same(proto: "owner"),
    3: .standard(proto: "collector_address"),
    4: .standard(proto: "minimal_fee"),
  ]

  fileprivate class _StorageClass {
    var _metadata: Weave_Metadata? = nil
    var _owner: Data = SwiftProtobuf.Internal.emptyData
    var _collectorAddress: Data = SwiftProtobuf.Internal.emptyData
    var _minimalFee: Coin_Coin? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _metadata = source._metadata
      _owner = source._owner
      _collectorAddress = source._collectorAddress
      _minimalFee = source._minimalFee
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 1: try decoder.decodeSingularMessageField(value: &_storage._metadata)
        case 2: try decoder.decodeSingularBytesField(value: &_storage._owner)
        case 3: try decoder.decodeSingularBytesField(value: &_storage._collectorAddress)
        case 4: try decoder.decodeSingularMessageField(value: &_storage._minimalFee)
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if let v = _storage._metadata {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      }
      if !_storage._owner.isEmpty {
        try visitor.visitSingularBytesField(value: _storage._owner, fieldNumber: 2)
      }
      if !_storage._collectorAddress.isEmpty {
        try visitor.visitSingularBytesField(value: _storage._collectorAddress, fieldNumber: 3)
      }
      if let v = _storage._minimalFee {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cash_Configuration, rhs: Cash_Configuration) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._metadata != rhs_storage._metadata {return false}
        if _storage._owner != rhs_storage._owner {return false}
        if _storage._collectorAddress != rhs_storage._collectorAddress {return false}
        if _storage._minimalFee != rhs_storage._minimalFee {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cash_UpdateConfigurationMsg: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UpdateConfigurationMsg"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "metadata"),
    2: .same(proto: "patch"),
  ]

  fileprivate class _StorageClass {
    var _metadata: Weave_Metadata? = nil
    var _patch: Cash_Configuration? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _metadata = source._metadata
      _patch = source._patch
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 1: try decoder.decodeSingularMessageField(value: &_storage._metadata)
        case 2: try decoder.decodeSingularMessageField(value: &_storage._patch)
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if let v = _storage._metadata {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      }
      if let v = _storage._patch {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cash_UpdateConfigurationMsg, rhs: Cash_UpdateConfigurationMsg) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._metadata != rhs_storage._metadata {return false}
        if _storage._patch != rhs_storage._patch {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}