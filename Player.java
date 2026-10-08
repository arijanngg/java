package projekat;

public class Player {

	private static final String String = null;
	private String name;
	private int x;
	private int y;
	private int width;
	private int height;
	private int health;
	
	
	public Player(String name, int x, int y, int width, int height, int health) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.health = health;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null  ) {
			System.out.println( "Ime igraca ne smije biti prazno");
			}else {
			this.name = name.trim();
			}
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(width <= 0) {
			System.out.println("Sirina mora biti veca od nule");
			width= 0;
		}else {
			this.width = width;
		}
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if(height <= 0) {
		System.out.println("Visina mora biti veca od nule");
	height= 0;
		}else {
		this.height= height;
	}
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health>= 0 && health <=100) {
			this.health =health;
		}else {
			System.out.println("Health mora biti izmedju 0 i 100");
		}
	
	
	System.out.println("Player [" +this.name+ "] @  (" + this.x +","+ this.y + ") " + this.width+"x" + this.height + "HP = " + this.health  );
	
	}
	
	
}
