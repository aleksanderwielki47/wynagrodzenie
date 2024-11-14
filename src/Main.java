abstract class Employee {
    abstract void calculateSalary();
    abstract void displayinfo();
}


class Manager extends Employee {

    @Override
    void calculateSalary() {
    System.out.println("Wynagrodzenie to: 5999zl brutto");
    }

    @Override
    void displayinfo() {
        System.out.println("stanowisko: manager");
        System.out.println("podstawowa placa: 3kola");
        System.out.println("nadgodziny: 5");
        System.out.println("za godzine: 30");
        System.out.println("premie: 1000zl");
        System.out.println("cala kwota: 6kola");
    }
}

class Programmer extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Wynagrodzenie to: 4999zl brutto");
    }

    @Override
    void displayinfo() {
        System.out.println("stanowisko: programista");
        System.out.println("podstawowa placa: 3kola");
        System.out.println("nadgodziny: 35");
        System.out.println("za godzine: 28");
        System.out.println("premie: 500zl");
        System.out.println("cala kwota: 5kola");
    }
}





public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.calculateSalary();
        m.displayinfo();
        Programmer p = new Programmer();
        p.calculateSalary();
        p.displayinfo();

    }
}