public class ImageProxyImpl implements Image {
    private final String name;
    private Image image;

    public ImageProxyImpl(String name) {
        this.name = name;

    }

    @Override
    public void displayImage() {
        if (this.image == null) {
            this.image = new ImageImpl(this.name);  // lazy loading
        }
        this.image.displayImage();
    }
}
