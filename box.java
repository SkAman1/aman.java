interface Employee {
    double calsalary();
    void playdetails();
}
class manager implements Employee{
    String name;
    double basesalary;
    manager(String name,int basesalary){
        this.name=name;
        this.basesalary=basesalary;
    }
    public double calsalary(){
        return basesalary;
    }   
    public void playdetails(){
      System.out.println("name:" +name);
       System.out.println("manager");
        System.out.println("basesalary is:" +basesalary);
   }
}
class developer implements Employee{
  String name;
    double basesalary;
    developer(String name,int basesalary){
        this.name=name;
        this.basesalary=basesalary;
    }
    public double calsalary(){
        return basesalary;
    }   
    public void playdetails(){
      System.out.println("name:" +name);
       System.out.println("developer");
        System.out.println("basesalary is:" +basesalary);
   }
}
class box{
    public static void main(String[] args) {
        manager m1=new manager("Sk Aman",18000);
        developer d1=new developer("Sk asif",20000);
        m1.calsalary();
        m1.playdetails();
        d1.calsalary();
        d1.playdetails();
    }
}