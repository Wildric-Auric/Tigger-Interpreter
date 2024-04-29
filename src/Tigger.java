import ast.*;
import frontend.*;
import memory.Memory;

import java.io.File;

public class Tigger{

  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("expecting a tigger file");
      System.exit(1);
    }else{
      System.out.println(args[0]);
      Memory.init(); //Init scope
      File f = new File (args[0]);
      TigParser parser = new TigParser();
      try {
        ASTprogram p = parser.getProg(f);
        System.out.println(p.toString()+" = "+p.eval());
      } catch (Exception e) {
        System.out.println(e);
        for (StackTraceElement s : e.getStackTrace()) {
          System.out.println(s);
        }
        System.exit(1);
      }
    }
  }
}
