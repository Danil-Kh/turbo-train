package testmyJava;


public class Test1 {

  static String name;

    public static void main(String[] args) {
        //new Gethawname("MARONBRANDLO");

         System.out.println("args = " + new Gethawname("Javametro").getName());




    }
}
class Gethawname{
    private String name = "";

    Gethawname(String name){
        if (name.length() % 2 == 0){
            for (int i = 0; i < name.length() / 2; i++) {
                this.name += name.charAt(i);
            }
        }
        else{
            for (int i = 0; i < (name.length() - 1) / 2 ; i++) {
                this.name += name.charAt(i);
            }
        }

    }

    public String getName() {
        return name;
    }
}

