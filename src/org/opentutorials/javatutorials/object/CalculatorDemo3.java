package org.opentutorials.javatutorials.object;

public class CalculatorDemo3 {

    public static void sum (int left, int right) {
        System.out.println(left+right); // 더하기
    }

    public static void avg(int left, int right) {
        System.out.println((left+right)/2); // 평균
    }

    public static void main(String[] args) {
        int left, right; // 변수 선언

        left = 10;
        right = 20;

        sum(left,right);
        avg(left,right); // 로직은 비슷하고 값만 다름. 연관 1

        left = 20;
        right = 40;

        sum(left, right);
        avg(left, right); // 로직은 비슷하고 값만 다름. 연관 2
        // 연관 1,2 반복

    }

}
