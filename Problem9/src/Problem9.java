public class Problem9 {
	public static void main(String[] args) {
		double product;
		a:
		for (int i = 1; i < 998; i++) {
			for (int j = 2; j < 999; j++) {
				for (int k = 3; k < 1000; k++) {
					//Speed optimization step. This makes a product and power computation unnecessary as soon as this logical condition is not met. Saves several seconds!
					if ((i + j + k) != 1000) {
						continue;
					}
					product = Math.pow(i, 2) + Math.pow(j, 2);
					if (product == Math.pow(k, 2)) {
						System.out.println(i * j * k + "");
						break a;
					}
				}
			}
		}
	}
}
