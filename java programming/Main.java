import SquareOfEvery4thElement.ArrayMethodDeclaration;
import SquareOfEvery4thElement.ArraySumOfSquareOf4thElement;

public class Main {
    public static void main(String[] args) {
        //------Create an object "arraySumOfSquareOf4thElement" of class "ArraySumOfSquareOf4thElement" ----------
        //-----------ArrayMethodDeclaration is an interface-----------------

        ArrayMethodDeclaration arraySumOfSquareOf4thElement=new ArraySumOfSquareOf4thElement();
        //------call the method "calculateSumOfSquareOf4thElement()" by using object "arraySumOfSquareOf4thElement"-----

        arraySumOfSquareOf4thElement.calculateSumOfSquareOf4thElement();
    }
}