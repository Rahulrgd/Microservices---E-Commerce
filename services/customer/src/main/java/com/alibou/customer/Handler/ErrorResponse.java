package com.alibou.customer.Handler;

import java.util.Map;

public record ErrorResponse(
    Map<String, String> errors
) {

}
