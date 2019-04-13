package org.fengfei.lanproxy.client.listener;

import io.netty.channel.ChannelHandlerContext;

/**
 * 频道状态监听者
 */
public interface ChannelStatusListener {

    /**
     * 通道不活跃了
     *
     * @param ctx
     */
    void channelInactive(ChannelHandlerContext ctx);

}
