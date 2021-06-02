package com.kodilla.good.patterns.myAllegro;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isConfirmed = orderService.sold(orderRequest.getUser(), orderRequest.getTimeOfOrdering(),
                orderRequest.getProduct(), orderRequest.getQuantity());
        if (isConfirmed) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),orderRequest.getTimeOfOrdering(),
                    orderRequest.getProduct(), orderRequest.getQuantity());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity(), true);
        } else {
            System.out.println("Sorry, we can't confirm your order");
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity(), false);
        }
    }
}
