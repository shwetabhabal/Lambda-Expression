public class Main {
    public static void main(String[] args) {
        MathFunction add=()->4+2;
        MathFunction.printResult(4,2, "add", add);
        MathFunction sub=()->4-2;
        MathFunction.printResult(4,2,"sub", sub);
        MathFunction mul=() ->4*2;
        MathFunction.printResult(4,2,"mul",mul);
    }
}