package com.example.java;

 class Car {
    int gas;

    String company = "현대자동차";
    String model ="그랜저";

    String color = "검정";

    int maxSpeed = 350;

    int speed;

    void setGas(int gas){
        this.gas = gas;
    }
    boolean isLeftGaS(){
     if(gas == 0){
         System.out.println("gas가 없습니다");
         return false;
     }
     System.out.println("gas가 있습니다");
     return true;
    }

    void run(){
        while (true){
            if(gas>0){
                System.out.println("달립니다(gas잔량:"+gas+")");
                gas -=1;
            }else{
                System.out.println("멈춥니다(gas잔량:"+gas+")");
                return;
            }
        }
    }


}
//test

class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.setGas(5);

        if(myCar.isLeftGaS()){
            System.out.println("출발합니다");

            myCar.run();
        }

        System.out.println("gas를 주입하세요");

        System.out.println("제작회사" + myCar.company);
        System.out.println("제작회사" + myCar.model);
        System.out.println("제작회사" + myCar.color);
        System.out.println("제작회사" + myCar.maxSpeed);
        System.out.println("제작회사" + myCar.speed);

        myCar.speed = 60;
        System.out.println("수정된속도" + myCar.speed);
    }
}
