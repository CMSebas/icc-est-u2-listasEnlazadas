import controller.ContactManager;
import controller.MenuController;
import models.Contact;
import view.ConsoleView;

public class App {
    public static void main(String[] args) {
        MenuController controller = new MenuController();
        controller.showMenu();

    }
}