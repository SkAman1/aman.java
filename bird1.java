interface bird{
    void fly();
    void sing();
}
class sparrow implements bird{
    public void fly(){
        System.out.println("sparrow flying");
    }
    public void sing(){
        System.out.println("cheep or chirrup");
    }
}
class penguin implements bird{
    public void fly(){
        System.out.println("penguin not flying");
    }
    public void sing(){
        System.out.println(" trumpeting, braying, and honking");
    }
}
class bird1{
    public static void main(String[] args){
        sparrow s1=new sparrow();
        penguin p1=new penguin();
        s1.fly();
        s1.sing();
        p1.fly();
        p1.sing();
    }
}