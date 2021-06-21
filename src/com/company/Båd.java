package com.company;

public class Båd extends Fartøj implements LydIf
{
    String køl;
    int skruer;

    public Båd(String medie, int vægt, String køl, int skruer)
    {
        super(medie, vægt);
        this.køl = køl;
        this.skruer = skruer;
    }

    @Override
    public String enMetodeViArver()
    {
        return "det her kommer fra klasse båd";
    }

    public String ringerMedSkibsKlokken() {

        return "ding ding";
    }

    @Override
    public String sigLyd()
    {
        return ringerMedSkibsKlokken() + " " + enMetodeViArver() ;
    }
}
