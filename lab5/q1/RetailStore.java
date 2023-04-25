public class RetailStore{
  private int[] itemId={1001,1002,1003,1004,1005};
  private double[] price={13.5,18.00,19.50,25.50};

  private double computePrice(int value){
    for(int i =0;i<price.length;i++){
      if(itemId[i]==value){
        return price[i];
      }
    }
    return price[value];
  }
  public static void main(String[] args){
    RetailStore retailOne= new RetailStore();
    System.out.println("price of item id 1002 is "+retailOne.computePrice(1002));
    System.out.println("price of item id 1004 is "+retailOne.computePrice(1004));
  }
}