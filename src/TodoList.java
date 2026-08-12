import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void add(String title) {
        int id = tasks.size() + 1;
        tasks.add(new Task(id, title));
    }

    public void show() {
        if (tasks.isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void complete(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.complete();
                return;
            }
        }

        System.out.println("Задача не найдена.");
    }
}