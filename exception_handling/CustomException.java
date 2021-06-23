package exception_handling;

class InvalidAge extends Exception{
    InvalidAge(){
        super();
    }
}

public class CustomException {
    static void  validateAge(int age) throws InvalidAge{
        if( age < 18)
            throw new InvalidAge();
        System.out.println("Valid age.");
    }
    public static void main(String[] args) {
        try{
            validateAge(10);
        }catch(InvalidAge ex){
            ex.printStackTrace();
            System.out.println(ex);
        }
    }
}
