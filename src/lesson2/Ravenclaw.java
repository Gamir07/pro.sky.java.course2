package lesson2;

public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wittiness;
    private int creativity;

    public Ravenclaw(String name, String surname, int magic, int transgression,
                     int intelligence, int wisdom, int wittiness, int creativity) {
        super(name, surname, magic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() + "Ravenclaw{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wittiness=" + wittiness +
                ", creativity=" + creativity +
                '}';
    }

    public void findBetterStudentInRavenclaw(Ravenclaw student) {
        int totalPointsFirstStudent = this.intelligence + this.wisdom + this.wittiness + this.creativity;
        int totalPointsSecondStudent = student.intelligence + student.wisdom + student.wittiness + student.creativity;

        if (totalPointsFirstStudent > totalPointsSecondStudent) {
            System.out.println(this.getName() + " лучший Когтевранец чем " + student.getName());
        } else if(totalPointsFirstStudent < totalPointsSecondStudent){
            System.out.println(student.getName() + " лучший Когтевранец чем " + this.getName());
        } else {
            System.out.println(this.getName() + " " + student.getName() + " имеют одинаковые характеристики");
        }
    }
}
