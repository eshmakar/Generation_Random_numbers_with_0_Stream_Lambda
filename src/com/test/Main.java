package com.test;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream.generate(Math::random)//через Stream гененируется рандомные цифры
                .limit(50)//получаем 50 штук
                .map(e -> ((int) (e * 1000)))//все это добро превращаем в int
                .map(e-> String.format("%03d", e))//если в начале не хватает нули, то добавляем их
                .forEach(System.out::println);//выводим на печать
    }
}
