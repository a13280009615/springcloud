package com.zf.springcloud.service.impl;

import com.zf.springcloud.bean.Payment;
import com.zf.springcloud.dao.PaymentDao;
import com.zf.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhengfan
 * @create 2020-09-23 21:44
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int save(Payment payment) {

        return  paymentDao.save(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
