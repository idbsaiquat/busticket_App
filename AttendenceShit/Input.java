
package AttendenceShit;

import java.util.Scanner;

public class Input {
    void input(){
        String name,mb,ccard,pass;
        Scanner input = new Scanner (System.in);
        System.out.println("*** ENTER YOUR INFORMATION ***");
        
        System.out.println("NAME := ");
            name=input.next();
        System.out.println("MOBILE NUMBER := ");
            mb=input.next();
        System.out.println("CREDIT CARD := ");
            ccard=input.next();
        System.out.println("PASSWORD := ");        
            pass=input.next();
     System.out.println("*** CONFARMATION SMS ***");       
        System.out.println("NAME ="+name);
        System.out.println("PHON NUMBER ="+mb);
     System.out.println("*** YOUR TICKET IS CONFARM ***");    
    }
    
}
