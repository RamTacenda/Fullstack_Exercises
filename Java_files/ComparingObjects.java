class MyClass{
    int num1;
    int num2;
    MyClass(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    void display(){
        System.out.println("Num1: "+num1+" Num2: "+num2);
    }
}

public class ComparingObjects {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(12, 34);
        MyClass obj2 = new MyClass(12, 34);
        obj1.display();
        obj2.display();
        System.out.println(obj1 == obj2);
    }
}
