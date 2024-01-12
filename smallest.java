public class smallest {
  public static int getsmallest(int arr[]){
    int smallest = Integer.MAX_VALUE;
    for(int i =0; i<arr.length; i++){
      if(smallest>arr[i]){
        smallest=arr[i];
      }
      
    }
    return smallest;
  }
  public static void main(String args[]){
    int arr[] = {1,2,3,4,5,6};
    System.out.print(getsmallest(arr));
  }
}