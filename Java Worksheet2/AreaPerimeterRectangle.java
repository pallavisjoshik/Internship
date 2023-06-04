class Rectangle{
    int length;
    int breadth;
    public int getBreadth(){
        return breadth;
    }
    public void setBreadth(int breadth){
        this.breadth = breadth;
    }
    public int getLength() {
        return length;
    }
    public void setlength(int length) {
        this.length = length;
    }
    int area(){
        return length*breadth;
    }
    int perimeter(){
        return 2*(length+breadth);
    }
}
class AreaPerimeterRectangle
{
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.setlength(5);
        System.out.println("the length of rectangle is "+ obj.getLength());
        obj.setBreadth(8);
        System.out.println("the breadth of rectangle is "+ obj.getBreadth());
        System.out.println("the area of rectangle is "+ obj.area());
        System.out.println("the perimeter of rectangle is "+ obj.perimeter());
    }
}
