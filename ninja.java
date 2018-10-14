public class ninja{
  public static void main(String[] args){
    shinobi[] s = new shinobi[3];

    s[0] = new shinobi();
    s[0].setNoregis("012606");
    s[0].setNama("Uchiha Sasuke");
    s[0].setPeringkat("Genin");

    s[1] = new shinobi();
    s[1].setNoregis("012607");
    s[1].setNama("Uzumaki Naruto");
    s[1].setPeringkat("Genin");

    s[2] = new shinobi();
    s[2].setNoregis("021601");
    s[2].setNama("Haruno Sakura");
    s[2].setPeringkat("Chunin");

    System.out.println("Data Shinobi \n");
    for(shinobi x:s){
      System.out.println("No Regis :"+x.getNoregis());
      System.out.println("Nama  : "+x.getNama());
      System.out.println("peringkat : "+x.getPeringkat());
      System.out.println();
    }
  }
}
