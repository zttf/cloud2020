package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author dale
 * @title MessageProviderImpl
 * @date 2023/6/14 17:37
 */
//生产者
@EnableBinding(Source.class) // 可以理解为是一个消息的发送管道的定义,不用写service注解了
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output; // 消息的发送管道Channel

    @Override
    public String send()
    {
        String serial = UUID.randomUUID().toString();
        this.output.send(MessageBuilder.withPayload(serial).build()); // 创建并发送消息
        System.out.println("***serial: "+serial);

        return serial;
    }
}
