package JAVA1;

public class House {

	//Class lvl veriables
		public String houseName;
		int houseNumber;
		
		//constructer 1 . Default .. nothing assigned
		public House() {}
		
		// construstor 2 . Just house name is assigned. 
		public House(String houseName) {
			this.houseName=houseName;
	
		}
		//constructor 3 . Both house name and number is assigned.
		public House(String houseName,int houseNumber ) {
			this.houseName=houseName;
			this.houseNumber=houseNumber;
		}
		
		public void setHouseName(String HouseName) {
			this.houseName=houseName;
			
		}
		public String getHouseName() {
			return houseName;
		}
		
		public int getHouseNumber() {
			return houseNumber;
		}
		
}
