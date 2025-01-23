package com.interfacefonctionnelle.exercice;

import java.util.Objects;
import java.util.function.*;

public class ExerciceFinaleFunctionalInter {
    // Retourne un Supplier<String> qui retourne "Hello"
    static Supplier<String> helloSupplier() {
        return () -> "Hello";
    }

    // Retourne un Predicate<String> qui vérifie si un String est vide
    static Predicate<String> isEmptyPredicate() {
        return String::isEmpty;
    }

    // Retourne un BiFunction<String, Integer, String>
    // qui prend un String et un Int et retourne un String contenant le String répété n fois
    static BiFunction<String, Integer, String> stringMultiplier() {
        return String::repeat;
    }

    // Retourne un Predicate<String> qui vérifie si un String a une longueur
    // comprise entre min et max
    public static Predicate<String> lengthInRangePredicate(int min, int max) {
        return s -> s.length() >= min && s.length() <= max;
    }

    // Retourne un IntSupplier qui retourne une valeur aléatoire entre 0 et 100
    public static IntSupplier randomIntSupplier() {
        return () -> (int) Math.round(Math.random() * 100);
    }

    // Retourne un IntUnaryOperator qui calcule le carré d'un nombre
    public static IntUnaryOperator intSquareOperation() {
        return a -> a * a;
    }

    // Retourne un LongBinaryOperator qui fait la somme entre deux Longs
    public static LongBinaryOperator longSumOperation() {
        return Long::sum;
    }

    // Retourne un ToIntFunction<String> qui convertit un String en Int
    public static ToIntFunction<String> stringToIntConverter() {
        return Integer::parseInt;
    }

    // Retourne un UnaryOperator<Function<String, String>>
    // qui prend un Function<String, String> et la retourne en ayant effectué un "trim"
    public static UnaryOperator<Function<String, String>> composeWithTrimFunction() {
        return function -> function.compose(String::trim);
    }

    // Retourne un Supplier<Supplier<Supplier<String>>> avec la valeur "WELL DONE"
    public static Supplier<Supplier<Supplier<String>>> wellDoneSupplier() {
        return () -> () -> () -> "WELL DONE";
    }

    public static void usingInterfaceFunctional() {
        System.out.println("hello supplier = " + Objects.equals(helloSupplier().get(), "Hello"));

        System.out.println("empty predicate when string is not empty = " + Objects.equals(isEmptyPredicate().test("Hello"), false));
        System.out.println("empty predicate when string is empty = " + Objects.equals(isEmptyPredicate().test(""), true));

        System.out.println("string multiplier = " + Objects.equals(stringMultiplier().apply("Hello", 2), "HelloHello"));

        System.out.println("lengthInRangePredicate when string fit the range = " + Objects.equals(lengthInRangePredicate(2, 5).test("Hell"), true));
        System.out.println("lengthInRangePredicate when string do not fit the range = " + Objects.equals(lengthInRangePredicate(2, 5).test("Hello World"), false));

        int randomInt = randomIntSupplier().getAsInt();
        boolean isLessThanOrEqual100 = Objects.compare(randomInt, 100, Integer::compareTo) == -1 || Objects.compare(randomInt, 100, Integer::compareTo) == 0;
        boolean isMoreThanOrEqual0 = Objects.compare(randomInt, 0, Integer::compareTo) == 1 || Objects.compare(randomInt, 0, Integer::compareTo) == 0;
        System.out.println("randomIntSupplier = " + randomInt + " { less than 100 = " + isLessThanOrEqual100 + ", more than 0 = " + isMoreThanOrEqual0);

        System.out.println("intSquareOperation = " + Objects.equals(intSquareOperation().applyAsInt(5), 25));

        System.out.println("longSumOperation = " + Objects.equals(longSumOperation().applyAsLong(5L, 3L), 8L));

        System.out.println("stringToIntConverter = " + Objects.equals(stringToIntConverter().applyAsInt("5"), 5));

        Function<String, String> expected = composeWithTrimFunction().apply(s -> s);
        System.out.println("composeWithTrimFunction = " + Objects.equals(expected.apply("   Hello   "), "Hello"));

        System.out.println("wellDoneSupplier = " + Objects.equals(wellDoneSupplier().get().get().get(), "WELL DONE"));
    }
}
