package com.zzsong.bus.abs.domain;

import com.zzsong.bus.abs.constants.DBDefaults;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.List;

/**
 * 推送实例
 *
 * @author 宋志宗 on 2020/9/17
 */
@Getter
@Setter
public class RouteInstance {
  /**
   * 丢弃
   */
  public static final int STATUS_DISCARD = -1;
  /**
   * 等待执行状态
   */
  public static final int STATUS_WAITING = 0;
  /**
   * 执行中
   */
  public static final int STATUS_RUNNING = 1;
  /**
   * 执行成功
   */
  public static final int STATUS_SUCCESS = 2;
  /**
   * 执行失败
   */
  public static final int STATUS_FAILURE = 3;

  /**
   * 实例id
   */
  @Nonnull
  private Long instanceId;
  /**
   * broker nodeId
   */
  private int nodeId;
  /**
   * 事件唯一id
   */
  @Nonnull
  private String eventId;
  /**
   * hash key
   */
  @Nonnull
  private String key;
  /**
   * 订阅关系id
   */
  @Nonnull
  private Long subscriptionId;
  /**
   * 订阅者id
   */
  @Nonnull
  private Long applicationId;
  /**
   * 主题
   */
  @Nonnull
  private String topic;
  /**
   * 下次推送时间
   */
  private long nextPushTime = -1;
  /**
   * 状态: -1 丢弃, 0 等待执行, 1 执行中, 2 完成, 3 失败
   */
  private int status = STATUS_WAITING;
  /**
   * 已重试次数
   */
  private int retryCount = -1;
  /**
   * 描述信息
   */
  private String message = DBDefaults.STRING_VALUE;
  /**
   * 消费该事件的监听器名称列表
   */
  @Nonnull
  private List<String> listeners = Collections.emptyList();
  /**
   * 没有ack的监听器列表
   */
  @Nonnull
  private List<String> unAckListeners = Collections.emptyList();
}
