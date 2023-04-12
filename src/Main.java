public class Main {
    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Гриффендор", "Гарри Поттер", 99, 95, 65, 75, 70);
        Gryffindor hermione = new Gryffindor("Гриффендор", "Гермиона Грейнджер", 90, 95, 75, 65, 50);
        Gryffindor ron = new Gryffindor("Гриффендор", "Рон Уизли", 70, 65, 70, 75, 95);

        Hufflepuff zaharia = new Hufflepuff("Пуффендуй", "Захария Смит", 80, 70, 60, 70, 70);
        Hufflepuff cedric = new Hufflepuff("Пуффендуй", "Седрик Диггори", 65, 60, 65, 75, 80);
        Hufflepuff justin = new Hufflepuff("Пуффендуй", "Джастин Финч-Флетчли", 70, 65, 75, 85, 75);

        Ravenclaw jou = new Ravenclaw("Когтевран", "Чжоу Чанг", 65, 55, 84, 75, 65, 65);
        Ravenclaw padma = new Ravenclaw("Когтевран", "Падма Патил", 60, 50, 80, 70, 50, 55);
        Ravenclaw marcus = new Ravenclaw("Когтевран", "Маркус Белби", 58, 55, 75, 50, 65, 75);

        Slytherin darko = new Slytherin("Слизерин", "Драко Малфой", 80, 70, 60, 70, 95, 80, 75);
        Slytherin graham = new Slytherin("Слизерин", "Грэхэм Монтегю", 70, 65, 65, 60, 80, 75, 70);
        Slytherin gregory = new Slytherin("Слизерин", "Грегори Гойл", 65, 60, 60, 65, 75, 65, 65);

        harry.printInfoStudent();
        hermione.printInfoStudent();
        ron.printInfoStudent();
        printSeparator();

        justin.printInfoStudent();
        zaharia.printInfoStudent();
        cedric.printInfoStudent();
        printSeparator();

        jou.printInfoStudent();
        padma.printInfoStudent();
        marcus.printInfoStudent();
        printSeparator();

        darko.printInfoStudent();
        graham.printInfoStudent();
        gregory.printInfoStudent();
    }
     static void printSeparator() {
        System.out.println("************************");
        System.out.println("------------------------");
    }

    static void printSeparatorMinus() {
        System.out.println("------------------------");
    }
}