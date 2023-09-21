interface language{
    void greet();
}
class english implements language{
    public void greet(){
        System.out.println("english:i am good boy");
    }
}
class bengali implements language{
    public void greet(){
        System.out.println("bengali:ami valo chele");
    }
}
class hindi implements language{
    public void greet(){
        System.out.println("hindi:main accha larka hoon");
    }
}
class show{
    public static void main(String[] args){
        english e1=new english();
        bengali b1=new bengali();       
        hindi h1=new hindi();
        e1.greet();
        b1.greet();
        h1.greet();
    }
}
