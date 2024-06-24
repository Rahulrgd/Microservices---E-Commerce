package com.alibou.order.payment;

import java.math.BigDecimal;

import com.alibou.order.Customer.CustomerResponse;
import com.alibou.order.OrderClasses.PaymentMethod;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
