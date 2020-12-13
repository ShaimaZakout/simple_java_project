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
public class WeightedProduct extends Product{
    public double  weight ;

   public WeightedProduct (){}
    public WeightedProduct(double weight, String product_name, String product_description, String p, int product_id, double product_price) {
        super(product_name, product_description, p, product_id);
        this.weight = weight;
    }

   

    @Override
    public double calcPay() {
        return weight *  getProduct_price() ;
    }
    
    
}
