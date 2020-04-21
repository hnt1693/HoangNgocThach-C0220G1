package Bai7_CleanCodeAndRefactoring.thuchanh;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = baseArea(radius);
        double perimeter = perimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
    static double baseArea(int radius){
        return Math.PI*radius*radius;
    }
    static double perimeter(int radius){
        return  Math.PI*radius;
    }

}
