// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package task4;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    String str = inputStringFromUser();

    System.out.println(str);

  }

  public static String inputStringFromUser() {
    System.out.println("Введите любой текст кроме пустой строки ");
    String str = null;
    try (Scanner sc = new Scanner(System.in);) {
      str = sc.nextLine();
      if (str.isEmpty()) {
        throw new Exception("Пустую строку вводить нельзя");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return str;
  }

}
