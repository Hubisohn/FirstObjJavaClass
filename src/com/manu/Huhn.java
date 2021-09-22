package com.manu;

public class Huhn {

    public int futto = 0;

    public void setFutto(int futto) {
        this.futto = this.futto + futto;
    }

    public Ei legei(){
        if (this.futto >= 50) {
            System.out.println("Ich habe ein Ei gelegt!");
            this.futto = this.futto - 50;
            return new Ei();
        }else{
            System.out.println("Ich kann kein Ei legen");
            return null;
        }
    }
}
