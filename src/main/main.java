package main;

import menu.*;
import animal.Animal;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        Menu menu = new Menu();

        menu.welcome();

        Scanner in = new Scanner(System.in);
        while(true){
            menu.showMenu();
            int choice = in.nextInt();
            if (choice == 7) {
                menu.exit();
                break;
            }

            switch (choice) {
                case 1:
                    menu.add(list);
                    break;
                case 2:
                    menu.modify(list);
                    break;
                case 3:
                    menu.delete(list);
                    break;
                case 4:
                    menu.find(list);
                    break;
                case 5:
                    menu.sort(list);
                    break;
                case 6:
                    menu.traverse(list);
                    break;
                default:
                    System.out.println("您输入了错误选择！");
            }
        }
    }
}
