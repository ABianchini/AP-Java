package period.one;

import java.util.Scanner;

public class ZIPCode {
	public String zipString;
	public int zipInt;
	public String zipBarcodeString;
	public int zipCodeInt;
	Scanner in = new Scanner(System.in);
	boolean validated;
	int inputInt;
	
	public ZIPCode() {
		System.out.println("Enter whether you're entering the bar code(1) or numerical ZIP Code(2):");
		inputInt = in.nextInt();
		if (inputInt == 1) {
			convertToZIPCode();
		} if (inputInt == 2) {
			convertToBarcode();
		}
	}
	
	private void convertToZIPCode() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter the barcode (\".\" for short bar and \"|\" for long bar):");
		zipBarcodeString = in.nextLine();
		String bar1;
		String bar2;
		String bar3;
		String bar4;
		String bar5;
		String checkBar;
		char dot = '.';
		char dash = '|';
		String tempBarcode = "";
		String zip1;
		String zip2;
		String zip3;
		String zip4;
		String zip5;
		String zipCheck;
		
		for (int i = 0; i < 32; i++) {
			if (zipBarcodeString.charAt(i) == dot) {
				tempBarcode = tempBarcode + "0";
			}
			if (zipBarcodeString.charAt(i) == dash) {
				tempBarcode = tempBarcode + "1";
			}
		}
		zipBarcodeString = tempBarcode;
		bar1 = zipBarcodeString.substring(1,6);
		bar2 = zipBarcodeString.substring(6,11);
		bar3 = zipBarcodeString.substring(11,16);
		bar4 = zipBarcodeString.substring(16,21);
		bar5 = zipBarcodeString.substring(21,26);
		checkBar = zipBarcodeString.substring(26,31);
		
		zip1 = String.valueOf((Integer.parseInt(bar1.substring(0,1)) * 7) + (Integer.parseInt(bar1.substring(1,2)) * 4) + (Integer.parseInt(bar1.substring(2,3)) * 2) + (Integer.parseInt(bar1.substring(3,4)) * 1));
		zip2 = String.valueOf((Integer.parseInt(bar2.substring(0,1)) * 7) + (Integer.parseInt(bar2.substring(1,2)) * 4) + (Integer.parseInt(bar2.substring(2,3)) * 2) + (Integer.parseInt(bar2.substring(3,4)) * 1));
		zip3 = String.valueOf((Integer.parseInt(bar3.substring(0,1)) * 7) + (Integer.parseInt(bar3.substring(1,2)) * 4) + (Integer.parseInt(bar3.substring(2,3)) * 2) + (Integer.parseInt(bar3.substring(3,4)) * 1));
		zip4 = String.valueOf((Integer.parseInt(bar4.substring(0,1)) * 7) + (Integer.parseInt(bar4.substring(1,2)) * 4) + (Integer.parseInt(bar4.substring(2,3)) * 2) + (Integer.parseInt(bar4.substring(3,4)) * 1));
		zip5 = String.valueOf((Integer.parseInt(bar5.substring(0,1)) * 7) + (Integer.parseInt(bar5.substring(1,2)) * 4) + (Integer.parseInt(bar5.substring(2,3)) * 2) + (Integer.parseInt(bar5.substring(3,4)) * 1));
		zipCheck = String.valueOf((Integer.parseInt(checkBar.substring(0,1)) * 7) + (Integer.parseInt(checkBar.substring(1,2)) * 4) + (Integer.parseInt(checkBar.substring(2,3)) * 2) + (Integer.parseInt(checkBar.substring(3,4)) * 1));
		validated = (10-(Integer.parseInt(zip1) + Integer.parseInt(zip2) + Integer.parseInt(zip3) + Integer.parseInt(zip4) + Integer.parseInt(zip5))%10) == Integer.parseInt(zipCheck);
		
