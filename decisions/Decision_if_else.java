 
package decisions;

 
public class Decision_if_else {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        //basic if else
        if(a>b){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
        //if else shorthand
        if(a>b) 
            System.out.println("true");
        else  
            System.out.println("false");
        
        //nested
        if(a>b){
            System.out.println("a>b");
        }else{
            if(a==b){
                System.out.println("a==b");
            }else{
                System.out.println("a<b");
            }
        }
        
        //if else-if
         if(a>b)
              System.out.println("a>b");
         else if(a==b)
             System.out.println("a==b");
         else
             System.out.println("a<b");
         
         //if(int a=10<b)
            //if(a<b=11) 
    }
}
