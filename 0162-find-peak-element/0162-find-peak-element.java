class Solution {
    public int findPeakElement(int[] arr) {
      int n=arr.length;
      if(n==1) return 0;
      int max=arr[0];
      int index=0;
      for(int i=1;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
            index=i;
        }
      }
      return index;
    }
}