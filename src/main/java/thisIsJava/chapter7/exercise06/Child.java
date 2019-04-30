package thisIsJava.chapter7.exercise06;

public class Child extends Parent{
    private String name;

    public Child(){
        this("홍길동");
        //자기자신의 생성자를 호출한다.
        System.out.println("chile() call");
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Chile(String name) call");
    }
}
