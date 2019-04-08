package io.ostenant.rpc.thrift.examples.rpc;

import com.msunsoft.service.calculator;
import io.ostenant.rpc.thrift.server.annotation.ThriftService;
import org.apache.thrift.TException;

@ThriftService(name = "rpcCalculatorService", version = 2.0)
public class testService implements calculator.Iface{
    @Override
    public int add(int arg1, int arg2) throws TException {
        return 3000;
    }

    @Override
    public int subtract(int arg1, int arg2) throws TException {
        return 4;
    }

    @Override
    public int multiply(int arg1, int arg2) throws TException {
        return 5;
    }

    @Override
    public int division(int arg1, int arg2) throws TException {
        return 6;
    }
}
