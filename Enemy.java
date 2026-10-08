package projekat;


public class Enemy {
	private String type;
	private int x;
	private int y;
	private int width;
	private int height;
	private int damage;
	
	public Enemy(String type, int x, int y, int width, int height, int damage) {
		super();
		this.type = type;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.damage = damage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if (type == null) {
			System.out.println("Ne smije biti prazno");
		}else {
			this.type = type.trim();
			this.type= type.toLowerCase();
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
			height = 0;
		}else {
			this.height= height;
		}
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		if( damage >= 0 && damage <= 100) {
			this.damage = damage;
			
		}else {
			System.out.println("Damage mora biti izmedju 0 i 100");
		this.damage = 0;
		
		
		}
		System.out.println("Enemy [" +this.type+ "] @  (" + this.x +","+ this.y + ") " + this.width+"x" + this.height + "DMG = " + this.damage  );
		
	}
	
	
}
