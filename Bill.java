public class Bill
{
    public static void main (String[] args)
    {
        int preisSchirm = 5;
        int preisMuetze = 25;
        int preisSchal = 15;

        System.out.print("Position        Preis\n");
        System.out.print("============    =====\n");
        System.out.print("Regenschirm         " +  preisSchirm  + "\n");
        System.out.print("Muetze             " +  preisMuetze  + " \n");
        System.out.print("Schal              " +  preisSchal   + " \n");
        System.out.print("                =====\n");
        System.out.print("                   " + (preisSchirm + preisMuetze + preisSchal));

    }
}