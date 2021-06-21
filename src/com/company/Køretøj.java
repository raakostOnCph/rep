package com.company;

public class Køretøj extends Fartøj implements LydIf
{

    int hastighed;
    int pris;


    public Køretøj(String medie, int vægt, int hastighed, int pris)
    {
        super(medie, vægt);
        this.hastighed = hastighed;
        this.pris = pris;
    }


    public String dyt() {

        return "dyt dyt";

}

    @Override
    public String sigLyd()
    {
        return dyt();
    }
}
