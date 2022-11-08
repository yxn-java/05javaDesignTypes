package com.javapractice.designTypes.Composite_11;
//组合模式：将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性。
public class Main {
    public static void main(String[] args){
        Employee CEO = new Employee("John","CEO");

        Employee headSales = new Employee("Rob","Sales");

        Employee headMarketing = new Employee("Mike","Marketing");

        Employee programmer1 = new Employee("Lili","Programmer");
        Employee programmer2 = new Employee("Bob","Programmer");

        Employee tester1 = new Employee("Jack","Tester");
        Employee tester2 = new Employee("Tom","Tester");

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(tester1);
        headSales.add(tester2);

        headMarketing.add(programmer1);
        headMarketing.add(programmer2);

        //print all employees of the organization
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
