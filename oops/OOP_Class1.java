package oops;

public class OOP_Class1 {

    //variable
    /*
        - access_modifier static_nonstatic return_type identifier = value; 
        - class level variable can only be declared where as local variable
          are required to be initialized while declaring.
        - when class level variables are not initialized while declaration,
        hence on compilation compiler provide the default values for them
     */
    int a;
    static int b;

    //method
    /*
        -  access_modifier static_nonstatic return_type identifier(param_if_any){//body return st;} 
     */
    void m() {
        int b;
        //System.out.println(b); - error
        System.out.println(a);

    }
    
   boolean m2(){
       return true;
   }

    //initializer
    /*
    Static initializer
            static{
                //body
            }
    Non Static Initializer
            {
                //body
            }
    
     */
    static {
        System.out.println("Hi, this static init");
    }
    
    {
        System.out.println("Hi,this i snon static init"); 
                
    }
    
    //Constructor
    /*
        - access_modifier ClassName(param_if any){//body}
        - its is a special method invoked while object creation only.
        - 3 types
            * Default - jb hm koi construyctor nahi banatehai
            * Non- Param - jb constructor bina param ke ho
                        - only one possible
            * Param - jb Contructor me param
                    - more than 1
    */
    public OOP_Class1() {

    }
}
