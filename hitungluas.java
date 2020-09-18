import java.util.Scanner;

public class TugasLingkaran {
    public static int inputJariJari(){
        System.out.print("Input r : ");
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
    public static double hitungLuas(int r){
        return Math.PI*Math.pow(r,2);
    }
    public static void printHasil(double luas){
        System.out.printf("Hasil luas lingkaran : %.2f\n",luas);
    }
    public static void main(String[] args) {
        String validation;
        do {
            int r = inputJariJari();
            double luas = hitungLuas(r);
            printHasil(luas);
            System.out.println("Input ulang?y/n");
            Scanner s=new Scanner(System.in);
            validation=s.nextLine();
        }while(validation.equalsIgnoreCase("y"));
    }
}