package io.ostenant.rpc.thrift.examples.rpc;

import com.msunsoft.service.calculator;
import io.ostenant.rpc.thrift.client.annotation.ThriftClient;
import io.ostenant.rpc.thrift.client.common.ThriftClientAware;import io.ostenant.rpc.thrift.examples.thrift.CalculatorService;

@ThriftClient(serviceId = "thrift-calculator-rpc-server", refer = calculator.class, version = 2.0)
public interface CalculatorThriftClient extends ThriftClientAware<calculator.Client> {
}
