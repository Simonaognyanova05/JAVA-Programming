public class Rectangle{
    public double height;
    public double width;

    public Rectangle(double hegiht, double width){
        this.height = hegiht;
        this.width = width;
    }

    public double calculateArea(){
        return this.height * this.width;
    }

    public double claculateParameter(){
        return 2 * (this.height + this.width);
    }
}