package com.tuya.edge.receive.yulin;

import com.tuya.edge.client.api.user.TenementReceiveEvent;
import com.tuya.edge.client.model.BaseResult;
import com.tuya.edge.client.model.EventContext;
import com.tuya.edge.client.model.user.EnableTenementRequest;
import com.tuya.edge.client.model.user.RemoveTenementRequest;
import com.tuya.edge.client.model.user.TenementRequest;
import org.springframework.stereotype.Component;

/**
 * @author zhaoyu
 * @date 2020/3/16
 */
@Component("yulinTenementReceiveEvent")
public class YulinTenementReceiveEventImpl implements TenementReceiveEvent {

    @Override
    public BaseResult addTenement(TenementRequest tenementRequest, EventContext context) {
        // 调http接口 增加用户信息
        return new BaseResult(true,"执行成功");
    }

    @Override
    public BaseResult modifyTenement(TenementRequest tenementRequest, EventContext context) {
        // 调http接口 更新用户信息
        return new BaseResult(true,"执行成功");
    }

    @Override
    public BaseResult removeTenement(RemoveTenementRequest removeTenementRequest, EventContext context) {
        // 调http接口 移除用户信息
        return new BaseResult(true,"执行成功");
    }

    @Override
    public BaseResult enableTenement(EnableTenementRequest enableTenementRequest, EventContext context) {
        // 调http接口 启用/禁用用户信息
        return new BaseResult(true,"执行成功");
    }
}
