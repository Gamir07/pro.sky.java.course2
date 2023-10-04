package lesson2;

public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyalty;
    private int honesty;
    public Hufflepuff(String name, String surname, int magic, int transgression,
                      int hardworking, int loyalty, int honesty) {
        super(name, surname, magic, transgression);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public void findBetterStudentInHufflepuff(Hufflepuff student) {
        int totalPointsFirstStudent = this.hardworking + this.loyalty + this.honesty;
        int totalPointsSecondStudent = student.hardworking + student.loyalty + student.honesty;

        if (totalPointsFirstStudent > totalPointsSecondStudent) {
            System.out.println(this.getName() + " лучший Пуффендуец чем " + student.getName());
        } else if(totalPointsFirstStudent < totalPointsSecondStudent){
            System.out.println(student.getName() + " лучший Пуффендуец чем " + this.getName());
        } else {
            System.out.println(this.getName() + " " + student.getName() + " имеют одинаковые характеристики");
        }
    }
}
