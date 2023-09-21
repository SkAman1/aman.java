class book{
    String name;
    int booknumber;
    int price;
    book(String name, int booknumber ,int price){
    this.name=name;
    this.booknumber=booknumber;
    this.price=price;
}
    void displayinfo(){
        System.out.println("****************books****************");
        System.out.println("name:"+name);
        System.out.println("booknumber:"+booknumber);
        System.out.println("price:"+price);
    }
    public static void main(String args[]){
      book b1=new book("java" ,23,350);
      book b2=new book("cprigramming", 24, 260);
      b1.displayinfo();
      b2.displayinfo();
}
}