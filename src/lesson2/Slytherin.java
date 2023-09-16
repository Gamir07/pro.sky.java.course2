package lesson2;

public class Slytherin extends Hogwarts{
    private int trickiness;
    private int decisiveness;
    private int ambitiousness;
    private int resourcefulness;
    private int lust_for_power;
    public Slytherin(String name, String surname, int magic, int transgression,
                     int trickiness, int decisiveness, int ambitiousness, int resourcefulness, int lust_for_power) {
        super(name, surname, magic, transgression);
        this.trickiness = trickiness;
        this.decisiveness = decisiveness;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.lust_for_power = lust_for_power;
    }

    @Override
    public String toString() {
        return super.toString() +  "Slytherin{" +
                "trickiness=" + trickiness +
                ", decisiveness=" + decisiveness +
                ", ambitiousness=" + ambitiousness +
                ", resourcefulness=" + resourcefulness +
                ", lust_for_power=" + lust_for_power +
                '}';
    }

    public void findBetterStudentInSlytherin(Slytherin student) {
        int totalPointsFirstStudent = this.trickiness + this.decisiveness + this.ambitiousness + this.resourcefulness + this.lust_for_power;
        int totalPointsSecondStudent = student.trickiness + student.decisiveness + student.ambitiousness + student.resourcefulness + student.lust_for_power;

        if (totalPointsFirstStudent > totalPointsSecondStudent) {
            System.out.println(this.getName() + " лучший Слизеринец чем " + student.getName());
        } else if(totalPointsFirstStudent < totalPointsSecondStudent){
            System.out.println(student.getName() + " лучший Слизеринец чем " + this.getName());
        } else {
            System.out.println(this.getName() + " " + student.getName() + " имеют одинаковые характеристики");
        }
    }
}
