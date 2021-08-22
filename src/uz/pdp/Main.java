package uz.pdp;

import uz.pdp.enums.Role;
import uz.pdp.modul.User;
import uz.pdp.service.UserServiceImpl;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      UserServiceImpl userServiceImp = new UserServiceImpl();
//      while(true){
      System.out.println("USERni tanlang!");
      for (int i = 0; i < userServiceImp.getUsers().size(); i++) {
         System.out.println(i + 1 + "=>" + userServiceImp.getUsers().get(i).getName());
      }

      int ssss = scanner.nextInt();
      String currentUser = userServiceImp.getUsers().get(ssss - 1).getPassword();
//      System.out.println(currentUser);
//      System.out.println("Enter your password!");
//      String Insertedpassword=scanner.nextLine();

      switch (ssss) {

         case 1:
            System.out.println("Welcome to Administration Account");
            System.out.println("1=> Create a new Password, 2=>Get other users'info, 3=>Uptade account'info, 4=>Delete");
            int chosing=scanner.nextInt();
            if (chosing==1) {
               userServiceImp.creates();
            }else if (chosing==2){
//               for (int i = 0; i < userServiceImp.getUsers().size(); i++) {
                  System.out.println("1 => " +userServiceImp.getUsers().get(0).getName()+" 2=> " + userServiceImp.getUsers().get(1).getName() + "3=>" + userServiceImp.getUsers().get(2).getName());
//               }
            int number=scanner.nextInt();
               if (number==1) {
                  System.out.println(userServiceImp.getUsers().get(0));
                  break;
               }else if (number==2) {
                  System.out.println(userServiceImp.getUsers().get(1));
               }else if (number==3) {
                  System.out.println(userServiceImp.getUsers().get(2));
               }
            }else if (chosing==3){
               userServiceImp.update();
            }else if (chosing==4){
               userServiceImp.delete();
            }
         case 2:
           int chosing1=scanner.nextInt();
            if (chosing1==1) {
               userServiceImp.creates();
            }else if (chosing1==2){
               userServiceImp.update();
            }
      }
   }
}















