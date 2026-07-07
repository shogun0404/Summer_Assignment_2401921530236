interface Test{
  void square();
}

class Arithmetic implements Test{
  @Override
  public void sqaure(){
    int n = 5;
    System.out.println("Square = " + (n * n));
  }
}
public class ToTestInt{
  public static void main(String[] args){
      Arithmetic obj = new Arithmetic();
      obj.square();
  }
}
