import java.util.Scanner;

public class Main {

    // Fcie
    static double scitaj(double a, double b) {
        return a + b;
    }

    static double odcitaj(double a, double b) {
        return a - b;
    }

    static double nasob(double a, double b) {
        return a * b;
    }

    static double del(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chces pocitat? (A/N): ");
        String u = scanner.next();

        while (u.equalsIgnoreCase("A")) {

            System.out.print("Vyber operaciu (+, -, *, /): ");
            String operacia = scanner.next();

            System.out.print("Zadaj prve cislo: ");
            double a = scanner.nextDouble();
        
            System.out.print("Zadaj druhe cislo: ");
            double b = scanner.nextDouble();

            // Použitie fcii
            if (operacia.equals("+")) System.out.println("Vysledok: " + (int) scitaj(a, b));
            else if (operacia.equals("-")) System.out.println("Vysledok: " + (int) odcitaj(a, b));
            else if (operacia.equals("*")) System.out.println("Vysledok: " + (int) nasob(a, b));
            else if (operacia.equals("/")) {
                if (b != 0) System.out.println("Vysledok: " + (float) del(a, b));
                else System.out.println("Nulou sa neda delit!");
            } else System.out.println("Neplatna operacia!");

            System.out.print("\nChces pocitat znova? (A/N): ");
            u = scanner.next();
        }

        System.out.println("Kalkulačka bola ukončená.");
        scanner.close();
    }
}
