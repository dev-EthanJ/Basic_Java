public class CarManager {
  public static void main(String args[]) {
    //코드 내용
    Car dogCar = new Car();
    Car cowCar = new Car();
    
    dogCar.speedUp();
    dogCar.speedUp();
    System.out.println(dogCar.getCurrentSpeed());
    
    dogCar.breakDown();
    System.out.println(dogCar.getCurrentSpeed());
  }
}