public class ImageImpl implements Image {
    private String name;
    public ImageImpl(String name) {
        this.name = name;
        // creating or loading of this object is pretty expensive...
        this.loadImage();
    }
    private void loadImage() {
        System.out.println("(Slow) Loading and Processing image '" + this.name + "'");
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying image '" + this.name + "'");
    }
}
