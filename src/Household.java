
public class Household {
	
	//data fields
	int occupants;
	float income;
	
	//overloaded constructors
	
	Household(){
		occupants = 1;
		income = 0.0f;
	}
		
	Household(int occupants){
		this.occupants = occupants;
		}
		
	Household(int occupants, float income){
			this.occupants = occupants;
			this.income = income;
		}
		
	//setters, getters
	int getOccupants() {
		return occupants;
	}
	void setOccupants(int occupants) {
		this.occupants = occupants;
	}
	float getIncome() {
		return income;
	}
	void setIncome(float income) {
		this.income = income;
	}
	

}
