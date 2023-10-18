import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

public class RandomNoisyImageGenerator {

    public static void main(String[] args) throws Exception {
        int width = 512;  // You can adjust this
        int height = 512; // You can adjust this

        BufferedImage noisyImage = generateNoisyImage(width, height);
        
        ImageIO.write(noisyImage, "jpg", new File("path_to_save_random_noisy_image.jpg"));
    }

    public static BufferedImage generateNoisyImage(int width, int height) {
        Random random = new Random();
        BufferedImage noisyImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int red = random.nextInt(256);
                int green = random.nextInt(256);
                int blue = random.nextInt(256);

                int rgb = (red << 16) | (green << 8) | blue;
                noisyImage.setRGB(x, y, rgb);
            }
        }

        return noisyImage;
    }
}
