public class Calculator {
    public int sum(int i, int i1) {
        return  i + i1 ;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int divison(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Divider can't be zero");
        }
        return a / b;
    }
}
