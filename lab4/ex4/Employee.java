public class Employee{
  private String name;
  private double salary;

  public Employee(String name, double salary){
    this.name=name;
    this.salary=salary;
  }
  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return name;
  }
  public void setSalary(double salary){
    this.salary=salary;
  }
  public double getSalary(){
    return salary;
  }
  @Override
  public String toString(){
    return "Name: "+name+", Salary: "+ salary;
  }
}