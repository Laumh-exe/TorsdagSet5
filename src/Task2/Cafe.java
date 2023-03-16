package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData() {

        try {
            File file = new File("src/Task2/Coffees.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                coffeeMenu.add(scanner.nextLine());
            }
        } catch(FileNotFoundException e) {
            System.out.println("File was not found");
            System.exit(0);
        }
    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
}
