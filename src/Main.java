import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue \n");
            writer.append("\n(A poem by Bro)");
            writer.close();
        }
        catch (IOException e) {

            e.printStackTrace();
        }
*/

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for(int i=1; i<=rows; i++) {
            System.out.println();
            for(int j=1; j<=columns; j++) {
                System.out.print(symbol);
            }
    }
}}
