package controller;

import view.ConsoleView;
import models.*;

public class MenuController {
    private ContactManager contactManager = new ContactManager();
    private ConsoleView consoleView = new ConsoleView();

    public void showMenu() {
        boolean running = true;

        while (running) {
            consoleView.displayMenu();
            String opcion = consoleView.getInput("Opción: ");

            switch (opcion) {
                case "1": addContact(); break;
                case "2": findContact(); break;
                case "3": deleteContact(); break;
                case "4": printList(); break;
                case "5": running = false; break;
                default: consoleView.showMessage("Opción inválida.");
            }
        }
    }

    private void addContact() {
        String name = consoleView.getInput("Nombre: ");
        String phone = consoleView.getInput("Teléfono: ");
        Contact contact = new Contact(name, phone);
        contactManager.addContact(contact);
        consoleView.showMessage("Contacto agregado.");
    }

    private void findContact() {
        String name = consoleView.getInput("Nombre a buscar: ");
        Contact contact = contactManager.findContactByName(name);
        if (contact != null) consoleView.showMessage(contact.toString());
        else consoleView.showMessage("No encontrado.");
    }

    private void deleteContact() {
        String name = consoleView.getInput("Nombre a eliminar: ");
        contactManager.deleteContactByName(name);
        consoleView.showMessage("Contacto eliminado (si existía).");
    }

    private void printList() {
        contactManager.printList();
    }
}
