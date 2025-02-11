package tp3exosYaip4;

public class Student extends Person{
    private String programme;
    private int year;
    private double fee;

    public Student (String name, String adress, String programme, int year, double fee) {
        super(name, adress);
        this.programme = programme;
        this.year = year;
        this.fee = fee;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[Person[name =?, adress =?] programme=?, year=?, fee=?";
    }
}
