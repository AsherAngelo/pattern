package com.pattern.prototype;

import java.io.*;
import java.util.ArrayList;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/10 16:44
 * @Version 1.0
 */
public class Prototype implements Cloneable,Serializable{
    private String name;
    private ArrayList<String> list;
    private ClonePerson clonePerson;

    public ClonePerson getClonePerson() {
        return clonePerson;
    }

    public void setClonePerson(ClonePerson clonePerson) {
        this.clonePerson = clonePerson;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    //如果想要实现深复制，需要使用这个方法
    public Object deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Prototype clone = (Prototype)ois.readObject();
            return clone;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;


    }
}
