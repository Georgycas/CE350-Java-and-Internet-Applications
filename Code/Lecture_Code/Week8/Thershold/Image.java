public class Image {
    private int[][] data;

    public Image(int[][] data) {
        this.data = data;
    }

    public void threshold() {
        // Convert the input matrix into a binary matrix using Otsu's thresholding
        int[][] binaryData = OtsuThresholdFilter.filter(data);

        // Update the data with the thresholded binary data
        this.data = binaryData;
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] imageData1 = {
            {1,  3,  5,  7,  9,  3,  4,  4,  5,  6},
            {1,  3,  5,  7,  9,  3,  4,  4,  5,  6},
            {1,  3,  5,  7,  9,  3,  4,  4,  5,  6},
            {1,  3,  5, 20, 25, 24, 33,  5,  6,  4},
            {1,  3,  5, 22, 35, 24, 32,  5,  6,  4},
            {1,  3,  5, 20, 28, 34, 23,  5,  6,  4},
            {1,  3,  5, 21, 25, 27, 23,  5,  6,  4},
            {1,  3,  5,  7,  9,  3,  4,  4,  5,  6},
            {1,  3,  5,  7,  9,  3,  4,  4,  5,  6},
            {1,  3,  5,  7,  9,  3,  4,  4,  5,  6}
        };

        int[][] imageData2 = {
            {1,  3,  5,  7,  9,  3,  4,  4,  5, 6},
            {1, 20, 25, 24,  3,  5,  6,  4,  2,  4},
            {1, 22, 35, 24,  3,  5,  6,  4,  5,  7},
            {1, 20, 28, 34,  2,  5,  6,  4,  8,  9},
            {1,  3,  5,  7,  9,  3,  4,  4,  5,  6},
            {1,  3,  5,  7,  9,  3, 67,  4,  5,  6},
            {1,  3,  5,  7,  9, 78, 54, 94,  5,  6},
            {1,  3,  5,  7,  9, 99, 98, 54,  5,  6},
            {1,  3,  5,  7,  9,  3, 64,  4,  5,  6},
            {1,  3,  5,  7,  9,  3,  4,  4,  5,  6}
            // Add the remaining rows of Image 2
        };

        Image image1 = new Image(imageData1);
        Image image2 = new Image(imageData2);

        System.out.println("Image 1:");
        image1.threshold();
        image1.print();

        System.out.println("\nImage 2:");
        image2.threshold();
        image2.print();
    }
}
