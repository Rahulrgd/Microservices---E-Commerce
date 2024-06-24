package com.alibou.order.OrderLine;

public record OrderLineResponse(
        Integer id,
        double quantity
) { }