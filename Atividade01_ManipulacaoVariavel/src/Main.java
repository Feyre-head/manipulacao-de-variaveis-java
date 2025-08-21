
public class Main {
    public static void main(String[] args) {
        String personName = "Inara";
        boolean isStudent = true;
        int personAge = 24;
        int totalAge;
        double personHeight = 1.68;
        double doubleHeight;
        String greetingMessage = "Olá";

        //Soma de 2 idades
        totalAge = personAge + personAge;

        //Dobro Altura
        doubleHeight = personHeight * 2;

        //Concatenação Saudação + Nome
        System.out.println(greetingMessage + " " + personName);

        System.out.println("Idade: "+ personAge);
        System.out.println("Dobro Idade: " + totalAge);
        System.out.println("Altura: " + personHeight);
        System.out.println("Dobro Altura: " + doubleHeight);
        System.out.println("É Estudante: " + isStudent);


    }
}