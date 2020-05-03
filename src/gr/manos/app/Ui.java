package gr.manos.app;

import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Ui {


    public Menu menu() {

        Menu returnMenu;
        System.out.println("1. CREATE FILE 2. DELETE FILE 3. LOAD FILE 4. " +
                "SAVE FILE 5. SEARCH FILE 0. EXIT PROGRAM");

        int choice;
        Scanner scanner = new Scanner(System.in);

        try {
            choice = scanner.nextInt();
            switch (choice) {

                case 1:
                    return Menu.CREATE;
                case 2:
                    return Menu.DELETE;
                case 3:
                    return Menu.LOAD;
                case 4:
                    return Menu.SAVE;
                case 5:
                    return Menu.SEARCH;
                case 0:
                    default: return Menu.EXIT;


            }

        } catch (Exception e) {
            return Menu.EXIT;
        }


    }
}