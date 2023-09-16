package lesson2;

public class Main {
    public static void main(String[] args) {
        Gryffindor gryffindor1 = new Gryffindor("Гарри", "Поттер",82, 83, 75, 80,97);
        Gryffindor gryffindor2 = new Gryffindor("Гермиона", "Грейнджер",69, 73, 91, 79,87);
        Gryffindor gryffindor3 = new Gryffindor("Рон", "Уизли",72, 61, 77, 79,90);

        Ravenclaw ravenclaw1 = new Ravenclaw("Чжоу", "Чанг", 59,47,72,65,48,52);
        Ravenclaw ravenclaw2 = new Ravenclaw("Падма ", "Патил ", 61,53,68,73,76,70);
        Ravenclaw ravenclaw3 = new Ravenclaw("Маркус ", "Белби", 74,79,64,57,55,60);

        Slytherin slytherin1 = new Slytherin("Драко", "Малфой", 80,75,71,80,83,94,90);
        Slytherin slytherin2 = new Slytherin("Грэхэм ", "Монтегю", 64,67,48,51,56,49,57);
        Slytherin slytherin3 = new Slytherin("Грегори  ", "Гойл ", 65,63,57,47,50,44,40);

        Hufflepuff hufflepuff1 = new Hufflepuff("Захария","Смит", 73, 64,83,77,79);
        Hufflepuff hufflepuff2 = new Hufflepuff("Седрик ","Диггори", 80, 71,80,70,73);
        Hufflepuff hufflepuff3 = new Hufflepuff("Джастин ","Финч-Флетчли", 69, 60,64,91,71);

        Hogwarts.findBetterStudent(gryffindor2, hufflepuff1);
        ravenclaw3.findBetterStudentInRavenclaw(ravenclaw1);
    }

}
