package com.company;
import  com.company.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Numarul angajatilor este : ");
        int numar =myObj.nextInt();
        ArrayList<Employee>  angajati = new ArrayList<>(){
            for(int i=0; i< numar; i++){
                Employee angajat = new Employee;
                System.out.println("Numele angajatului este: "+i+1);

                String name = myObj.nextLine();
                angajat.setName(name);
                System.out.println("Salariul angajatului este: " + i+1);
                double hourRate = myObj.nextDouble();
                angajat.setHourRate(hourRate);


            }
        }
    }
}
