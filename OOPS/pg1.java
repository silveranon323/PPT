package OOPS;
class Rectangle{
    int length;
    int width;
Rectangle(int x , int y){
    length=x;
    width=y;
}
Rectangle(){
    length=0;
    width=0;
}
int rectArea(){
    int result=length*width;
    return result;
}

}
public class pg1 {
public static void main(String[] args) {
   Rectangle rect1,rect2;
   rect1 = new Rectangle(10,20);
   rect2 = new Rectangle();

   System.out.println(rect1.rectArea());
   System.out.println(rect2.rectArea());
 
}
}
