/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author holger
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Hello World");
        Person owner = new Person("Holger");
        System.out.println("Hello " + owner.getName());
        owner.setName("Peter");
        System.out.println("Hello " + owner.getName());

    }
    
}
