package Week1.day1;

public class Mobile {
	String mobileBrandName = "Sony";
	char mobileLogo = 'S';
	short noOfMobilePiece = 2;
	int ModelNumber = 31523054;
	long MobileImeiNumber = 3246523564932296l;
	float mobilePrice = 43549;
	boolean isDamaged = false;
	
public static void main(String[] args ) {
	Mobile myMobile = new Mobile();
	System.out.println("BrandName"+" = "+myMobile.mobileBrandName);
	System.out.println("MobileLogo"+" = "+myMobile.mobileLogo);
	System.out.println("No Of Quantity"+" = "+myMobile.noOfMobilePiece+" "+"Piece");
	System.out.println("ModelNO"+" = "+myMobile.ModelNumber);
	System.out.println("Mobile ImeiNumber"+" = "+myMobile.MobileImeiNumber);
	System.out.println("Price Of the Mobile"+" = "+myMobile.mobilePrice);
	System.out.println("Is Damaged"+" = "+myMobile.isDamaged);
	
	
}
	

}
