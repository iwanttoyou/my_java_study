package demo;

interface action{
    void lamda(String person,double i);
}
public class test {
    public static void main(String[] args) {
        action e=(String a,double b)-> System.out.println("hello world");
        System.out.println(e);
        demo dd=new demo("dd",1.0);
        dd.test1((String a,double b)-> System.out.println("hello world"));
    }
}

class demo {
    private String name = null;
    private double i = 0;

    demo(String name, double i) {
        this.name = name;
        this.i = i;
    }

    public double getI() {
        return i;
    }

    public String getName() {
        return name;
    }
    public void test1(action e){
        e.lamda("",1);
    }
}
