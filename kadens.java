public class kadens {
  public static void kadens(int numbers[]){
    int cs = 0;
    int ms = Integer.MIN_VALUE;
    for(int i = 0; i<numbers.length; i++){
      cs+=numbers[i];
      if(cs<0){
        cs=0;
      }
    }
    ms=Math.max(cs,ms);
    System.out.print(ms);
  }
  public static void main(String args[]){
    int numbers[] = {1,2,3,4,5,6,7};
    kadens(numbers);
  }
}
