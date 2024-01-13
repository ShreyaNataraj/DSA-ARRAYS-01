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
  public static int binarySearch(int arr[] ,int key){
    int start = 0, end = arr.length-1; 
    while(start<=end){
      int mid = (start+end)/2;
     if(arr[mid]==key){
      return mid;
     }
     if(arr[mid]>key){
      end = mid-1;
     }
     else{
      start = mid+1;
     }
    }
    return -1;
  }
  public static void reverse(int arr[]){
    int temp ; 
    int first = 0;
    int last = arr.length-1;
    while(first<last){
      temp = arr[last];
      arr[last] = arr[first];
      arr[first] = temp;
      first ++;
      last --;
    }
  }
  public static void pairsinarray(int arr[]){
    for(int i = 1; i<arr.length; i++){
     for(int j = i+1; j<arr.length; j++){
      System.out.print("(" + arr[i] + "," + arr[j] + ")");
     }
     System.out.println();
    }
    System.out.println();
  }


  public static void main(String args[]){
    int arr[] = {1,2,3,4,5,6};
    pairsinarray(arr);
  }
}