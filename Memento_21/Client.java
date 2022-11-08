package com.javapractice.designTypes.Memento_21;


//        Originator：原发器，负责创建一个备忘录，用于记录当前对象的内部状态，也可以使用它来利用备忘录恢复内部状态，同时原发器还可以根据需要决定 Memento 存储 Originator 的哪些内部状态。
//                Memento：备忘录，用于存储 Originator 的内部状态，并且可以防止 Originator 以外的对象访问Memento。在备忘录 Memento 中有两个接口，其中 Caretaker 只能看到备忘录中的窄接口，它只能将备忘录传递给其他对象。Originator可以看到宽接口，允许它访问返回到先前状态的所有数据。
//                Caretaker: 负责人，对备忘录 Memento 进行管理，保存和提供备忘录，但不能对备忘录的内容进行操作和访问，只能够将备忘录传递给其他对象。


public class Client {
    public static void main(String[] args) {
        //打BOSS之前：血、蓝全部满值
        Role role = new Role(100, 100);
        System.out.println("----------大战BOSS之前----------");
        role.display();

        //保持进度
        Caretaker caretaker = new Caretaker();
        caretaker.memento = role.saveMemento();

        //大战BOSS，快come Over了
        role.setBloodFlow(20);
        role.setMagicPoint(20);
        System.out.println("----------大战BOSS----------");
        role.display();

        //恢复存档
        role.restoreMemento(caretaker.getMemento());
        System.out.println("----------恢复----------");
        role.display();

    }
}
