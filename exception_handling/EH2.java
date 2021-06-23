package exception_handling;

public class EH2 {

    public static void main(String[] args) {
        try {
            int b = Integer.parseInt("");
            int a = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException ex1) {
            System.out.println(ex1);
        } catch (ArithmeticException ex2) {
            System.out.println(ex2);
        }catch(NumberFormatException ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("Finally Block");
        }
    }
}
