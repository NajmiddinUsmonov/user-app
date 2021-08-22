package uz.pdp.service;

import uz.pdp.enums.Role;
import uz.pdp.modul.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserServiceImpl implements UserService{

    ArrayList<User> users=new ArrayList<>();

    public UserServiceImpl() {
        users.add(new User("Directors", Role.ADMINISTRATOR,"12345"));
        users.add(new User("Manegers", Role.USER,"123123"));
        users.add(new User("Strangers", Role.GUEST,"321321"));
    }

    @Override
    public void creates() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password");
        if (scanner.nextLine().equals(users.get(0).getPassword())) {
            System.out.println("Xush kelibsiz");
            System.out.println("Select User: 1=>" + users.get(0).getName() + " 2=>" + users.get(1).getName() + " 3=>" + users.get(0).getName());
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    while(true) {
                        System.out.println("Enter current Password" + scanner.nextLine());
                        String currentsPassword = scanner.nextLine();

                        if (currentsPassword.equals(users.get(0).getPassword())) {
                                System.out.println("Do you change the password?, 1=>Yes, 2=>No");
                                if (scanner.nextInt() == 1) {
                                    System.out.println("Enter old password" +scanner.nextLine());
                                    String oldPassword = scanner.nextLine();
                                    if (oldPassword.equals(users.get(0).getPassword())) {
                                        System.out.println("Enter new Password");
                                        String newPassword = scanner.nextLine();
                                        System.out.println("Confirm new password!");
                                        String confirmPassword = scanner.nextLine();
                                        if (newPassword.equals(confirmPassword)) {
                                            users.get(0).setPassword(confirmPassword);
                                            System.out.println("===> Password o'rnatildi <===");
                                            creates();

                                        } else {
                                            System.out.println("Not Match");
                                        }
                                    } else {
                                        System.out.println("Incorrect Old Password");
                                        continue;
                                    }
                                }else {
                                    break;
                                }
                        }
                    }
                case 2:


                    break;
            }

            }else{
            System.out.println("Wrong Password");
            creates();
        }
        }




    @Override
    public void get(int number) {
        users.indexOf(users.get(number));

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    public ArrayList<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "users=" + users +
                '}';
    }
}
