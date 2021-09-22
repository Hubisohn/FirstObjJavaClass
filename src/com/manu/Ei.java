package com.manu;

public class Ei {

    public int state = 1;

    public Huhn schlupf() {
        if (this.state == 1) {
            System.out.println("Ein Huhn schlüpfte gerade!");
            this.state = 0;
            return new Huhn();
        } else if (this.state == 0) {
            System.out.println("Kein Ei zur verfügung!");
            return null;
        } else {
            return null;
        }
    }

    public Ei zerstören() {
        if (this.state == 1) {
            System.out.println("Du hast das Ei zerstört!");
            this.state = 0;
            return null;
        }else{
            System.out.println("Du kannst kein Ei zerstören!");
            return null;
        }
    }
}
