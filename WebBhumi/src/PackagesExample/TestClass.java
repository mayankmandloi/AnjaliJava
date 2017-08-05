/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackagesExample;

import Methods.MethodTest;

/**
 *
 * @author web-bhumi
 */
public class TestClass {
    public static void main(String[] args) {
        MethodTest mt1 = new MethodTest();
        mt1.setName("Mayank");
        mt1.setAddress("Web Bhumi");
        mt1.setAge(28);
        System.out.println(mt1.getName()+mt1.getAddress()+mt1.getAge());
    }
}
