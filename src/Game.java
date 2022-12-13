public class Game {
    private String name;
    private Question[] questions;

    private int maxWinner;

    private int currCorrectCounter;

    public Game(String name, Question[] questions, int maxWinner) {
        this.name = name;
        this.questions = questions;
        this.maxWinner = maxWinner;
    }

    public void go() {
        // for
    }
}
