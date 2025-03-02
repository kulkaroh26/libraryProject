import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

public class Crosswalk {
  public static void main(String[] args) {
    ArrayList<Integer> barcode = new ArrayList<Integer>();
    try {
      File myObj = new File("StudentBarcodeIDS.csv");
      Scanner myReader = new Scanner(myObj);
      myReader.nextLine();
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        barcode.add(Integer.valueOf(data));
        System.out.println(data);
      }
      myReader.close();

    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    barcode.sort(null);
    boolean numFound;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number to search for in the list below");
    int numSearch = scan.nextInt();
    int len = barcode.size();
    /*for (int i=0;i<len-1;i++){
		if (numSearch == barcode.get(i)){
			System.out.println("This number is in the list");
			break;//i need to break out 
		}
		System.out.print("This number is not in the list");
	}*/
	
    int high=0;
    int low=0;
    while (true){

		int mid = barcode.get(len/2);
		if (barcode.get(mid)==numSearch){
			System.out.println("This number is in the list");
			break;
		}
		if (barcode.get(mid)>numSearch){
			high = barcode.get(mid);
			for (int i=0;i<high;i++){
				len = 0;
				len = len + 1;
			}
		}
		if (barcode.get(mid)<numSearch){
			low = barcode.get(mid);
			for (int i=low;i<high;i++){
				len = 0;
				len = len + 1;
			}
		}
	} 	
}
