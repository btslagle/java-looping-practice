class App {
  public static void main(String args[]){
    App.forLoop();
    App.whileLoop();
    App.doWhileLoop();
  }

  private static void forLoop() {
    for (int i = 1; i < 11; i=i+1)
      System.out.println(i);
  }
  private static void whileLoop() {
    int i = 0;
    while(i<5){      
      System.out.println("I love Java");
      i++;
    }
  }
  private static void doWhileLoop() {
    int i = 0;
      do{
        System.out.println("I love Java");
        i++;
      }
      while(i <5);
  }
}
