package Com.Controller;

import java.util.Scanner;
import Com.Services.Employee_Service;

public class Main {

    public static void main(String[] args) {
        Employee_Service es = new Employee_Service();
        Scanner sc = new Scanner(System.in);

        int option;
        do {
            System.out.println("Enter an option:\n1. Insert\n2. Delete\n3. Update\n4. Fetch\n5. Exit");
            option = sc.nextInt();

            switch (option) {
                case 1 -> es.insertData();
                case 2 -> es.deleteData();
                case 3 -> es.updateData();
                case 4 -> es.fetchData();
                case 5 -> System.out.println("Exiting program...");
                default -> System.out.println("Option not valid.");
            }
        } while (option != 5);

        sc.close();
    }
}
