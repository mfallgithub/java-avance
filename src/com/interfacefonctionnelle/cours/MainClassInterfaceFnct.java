package com.interfacefonctionnelle.cours;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;

public class MainClassInterfaceFnct {
//    public MainClassInterfaceFnct(String message) {
//        System.out.println(message);
//    }

    public static void usingInterfaceFonctionnelle() {

        //Using class anonyme
//        Printer printer= new Printer() {
//        Printer printer= new Printer() {
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//            }
//        };
        //using method fonctionnelles -> lambda expression
        //Printer p1 = msg -> System.out.println(msg);
        // Printer p2 = System.out::println;
        //referecer un constructeur
        //Printer p2 = MainClassInterfaceFnct::new;
        //affichage avec deux approches
        List<String> myList = Arrays.asList("Monday", "Tuesday", "Wednesday");
        //imperative
//        for(var day: myList)
//            System.out.println(day);
        //declarative avec le Consumer
//        myList.forEach(day -> System.out.println(day));
        //enchainer les consumers
//        Consumer<String> print= item-> System.out.println(item);
//        Consumer<String> printLowerCase= item-> System.out.println(item.toLowerCase());
//        Consumer<String> printUpperCase= item-> System.out.println(item.toUpperCase());
//
//        myList.forEach(print.andThen(printLowerCase).andThen(printUpperCase));

        //Using Supplier Interface
        //Supplier<Integer> getActualYear=()-> LocalDateTime.now().getYear();
        //System.out.println(getActualYear.get());
        //ou bien en utilisant IntSupplier
//        IntSupplier getActualYear=()-> LocalDateTime.now().getYear();
//        System.out.println(getActualYear.getAsInt());

        // Using Function Interface

//        Function<String, Character> getFirstChar = str -> str.charAt(0);
//        System.out.println(getFirstChar.apply("Hello"));

        //Function Interface ->AndThen vs Compose
        //replace $ -> *
//        Function<String, String> dollarToStar = str -> str.replace('$', '*');
        //then replace * -> !
        //Function<String, String> starToExclamation = str -> str.replace('*', '!');
        //with AndThen
//        var result = dollarToStar
//                .andThen(starToExclamation)
//                .apply("$Hello*World");
//        System.out.println(result);
        //with Compose
//         result = dollarToStar
//                .compose(starToExclamation)
//                .apply("$Hello*World");
//        System.out.println(result);

        //Using Predicate Interface
        //Predicate<String>hasLengthEven=str->str.length()%2==0;
        //System.out.println(hasLengthEven.test("Hello"));
        //combinaison des predicats
        //Predicate<String> hasLeftParenthese=str->str.startsWith("(");
        //Predicate<String> hasRightParenthese=str->str.endsWith(")");
        // &&
       // Predicate<String> hasParentheses=hasLeftParenthese.and(hasRightParenthese);
        // ||
       // Predicate<String>hasAtLeastParenthese=hasLeftParenthese.or(hasRightParenthese);
        // !
       // Predicate<String> negate= hasAtLeastParenthese.negate();

        //System.out.println(hasAtLeastParenthese.test("(Hello"));
       // System.out.println(hasParentheses.test("(Hello"));
        //System.out.println(negate.test("(Hello"));

        // BinaryOperator
//        BinaryOperator<Integer> multiply=(a,b)->a*b;
//        Function<Integer, Integer> multiplyBy10= a-> a*10;
//        var result= multiply.andThen(multiplyBy10).apply(5,2);
//        System.out.println(result);

        //UnaryOperator Interface

        IntUnaryOperator cube= a->a*a*a;
        IntUnaryOperator increment= a->a+1;

        var result= cube.andThen(increment).applyAsInt(5);
        System.out.println(result);

    }
}
