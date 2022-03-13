class calculation1 {
    
    static void CirclePerimeter(double diameter) {
        double perimeter = Math.PI * diameter;
        System.out.println("Circle Perimeter = " + perimeter);
    }

    public static void main(String[] args) {
        CirclePerimeter(10);
    }  
}