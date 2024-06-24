package com.alibou.order.kafka;

import java.math.BigDecimal;
import java.util.List;

import com.alibou.order.Customer.CustomerResponse;
import com.alibou.order.OrderClasses.PaymentMethod;
import com.alibou.order.Product.PurchaseResponse;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}