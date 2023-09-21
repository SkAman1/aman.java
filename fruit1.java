interface fruit{
    void sweet();
    void vitamin();
}
 class apple implements fruit {
    String fruitname;
    String colour;
    String season;
    apple(String fruitname,String colour,String season) {
        this.fruitname=fruitname;
        this.colour=colour;
        this.season=season;
    }
    public void sweet(){
        System.out.println("fruitname:"+fruitname);
        System.out.println("colour:"+colour);
        System.out.println("season:"+season);
    }
public void vitamin(){
    int c;
    System.out.println("we get vitamin C,E");
    }
 }
 class orange implements fruit {
    String fruitname;
    String colour;
    String season;
    orange(String fruitname,String colour,String season) {
        this.fruitname=fruitname;
        this.colour=colour;
        this.season=season;
    }
    public void sweet(){
        System.out.println("fruitname:"+fruitname);
        System.out.println("colour:"+colour);
        System.out.println("season:"+season);
    }
    public void vitamin(){
        String c;
        System.out.println("we get vitamin C");
        }
     }
public class fruit1 {
    public static void main(String[] args) {
        apple a1=new apple("Apple","Red","september-october");
        orange p1=new orange("orange","orange","november-december");
        a1.sweet();
        a1.vitamin();
        p1.sweet();
        p1.vitamin();
    }
}
