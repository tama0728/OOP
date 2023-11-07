import java.util.Scanner;

public class Project1 {
    Scanner sc = new Scanner(System.in);

    String help = """
            Type a Java language expression, statement, or declaration.
            Or type one of the following commands:
            /list: list the source you have typed.
            /exit: exit the jshell tool
            /history: history of what you have typed.
            /!: rerun last snippet.
            """;
    String[] history_buffer = new String[10];
    int historyIndex = 0;

    public void help() {
        System.out.print(help);
    }

    public void list() {
//        int j = 1;
        for (int i = 0, j = 1; i < historyIndex; i++) {
            if (history_buffer[i].charAt(0) != '/') {
                System.out.println(j++ + " : " + history_buffer[i]);
            }
        }
    }

    public void exit() {
        System.out.println("Goodbye.");
        System.exit(0);
    }

    public void history() {
        for (int i = 0; i < historyIndex; i++) {
            System.out.println(history_buffer[i]);
        }
    }

    public void rerun() {
        if (historyIndex < 2) {
            System.out.println("No previous command.");
            return;
        }
        System.out.println("Re-running '" + history_buffer[historyIndex - 2]  + "'.");
    }

    public void input() {
        System.out.print("jshell> ");
        String input = sc.nextLine();
        System.out.println();
        history_buffer[historyIndex] = input;
        historyIndex++;
        if (input.equals("/help")) {
            help();
        } else if (input.equals("/list")) {
            list();
        } else if (input.equals("/exit")) {
            exit();
        } else if (input.equals("/history")) {
            history();
        } else if (input.equals("/!")) {
            rerun();
        } else if (input.charAt(0) == '/') {
            System.out.println("Invalid command:" + input);
            System.out.println("Type /help for help.");
        } else {
            System.out.println("Running '" + input + "'.");
        }
        if (historyIndex == 10) {
            historyIndex = 0;
            System.out.println("The history buffer is cleared.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Project1 p = new Project1();
        while (true) p.input();
    }
}
