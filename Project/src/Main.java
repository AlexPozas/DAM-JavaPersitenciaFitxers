import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Main {
  static Scanner in = new Scanner(System.in); // System.in és global


  // Main
  public static void main(String[] args) throws InterruptedException, IOException {
    
    boolean running = true;
    while (running) {
      String menu = "Escull una opció:";
      menu = menu + "\n 0) PR120ReadFile";
      menu = menu + "\n 1) PR121Files";
      menu = menu + "\n 3) PR123sobreescriu";
      menu = menu + "\n 5) PR124lines";
      // Adapta aquí les altres classes de l’exercici (PR122cat…)
      menu = menu + "\n 100) Sortir";
      System.out.println(menu);


      int opcio = Integer.valueOf(llegirLinia("Opció:"));
      try {
        switch (opcio) {
          case 0: PR120ReadFile.main(args); break;
          case 1: PR121Files.main(args); break;
          case 3: PR123sobreescriu.main(args); break;
          case 5: PR124linies.main(args); break;
          // Adapta aquí les altres classes de l’exercici (PR122cat…)
          case 100: running = false; break;
          default: break;
        }
      } catch (Exception e) {
          System.out.println(e);
      }
    }
    in.close();
  }
 
  static public String llegirLinia (String text) {
    System.out.print(text);
    return in.nextLine();
  }
}
