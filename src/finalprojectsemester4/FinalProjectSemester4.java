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
public class FinalProjectSemester4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            DimensionalProduct n = new DimensionalProduct();
            n.choices();
            WeightedProduct s = new WeightedProduct();
            n.choices();

        } catch (Exception ex) {
            System.out.println(ex + "error try again");
        }

    }

}
