package storeProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int inventory;
		int choice;

		ArrayList<Laptop> lap = new ArrayList<>();
		ArrayList<Table> tab = new ArrayList<>();
		ArrayList<Light> lig = new ArrayList<>();

		System.out.println("Welcome to the store inventory!");
		System.out.println("1. Add item to inventory");
		System.out.println("2. Check inventory");
		System.out.println("3. Exit");

		inventory = scan.nextInt();

		while (inventory != 3) {
			switch (inventory) {
			case 1:
				System.out.println("1. Laptops Stock");
				System.out.println("2. Tables Stock");
				System.out.println("3. Lights Stock");
				System.out.println("4. Previous Menu");
				choice = scan.nextInt();

				while (choice != 4) {
					switch (choice) {
					case 1:
						System.out.println("Laptops Stock");
						System.out.println();
						System.out.println("Enter ID");
						int id = scan.nextInt();
						scan.nextLine();
						System.out.println("Enter Name");
						String name = scan.nextLine();
						System.out.println("Enter Price");
						int price = scan.nextInt();
						scan.nextLine();
						System.out.println("Enter Screen Size");
						double screen = scan.nextDouble();
						scan.nextLine();
						System.out.println("Enter RAM Size");
						int ram = scan.nextInt();
						scan.nextLine();
						System.out.println("Enter SSD Size");
						int ssd = scan.nextInt();
						scan.nextLine();
						System.out.println("Enter Processor Speed");
						double processor = scan.nextDouble();
						scan.nextLine();

						// Assuming you have a Laptop class with a constructor:
						Laptop lapObj = new Laptop(id, name, price, screen, ram, ssd, processor);
						
						lap.add(lapObj);
						System.out.println("Laptop Added");
						System.out.println();

						System.out.println("Add more or go back?");
						System.out.println();
						System.out.println("Press 1 for add more or 2 for going back");

						int lapcont = scan.nextInt();
						if (lapcont == 1) {
							choice = 1;
						} else if (lapcont == 2) {
							choice = 4;
						}
						break;

					case 2:
						System.out.println("Tables Stock");
						System.out.println();
						System.out.println("Enter ID");
						id = scan.nextInt();
						scan.nextLine();
						System.out.println("Enter Name");
						name = scan.nextLine();
						System.out.println("Enter Price");
						price = scan.nextInt();
						scan.nextLine();
						System.out.println("Enter Height");
						double height = scan.nextDouble();
						scan.nextLine();
						System.out.println("Enter Width");
						double width = scan.nextDouble();
						scan.nextLine();
						System.out.println("Enter Length");
						double length = scan.nextDouble();
						scan.nextLine();

						Table tabObj = new Table(id, name, price, height, width, length);
						tab.add(tabObj);
						System.out.println("Table Added");
						System.out.println();

						System.out.println("Add more or go back?");
						System.out.println();
						System.out.println("Press 1 for add more or 2 for going back");

						int tabcont = scan.nextInt();
						if (tabcont == 1) {
							choice = 2;
						} else if (tabcont == 2) {
							choice = 4;
						}
						break;

					case 3:
						System.out.println("Light Stock");
						System.out.println();
						System.out.println("Enter ID");
						id = scan.nextInt();
						scan.nextLine();
						System.out.println("Enter Name");
						name = scan.nextLine();
						System.out.println("Enter Price");
						price = scan.nextInt();
						scan.nextLine();
						System.out.println("Enter Watt");
						int watt = scan.nextInt();
						scan.nextLine();
						System.out.println("Enter Lumens");
						int lumens = scan.nextInt();
						scan.nextLine();
						Light ligObj = new Light(id, name, price, watt, lumens);
						lig.add(ligObj);
						System.out.println("Light Added");
						System.out.println();
						System.out.println("Add more or go back?");
						System.out.println();
						System.out.println("Press 1 for add more or 2 for going back");

						int ligcont = scan.nextInt();
						if (ligcont == 1) {
							choice = 3;
						} else if (ligcont == 2) {
							choice = 4;
						}
						break;

					case 4:
						System.out.println("4. Go Back");
						break;

					default:
						System.out.println("Invalid Choice!");
					}

				}
				break;

			case 2:
				System.out.println("Checking Inventory");
				System.out.println();
				System.out.println("1. Laptop Inventory");
				System.out.println("2. Table Inventory");
				System.out.println("3. Light Inventory");
				System.out.println("4. Previous Menu");
				int checking;
				checking = scan.nextInt();
					switch (checking) {
					case 1:
						System.out.println(lap.toString());
						break;
					case 2:
						System.out.println(tab.toString());
						break;
					case 3:
						System.out.println(lig.toString());
						break;
					case 4:
						checking = 4;
						break;
					}break;

			default:
				System.out.println("Invalid Choice!");
				break;

			}
			System.out.println("1. Add item to inventory");
			System.out.println("2. Check inventory");
			System.out.println("3. Exit");
			inventory = scan.nextInt();
		}
		scan.close();
	}

}