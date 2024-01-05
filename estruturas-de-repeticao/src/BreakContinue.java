public class BreakContinue {
  public static void main(String[] args) {
    for(int n = 1; n <=5 ; n++){
      if(n == 3){
        break;
      }
      System.out.println("Break"+ n);
  };
    for(int i = 1; i <=5 ; i++){
      if(i == 3){
        continue;
      }
      System.out.println("Continue " + i);
    }
  }
}
