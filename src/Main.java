//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book deadSouls = new Book("Dead Souls", "Nikolai Gogol", 352);
        deadSouls.displayInfo();

        deadSouls.setTitle("Set123");

        System.out.println(deadSouls.getTitle());

        
    }
}