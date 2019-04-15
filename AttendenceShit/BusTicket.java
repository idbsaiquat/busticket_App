
package AttendenceShit;

import java.util.Scanner;


public class BusTicket {
    public static void main(String [] args){
        Input in = new Input();
        Scanner input = new Scanner (System.in);
        System.out.println("*** CHOOSE YOUR DESTINATION ***");
        System.out.println("1. DHAKA TO KUSHTIA------(FARE = 1000)");
        System.out.println("2. DHAKA TO POTUAKHALI---(FARE = 1500)");
        System.out.println("3. DHAKA TO CHITTAGONG---(FARE = 2000)");
        System.out.println("4. DHAKA TO RAJSHAI------(FARE = 1800)");
        System.out.println("5. DHAKA TO KHULNA-------(FARE = 1500)");
        
        System.out.println("SELECT = ");
        
        int destenituon = input.nextInt();
        
        if(destenituon ==1|| destenituon == 2|| destenituon ==3|| destenituon ==4|| destenituon ==5){
            
        System.out.println("*** CHOOSE YOUR SEAT NUMBER ***");
        
        System.out.println("A1         A2   A3");
        System.out.println("B1         B2   B3");
        System.out.println("C1         C2   C3");
        System.out.println("D1         D2   D3");
        System.out.println("E1         E2   E3");
        System.out.println("F1         F2   F3");
        System.out.println("G1         G2   G3");
        System.out.println("H1         H2   H3");
        System.out.println("I1         I2   I3");
        System.out.println("J1    J2   J3   J4");
        
        System.out.println("SELECT = ");
        
        String sitNumber=input.next();
        
        if(sitNumber.equals("A1")||sitNumber.equals("A2")|| sitNumber.equals("A3")||
           sitNumber.equals("B1")||sitNumber.equals("B2")|| sitNumber.equals("B3")||    
           sitNumber.equals("C1")||sitNumber.equals("C2")|| sitNumber.equals("C3")||
           sitNumber.equals("D1")||sitNumber.equals("D2")|| sitNumber.equals("D3")||
           sitNumber.equals("E1")||sitNumber.equals("E2")|| sitNumber.equals("E3")||    
           sitNumber.equals("F1")||sitNumber.equals("F2")|| sitNumber.equals("F3")||
           sitNumber.equals("G1")||sitNumber.equals("G2")|| sitNumber.equals("G3")||
           sitNumber.equals("H1")||sitNumber.equals("H2")|| sitNumber.equals("H3")||
           sitNumber.equals("I1")||sitNumber.equals("I2")|| sitNumber.equals("I3")||    
           sitNumber.equals("J1")||sitNumber.equals("J2")|| sitNumber.equals("J3")||
           sitNumber.equals("J4")
                )
        
        { 
            
         in.input();
        
        
        
            
        
        }
        
        else{
            
            System.out.println("Eror Input");
        
        };
        
            
            
        
        }else{
        
            System.out.println("Eror Input");
        
        }
        
    
    
    }
    
    
    
}
