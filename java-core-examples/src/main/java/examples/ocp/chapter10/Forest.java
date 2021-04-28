package examples.ocp.chapter10;

import java.util.ArrayList;
import java.util.List;

public final class Forest {
   private final int flora;
   private final List<String> fauna;

   public Forest() {
      this.flora = 5;
      this.fauna = new ArrayList<>();
   }

   public int getFlora() {
      return flora;
   }
   public List<String> getFauna() {
      return fauna;
   }
}
