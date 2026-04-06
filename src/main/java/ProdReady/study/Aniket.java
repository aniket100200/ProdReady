package ProdReady.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aniket {
  public static void main(String[] args) {
    try {
      InputStreamReader reader = new InputStreamReader(System.in);
      BufferedReader bf = new BufferedReader(reader);

      Integer a = Integer.parseInt(bf.readLine());
      System.out.println(a * a + "<------------");

      bf.close();

    } catch (Exception t) {

    }

    // try with Resources
    try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
