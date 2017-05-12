package cn.edu.zju;

/**
 * Created by I337169 on 5/12/2017.
 */
public class MyClass {

    public int testHello(String input){
        if ("a".equalsIgnoreCase(input)){
            return 0;
        }else {
            return 1;
        }
    }
    public static void main(String[] args) {
       MyClass myClass = new MyClass();
        System.out.println(myClass.testHello("a"));
        System.out.println(myClass.testHello("b"));
    }
}

