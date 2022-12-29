public class BinarySearchRecursive{
// recursive
  public boolean binarySearch(int[] a, int x, int left, int right){
    if(left>right){
      return false;
    }
    int mid=(right+left)/2;
    // int mid = left + ((right - left)/2);
    if(a[mid]==x){
      return true;
    }
    else if(x<a[mid]){
      return binarySearch(a, x, left, mid-1);
    }
    else{
      return binarySearch(a, x, mid+1, right-1);
    }
  }
}