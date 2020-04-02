public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
      Customers customerObj1 = new Customers(10001,"Saakshi",9000000000l,"Bangalore","16-Jul-1990",'F',"Lalme Kajal,Salwar");
      Customers customerObj2 = new Customers(10008,"Rahul",9000000001l,"Chennai","27-Jan-1992",'M',"T-Shirt,Jeans");
      Suppliers supplierObj1 = new Suppliers(7901,"ABC Traders",8000000000l,"Mumbai",10,"Paid",4.75f);
      Suppliers supplierObj2 = new Suppliers(7972,"XYZ Enterprises",8000000900l,"Kolkata",7,"Unpaid",4.35f);
      
      customerObj1.displayProfileDetails();
      customerObj2.displayProfileDetails();
     supplierObj1.displayProfileDetails();
     supplierObj2.displayProfileDetails();
     
      customerObj1.editAddress("Coimbatore");
      supplierObj1.editAddress("Delhi");
      
      customerObj1.placeOrder();
      
      supplierObj1.increaseStockLevel(5);
      supplierObj2.increaseStockLevel(10); 
    }	
}

class Users {
		//write the logic for the class Users	
  int Id;
  String name;
  Long MobileNumber;
  String address;
  public void editAddress(String newAddress){
    System.out.println(name +", "+address);
    address = newAddress;
    System.out.println(name+", "+address);
    
  }
  public void displayProfileDetails(){
    this.name = name;
    this.MobileNumber = MobileNumber;
    System.out.println(name+", "+MobileNumber);
  }
  
}

class Customers extends Users{
		//write the logic for the class Customers	
  String dateOfBirth;
  char gender;
  String orderHistory;
  public Customers(int Id,String name,Long MobileNumber,String address,String dateOfBirth,char gender,String orderHistory)
  {
    this.Id = Id;
  this.name = name;
  this.MobileNumber = MobileNumber;
  this.address = address;
  this.dateOfBirth = dateOfBirth;
  this.gender = gender;
  this.orderHistory = orderHistory;
  }
  
  
  public void placeOrder() {
		System.out.println("Order placed successfully!");
	}
  
}

class Suppliers extends Users {
		//write the logic for the class Suppliers
 
  int itemStock;
  String paymentStatus;
  Float feedbackRating;
  public Suppliers(int Id,String name,Long MobileNumber,String address,int itemStock,String paymentStatus,Float feedbackRating){
  this.Id = Id;
  this.name = name;
  this.MobileNumber = MobileNumber; 
  this.address = address;
  this.itemStock = itemStock;
  this.feedbackRating = feedbackRating;
  }
  
 public void increaseStockLevel(int newStock) {		
		System.out.println(name+", "+(itemStock+newStock));		
	}
}