package Week11;

class ShapAreaAndPerimeter {
    public static void main (String[] args) {
        AbstractShape[] shapes = new AbstractShape[2];

        shapes[0] = new ARectangle(100, 50);
        shapes[1] = new ACircle(50);

        // version 1
        for (AbstractShape shape : shapes) {
            if (shape instanceof ARectangle) {
                ARectangle ac = (ARectangle) shape;
                System.out.printf("%s area: %.2f\n", ac.getClass(), ac.getArea());
            } else if (shape instanceof ACircle) {
                ACircle ac = (ACircle) shape;
                System.out.printf("%s area: %.2f\n", ac.getClass(), ac.getArea());
            }
        }

        // version 2
        for (AbstractShape shape : shapes) {
            System.out.printf("%s area: %.2f\n", shape.getClass(), shape.getArea());
        }
    }
}
