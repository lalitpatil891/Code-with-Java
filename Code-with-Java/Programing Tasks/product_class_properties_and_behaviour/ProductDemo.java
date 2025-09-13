/*  OOP Day - 1
Program 01:  #0001
-----------
Write a Program on OOPs to define Product class properties and behaviour.*/

package com.nit.product_class_properties_and_behaviour;

public class ProductDemo {

	public static void main(String[] args) {
		
	
		 // Directsly calling methods on a new Product object
        new Product() {{
            setProductData();
            getProductInfo();
          
        }};
	}

}

/*output 

Product Id is: 2
Product Name is: Lalit
Product Price is: 50
*/