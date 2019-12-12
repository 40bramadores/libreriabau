import kiosko.Kiosko;
import menu.Menu;

import java.util.Scanner;

public class Main {
    static Kiosko kiosko = new Kiosko();
    public static void main(String[] args) {
        Menu menu = new Menu(kiosko);
    }

}
