
public class Demo {
    public static void main(String[] args) {
        Image img1 = new ImageProxyImpl("Demo1");
        Image img2 = new ImageProxyImpl("Demo2");

        img1.displayImage();
        img1.displayImage();
        img1.displayImage();

        img2.displayImage();
        img2.displayImage();
        img2.displayImage();
    }
}
