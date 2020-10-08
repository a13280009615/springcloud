package com.zf.springcloud.service;

import com.zf.springcloud.bean.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhengfan
 * @create 2020-09-23 21:43
 */
public interface PaymentService {
    public int save(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
