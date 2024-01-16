public class subArrays {
  public static void printsubarrays(int numbers[]){
    int currSum = 0;
    int maxSum= Integer.MIN_VALUE;
    for(int i = 0; i<numbers.length; i++){
      int start = i;
      for(int j = i; j<numbers.length ; j++){
        int end = j;
        currSum=0;
        for(int k = start; k<=end; k++){
          currSum+=numbers[k];}
          System.out.print(currSum + " ");
          if(currSum>maxSum){
            maxSum =currSum;
          }
        }
        
      }
      System.out.println("maximum Sum is " + maxSum + " ");
    }

  public static void maxSubarray(int numbers[]){
    int currsum = 0;
    int maxsum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];
    prefix[0] = numbers[0];
    for(int i = 1; i<numbers.length ; i++){
      prefix[i] = prefix[i-1]+numbers[i];
    }
    for(int i =0; i<numbers.length ; i++){
      for(int j =0;j<numbers.length; j++ ){
        currsum =0;
        currsum =(i==0)?prefix[j]:prefix[j]-prefix[i-1];
        if(currsum>maxsum){
          maxsum =currsum;
        }
      }
    }
    System.out.print(maxsum);
  }
public static void kadens(int numbers[]){
  int currsum = 0;
  int maxsum =Integer.MIN_VALUE;
 for(int i =0; i<numbers.length; i++){
  currsum = currsum +numbers[i];
  if(currsum<0){
    currsum =0;
  }
  maxsum =Math.max(currsum,maxsum);
 }
 System.out.print(maxsum);
  }

  
  public static void main(String args[]){
    int numbers[] = {1,2,3,4,5,6,7};
    kadens(numbers);
  }
}
