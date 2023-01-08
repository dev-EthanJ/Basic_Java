public class Profile {

  String name;
  int age;

  public void setName(String str) {
    name = str;
  }

  public void setAge(int val) {
    age = val;
  }

  public void printName() {
    System.out.print(name);
  }

  public void printAge() {
    System.out.print(age);
  }

  public static void main(String [] args) {
    Profile profile = new Profile();

    profile.setName("Insung");
    profile.setAge(20);

    System.out.print("My name is ");
    profile.printName();
    System.out.println();

    System.out.print("My age is ");
    profile.printAge();
  }
}