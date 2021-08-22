package uz.pdp.modul;

import uz.pdp.enums.Role;

public class User {
   private String name;
   private Role role;
   private String password;


   public User(String name, Role role, String password) {
      this.name = name;
      this.role = role;
      this.password = password;
   }

   public String getName() {
      return name;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public Role getRole() {
      return role;
   }







   @Override
   public String toString() {
      return "User{" +
              "name='" + name + '\'' +
              ", role=" + role +
              ", password='" + password + '\'' +
              '}';
   }
}
