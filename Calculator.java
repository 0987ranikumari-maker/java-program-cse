class Calculator {
    int a, b;

    Calculator(int x, int y) {
        a = x;
        b = y;
    }

    void add() { System.out.println("Add = " + (a + b)); }
    void sub() { System.out.println("Sub = " + (a - b)); }
    void mul() { System.out.println("Mul = " + (a * b)); }
    void div() { System.out.println("Div = " + (a / b)); }
}

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c = new Calculator(10, 5);
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}
