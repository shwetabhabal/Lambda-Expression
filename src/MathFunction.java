@FunctionalInterface
public interface MathFunction {
    int calculate( );
    static void printResult(int a, int b, String function, MathFunction fobj){
        System.out.println("Result of "+function+" :"+fobj.calculate());
    }
}
