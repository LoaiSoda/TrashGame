import java.util.Scanner;

public class TrashGame {
    
    private static Scanner input = new Scanner(System.in);
    private static Gamemode1Eng gamemode1Eng = new Gamemode1Eng();
    private static Gamemode2Eng gamemode2Eng = new Gamemode2Eng();
    private static boolean menu;
    private static String menuChoice;
    
    //start menu. Language menu
    public static void start() {
       
        boolean langMenu = true;
        System.out.println("\nPlease choose a language from the list to run the program with\n\n1) English\n2) Deutsch\n3) Exit");
        while (langMenu == true) {
            String langChoice = input.next();
            if(langChoice.equals("1")){
                langMenu = false;
                engMenuOptions();
            }
            else if(langChoice.equals("2")) {
                langMenu = false;
                deMenuOptions();
            }
            else if(langChoice.equals("3")) {
                langMenu = false;
            }

            else {
                System.out.println("\nChoice not valid!\nPlease try again!");
            }
        }
    }

    private static void engMenuOptions(){
        menu = true;
        System.out.println("\nChoose one of the following options!\n\n1) Gamemode 1\n2) Gamemode 2\n3) Language Menu\n4) Exit");
        while (menu == true) {
            menuChoice = input.next();
            switch (menuChoice) {
                case "1":
                    System.out.println("\nThe gamemode 1 will run in English!");
                    gamemode1Eng.startGamemodeEng();
                    menu = false;
                    break;
                case "2":
                    System.out.println("\nThe gamemode 2 will run in English!");
                    gamemode2Eng.startGamemodeEng();
                    menu = false;
                    break;
                case "3":
                    menu = false;
                    start();
                    break;
                case "4":
                    menu = false;
                    break;
                default:
                    System.out.println("\nChoice not valid!\nPlease try again!");
            }
        }
    }

    private static void deMenuOptions(){
        menu = true;
        System.out.println("\nWaehle ein Modus aus!\n\n1) Gamemode 1\n2) Gamoemode 2\n3) Sprachmenue\n4) Exit");
        while (menu == true) {
            menuChoice = input.next();
            switch (menuChoice) {
                case "1":
                    System.out.println("\nGamemode 1 wird auf Deutsch gespielt");
                    //gamemode1De.startGamemodeDe();
                    menu = false;
                    break;
                case "2":
                    System.out.println("\nGamemode 2 wird auf Deutsch gespielt");
                    //gamemode2De.startGamemodeDe();
                    menu = false;
                    break;
                case "3":
                    menu = false;
                    start();
                    break;
                case "4":
                    menu = false;
                    break;
                default:
                    System.out.println("\nChoice not valid!\nPlease try again!");
            }
        }
    }
}