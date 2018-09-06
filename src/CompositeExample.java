import java.util.ArrayList;


interface Human{
	public void talk(String blah);
}

class Mother implements Human{
	String name;
	Child child;
	
	public Mother(String name, Child child){
		this.name = name;
		this.child = child;
	}
	public String getChildName(){
		return child.name;
	}
	public void talk(String blah){
		System.out.println(name + " says " +blah);
	}
	
}

class Child implements Human{
	String name;
	
	public Child(String name){
		this.name = name;
	}
	public void talk(String blah) {
		System.out.println(name + " says " + blah);		
	}
}

class Composite implements Human{
	ArrayList<Human> people = new ArrayList<>();
	@Override
	public void talk(String blah) {
		System.out.println(blah);
	}
	
	public void add(Human human){
		people.add(human);
	}
	
	public void remove(Human human){
		people.remove(human);
	}

}
public class CompositeExample{

	public static void main(String[] args) {
		Composite composite = new Composite();
		composite.add(new Mother("judy", new Child("tom")));
		composite.add(new Child("mike"));
		for (int j = 0; j < composite.people.size(); j++) {
			composite.people.get(j).talk("hi");
		}
		
	}
}

