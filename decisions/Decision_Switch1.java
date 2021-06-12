package decisions;

public class Decision_Switch1 {
    public static void main(String[] args) {
        char a = 1;
        //case can be of any no.
        //default can only be one
        //if any block is executed then the following next block will
        //automatically be executed.
        switch(a){ 
            default:
                System.out.println("Invalid day input."); 
                break;
            case 'a':
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3/4:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
           
        }
    }
}
