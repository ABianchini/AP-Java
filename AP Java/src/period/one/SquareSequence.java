package period.one;

public class SquareSequence implements Sequence
{
   private int n;

   public int next()
   {
      n++;
      return n * n; 
   }
}
