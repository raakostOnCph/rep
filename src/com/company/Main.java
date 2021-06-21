package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here


       // System.out.println(andreas.alder);


//        System.out.println(andreas);  // adressen på obj
//        System.out.println(andreas.hashCode()); //adressen på obj
//
//
//        nik = andreas;
//
//        System.out.println(nik.navn);
//
//        System.out.println(andreas.navn);

//        Person [] people = new Person[5];
//
//
//        Person charlotte = new Person("Charlotte", 53);
//        Person nik = new Person("Nik", 49);
//        Person peter = new Person("Peter", 59);
//        Person daniel = new Person("Daniel", 39);
//        Person andreas = new Person("Andreas", 37);
//
//        people[0] = charlotte;
//        people[1] = peter;
//        people[2] = daniel;
//        people[3] = andreas;
//        people[4] = nik;
//
//        List<Person> personList = new ArrayList<>(Arrays.asList(people));
//
//        personList.add(new Person("Nanna", 47));
//
//        System.out.println(personList.get(5).navn);
//
//        List<Person> personList1 = new ArrayList<>();
//        personList1.add(peter);


        Køretøj køretøj = new Køretøj("vej", 2000, 120, 200000);

        køretøj.hashCode();



//        List<LydIf> fartøjs = new ArrayList<>();
//
//        fartøjs.add(new Båd("vand", 5,"rund",2)) ;
//        fartøjs.add(new Færge("vand", 5, "smal",4, 400, 60));
//        fartøjs.add(new Køretøj("vej",56,12,23));
//
//
//
//        Båd båd = new Båd("vand", 5,"rund",2);
//
//        System.out.println(båd.enMetodeViArver());
//
//
//        Færge paulAnker = new Færge("vand", 5, "smal",4, 400, 60);
//
//        System.out.println(paulAnker.enMetodeViArver());
//
//
//        for (LydIf fartøj : fartøjs) {
//
//            System.out.println(fartøj.sigLyd());
//        }



        Person ulla = new Person("Ulla", 37);

        Båd martha = new Båd("Vand",1000, "rund", 3);

       // System.out.println(ulla.navn);


        Object obj = new Object();

        obj = ulla;

        System.out.println(ulla.navn);

        System.out.println(((Person) obj).navn);


        Person holger = new Person("h", 66);




    }




}
