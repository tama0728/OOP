package Week11;

class ARectangle extends AbstractShape {
    private double width, height;
    public ARectangle (double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
