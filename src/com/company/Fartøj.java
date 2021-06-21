package com.company;

public class Fartøj
{
    String medie;

    int vægt;

    public Fartøj(String medie, int vægt)
    {
        this.medie = medie;
        this.vægt = vægt;
    }

    public String enMetodeViArver() {

        return "det her kommer helt oppe fra klassen fartøj";
    }
}
