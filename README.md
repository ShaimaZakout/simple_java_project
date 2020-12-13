# simple_java_project "product bag "
Project Description
You have the following products data file:
1,name1,desc1,100,50,50,D
2,name2,desc2,50,12,W
3,name3,desc3,30,20,W
4,name4,desc4,80,60,55,D
--------------
For each record, the following data are common:
product id, product name, product description, product price
For records that end with D (Dimensional), the two values before the D
letter are product width and length.
For records that end with W (Weighted), the value before the W letter
represents the product weight.
------------
Create an abstract class named Product which contains the following
attributes: product id, product name, product description and product price.
and calcPay() abstract method.
Create a sub class from the Product class to represents the Dimensional
Product, add the following attributes: width and length. Implements the
calcPay() so that it returns the result of (width * length * price).
Create another sub class from the Product class to represents the
Weighted Product, add the following attribute: weight. Implements the
calcPay() so that it returns the result of (weight * price).
-------------
When the program run, the following choices appear:
1- Show All Products
2- Add Product
3- Delete Product
4- Edit Product
5- Calculate Total Price
6- Save data to file
7- Exit
