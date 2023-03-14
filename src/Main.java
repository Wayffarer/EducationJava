import db.DB;

public class Main {
    public static void main(String[] args) {
      DB db = new DB();

      final int count = 35;

      Person obj1 = new Person();
      Person obj2 = new Person();
      Person obj3 = new Person();
      Person obj4 = new Person();

      Person.getCount();

//      Person.count = 5;
//      System.out.println(Person.count);
    }
    public static void ifo(){
        System.out.println("Hello");
    }

    public static void ifo(String word){
        System.out.println(word + "!");
    }
}