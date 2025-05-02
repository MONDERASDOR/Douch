package com.sunpowder.douch.network;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

public class MCInitialPipeline extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) {
        ch.pipeline().addLast("handshake-decoder", new MCHandshakeDecoder());
        ch.pipeline().addLast("handshake-handler", new MCHandshakeHandler());
    }
}
