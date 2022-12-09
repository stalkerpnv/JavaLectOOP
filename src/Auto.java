public class Auto {
    String firm;
    double maxSpeed;

    public Auto(String firm, double maxSpeed) {
        this.firm = firm;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "firm='" + firm + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
