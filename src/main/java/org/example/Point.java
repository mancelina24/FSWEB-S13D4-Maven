package org.example;

public class Point {
    private int x;
    private int y;

 public Point(int x,int y){
     this.x=x;
     this.y=y;
 }
 public int getX(){
     return x;
 }
 public void setX(int x){
     this.x=x;
 }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    //Burada da sadece constructorda verilen x ve y kullanılarak 0 noktasına olan uzaklığı hesaplanıyor.
    public double distance(){
     return Math.sqrt(x*x+y*y);
    }
    //Nokta B: (xB, yB) koordinatlarına sahip (bu da metoda parametre olarak gelen Point p nesnesi olacak).
    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
    }
    //Burada da argüman olarak verilen ve constructor anında verilmiş olan x ve y değerleri kullanılarak
    //distance hesaplanıyor.
    public double distance(int a, int b) {
        return Math.sqrt(Math.pow(a - this.x, 2) + Math.pow(b - this.y, 2));
    }
}
