import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList; //Import this to handle ArrayList methods

public class doubleCrosswalk {
  public static void main(String[] args) {
    ArrayList<Integer> barcode = new ArrayList<Integer>();
    ArrayList<Integer> stuID = new ArrayList<Integer>();
    //first try catch to handle exceptions 
    try {
      File myObj = new File("StudentBarcodeIDS.csv"); //import file for student barcodes originally
      Scanner myReader = new Scanner(myObj);
      myReader.nextLine();
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        barcode.add(Integer.valueOf(data));
        //System.out.println(data);
      }
      myReader.close();

    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    try {
      File myObj = new File("Export Items, Copy Based-3.txt");
      Scanner myReader = new Scanner(myObj);
      myReader.nextLine();
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String regex = "[\t]";
        String[] twoColumn = data.split(regex);
        stuID.add(Integer.parseInt(twoColumn[0]));
        //System.out.println(twoColumn[0]);
        System.out.println(stuID);
      }
      myReader.close();

    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } /*
    barcode.sort(null);
    boolean numFound;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number to search for in the list below");
    int numSearch = scan.nextInt();
    int len = barcode.size(); 
    int constant = barcode.size();
    
    
    int high=0;
    int low=0;
    for (int i = 0;i<constant;i++){
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
	} */
}    
	
}
