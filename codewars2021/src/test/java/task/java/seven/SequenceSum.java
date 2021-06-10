package task.java.seven;

public class SequenceSum{

  public static String showSequence(int value){
    if (value < 0) {
      return value + "<" + "0";
    }
    int sum = 0;
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i <= value; i++) {
      if(i != 0) {
        builder.append("+");
      }
      builder.append(i);
      sum += i;
    }

    if (sum == 0) {
      return "0=0";
    }

    return builder.append(" = ").append(sum).toString();
  }

  /*public static void main(String args[]){
    int param=Integer.ParseInt(args[0]);
    SequenceSum.showSequence(param);
  }*/
}
