package strings;

public class Rotate {

	public static void main(String[] args) {

		int size = 3;
		int[][] matrix = new int[size][size];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;

		matrix[1][0] = 10;
		matrix[1][1] = 11;
		matrix[1][2] = 12;

		matrix[2][0] = 100;
		matrix[2][1] = 200;
		matrix[2][2] = 300;

		rotate(matrix, size);
	}

	private static void rotate(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; ++i) {
				int offset = i - first;
				int top = matrix[first][i]; // save top
				// left -> top
				matrix[first][i] = matrix[last - offset][first];

				// bottom -> left
				matrix[last - offset][first] = matrix[last][last - offset];

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];

				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
	}

}
