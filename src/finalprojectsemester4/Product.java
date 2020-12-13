/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectsemester4;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp probook 450g5
 */
public abstract class Product {

    private int product_id;
    private String product_name;
    private String product_description;
    private double product_price;
    private static ArrayList<Product> products = new ArrayList<>();
    static Product[] product = new Product[1];

    public Product(String product_name, String product_description, String p, int product_id) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_price = product_price;
    }
    private Scanner s = new Scanner(System.in);

    @Override
    public String toString() {
        return " { " + "Product Name=" + getProduct_name() + ",Product Id =" + getProduct_id() + ",Product Description =" + getProduct_description() + ", Product Price=" + getProduct_price() + " }";
    }

    public double calcPay() {

        return getProduct_price();
    }

    public Product() {
    }

//   public double Calculate_Total_Price (){
//      
//      return ;
//}
    /**
     * @return the product_id
     */
    public int getProduct_id() {
        return product_id;
    }

    /**
     * @param product_id the product_id to set
     */
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    /**
     * @return the product_name
     */
    public String getProduct_name() {
        return product_name;
    }

    /**
     * @param product_name the product_name to set
     */
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    /**
     * @return the product_description
     */
    public String getProduct_description() {
        return product_description;
    }

    /**
     * @param product_description the product_description to set
     */
    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    /**
     * @return the product_price
     */
    public double getProduct_price() {
        return product_price;
    }

    /**
     * @param product_price the product_price to set
     */
    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    /**
     * @return the products
     */
    public static ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * @param aProducts the products to set
     */
    public static void setProducts(ArrayList<Product> aProducts) {
        products = aProducts;
    }

    /**
     * @return the s
     */
    public Scanner getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(Scanner s) {
        this.s = s;

    }

    public void choices()  {
        boolean check = true;
        while (check) {

            System.out.println(">>>>> Choices <<<<< \n" + "1- Show All Products \n" + "2- Add Product \n" + "3- Delete Product  \n"
                    + "4- Edit Product  \n" + "5- Calculate Total Price \n" + "6- Save data to file  \n"
                    + "7- Exit. " +"\n Enter your choice: ");

            int input = s.nextInt();
            s.nextLine();
            switch (input) {
                case 1:
                    Show_All_Products();
                    break;
                case 2:
                    Add_Product();
                    break;
                case 3:
                    Delete_Product();
                    break;
                case 4:
                    Edit_Product();
                    break;
                case 5:
                    Calculate_Total_Price();
                    break;
//                case 6:
//                    Save_data_to_file();
//                    break;
                case 7:
                    check = false;
                    break;

            }
        }

    }

    public void Show_All_Products() {
        for (Product m : getProducts()) {
            System.out.println(m.toString());
        }
    }

    public void Add_Product() {
        boolean isFound = false;
        s.nextLine();
        do {
            System.out.println(">>>>> Add Product <<<<< ");
            System.out.println("Enter ID :");
            String id = s.nextLine();
            System.out.println("Enter Name");
            String Name = s.nextLine();
            System.out.println("Enter description");
            String p = s.nextLine();
            System.out.println("Enter price");
            int in = s.nextInt();
            System.err.println("The Product has been successfully added . :)");
            isFound = false;
            Product a = new Product(id, Name, p, in) {
            };
            product[0] = a;
            // isFound=true;
        } while (isFound);
    }

    public void Delete_Product() {
        s.nextLine();
        System.out.println(">>>>>  Delete Product <<<<<");
        System.out.println("Enter id:");
        String id = s.nextLine();
        boolean tf = false;
        for (Product m : getProducts()) {
            if (id.equals(m.getProduct_id())) {
                getProducts().remove(m);
                tf = true;
                break;
            }
        }
        if (tf) {
            System.out.println("The Product has been successfully deleted. :)");
        } else {
            System.out.println("The Product has been successfully deleted. :(");
        }

    }

    public void Edit_Product() {
        s.nextLine();
        boolean tf = false;
        System.out.println(">>>>>  Edit Product <<<<<");
        System.out.println("Enter id:");
        String id = s.nextLine();

        for (Product a : getProducts()) {
            if (id.equals(a.getProduct_id())) {
                System.out.println("Enter New ID:");
                int AAA = s.nextInt();
                a.setProduct_id(AAA);
                tf = true;
                break;
            }
        }
        if (tf) {
            System.out.println("The Product data was successfully Edit. :)");
        } else {
            System.out.println("The  Product data wasn't successfully Edit. :( ");
        }

    }

    public void Calculate_Total_Price() {
        System.out.println(getProduct_price() + getProduct_price());

    }

}
