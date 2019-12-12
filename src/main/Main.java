import kiosko.Kiosko;
import menu.Menu;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Kiosko kiosko = new Kiosko();
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu(kiosko);
    }

}
