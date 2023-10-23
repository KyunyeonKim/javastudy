package com.example.java;

 class Car {
    int gas;

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

class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.setGas(5);

        if(myCar.isLeftGaS()){
            System.out.println("출발합니다");

            myCar.run();
        }

        System.out.println("gas를 주입하세요");
    }
}
