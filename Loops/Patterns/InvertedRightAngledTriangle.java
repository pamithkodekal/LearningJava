package Loops.Patterns;

public class InvertedRightAngledTriangle {
    public static void main(String[] args) {

        System.out.print("Inverted RIght Angle Triangle");

        for (int i = 4 ; i > 0;i-- ){
            System.out.println(); 
            for (int j = i ; j > 0 ; j--){ 
                System.out.print("*");
            }
        }

}
}