		zipString = zip1+zip2+zip3+zip4+zip5;
		
	}
	
	private void convertToBarcode() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter the 5-digit ZIP Code:");
		String input = in.nextLine();
		zipString = input;
		
		String tempBarCode1 = null;
		String tempBarCode2 = null;
		String tempBarCode3 = null;
		String tempBarCode4 = null;
		String tempBarCode5 = null;
		String checkBarCode = null;
		int digit1 = Integer.parseInt(zipString.substring(0,1));
		int digit2 = Integer.parseInt(zipString.substring(1,2));
		int digit3 = Integer.parseInt(zipString.substring(2,3));
		int digit4 = Integer.parseInt(zipString.substring(3,4));
		int digit5 = Integer.parseInt(zipString.substring(4,5));
		int preCheckBar = (digit1+digit2+digit3+digit4+digit5)%10;
		int checkBar = (10-preCheckBar);
		
		if (digit1 == 0) tempBarCode1 = "||...";
		if (digit1 == 1) tempBarCode1 = "...||";
		if (digit1 == 2) tempBarCode1 = "..|.|";
		if (digit1 == 3) tempBarCode1 = "..|||";
		if (digit1 == 4) tempBarCode1 = ".|...";
		if (digit1 == 5) tempBarCode1 = ".|.||";
		if (digit1 == 6) tempBarCode1 = ".||..";
		if (digit1 == 7) tempBarCode1 = "|....";
		if (digit1 == 8) tempBarCode1 = "|..||";
		if (digit1 == 9) tempBarCode1 = "|.|..";
		
		if (digit2 == 0) tempBarCode2 = "||...";
		if (digit2 == 1) tempBarCode2 = "...||";
		if (digit2 == 2) tempBarCode2 = "..|.|";
		if (digit2 == 3) tempBarCode2 = "..|||";
		if (digit2 == 4) tempBarCode2 = ".|...";
		if (digit2 == 5) tempBarCode2 = ".|.||";
		if (digit2 == 6) tempBarCode2 = ".||..";
		if (digit2 == 7) tempBarCode2 = "|....";
		if (digit2 == 8) tempBarCode2 = "|..||";
		if (digit2 == 9) tempBarCode2 = "|.|..";
		
		if (digit3 == 0) tempBarCode3 = "||...";
		if (digit3 == 1) tempBarCode3 = "...||";
		if (digit3 == 2) tempBarCode3 = "..|.|";
		if (digit3 == 3) tempBarCode3 = "..|||";
		if (digit3 == 4) tempBarCode3 = ".|...";
		if (digit3 == 5) tempBarCode3 = ".|.||";
		if (digit3 == 6) tempBarCode3 = ".||..";
		if (digit3 == 7) tempBarCode3 = "|....";
		if (digit3 == 8) tempBarCode3 = "|..||";
		if (digit3 == 9) tempBarCode3 = "|.|..";
		
		if (digit4 == 0) tempBarCode4 = "||...";
		if (digit4 == 1) tempBarCode4 = "...||";
		if (digit4 == 2) tempBarCode4 = "..|.|";
		if (digit4 == 3) tempBarCode4 = "..|||";
		if (digit4 == 4) tempBarCode4 = ".|...";
		if (digit4 == 5) tempBarCode4 = ".|.||";
		if (digit4 == 6) tempBarCode4 = ".||..";
		if (digit4 == 7) tempBarCode4 = "|....";
		if (digit4 == 8) tempBarCode4 = "|..||";
		if (digit4 == 9) tempBarCode4 = "|.|..";
		
		if (digit5 == 0) tempBarCode5 = "||...";
		if (digit5 == 1) tempBarCode5 = "...||";
		if (digit5 == 2) tempBarCode5 = "..|.|";
		if (digit5 == 3) tempBarCode5 = "..|||";
		if (digit5 == 4) tempBarCode5 = ".|...";
		if (digit5 == 5) tempBarCode5 = ".|.||";
		if (digit5 == 6) tempBarCode5 = ".||..";
		if (digit5 == 7) tempBarCode5 = "|....";
		if (digit5 == 8) tempBarCode5 = "|..||";
		if (digit5 == 9) tempBarCode5 = "|.|..";
		
		if (checkBar == 0) checkBarCode = "||...";
		if (checkBar == 1) checkBarCode = "...||";
		if (checkBar == 2) checkBarCode = "..|.|";
		if (checkBar == 3) checkBarCode = "..|||";
		if (checkBar == 4) checkBarCode = ".|...";
		if (checkBar == 5) checkBarCode = ".|.||";
		if (checkBar == 6) checkBarCode = ".||..";
		if (checkBar == 7) checkBarCode = "|....";
		if (checkBar == 8) checkBarCode = "|..||";
		if (checkBar == 9) checkBarCode = "|.|..";
		zipBarcodeString = "|"+tempBarCode1 + tempBarCode2 + tempBarCode3 + tempBarCode4 + tempBarCode5 + checkBarCode + "|"; 
	}
	public String getOutput() {
		String outputFinal = null;
		if (inputInt == 2) {
			outputFinal = "Your barcode is:\n" + zipBarcodeString;
		}
		if (inputInt == 1) {
			String valid;
			if (validated) {
				valid = "This ZIP Code is validated.";
			} else {
				valid = "This ZIP Code is totally wrong!";
			}
			outputFinal = "Your ZIP Code is:\n" + zipString + "\n" + valid;
		}
		return outputFinal;
	}
}
