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
public class Soy extends CondimenDecrator{
     
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public Float Cost() {
        return beverage.Cost()+3f; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescript() {
        return super.getDescript()+ "Soy "; //To change body of generated methods, choose Tools | Templates.
    }
    
            
    
}
