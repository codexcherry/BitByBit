public class Main{

  public static int binarysearch(int list[],int key){

    int start=0;
    int end = list.length-1;
    int mid = ( start + end ) / 2 ; 
    while (start <= end ){

      if (list[mid] == key){
        return mid+1;
      }
      if(list[mid] < key ){

        start = mid + 1 ;
        
      }

      else {
        start = mid - 1 ; 
      }
      
    }

    return -1;
    
  }

  public static void main(String args[]){
    int list[] = {1,2,3,4,5,6,7,8};
    int key = 4;
    System.out.println("Key Found : " + binarysearch(list,key) );
  }
  
}
