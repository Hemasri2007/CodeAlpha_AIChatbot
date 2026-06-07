import java.util.Scanner;
public class AIChatbot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String message;
        System.out.println("Welcome to AI Chatbot!");
        System.out.println("Type 'bye' to end the chat.");
        while (true) {

            System.out.print("\nYou: ");
            message = input.nextLine().toLowerCase();

            if (message.equals("bye")) {
                System.out.println("Bot: Goodbye!");
                break;
            }

            if (message.contains("hello")) {
                System.out.println("Bot: Hello! Nice to meet you.");
            }

            else if (message.contains("how are you")) {
                System.out.println("Bot: I am doing great.Thanks for asking!.");
            }

            else if (message.contains("what is your name")) {
                System.out.println("Bot: I am an AI Chatbot created using java.");
            }

            else if (message.contains("tell me about java")) {
                System.out.println("Bot: Java is a popular and powerful object-oriented programming language.");
            }

            else if (message.contains("internship")) {
                System.out.println("Bot: Internships helps students gain practical experience.");
            }

            else if (message.contains("thank you")) {
                System.out.println("Bot: you are welcome!.");
            }

            else {
                System.out.println("Bot: Sorry, I don't have an answer for that.");
            }
        }

        input.close();
    }
}
