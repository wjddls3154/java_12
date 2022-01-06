package org.opentutorials.javatutorials.object;

class Calculator { // class 는 지금부터 Calculator 라는 객체의 설계도를 알려주겠다 하는 뜻. 객체는 변수와 메소드의 집합
    // 그리고 이 Calculator 는 아래 main 에서 new Calculator() 로 만든것이다.
    int left, right; // this.left 와 this.right 가 지정하는것들,

    public void  setOprands(int left,int right){
        this.left = left; // 뒤에 left 는, 위의 int left 의미, 인스턴스의 변수 : 인스턴스에 값을 뭐를 넣느냐에 따라 달라지기 때문.
        this.right = right; // 뒤에 right 는, 위의 int right 의미, 인스턴스의 변수
    }

    public void sum () {
        System.out.println(this.left+this.right); // 더하기
    }

    public void avg() {
        System.out.println((this.left+this.right)/2); // 평균
    }
}


public class CalculatorDemo4 {

    public static void main(String[] args) {

        Calculator c1 = new Calculator(); // Calculator 라는 새로운 객체를 만들고, 그것을 c1 이라는 인스턴스에 담았는데,
        // 그 변수는  calculator 라는 객체를 담을수있는 그릇이어야하기때문에, 앞에 Calculator 를 붙여주는것이다.
        // 구체적인 객체 : 인스턴스
        c1.setOprands(10,20); // 위의 setOprands 에 10과 20의 값이 들어간다. 인스턴스마다 서로 다른 값을 소유하고있다.
        c1.sum(); // 30
        c1.avg(); // 15

        Calculator c2 = new Calculator(); // c2 라는 인스턴스가 만들어짐.
        c2.setOprands(20,40); // 위의 setOprands 에 20과 40의 값이 들어간다.
        c2.sum();
        c2.avg();

   }


}
