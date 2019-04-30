package thisIsJava.chapter7.exercise05;

public class Child extends Parent {
    private int studentNo;

//    public Child(String name, int studentNo){
//        this.name = name;
//        this.studentNo = studentNo;
//    }

    /*
        컴파일 에러가 발생하는 이유 :
            부모생성자에서 기본 생성자가 아닌 사용자가 지정해둔 생성자가 있기때문에, 자식 생성자는 이를 상속받아서
            super(name); 이라고 해줘야한다.
    */

    public Child(String name, int studentNo){
        super(name);
        this.studentNo = studentNo;
    }
}
