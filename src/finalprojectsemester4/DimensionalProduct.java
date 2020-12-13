/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectsemester4;

/**
 *
 * @author hp probook 450g5
 */
public class DimensionalProduct extends Product {

    public double width;
    public double length;

public DimensionalProduct (){}

    public DimensionalProduct(double width, double length, String product_name, String product_description, String p, int product_id, double product_price) {
        super(product_name, product_description, p, product_id);
        this.width = width;
        this.length = length;
    }

   

    @Override
    public double calcPay() {
        return width*length*getProduct_price() ; 
    }



  
    
    

}
