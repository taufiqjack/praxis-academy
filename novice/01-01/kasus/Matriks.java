import java.util.Scanner;

public class Matriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int C[][] = new int[2][2];

        System.out.println("-------------------");
        System.out.println("Masukkan nilai A : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("[" + (i + 1) + "][" + (j + 1) + "]: ");
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMasukkan nilai B : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("[" + (i + 1) + "][" + (j + 1) + "]:");
                B[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("-------------------");
        System.out.println("Hasil Matrik A dan B adalah : ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(+(C[i][j]) + " ");

            }
            System.out.println(" ");
        }
    }

}
