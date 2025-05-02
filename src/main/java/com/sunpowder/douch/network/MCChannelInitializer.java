package com.sunpowder.douch.network;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

public class MCChannelInitializer extends ChannelInitializer<Channel> {
    @Override
    protected void initChannel(Channel ch) throws Exception {
        // Setup pipeline for new connection
        // Add decoders, encoders, handlers, etc.
    }
}
