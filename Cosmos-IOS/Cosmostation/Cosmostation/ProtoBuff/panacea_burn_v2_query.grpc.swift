//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: panacea/burn/v2/query.proto
//

//
// Copyright 2018, gRPC Authors All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
import GRPC
import NIO
import SwiftProtobuf


/// Query defines the gRPC querier service.
///
/// Usage: instantiate `Panacea_Burn_V2_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Panacea_Burn_V2_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Panacea_Burn_V2_QueryClientInterceptorFactoryProtocol? { get }
}

extension Panacea_Burn_V2_QueryClientProtocol {
  internal var serviceName: String {
    return "panacea.burn.v2.Query"
  }
}

internal protocol Panacea_Burn_V2_QueryClientInterceptorFactoryProtocol {
}

internal final class Panacea_Burn_V2_QueryClient: Panacea_Burn_V2_QueryClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Panacea_Burn_V2_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the panacea.burn.v2.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Panacea_Burn_V2_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Panacea_Burn_V2_QueryProvider: CallHandlerProvider {
  var interceptors: Panacea_Burn_V2_QueryServerInterceptorFactoryProtocol? { get }
}

extension Panacea_Burn_V2_QueryProvider {
  internal var serviceName: Substring { return "panacea.burn.v2.Query" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    default:
      return nil
    }
  }
}

internal protocol Panacea_Burn_V2_QueryServerInterceptorFactoryProtocol {
}