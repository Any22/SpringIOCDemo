package org.example.dto;

import org.example.service.Register;

/**********************************************************************************************************
 * Now we are using inversion of flow b/c tight coupling is still there after introducing abstraction.
 * The customer object got created first then CurrentAccount was created .
 * we are inverting this flow now : creating the object of CurrentAccount first ,then object of Customer will be
 * created
 * The CurrentAccount object will be passed as a constructor to Customer object
 ************************************************************************************************************/

// Customer
public class Customer{
    private String customerName;
    private int customerAge;

    private AccountType accountType ;

   private Register register ;

    public Customer(){

    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }


    public String registerAccount() {
        String msg ;
        String accountType;

        System.out.println("Customer Name :" + ""+ getCustomerName());
        System.out.println("Customer Age :" + ""+ getCustomerAge());

        accountType = register.registerToAccount();

        if (accountType.equals("Current Account")){

                msg = "Customer registered to : "+" " + accountType;

          } else if (accountType.equals("Savings Account")){

                msg = "Customer registered to : "+" " + accountType;

           }  else{

                msg = "The customer is not registered yet";
          }

           return msg;

    }
}
