

import java.io.File;


public class Test {
    @org.junit.Test
    public void t1(){
        //当前项目根路径
        //D:\JAVA\javaSoftware\git\Git download\netty-demo\version\
        String path = System.getProperty("user.dir") ;
        String path2 = System.getProperty("user.dir") + File.separator;
        System.out.println(path2);
    }

}
