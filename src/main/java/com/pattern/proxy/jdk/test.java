package com.pattern.proxy.jdk;

import com.pattern.proxy.staticproxy.Son;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/11 21:37
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) throws IOException {
        Object o = new JDKProxyMeipo().getInstance(new Zhaomengjie());
        //System.out.println(o);

        Son son = (Son)new JDKProxyMeipo().getInstance(new Zhaomengjie());
        System.out.println(son);
        System.out.println("****************************");
        Son son58 = (Son)new JDKProxy58().getInstance(new Zhaomengjie());
        son58.buy();
        System.out.println("-------------------------");
        son58.marry();


        //可以通过反编译来获取自动生成的类
        byte[] b = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Son.class});
        FileOutputStream fileOutputStream = new FileOutputStream("E://");
        fileOutputStream.write(b);
        fileOutputStream.close();
    }
}
