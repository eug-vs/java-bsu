import algebra.Matrix;


public class Main {
    public static void main(String[] args){
        Matrix foo = new Matrix(4, 4);
        Matrix bar = new Matrix(4, 4);
        bar = foo.transposeMinor();
        System.out.println(foo);
        System.out.println(bar);

        if (foo.isEqual(bar)) {
            System.out.println("True");
        } else if (foo.isEqual(bar.transposeMajor())) {
            System.out.println("True");
        } else if (foo.isEqual(bar.transposeMinor())) {
            System.out.println("True");
        } else if (foo.isEqual(bar.transposeMajor().transposeMinor())) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        foo.task();
        System.out.println(foo);
    }
}
