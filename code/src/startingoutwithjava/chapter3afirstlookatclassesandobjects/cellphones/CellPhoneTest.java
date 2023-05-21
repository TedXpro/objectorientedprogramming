package code.src.startingoutwithjava.chapter3afirstlookatclassesandobjects.cellphones;
// package StartingOutWithJava.Chapter3_A_First_Look_At_Classes_And_Objects.CellPhones;

import java.util.Scanner;

public class CellPhoneTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name,
                model,
                price;
        CellPhone cell;

        System.out.print("Enter the Manufactures Name: ");
        name = keyboard.nextLine();
        System.out.print("Enter the Model of the phone: ");
        model = keyboard.nextLine();
        System.out.print("Enter the Price of the phone: ");
        price = keyboard.nextLine();

        cell = new CellPhone(name, model, price);

        System.out.println("The data u have entered is:");
        System.out.println("Name: " + cell.getMake());
        System.out.println("Model: " + cell.getModel());
        System.out.println("Price: " + cell.getRetailPrice());
        keyboard.close();
    }
}
