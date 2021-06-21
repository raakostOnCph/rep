package com.company;

public class Færge extends Båd implements LydIf
 {
     int passagere;
     int antal_biler;

     public Færge(String medie, int vægt, String køl, int skruer, int passagere, int antal_biler)
     {
         super(medie, vægt, køl, skruer);
         this.passagere = passagere;
         this.antal_biler = antal_biler;
     }


     @Override
     public String enMetodeViArver()
     {
         return "from paulAnker with love";
     }

     public String tuder() {

         return "tuuuut tuuuut";
     }

     @Override
     public String sigLyd()
     {
         return tuder();
     }
 }
