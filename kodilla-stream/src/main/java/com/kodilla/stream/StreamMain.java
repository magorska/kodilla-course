package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {

//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String beautifulText = poemBeautifier.beautify("Text to beautify", text -> "***" + text + "***");
        System.out.println(beautifulText);

        String beautifulText2 = poemBeautifier.beautify("Text to beautify", text -> text.toUpperCase());
        System.out.println(beautifulText2);

        String beautifulText3 = poemBeautifier.beautify("Text to beautify", text -> text.toLowerCase());
        System.out.println(beautifulText3);

        String beautifulText4 = poemBeautifier.beautify("Text to beautify",text -> text.replace(" ","&"));
        System.out.println(beautifulText4);

        String beautifulText5 = poemBeautifier.beautify("Text to beautify", text -> text.repeat(3));
        System.out.println(beautifulText5);


    }
}

