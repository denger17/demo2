package class12;

public class Task1 {
    //Store username, password and confirm password from a user and check following requirements:
    //
    //Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
    //Password should be minimum 8 characters, if less → message=”Password is too short”.
    //Password cannot contain username if so, → message=”Password cannot contain username”.
    //Password should match confirmed password, if not  → message=“Passwords do not match”.
    //
    //Only after all requirements met → message “Your username and password has been created”
    public static void main(String[] args) {
        String user=new String("Username");
        String pass=new String("passwor");
        boolean isEmpty=user.isEmpty();
        System.out.println(user.isEmpty());
        System.out.println("Username and Password cannot be empty");
        System.out.println("Passwords do not match");
        int len=pass.length();
        if (pass.length()<8){
            System.out.println("Passwords do not match");
        }
    }
}
