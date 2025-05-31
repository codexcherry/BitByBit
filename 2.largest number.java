public class Main{
  
  public static int getlargest(int list[]){

    int largest = Integer.MIN_VALUE;

    for (int i=0; i< list.length ; i++ ){

      if ( largest < list[i]){
        largest = list[i];
      }
      
    }

    return largest;
    
  }
  
  public static void main(String args[]){

    int list[] = {1,2,3,4,5,6,7};
    int result = getlargest(list);
    System.out.println("Largest Number :" + result);

    
  }
}
