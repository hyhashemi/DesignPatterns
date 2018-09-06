import java.util.ArrayList;

class Restaurant{
	Struct struct;
	int costumerNum;
	int dayIncome;
	public Restaurant(Struct struct, int costumerNum, int dayIncome){
		this.struct = struct;
		this.costumerNum = costumerNum;
		this.dayIncome = dayIncome;
	}
	public void getIncome(){
		System.out.println(dayIncome);
	}
}
class Struct{
	String place;
	String name;
	String type;
	public Struct(String place, String name, String type){
		this.place = place;
		this.name = name;
		this.type = type;
	}
}

class RestaurantFactory{
	
	public static ArrayList<Struct> structs = new ArrayList<>();
	public static Struct getStruct(String place, String name, String type){
		for (int i = 0; i < structs.size(); i++) {
			if (structs.contains(new Struct(place, name, type))){
				return structs.get(i);
			}
		}
		Struct newstruct = new Struct(place, name, type);
		structs.add(newstruct);
		return newstruct;
		
	}
}

public class FlyweightExample {
	public static void main(String[] args) {
		Struct struct = RestaurantFactory.getStruct("poonak", "manino", "irani");
		Restaurant restaurant = new Restaurant(struct, 20, 5000);
		restaurant.getIncome();
	}
}
