package com.PracticeCliff;

public class Die {
    public int numberOfSides;
    public int faceUpValue;

    public Die(){
        numberOfSides = 6;
    }

    //Example of overloading
    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

   public void roll() {
        faceUpValue = (int) ((Math.random() * numberOfSides) + 1);

   }


}
