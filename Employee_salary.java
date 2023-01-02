/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.employee_salary;
import java.util.Scanner;
/**
 *
 * @author ascom
 */
public class Employee_salary {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter your curent salart");
         double curr_salary=input.nextDouble();
         double taxs=.02*curr_salary;
         double sal_after=curr_salary-taxs;
         System.out.println("taxs : "+taxs);
         System.out.println("salary after taxs :"+sal_after);
         double incentive=500;
         System.out.println("incentive =500 .");
         System.out.println("net salary = "+(incentive+sal_after));
        
    }
}
