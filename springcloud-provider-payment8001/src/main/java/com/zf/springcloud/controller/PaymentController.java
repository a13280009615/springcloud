package com.zf.springcloud.controller;

import com.zf.springcloud.bean.Payment;
import com.zf.springcloud.service.PaymentService;
import com.zf.springcloud.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author zhengfan
 * @create 2020-09-23 21:46
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/save")
    public CommonResult  save(@RequestBody Payment payment){

        int result = paymentService.save(payment);
        log.info("=======插入结果"+result);
         if (result > 0){
             return  new CommonResult(200,"插入成功",result);
         }else{
             return  new CommonResult(500,"插入失败",null);
         }
    }


    @GetMapping("/payment/get/{id}")
    public CommonResult  save(@PathVariable("id") Long id){

        Payment payment = paymentService.getPaymentById(id);
        log.info(new Date()+"=======查询结果"+payment);
        if (null != payment  ){
            return  new CommonResult(200,"查询成功",payment);
        }else{
            return  new CommonResult(500,"没有相应的记录,查询的ID"+id,null);
        }
    }

}
