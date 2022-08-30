public class QuizQuestions {

    private String questionWithAnswers;
    private String questionOne;
    private String questionTwo;
    private String questionThree;
    private String questionFour;
    private String questionFive;
    private String correctAnswer;

    public String getQuestionWithAnswers() {
        return questionWithAnswers;
    }

    public void setQuestionWithAnswers(String questionWithAnswers) {
        this.questionWithAnswers = questionWithAnswers;
    }

    public String getQuestionOne() {
        return questionOne;
    }

    public void setQuestionOne(String questionOne) {
        this.questionOne = questionOne;
    }

    public String getQuestionTwo() {
        return questionTwo;
    }

    public void setQuestionTwo(String questionTwo) {
        this.questionTwo = questionTwo;
    }

    public String getQuestionThree() {
        return questionThree;
    }

    public void setQuestionThree(String questionThree) {
        this.questionThree = questionThree;
    }

    public String getQuestionFour() {
        return questionFour;
    }

    public void setQuestionFour(String questionFour) {
        this.questionFour = questionFour;
    }

    public String getQuestionFive() {
        return questionFive;
    }

    public void setQuestionFive(String questionFive) {
        this.questionFive = questionFive;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public QuizQuestions (String questionWithAnswers) {
        String[] splitQuestionsAndAnswers = questionWithAnswers.split("\\|");

    }
}
