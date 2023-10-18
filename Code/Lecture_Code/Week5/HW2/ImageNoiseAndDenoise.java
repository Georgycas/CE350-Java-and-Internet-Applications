import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

public class ImageNoiseAndDenoise {

    public static void main(String[] args) throws Exception {
        BufferedImage image = ImageIO.read(new File("path_to_your_image.jpg"));

        BufferedImage noisyImage = addNoise(image, 25);
        BufferedImage denoisedImage = denoiseUsingGaussianFilter(noisyImage);

        ImageIO.write(noisyImage, "jpg", new File("path_to_save_noisy_image.jpg"));
        ImageIO.write(denoisedImage, "jpg", new File("path_to_save_denoised_image.jpg"));
    }

    public static BufferedImage addNoise(BufferedImage image, int strength) {
        Random random = new Random();
        int width = image.getWidth();
        int height = image.getHeight();

        BufferedImage noisyImage = new BufferedImage(width, height, image.getType());

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int rgb = image.getRGB(x, y);
                int noise = (int) (strength * (random.nextFloat() - 0.5));

                int newRed = clamp((rgb >> 16) & 0xFF + noise, 0, 255);
                int newGreen = clamp((rgb >> 8) & 0xFF + noise, 0, 255);
                int newBlue = clamp(rgb & 0xFF + noise, 0, 255);

                noisyImage.setRGB(x, y, (newRed << 16) | (newGreen << 8) | newBlue);
            }
        }

        return noisyImage;
    }

    public static BufferedImage denoiseUsingGaussianFilter(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();

        BufferedImage denoisedImage = new BufferedImage(width, height, image.getType());

        double[][] gaussianKernel = {
            {1.0 / 16, 2.0 / 16, 1.0 / 16},
            {2.0 / 16, 4.0 / 16, 2.0 / 16},
            {1.0 / 16, 2.0 / 16, 1.0 / 16},
        };

        for (int y = 1; y < height - 1; y++) {
            for (int x = 1; x < width - 1; x++) {
                double red = 0, green = 0, blue = 0;
                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {
                        int rgb = image.getRGB(x + l, y + k);
                        red += ((rgb >> 16) & 0xFF) * gaussianKernel[k + 1][l + 1];
                        green += ((rgb >> 8) & 0xFF) * gaussianKernel[k + 1][l + 1];
                        blue += (rgb & 0xFF) * gaussianKernel[k + 1][l + 1];
                    }
                }
                int newRed = clamp((int) red, 0, 255);
                int newGreen = clamp((int) green, 0, 255);
                int newBlue = clamp((int) blue, 0, 255);
                denoisedImage.setRGB(x, y, (newRed << 16) | (newGreen << 8) | newBlue);
            }
        }

        return denoisedImage;
    }

    public static int clamp(int value, int min, int max) {
        return Math.max(min, Math.min(max, value));
    }
}
