package com.learn.java.dp.prototype;

import java.io.IOException;

public class PrototypeClient {
    public static void main(String[] args) {
        ConcretePrototypeA sourceA = new ConcretePrototypeA(1, 2);
        ObjectReference reference = new ObjectReference(1);
        sourceA.setReference(reference);
        ConcretePrototypeA targetA = sourceA.clone();
        System.out.println(sourceA == targetA);
        System.out.println(sourceA.getA() == targetA.getA());
        System.out.println(sourceA.getB() == targetA.getB());
        System.out.println(sourceA.getReference() == targetA.getReference());

        Attachment attachment = new Attachment("attachment");
        WeekLog weekLog = WeekLog.builder().
                employeeNo(1)
                .name("张三")
                .dept("研发部")
                .content("张三的周报")
                .attachment(attachment).build();
        try {
            WeekLog clone = weekLog.deepClone();
            System.out.println(weekLog == clone);
            System.out.println(weekLog.getAttachment() == clone.getAttachment());
            System.out.println(weekLog.getEmployeeNo() == (clone.getEmployeeNo()));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
