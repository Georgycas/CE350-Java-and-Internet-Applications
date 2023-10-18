public class HistogramProcessor {
    public static void main(String[] args) {
        System.out.println("Histogram for Image1:");
        Image1 image1 = new Image1();
        int[] histogram1 = processHistogram(image1.getPixelArray());
        displayHistogram(histogram1);

        System.out.println("\nHistogram for Image2:");
        Image2 image2 = new Image2();
        int[] histogram2 = processHistogram(image2.getPixelArray());
        displayHistogram(histogram2);

        System.out.println("\nHistogram for Image3:");
        Image3 image3 = new Image3();
        int[] histogram3 = processHistogram(image3.getPixelArray());
        displayHistogram(histogram3);
    }

    // Function to compute the histogram for a given pixel array
    public static int[] processHistogram(int[][] pixelArray) {
        int[] histogram = new int[256]; // Assuming the range is from 0 to 255

        for (int i = 0; i < pixelArray.length; i++) {
            for (int j = 0; j < pixelArray[i].length; j++) {
                int pixelValue = pixelArray[i][j];
                histogram[pixelValue]++;
            }
        }

        return histogram;
    }

    // Function to display the histogram
    public static void displayHistogram(int[] histogram) {
        System.out.println("Gray-level\t#-of-pixels");
        for (int i = 0; i < histogram.length; i++) {
            if (histogram[i] > 0) {
                System.out.println(i + "\t\t" + histogram[i]);
            }
        }
    }
}
