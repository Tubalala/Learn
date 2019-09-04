package day03.test02.test03;

public class Demo {
    public static void print(String name,Personbuilder pb){
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        print("涂成",name->new Person(name));
        print("涂成",Person::new);
    }
}
