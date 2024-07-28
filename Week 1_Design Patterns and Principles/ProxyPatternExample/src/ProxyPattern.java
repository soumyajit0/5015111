import dependencies.Image;
import dependencies.ProxyImage;

public class ProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("img1.png");
        Image image2 = new ProxyImage("img2.png");

        // Image will be loaded and displayed
        image1.display();
        // Image will be displayed without loading or caching
        image1.display();

        System.out.println();

        // Image will be loaded and displayed
        image2.display();
        // Image will be displayed without loading or caching
        image2.display();
    }
}
