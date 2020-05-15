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
public class CondimenDecrator extends Beverage{
    
    protected  Beverage beverage;// component

    public CondimenDecrator(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    } 
    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    } 
    
    @Override
    public Float Cost() {
        return beverage.Cost();
    }

    @Override
    public String getDescript() {
        return beverage.getDescript();
    }
    
     

     
    
}
