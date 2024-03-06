import java.util.Scanner;

public class Lab02JPA08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i =0 ; i <5 ; i++){
            System.out.println("Input:");
            int score = input.nextInt();
            if (score >= 90) {
                System.out.println("Your grade is A");
            }else if (80 <= score && score< 90) {
                System.out.println("Your grade is B");
            }else if (70 <= score && score< 80) {
                System.out.println("Your grade is C");
            }else if (60 <= score && score< 70) {
                System.out.println("Your grade is D");
            }else if (0 <= score && score< 60) {
                System.out.println("Your grade is F");
            }
        }
        input.close();
    }
}
