import javax.script.ScriptEngine;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class login {
    private Map<String, String> user;
    private String id;
    private String pw;
    Scanner sc = new Scanner(System.in);

    public login() {
        user = new HashMap<String, String>();
    }

    public void addUser(String id, String pw) {
        user.put(id, pw);
    }

    public boolean checkId() {
        System.out.println("id와 password를 입력해주세요.");
        System.out.print("id : ");
        id = sc.nextLine();
        if (!user.containsKey(id)) {
            System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            return false;
        }
        System.out.print("password : ");
        pw = sc.nextLine();
        if (!user.get(id).endsWith(pw)) {
            System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
            return false;
        }
        return true;
    }
}

public class Homework8 {
    public static void main(String[] args) {
        login login = new login();
        login.addUser("myId", "myPass");
        login.addUser("myId2", "myPass2");
        login.addUser("myId3", "myPass3");
        boolean f;
        do {
            f = login.checkId();
        } while (!f);
        System.out.println("id와 비밀번호가 일치합니다.");
    }
}
