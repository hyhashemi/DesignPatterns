
interface Animal {
	
	public String talk();
	public String eat();
	public void move(int x, int y, int z);
	
}

class Lion implements Animal{
	
	public String talk(){
		return "roar";
	}
	public String eat(){
		return "meat";
	}
	public void move(int x, int y, int z){
		System.out.println("moves right " + x + "m" +
				" moves left "+ y + "m"+ " jumps " + z+ "m");
	}
}

class Ant{
	public void move(int x, int y){
		System.out.println("moves right "+x+"m" +
				" moves left "+y+"m");
	}
	public String talk(){
		return "pech pech";
	}
	public String eat(){
		return "plant";
	}
}

class AntAdapter implements Animal{
	private Ant ant;
	public AntAdapter(Ant ant){
		this.ant = ant;
	}
	
	public void move(int x, int y, int z){
		System.out.println("moves right "+x+"m" +
				" moves left "+y+"m");
	}
	public String talk() {
		return ant.talk();
	}

	public String eat() {
		return ant.eat();
	}
	
	}

	public class AdapterExample{
		
		public static void  main(String[] args) {
		Animal[] animals = new Animal[3]; 
		animals[0] = new Lion();
		animals[1] = new AntAdapter(new Ant());
		animals[0].move(4, 5, 1);
		animals[1].move(1, 1, 6);
	}	
}