/**
 * 
 */
package basicjavaprograms;

/**
 * @author anilkumar06
 *
 */
abstract class Class1 {

public static String name;

public Class1(String name) {

System.out.println("calling base class constructor");

}

}

class test extends Class1 {

public test(String name) {

super(name);
}

}




