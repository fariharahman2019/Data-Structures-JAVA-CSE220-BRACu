public class BinarySearchIterative{
// iterative
  public int binarySearch(int[] a, int x){
    int left = 0;
    int right = a.length-1;
    while(left<=right){
      int mid=(right+left)/2; //int mid = left + ((right - left)/2);
      if(a[mid]==x){
        return mid;
      }
      else if(x<a[mid]){
        right = mid - 1;
      }
      else{
        left = mid + 1;
      }
    }
    return -1;
  }
}