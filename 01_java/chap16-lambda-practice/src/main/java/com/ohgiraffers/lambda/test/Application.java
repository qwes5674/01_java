package com.ohgiraffers.lambda.test;

import com.sun.source.tree.UsesTree;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.*;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();
    }

    /**
     * <pre>
     * @실습문제1
     * 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
     * </pre>
     */
    private void test1() {

        Supplier<LocalTime> supplier =  () -> LocalTime.now();

        LocalTime localTime = supplier.get();
        System.out.println("현재 시간은: " + localTime);
    }

    /**
    * <pre>
     * @실습문제2
     * 로또를 생성하는 람다식을 작성하세요.
     * - 리턴타입 Set<Integer>
     * </pre>
    */
   private void test2() {
       Supplier<Set<Integer>> lotto = () -> {
           Set<Integer> set = new TreeSet<>();
           while(set.size() <7){
                 set.add((int)(Math.random() *45 +1));
           }
           return set;
        };
       System.out.println("이번주 로또 번호는 : " + lotto.get() + " 입니다");
   }

    /**
     * <pre>
     * @실습문제3
     * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
     * 현재 1달러는 1350원이다.
     * </pre>
    */
    private void test3() {

        BiConsumer<String, Integer> biConsumer = (str, money) -> System.out.println("￦ " +(double) money + " => " + str + " "+ ((double) money / 1350) );
        biConsumer.accept("$",3000);

    }

    /**
     * <pre>
     * @실습문제4
     * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
     * </pre>
     */
    private void test4() {
        DoubleFunction<String> money = Value -> String.valueOf(Value);

        Double Value = 3000.0;
        System.out.println(money.apply(Value) + "원은 " + money.apply(Value/1350) + "달러 입니다.");
    }

    /**
     * <pre>
     * @실습문제5
     * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
     * 문자열리스트 {"abc","","대한민국","   "}를 체크하세요.
     * </pre>
     */
        private void test5() {
            List<String> strList = Arrays.asList("abc", "", "대한민국", "   ");
            BiConsumer<String,Arrays> biConsumer = (string) ->

        }
}
