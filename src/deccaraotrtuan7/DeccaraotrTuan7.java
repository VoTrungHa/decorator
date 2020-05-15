/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deccaraotrtuan7;

/**
 *
 * @author hp-pc
 */
public class DeccaraotrTuan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Beverage beverage=new DarkRoast();
        beverage=new Milk(beverage); 
        beverage=new Mocha(beverage);
        
        System.out.println(beverage.getDescript()+": "+ beverage.Cost());
        beverage=new Milk(beverage);
        
    }
    
}
