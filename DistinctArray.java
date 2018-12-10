
public class DistinctArray {
	public static String names[] = { "Archana", "Dasari", "Maya", "Archana", "Roger", "Jack", "Dasari", "Harry",
			"Maya" };
	public static int count = 0;

	public static void RemoveDuplicate(String[] names) {
		for (int j = 0; j <= names.length; j++) {
			for (int l = j + 1; l < names.length - count; l++) {

				if (names[j].equals(names[l])) {
					count++;
					// System.out.println(names[l]);
					for (int p = l; p < names.length -1; p++) {
						names[p] = names[p + 1];
					}

				}

			}

		}
		for (int m = 0; m < names.length - count; m++) {
			
			System.out.println(names[m]);
		}
	}

	public static void printArray() {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("**************ORIGINAL ARRAY***************");
		printArray();
		System.out.println("***********ARRAY AFTER REMOVING DUPLICATES*****************");
		RemoveDuplicate(names);

	}
}
