import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner scNum = new Scanner(System.in);
        Map<String, User> users = new HashMap<>();

        int stepCode = 10;
        while (stepCode != 0) {
            System.out.println("1. Regfister, 2. Login");
            stepCode = scNum.nextInt();

            switch (stepCode) {
                case 1 -> {
                    System.out.println("Enter your username: ");
                    String username = scStr.nextLine();
                    System.out.println("Enter your password: ");
                    String password = scStr.nextLine();
                    if (users.containsKey(username)) {
                        System.out.println("User already exists.");
                    } else {
                        User user = new User(username, password);
                        users.put(username, user);
                        System.out.println("Successfully registered.");
                    }
                }
                case 2 -> {
                    System.out.println("Enter your username: ");
                    String username = scStr.nextLine();
                    System.out.println("Enter your password: ");
                    String password = scStr.nextLine();
                    if (users.containsKey(username)) {
                        if(users.get(username).getPassword().equals(password)) {
                            System.out.println("Successfully logged in.");
                        } else {
                            System.out.println("Incorrect password.");
                        }
                        System.out.println("User already exists.");
                    } else {
                        System.out.println("User not found.");
                    }
                }
            }
        }

    }
    static class User {
        private String username;
        private String password;

        public String getPassword() {
            return password;
        }

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}