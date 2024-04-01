/*
class testMe {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }
}

class Student {

    Student(){}
    Student(String name, int ban, int no, int kor, int eng, int math){
       this. name = name;
       this. ban = ban;
       this. no = no;
       this. kor = kor;
       this. eng = eng;
       this. math = math;
    }
    String name; //학생이름
    int ban; //반
    int  no;//번호
    int kor, eng, math;//국어, 영어, 수학

    public String info(){
        return name + ban + no + kor + eng + math+ ","+
                (((int)((kor + eng +math)/3f*10 + 0.5f))/10f);

    }
}

*/
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class testMe {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // "Dog barks"
        myCat.makeSound(); // "Cat meows"
    }
}
