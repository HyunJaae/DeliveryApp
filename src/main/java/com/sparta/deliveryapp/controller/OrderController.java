package com.sparta.deliveryapp.controller;

import com.sparta.deliveryapp.dto.OrderRequestDto;
import com.sparta.deliveryapp.model.Order;
import com.sparta.deliveryapp.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class OrderController {
    OrderService orderService;

    @PostMapping("/order/request")
    public Order createOrder(@RequestBody OrderRequestDto orderRequestDto) {
        System.out.println("order controller 도착!" + orderRequestDto.getRestaurantId());
        if(orderRequestDto == null) {
            throw new NullPointerException("주문을 해주세요.");
        }
        return orderService.createOrder(orderRequestDto);
    }
}