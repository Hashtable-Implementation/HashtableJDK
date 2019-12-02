package com.kamaldwip.coding.hashtable.jdk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Employee kamal = new Employee("Kamaldwip","Chaudhury",585199);
        Employee kishore = new Employee("Kishore","Choudhury",687125);
        Employee prateek = new Employee("Prateek","Sahu",565312);
        Employee parag = new Employee("Parag","Roy",654123);
        Employee kaushik = new Employee("Kaushik","Talukdar",585192);
        Employee abhinav = new Employee("Abhinav","Borgohain",585162);

        Map<String,Employee> hashMap = new HashMap<String, Employee>();

        hashMap.put("Chaudhury",kamal);
        hashMap.put("Choudhury",kishore);
        hashMap.put("Sahu",prateek);
        hashMap.put("Roy",parag);
        hashMap.put("Talukdar",kaushik);
        hashMap.put("Borgohain",abhinav);


        hashMap.forEach((k,v)-> System.out.println("Key : "+k+" Employee : "+v));

        System.out.println(hashMap.get("Choudhury"));

        System.out.println(hashMap.getOrDefault("someone",kamal));

        System.out.println(hashMap.containsKey("Sahu"));

        System.out.println(hashMap.remove("Roy"));


        Iterator<Employee> iterator = hashMap.values().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
