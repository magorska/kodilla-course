package com.kodilla.good.patterns.Food2Door;

public class Food2DoorApplication {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        OrderRequest orderRequest = orderRetriever.retriever();
    }
}
