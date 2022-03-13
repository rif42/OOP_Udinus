class helloworld {
    
    static void CirclePerimeter(double diameter) {
        double perimeter = Math.PI * diameter;
        System.out.println("Circle Perimeter = " + perimeter);
    }

    static void TriangleArea(double base, double height) {
        double area = (base * height) / 2;
        System.out.println("Triangle Area = " + area);
    }

    static void TubeVolume(double diameter, double height) {
        double volume = Math.PI * (diameter/2) * (diameter/2) * height;
        System.out.println("Tube Volume = " + volume);
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Nama Saya adalah Rifky Ariya Pratama");
        System.out.println("Saya adalah mahasiswa Teknik Informatika Universitas Dian Nuswantoro");
        System.out.println("Saya sedang belajar bahasa pemrograman Java"); 
        CirclePerimeter(10);
        TriangleArea(6, 8);
        TubeVolume(5, 10);     
    }  
}