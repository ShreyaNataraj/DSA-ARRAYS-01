//given n non negative integers representing an eevation map where the width of each base is one.compute how much water it can trap after raining//
public class Rainwater {
  public static int trappedrainwater(int height[]){
    int leftMax[] = new int[height.length];
    leftMax[0] = height[0];
    for(int i = 1; i<height.length; i++){
      leftMax[i] =  Math.max(leftMax[i-1],height[i]);
    }
   int rightMax[] = new int[height.length];
   rightMax[height.length-1] = height[height.length-1];
   for(int i = height.length-2; i>=0; i--){
    rightMax[i] = Math.max(rightMax[i+1],height[i]);
   }
   int trappedwater =0;
   for(int i =0; i<height.length; i++){
   int waterlevel = Math.min(leftMax[i],rightMax[i]);
   trappedwater+=waterlevel-height[i];
   }
   return trappedwater;
  }
  public static void main(String args[] ){
    int height[] = {4,2,0,6,3,2,5};
    System.out.println(trappedrainwater(height));
  }
}
