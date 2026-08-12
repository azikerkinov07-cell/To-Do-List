import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todo = new TodoList();

        while (true) {
            System.out.println("\n1. Добавить");
            System.out.println("2. Показать");
            System.out.println("3. Выполнить");
            System.out.println("4. Выйти");

            System.out.print("> ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Название: ");
                    String title = scanner.nextLine();
                    todo.add(title);
                    break;

                case 2:
                    todo.show();
                    break;

                case 3:
                    System.out.print("ID задачи: ");
                    int id = scanner.nextInt();
                    todo.complete(id);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Неверный пункт.");
            }
        }
    }
}