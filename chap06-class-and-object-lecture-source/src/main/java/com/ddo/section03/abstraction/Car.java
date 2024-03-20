package com.ddo.section03.abstraction;

public class Car {
    private boolean isOn;
    private int speed;
    public void startUp(){
       if(isOn){
           System.out.println("이미 시동이 걸려 있습니다.");
       }else {
           this.isOn=true;
           System.out.println("시동을 걸었습니다. 이제 출발할 준비가 되어있습니다.");
       }
    }
    public void go(){
        int speed = 0;
        if(isOn){
            System.out.println("차가 앞으로 움직입니다.");
            this.speed += 10;
            System.out.println("현재 차의 시속은 "+this.speed + "km/h입니다.");
        }else{
            System.out.println("차의 시동이 걸려있지 않았습니다. 시동을 먼저 걸어주세요.");
        }
    }
    public void stop(){
        if (isOn){
            if (this.speed > 0){
                this.speed=0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
            } else{
                System.out.println("차는 이미 멈춰있는 상태입니다.");
            }
        }else{
            System.out.println("차의 시동이 걸려있지 않았습니다. 시동을 먼저 걸어주세요.");
        }
    }
    public void turnOff(){
        if(isOn){
            if (speed > 0){
                System.out.println("달리는 상태에서 시동을 끌 수 없습니다. 차를 우선 멈춰주세요.");
            }else{
                this.isOn = false;
                System.out.println("시동을 끕니다. 다시 운행하시려면 시동을 켜주세요.");
            }
        }else {
            System.out.println("이미 시동이 꺼져있는 상태입니다. 시동 상태를 확인해주세요.");
        }
    }
}
