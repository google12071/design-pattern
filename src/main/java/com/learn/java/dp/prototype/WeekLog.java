package com.learn.java.dp.prototype;

import lombok.Builder;

import java.io.*;

/**
 * 工作日报(通过序列化对象实现对象的深度拷贝)
 */
@Builder
public class WeekLog implements Serializable {
    private int employeeNo;
    private String name;
    private String dept;
    private String content;
    private Attachment attachment;

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public WeekLog deepClone() throws IOException, ClassNotFoundException {
        //对象写入字节流
        ByteArrayOutputStream bas = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bas);
        oos.writeObject(this);

        //对象从流中读出
        ByteArrayInputStream bis = new ByteArrayInputStream(bas.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeekLog) ois.readObject();
    }
}
