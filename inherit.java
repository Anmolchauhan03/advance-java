/**
 * inherit
 */
public class inherit {

    public void mdu()
    {
        System.out.println("rajput");
    }
}
 
class Two extends inherit{
    public void saitm() { System.out.println("anmol"); }
}
 
// Driver class
 class mdu{
      // Main function
    public static void main(String[] args)
    {
        Two g = new Two();
        g.mdu();
        g.saitm();
        g.mdu();
    }
}
