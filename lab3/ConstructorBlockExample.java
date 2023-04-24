public class ConstructorBlockExample{
  {System.out.println("first");}
  public ConstructorBlockExample(){
    System.out.println("no params");
  }
  public ConstructorBlockExample(String p1){
    System.out.println("1 param");
  }
  {System.out.println("second");}
  public static void main(String[] args){
    ConstructorBlockExample const1= new ConstructorBlockExample();
    System.out.println();
    ConstructorBlockExample const2= new ConstructorBlockExample("lmao");
  }
}