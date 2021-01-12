package hello;

public interface world {
    void hello();
}
interface demo2{
    void demo(String name);
}
class Person{
    private String name=null;
    private double i=0;
    Person(String name,double i){
        this.i=i;
        this.name=name;
    }
    public double getI() {
        return i;
    }
    public String getName() {
        return name;
    }
    
}

class student extends Person implements world{   
    public student(String name, double i) {
        super(name, i);
    }
    public void hello() {
    System.out.println("hello world!!!");
}
   public world try1World(world e){
    e.hello();
    return e;   
   }
   public demo2 trydeDemo1(demo2 d){
       d.demo("name");
       return d;
   }
}

class demo1{
    public static void main(String[] args) {
        Person person=new Person("dd", 1);
        double a=person.getI();
        String b=person.getName();
        System.out.println(a+b);
        Person person1=new student("ss",0);      
        System.out.println(person1.getName());
        student stu=(student)person1;
        stu.hello();
        stu.try1World(()->System.out.println("hello world !!!!!"));
        stu.trydeDemo1(d->System.out.println("name"));
    }
}
