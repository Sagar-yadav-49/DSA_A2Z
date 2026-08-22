package javaCollectionFramework.WrapperClasses;

import com.sun.security.jgss.GSSUtil;

public class WrapperClasses {
    public static void main(String[] args) {
        // ways of object creation of wrapper classes
//        Integer obj1=new Integer(12); // deprecated

        Integer obj2=Integer.valueOf(12);

        Integer obj3=12; // Autoboxing, primitive can be converted into its object of corresponding wrapper class

        int age=obj2; // Unboxing, object of wrapper class can be converted into its corresponding primitive type

        // valueOf() method
        Integer obj4=Integer.valueOf("12"); // convert string into integer
        System.out.println(obj4*10); // 120

        Boolean bool=Boolean.valueOf(false);
        Boolean bool2=Boolean.valueOf("false");


    }
}