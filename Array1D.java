class Array1D {
    int arr[] = new int[5];

    void input() {
        for(int i = 0; i < 5; i++)
            arr[i] = i + 1;
    }

    void output1() {
        for(int i = 0; i < 5; i++)
            System.out.print(arr[i] + " ");
    }

    void output2() {
        for(int i = 4; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }

    void reverse() {
        for(int i = 4; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}

public class ArrayMain {
    public static void main(String[] args) {
        Array1D a = new Array1D();
        a.input();
        a.output1();
        System.out.println();
        a.reverse();
    }
}
