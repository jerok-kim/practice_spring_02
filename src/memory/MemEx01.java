package memory;

class Hello {
    static String hello = "Hello";
}

public class MemEx01 {

    static int num = 10;  // static
    String name = "Jerok";  // heap

    public void myPrint() {
        System.out.println(num);
        // System.out.println(value);
    }

    public void gogo() {
        int value = 50;  // local variable
    }

    public static void m1() {
        // System.out.println(name);
    }

    public static void main(String[] args) {
        int sum = 20;
        System.out.println(num);
        System.out.println(Hello.hello);

        MemEx01 me = new MemEx01();  // static을 제외한 모든 것이 heap에 뜬다.
        System.out.println(me.name);
        me.gogo();
    }

}
