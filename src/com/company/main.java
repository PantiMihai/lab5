
import  com.company.Employee;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Numarul angajatilor este: ");
        int numar = myObj.nextInt();
        myObj.nextLine(); // Consumă newline din buffer

        ArrayList<Employee> angajati = new ArrayList<>();
        for (int i = 0; i < numar; i++) {
            Employee angajat = new Employee();
            System.out.println("Numele angajatului este: " + (i + 1));
            String name = myObj.nextLine();
            angajat.setName(name);

            System.out.println("Email-ul angajatului este: " + (i + 1));
            String email = myObj.nextLine();
            angajat.setEmail(email);

            System.out.println("Salariul angajatului este: " + (i + 1));
            double hourRate = myObj.nextDouble();
            angajat.setHourRate(hourRate);

            System.out.println("Capacitatea angajatului este: " + (i + 1));
            double capacity = myObj.nextDouble();
            angajat.setCapacity(capacity);

            System.out.println("Zile libere ale angajatului sunt: " + (i + 1));
            int freeDays = myObj.nextInt();
            angajat.setFreeDays(freeDays);

            angajati.add(angajat);
        }

        // Afisare informatii angajati
        for (int i = 0; i < angajati.size(); i++) {
            Employee angajat = angajati.get(i);
            System.out.println("Angajatul " + (i + 1) + ":");
            System.out.println("Nume: " + angajat.name);
            System.out.println("Email: " + angajat.email);
            System.out.println("Salariu: " + angajat.hourRate);
            System.out.println("Capacitate: " + angajat.capacity);
            System.out.println("Zile libere: " + angajat.freeDays);
        }
    }
}
