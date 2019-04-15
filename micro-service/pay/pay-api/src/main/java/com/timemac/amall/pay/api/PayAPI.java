package com.timemac.amall.pay.api;

/**
 * @author ivanyu
 */
public interface PayAPI {
    String hello(String message);

    Float getTotalPayByOrderId(Long orderId);
}
