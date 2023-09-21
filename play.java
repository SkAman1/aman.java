interface animal{
    void makesound();
}
class dog implements animal{
    String name;
    String sound;
    dog(String name,String sound){
        this.name=name;
        this.sound=sound;
    }
    public void makesound(){
        System.out.println("Dog name:" +name);
          System.out.println("sound:" +sound);
      }
  }
  class cat implements animal{
    String name;
    String sound;
    cat(String name,String sound){
        this.name=name;
        this.sound=sound;
    }
    public void makesound(){
        System.out.println("Dog name:" +name);
          System.out.println("sound:" +sound);
      }
  }
  class play{
    public static void main(String[] args) {
        dog d1=new dog("dog","brak brak!");
        cat c1=new cat("cat","meow!");
        d1.makesound();
        c1.makesound();
    }
}
