/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;

/**
 *
 * @author tykugler
 */
 
/**
 A class for testing the Greeter class.
 */
public class GreeterApp
{ /**
 Creates Greeter object and prints out what is returned by sayHello().
 @param args 
 */
public static void main(String[] args)
{
Greeter amyGreeter = new Greeter("Amy");
Greeter briannaGreeter = new Greeter("Brianna");
briannaGreeter.setName("Bri");
amyGreeter.swapNames(briannaGreeter);
String greeting = amyGreeter.sayHello();
System.out.println(greeting);
}
}
