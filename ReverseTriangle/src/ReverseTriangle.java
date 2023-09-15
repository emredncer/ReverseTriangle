import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {

        boolean errorCheck = true;//başta while'a girmesi için true tanımlandı.
        int row;

        while (errorCheck) { //2'den küçük sayı girilirse üçgen oluşturulamaz!

            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the number of rows of the triangle to be created: ");
            row = input.nextInt();

            if (row < 2) {
                System.out.println("You must enter a number greater than 2!");
                //errorCheck = true; yazmadım çünkü hala true

            } else {
                for (int i = row; i >= 1; i--) { //İlk döngü satırları dönecek
                    for (int space = i; space < row; space++) { //space = satır-1
                        System.out.print(" ");
                    }

                    for (int star = 1; star <= (2 * i - 1); star++) { //Yıldız basacak döngü
                        System.out.print("*");
                    }

                    System.out.println(""); //Bu yazılmazsa yan yana basacak.
                }

                errorCheck = false; //While döngüsünden çıkış bileti :)
            }
        }
    }
}
