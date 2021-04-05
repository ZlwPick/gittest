package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.expression.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("版本2");


        System.out.println("创建分支表示之前分支的那个部分代码");
    }


    @Test
    void test() {
        List<user> users = new ArrayList<>();

        //builder方式构造类
        users.add(user.builder().name("zlw").pass("123").age(18).hobby("上网").build());

        Runnable runnable = () -> System.out.printf("zlw");
        runnable.run();

    }

    @Test
    void Consumer() {
        //一个入参 无返回值
        Consumer<String> String = s -> System.out.println(s);
        String.accept("Consumer");
    }

    @Test
    void Function() {
        //一个入参 一个返回值
        Function<String, String> function = s -> {
            System.out.println(s);
            return s;
        };

        String function1 = function.apply("Function");
        System.out.println(function1);
    }

    @Test
    void Supplier() {
        //无入参 一个返回值
        Supplier<String> supplier = () -> {
            System.out.println("supplier");
            return "supplier";
        };
        String s = supplier.get();
        System.out.println(s);
    }

    @Test
    void Predicate() {
        //一个入参 返回boolean
        Predicate<Integer> predicate = i -> i != 0;
        boolean test = predicate.test(1);
        System.out.println(test);

//        UnaryOperator 入参和返回值类型相同
    }

    @Test
    void yingyong() {

        //静态引用
        Function<String, String> function = DemoApplicationTests::info;
        String zlwzlw = function.apply("zlwzlw");
        System.out.println(zlwzlw);

        DemoApplicationTests demoApplicationTests = new DemoApplicationTests();
        Consumer<String> consumer = demoApplicationTests::info1;
        consumer.accept("实例引用");

        Supplier<DemoApplicationTests>  demoApplicationTestsSupplier = DemoApplicationTests::new;


    }


    public static String info(String s) {
        return "info" + s;
    }

    public void info1(String s) {
        System.out.println(s);
    }

    public DemoApplicationTests(){

    }

}
