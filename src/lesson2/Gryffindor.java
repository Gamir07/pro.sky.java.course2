package lesson2;

public class Gryffindor extends Hogwarts {
    private int goodness;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int magic, int transgression,
                      int goodness, int honor, int bravery) {
        super(name, surname, magic, transgression);
        this.goodness = goodness;
        this.honor = honor;
        this.bravery = bravery;

    }

    @Override
    public String toString() {
        return super.toString() + "Gryffindor{" +
                "goodness=" + goodness +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public void findBetterStudentInGryffindor(Gryffindor student) {
        int totalPointsFirstStudent = this.bravery + this.honor + this.goodness;
        int totalPointsSecondStudent = student.bravery + student.honor + student.goodness;

        if (totalPointsFirstStudent > totalPointsSecondStudent) {
            System.out.println(this.getName() + " лучший Гриффиндорец чем " + student.getName());
        } else if(totalPointsFirstStudent < totalPointsSecondStudent){
            System.out.println(student.getName() + " лучший Гриффиндорец чем " + this.getName());
        } else {
            System.out.println(this.getName() + " " + student.getName() + " имеют одинаковые характеристики");
        }

    }
}
