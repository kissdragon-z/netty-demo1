package cn.zml.consumer;

import cn.zml.netty.NettyClient;
import cn.zml.publicInterface.HelloService;

public class ClientBootstrap {

    public static final String providerName = "HelloService#hello#";

    public static void main(String[] args) throws InterruptedException {

        NettyClient consumer = new NettyClient();
        // 创建一个代理对象
        HelloService service = (HelloService) consumer.getBean(HelloService.class, providerName);

        for (int i = 0; i < 10; i++) {
            System.out.println(service.hello("are you ok ?"));
        }
    }

}
