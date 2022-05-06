public class ReturnValues {
    public static void main(String[] args) {
        double result = measureRectangle(5.6, 53.2);
        System.out.println("The area is "+ result);

        double area = measureRectangleWithOption(4.5, 433.43, "area");
        double perimeter = measureRectangleWithOption(4.5, 433.43, "perimeter");

        System.out.println("area is: " + area + " perimeter is: " + perimeter);
    }

    public static double measureRectangle(double len, double width){
        return len * width;
    }

    public static double measureRectangleWithOption(double len, double width, String option){
        if (len <= 0 || width <= 0){
            System.out.println("cannot be negative");
            System.exit(0);
        } 
        switch (option){
            case "area": return measureRectangle(len, width);
            case "perimeter": return 2 * (len + width);
            default: return 404;
        }
    }
}
