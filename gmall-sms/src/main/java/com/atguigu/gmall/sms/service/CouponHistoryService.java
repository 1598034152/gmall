package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.CouponHistoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 优惠券领取历史记录
 *
 * @author canglong
 * @email canglong@atguigu.com
 * @date 2020-05-29 21:48:51
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

