public class Question {
    String question;
    String[] answers;
    String correctAnswer;

    public Question(String question, String[] answers, String correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer(){
        boolean correct = false;
        if (correctAnswer.equals(correct)){
            return true;
        }
        return false;
    }
}
//add method to check the correct answer. true/false.

//when do you use a constructor and getters and setters.
