public class TestDriver{
  public static void main(String[] args){
    Employee e1= new Employee("Kamlesh", 240);
    Manager e2 = new Manager("Kamlesh", 240, "Engineer");
    System.out.println(e1);
    System.out.println(e2);
  }
}