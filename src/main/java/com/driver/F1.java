package com.driver;

public class F1 extends Car {
     String name;
     boolean isManual;
    public F1(String name, boolean isManual) {
        super(name,4,2,1,isManual,"",8);


        this.name=name;
        this.isManual=isManual;
    }
    Car c1=new Car(name,4,2,1,isManual,"",8);

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
newSpeed = c1.getSpeed()+rate;
        if(newSpeed <= 0) {
           c1.setGear(1);
            System.out.println("gear "+c1.getGear());
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            if(newSpeed>0 && newSpeed <51 ){
                c1.setGear(1);
                //System.out.println("gear "+c1.getGear());
            }
            else if(newSpeed>50 && newSpeed <101 ){
                c1.setGear(2);
                //System.out.println("gear "+c1.getGear());
            }
            else if(newSpeed>100 && newSpeed <151 ){
                c1.setGear(3);
               // System.out.println("gear "+c1.getGear());
            }
            else if(newSpeed>150 && newSpeed <201 ){
                c1.setGear(4);
                //System.out.println("gear "+c1.getGear());
            }
            else if(newSpeed>200 && newSpeed <250 ){
                c1.setGear(5);
                //System.out.println("gear "+c1.getGear());
            }
            else { c1.setGear(6);
               // System.out.println("gear "+c1.getGear());
            }

        }
    }
}
