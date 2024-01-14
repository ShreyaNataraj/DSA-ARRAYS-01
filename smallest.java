public class smallest{
  public static int getsmallest(int arr[]){
    int smallest = Integer.MAX_VALUE;
    for(int i =0; i<arr.length; i++){
      if(arr[i]<smallest){
        smallest = arr[i];
      }
    }
    return smallest;
  }
  public static void main(String args[]){
    int arr[] = {2,5,7,9,1,3};
    System.out.println(getsmallest(arr));
  }
}