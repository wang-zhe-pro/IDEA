package 实验作业;
public class Matrix {
    int rowCount;
    int cowCount;
    double data[][];

    Matrix() {
    }

    Matrix(double[][] a) {
        rowCount = a.length;
        cowCount = a[0].length;
        data = new double[a.length][a[0].length];
        for (int i = 0; i < this.rowCount; i++) {
            for (int j = 0; j < this.cowCount; j++) {
                data[i][j] = a[i][j];
            }
        }
    }

    public int getRowCount() {

        return this.rowCount;
    }

    public int getColCount() {


        return this.cowCount;
    }

    public String toString() {
        StringBuilder matrix = new StringBuilder();
        int m, n;
        matrix.append("[\n");
        for (int i = 0; i < this.rowCount; i++) {
            matrix.append("[");
            for (int j = 0; j < this.cowCount; j++) {
                n = j;
                matrix.append(String.format("%.3f", this.data[i][j]));
                if (n++ < this.cowCount)
                    matrix.append(" ");
            }
            m = i;
            if (m++ < this.rowCount)
                matrix.append("]\n ");
            else
                matrix.append("]");
        }
        matrix.append("\n]");
        return matrix.toString();

    }

    public Matrix multiply(Matrix matG) {
        if (this.data[0].length == matG.data.length) {
            Matrix C = new Matrix(this.data);
            for (int i = 0; i < C.rowCount; i++) {
                for (int j = 0; j < C.cowCount; j++) {
                    for (int k = 0; k < this.cowCount; k++) {
                        C.data[i][j] += this.data[i][k] * matG.data[k][j];
                    }

                }
            }
            for (int i = 0; i < C.rowCount; i++) {
                for (int j = 0; j < C.cowCount; j++) {

                    C.data[i][j] =C.data[i][j]-this.data[i][j];


                }
            }
            return C;
        } else
            return null;
    }
}
