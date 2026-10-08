import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("Hello World");
        Scanner scanner = new Scanner(System.in);
//        String response = scanner.nextLine();
//        System.out.println(response);
        var questions = getQuestions();

//        var questionStorage = new DefaultQuestionStorage();
//        questionStorage.getQuestion();
        var answers = List.of("1", "2");

        var q = List.of(new Question("Вопрос 1", "1"));
        var answer = q.getFirst().getAnswer();

        for (int i = 0; i < questions.size(); i++) {
            String question = questions.get(i);
            System.out.println(question);
            String response = scanner.nextLine();
            if (response.equals(answers.get(i))) {
                System.out.println("Молодец");
            } else {
                System.out.println("Ты ошибся");
            }
        }
        A.foo();
        A a = new A();
        a.bar();

    }

    public void work(CanFly canFly) {
//        System.out.println(animal.toString());
        canFly.fly();
    }

    public static List<String> getQuestions() {
        return List.of("Вопрос 1", "Вопрос 2");
    }
}

class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return "@" + question;
    }

    public String getAnswer() {
        return answer;
    }
}

class A {
    public A() {

    }

    public A(int i) {

    }

    private void privateMethod() {
        System.out.println("private method");
    }

    protected void protectedMethod() {
        System.out.println("protected method");
    }

    // крайне не желательный код
    static void foo() {
        System.out.println("foo");
    }

    void bar() {
        System.out.println("bar");
    }
}

class B extends A {

    void t() {
        protectedMethod();
//        privateMethod(); // ошибка компиляции
    }

    class C {

    }
}

class Animal {

}

interface CanFly {
    void fly();
}

class Cat extends Animal {

}

class Dog extends Animal {
}

class Bird extends Animal implements CanFly {
    @id86240433 (@Override)
    public void fly() {
        System.out.println("Лети");
    }
}

class Airplane implements CanFly {
    @id86240433 (@Override)
    public void fly() {

    }
}

interface QuestionStorage {
    String getQuestion();
}

class InMemoryQuestionStorage implements QuestionStorage {
    public String getQuestion() {
        return "";
    }
}

//class DefaultQuestionStorage implements QuestionStorage {
//    String getQuestion() {
//        return Db.create("").getConection().select("").first();
//    }
//}