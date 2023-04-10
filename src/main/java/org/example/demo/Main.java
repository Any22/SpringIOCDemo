/********************************************************************************************************************
 * The idea behind this application is to show what tight coupling is ? and how that issue is resolved by making this
 * application loosely coupled , as tight coupling makes testing difficult and any error in one class  will
 * affect other dependent class .
 * Problem :  Here in this application problem is discussed when we are calling a method "registerAccount" from class Customer
 * we are bound to create an object of CurrentAccount or SavingsAccount in Customer class which is tight coupling
 * Solution : The most common way is Abstraction which makes the concept of loosely coupled application  possible .
 *******************************************************************************************************************/

package org.example.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.config.SpringConfig;


public class Main {
    public static void main(String[] args) {
       ApplicationContext applicationContext ;
       applicationContext= new AnnotationConfigApplicationContext(SpringConfig.class);

      // Implementing Inversion of control by creating register object first

       Register register = new CurrentAccount();

       Customer customer = applicationContext.getBean(Customer.class);

       customer.setCustomerName("Jonas");
       customer.setCustomerAge(34);
       customer.setRegister(register);

        System.out.println("Customer Name :" + ""+ customer.getCustomerName());
        System.out.println("Customer Age :" + ""+ customer.getCustomerAge());
        System.out.println(customer.registerAccount());


       
    }
}