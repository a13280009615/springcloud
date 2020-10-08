package com.zf.springcloud.controller;

import com.zf.springcloud.bean.Payment;
import com.zf.springcloud.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhengfan
 * @create 2020-09-23 22:46
 */
@RestController
@Slf4j
public class OrderController {

    public static  final  String PARAM_URL = "http://localhost:8001" ;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/save")
    public CommonResult<Payment> create(Payment payment){
        return  restTemplate.postForObject(PARAM_URL+"/payment/save",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return  restTemplate.getForObject(PARAM_URL+"/payment/get/"+id,CommonResult.class);
    }

}
