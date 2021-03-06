package com.zzsong.bus.abs.core;

import com.zzsong.bus.abs.domain.RouteInstance;
import reactor.core.publisher.Mono;

import javax.annotation.Nonnull;

/**
 * 消息推送处理器
 *
 * @author 宋志宗 on 2020/9/19 9:43 下午
 */
public interface MessagePusher {

  Mono<RouteInstance> push(@Nonnull RouteInstance routeInstance);
}
