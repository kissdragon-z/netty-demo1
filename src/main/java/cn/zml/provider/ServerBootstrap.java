package cn.zml.provider;

import cn.zml.netty.NettyServer;

public class ServerBootstrap {

    public static void main(String[] args) {
        NettyServer.startServer("localhost", 8088);

    }

}
