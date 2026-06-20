import java.util.Random;

abstract class Compartment{
  public abstract String notice();
}
class FirstClass extends Compartment{
  @Override
  public String notice(){
    return "FirstClass";
    }
}
class Ladies extends Compartment{
  @Override
  public String notice(){
  return "Ladies";
  }
}
class General extends Compartment{
  @Override
  public String notice(){
  return "General";
  }
}
class Luggage extends Compartment{
  @Override
  public String notice(){
  return "Luggage";
  }
}

class TestCompartment{
  public static void main(String[] args){
    Compartment[] compartment = new Compartment[10] ;

    Random r = new Random();

    for(int i = 0 ; i < compartment.length ; i++){
      //generate num from 1 to 4 
      int k = r.nextInt(4) + 1 ;
      if(k == 1){
       compartment[i] = new FirstClass();
      }else if(k==2){
        compartment[i] = new Ladies();
      }else if(k==3){
        compartment[i] = new General();
      }else{
        compartment[i] = new Luggage();
      }
    }
    //displaying coach 
    for( Compartment coach : compartment){
      System.out.println(coach.notice() );
    }

    
  }
}
