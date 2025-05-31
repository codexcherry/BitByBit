public class Main{

  public static int linearsearch(int list[],int key){
    
    for (int i =0 ; i < list.length; i++){
      if ( list[i] == key ){
        return i+1;
      }
    }
    return -1;
  }



  public static void main(String args[]){

    int list[] = {1,2,3,4,5,6,7};
    
    int key=4;

    int result = linearsearch(list,key);
    if ( result == -1){
      System.out.println("Key not Found");
    }
    else {
      System.out.println("Key Found :" + result );
      
    }
    
  }
  
}
