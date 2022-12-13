public class Main {
    public static void main(String[] args) {


        Answer[] answers1 = new Answer[3];
        answers1[0] = new Answer("Казань",false);
        answers1[1] = new Answer("Москва",true);
        answers1[2] = new Answer("Нижний Новгород",false);
        Question question1 = new Question("Столица России?",answers1);
        //...
        Question[] questions = new Question[1];
        Game game1 = new Game("Игра в города",questions,3);
        game1.go();


        System.out.println("");
        /*
        Вопросы по географии:
           - вопросы по географии
           - в каждом вопросе несколько вариантов ответов
           - один из них верный
           - складываем верные ответы
           - если ответов > 3 - то победитель!
         */
    }
}