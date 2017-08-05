/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author web-bhumi
 */
public class MethodTest {
    private String name;
    private String address;
    private int age;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        if(age>=18)
        this.age = age;
    }
    public static void main(String[] args) {
        MethodTest mt = new MethodTest();
        mt.setName("Anjali");
        mt.setAddress("Indore");
        mt.setAge(22);
            
        System.out.println("Name- "+mt.getName()+" Address:- "+mt.getAddress()+" age:-"+mt.getAge());
    }
    
}
