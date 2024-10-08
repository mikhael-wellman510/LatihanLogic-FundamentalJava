package JavaComparator;

public class Biodata {
    private String name;
    private int score;

    public Biodata(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Biodata{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
