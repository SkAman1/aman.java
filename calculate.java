interface musicplayer{
    void play();
    void stop();
}
class mp3player implements musicplayer{
    public void play(){
        System.out.println("play music");  
    }
    public void stop(){
    
        System.out.println("music is stopping");
      }
 } 
  class cdplayer implements musicplayer{
    public void play(){
        System.out.println("play music");
    }
    public void stop(){
    
        System.out.println("music is stopping");
      }
  }

class calculate{
    public static void main(String[] args){
        mp3player m1=new mp3player();
        cdplayer c1=new cdplayer();
        m1.play();
        m1.stop();
        c1.play();
        c1.stop();
    }
}