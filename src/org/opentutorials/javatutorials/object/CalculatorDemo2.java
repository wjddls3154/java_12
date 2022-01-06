package org.opentutorials.javatutorials.object;

public class CalculatorDemo2 {

    public static void sum(int left, int right) {
        System.out.println(left+right);
    }

    public static void main(String[] args){
        sum(10,20); // 위의 메소드 sum 에 left 에 10이 , right 에 20의 값이 들어간다.
        sum(20,40);
    }

    /**
     * 프로그래밍의 주요 원칙 중 하나 중복의 제거, 가장 좋은 방법은 메소드를 사용하는 것.
     * 위의 경우 처럼 10+20 , 20+40을 중복 안시키고 메소드 sum 을 만들어서 사용.
     */

}
