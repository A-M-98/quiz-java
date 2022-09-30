import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quiz {

    List<Question>  questionsArray = new ArrayList<>();

    public Quiz() {
        questionsArray.add(new Question("Whats 1 + 1?", new String[]{"A: 1", "B: 2", "C: 10", "D: 11"}, "B: 2"));
        questionsArray.add(new Question("Whats 10 + 1?", new String[]{"A: 100", "B: 20", "C: 110", "D: 11"}, "D: 11"));
        questionsArray.add(new Question("Whats 20 x 2?", new String[]{"A: 120", "B: 22", "C: 20", "D: 40"}, "D: 40"));
        questionsArray.add(new Question("Whats 11 - 12?", new String[]{"A: -1", "B: -12", "C: 2", "D: 23"}, "A: -1"));
        questionsArray.add(new Question("Whats 100 ÷ 1?", new String[]{"A: 10", "B: 99", "C: 100", "D: 110"}, "C: 100"));
        questionsArray.add(new Question("Whats 33 + 33?", new String[]{"A: 36", "B: 66", "C: 99", "D: 12"}, "B: 66"));
        questionsArray.add(new Question("Whats 100 ÷ 5?", new String[]{"A: 20", "B: 22", "C: 95", "D: 105"}, "A: 20"));
        questionsArray.add(new Question("Whats 1300 x 3?", new String[]{"A: 11203", "B: 1333", "C: 2290", "D: 3900"}, "D: 3900"));
        questionsArray.add(new Question("Whats 5 - 3?", new String[]{"A: 7", "B: 2", "C: 8", "D: 11"}, "B: 2"));
        questionsArray.add(new Question("Whats 8 x 8?", new String[]{"A: 64", "B: 16", "C: 32", "D: 60"}, "A: 64"));
        questionsArray.add(new Question("Whats 25 ÷ 5?", new String[]{"A: 11", "B: 20", "C: 10", "D: 5"}, "D: 5"));

    }

    public String getQuestion(){
        Random random = new Random();
        return questionsArray.get(random.nextInt(questionsArray.size())).toString();
    }
}
//A method to get a question.
// This is going to take an integer and
// it's going to get the item(question) in the array.
