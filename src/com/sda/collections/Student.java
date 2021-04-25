package com.sda.collections;

public class Student implements IPerson {
    public String name;

    @Override
    public void sayHello() {
        System.out.println("Hello by student!");
    }

    public void sayHelloFromInterfaceParam(IPerson personInterface) {
        System.out.println("method -> sayHelloFromInterfaceParam()");
        personInterface.sayHello();
    }


}
