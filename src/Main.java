import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  String[] name = {"Sarah", "John"};
        int[] age = {30, 15};



        Person alex = new Person();
        Person anna  = new Person();
        alex.name = "Alex";
        alex.age = 30;
        anna.name = "Anna";
        anna.age = 15;
        System.out.println("имя - " + anna.name);



        Dog muha = new Dog();
        muha.name = "Муха";
        muha.age = 200;
        muha.poroda = "Лайка";
        System.out.println("Имя:" + muha.name );
        System.out.println("Возраст:" + muha.age + " лет" );
        System.out.println("Порода:" + muha.poroda );



        Person leha = new Person("Леха", 25);
        Person lena = new Person("Лена", 30);
        System.out.println("Имя " + leha.getName() + " возраст " + leha.getAge());
        System.out.println("Имя " + leha.getName() + " возраст " + leha.getAge());
        leha.setAge(18);
        System.out.println("Имя " + leha.getName() + " возраст " + leha.getAge());







      PersonService personService = new PersonService("ЛЕха", 28);

      if (PersonService.isAdult()){
         System.out.println("ИДи в бар");
      }else {
        System.out.println("Иди в школу");
      }




      PhoneBook phoneBook = new PhoneBook();
      phoneBook.addContact(" Санта", "+79374562345");
      phoneBook.addContact(" Нинтендо", "+79372352352");
      phoneBook.addContact(" Ps4", "+79323231523");
      phoneBook.addContact(" Ps5", "+79332222222");
      phoneBook.printAllContacts();
      phoneBook.removeContact(" Ps4");
      phoneBook.printAllContacts();
        System.out.println(phoneBook.getCurrentSize());
    }


        Person p1  = new Person("Иван", 25);
        Person p2  = p1;
        System.out.println(p1.equals(p2));

       */
        Book book = new Book("Разработка Java",500,"Программирование","Adam Sendler");
        Magazine magazine = new Magazine("Все для ПО",300, "Компы");
        book.printContent();
        magazine.getContent();
    }
}

