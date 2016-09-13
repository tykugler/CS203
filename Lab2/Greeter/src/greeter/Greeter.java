/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;

/**
 * @author tykugler
 */

/** 
 A class for producing simple greetings.
 */
public class Greeter
{ /**
Constructs a Greeter object that can greet a person or entity.
@param aName the name of the person or entity who should
be addressed in the greetings.
*/
public Greeter(String aName)
{ name = aName;
}

/**
Greet with a "Hello" message.
@return a message containing "Hello" and the name of the greeted 
person or entity.
*/
public String sayHello()
{ return "Hello, " + name + "!";
}

/**
Sets the name field of a Greeter object.
@param newName the name of the person or entity who should be addressed
in the greetings.
 */
public void setName(String newName)
{
    this.name = newName;
}

/**
Swaps two names between two Greeter objects.
@param other a Greeter whose name will be swapped with the name of 
the object that calls this method.
 */
public void swapNames(Greeter other)
{
    String nameOne = this.name;
    String nameTwo = other.name;
    this.setName(nameTwo);
    other.setName(nameOne);
}

private String name;
}
