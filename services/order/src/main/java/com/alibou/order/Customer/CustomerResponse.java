package com.alibou.order.Customer;

public record CustomerResponse(
    String id,
    String firstname,
    String lastname,
    String email
) {

}
