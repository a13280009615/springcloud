package com.zf.springcloud.dao;

import com.zf.springcloud.bean.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhengfan
 * @create 2020-09-23 21:23
 */
@Mapper
public interface PaymentDao {

    public int save(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
