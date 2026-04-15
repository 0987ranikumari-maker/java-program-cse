class Matrix {
    int a[][] = {{1,2},{3,4}};
    int b[][] = {{5,6},{7,8}};

    void addition() {
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
                System.out.print((a[i][j]+b[i][j])+" ");
            System.out.println();
        }
    }

    void transpose() {
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
                System.out.print(a[j][i]+" ");
            System.out.println();
        }
    }

    void rowSum() {
        for(int i=0;i<2;i++){
            int sum=0;
            for(int j=0;j<2;j++)
                sum+=a[i][j];
            System.out.println("Row sum="+sum);
        }
    }

    void colSum() {
        for(int i=0;i<2;i++){
            int sum=0;
            for(int j=0;j<2;j++)
                sum+=a[j][i];
            System.out.println("Col sum="+sum);
        }
    }

    void diagonalSum() {
        int sum=0;
        for(int i=0;i<2;i++)
            sum+=a[i][i];
        System.out.println("Diagonal sum="+sum);
    }
}

public class MatrixMain {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.addition();
        m.transpose();
        m.rowSum();
        m.colSum();
        m.diagonalSum();
    }
}
