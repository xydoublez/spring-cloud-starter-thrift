package io.ostenant.rpc.thrift.server.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.thrift.server")
public class ThriftServerProperties {

    /**
     * 服务名称ID
     */
    private String serviceId;

    /**
     * 服务端口号
     */
    private int port = 25000;
    /**
     * 绑定ip,默认为空
     */
    private String host="";
    /**
     * 读取缓存大小设置，默认1M
     */
    private  long maxReadBufferBytes=1*1024 * 1024L;
    /**
     * 服务注册信息（默认不开启）
     */
    private ThriftServerDiscoveryProperties discovery;

    /**
     * 服务的工作线程队列容量
     */
    private int workerQueueCapacity = 1000;

    /**
     * 服务模型(单线程/多线程/阻塞/非阻塞) 默认hsHa
     * <p>
     * simple: 单线程阻塞模型
     * nonBlocking: 单线程非阻塞模型
     * threadPool: 线程池同步模型
     * hsHa: 半同步半异步模型
     * threadedSelector: 线程池选择器模型
     * </p>
     */
    private String serviceModel = TServiceModel.SERVICE_MODEL_DEFAULT;

    private TThreadPoolServerProperties threadPool;

    private THsHaServerProperties hsHa;

    private TThreadedSelectorServerProperties threadedSelector;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ThriftServerDiscoveryProperties getDiscovery() {
        return discovery;
    }

    public void setDiscovery(ThriftServerDiscoveryProperties discovery) {
        this.discovery = discovery;
    }

    public int getWorkerQueueCapacity() {
        return workerQueueCapacity;
    }

    public void setWorkerQueueCapacity(int workerQueueCapacity) {
        this.workerQueueCapacity = workerQueueCapacity;
    }

    public String getServiceModel() {
        return serviceModel;
    }

    public void setServiceModel(String serviceModel) {
        this.serviceModel = serviceModel;
    }

    public TThreadPoolServerProperties getThreadPool() {
        return threadPool;
    }

    public void setThreadPool(TThreadPoolServerProperties threadPool) {
        this.threadPool = threadPool;
    }

    public THsHaServerProperties getHsHa() {
        return hsHa;
    }

    public void setHsHa(THsHaServerProperties hsHa) {
        this.hsHa = hsHa;
    }

    public TThreadedSelectorServerProperties getThreadedSelector() {
        return threadedSelector;
    }

    public void setThreadedSelector(TThreadedSelectorServerProperties threadedSelector) {
        this.threadedSelector = threadedSelector;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public long getMaxReadBufferBytes() {
        return maxReadBufferBytes;
    }

    public void setMaxReadBufferBytes(long maxReadBufferBytes) {
        this.maxReadBufferBytes = maxReadBufferBytes;
    }
}
