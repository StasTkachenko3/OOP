import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) { // конструктор. без него не сделаем Get и Set  ALT+Insert
        this.name = name;
        this.age = age;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAge() {
        return getAge();
    }

    /* public void setAge(int age) {
         if (age < this.age) {
             throw new IllegalArgumentException("Возраст меньше текущего!");
         }
         if (age < 0 ){
             throw new IllegalArgumentException("Возраст отрицательный!");
         }
         this.age = age;
     }
     //public boolean isAdult (){
     //  return this.getAge() > 18;

     @Override
     public String toString() {
         return "Person{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 '}';


    public void increaseAge(int increment) {
        if (increment < 0) {
            throw new IllegalArgumentException("Возраст отрицательный!");
        }
        this.age = age + increment;

     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}


