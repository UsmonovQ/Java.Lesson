public class Alphabet {
    public static void main(String[] args) {
        int rows = 6;
        int cols = 6;
        char[][] alphabet = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int letter = i * cols + j;
                if (letter < 32) {
                    if (letter == 6) {
                        alphabet[i][j] = 'Ё';
                    } else {
                        alphabet[i][j] = (char) ('А' + letter);
                    }
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(alphabet[i][j] + "\t");
            }
            System.out.println();
        }
    }
}