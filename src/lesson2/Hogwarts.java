package lesson2;

public class Hogwarts {
    private String name;
    private String surname;
    private int magic;
    private int transgression;

    public Hogwarts(){

    }
    public Hogwarts(String name, String surname, int magic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression +
                '}';
    }

    public static void findBetterStudent(Hogwarts student1, Hogwarts student2) {
        if (student1.magic + student1.transgression > student2.magic + student2.transgression) {
            System.out.println(student1.name + " " + student1.surname + " обладает большей мощностью магии чем "
                    + student2.name + " " + student2.surname);
        }else {
            System.out.println(student2.name + " " + student2.surname + " обладает большей мощностью магии чем "
                    + student1.name + " " + student1.surname);
        }
    }
}
