package projekat;

public class Game {

	 

		private Player player;
		private Enemy[] enemies = new Enemy [10];
		private int enemyCount  = 0;
		private String eventLog = " ";
		
		
		public Game( Player player) {
			this.player  = player;
		}
		public boolean checkCollision (Player p, Enemy e) {
			return p.getX()<e.getX()+e.getWidth() && p.getX()+ p.getWidth()>e.getX() && p.getY() <e.getY()+e.getWidth()&& p.getY()+p.getHeight()>e.getY();
			
		}
		public void decreaseHealth (Player p, Enemy e) {
			int oldHp = p.getHealth();
			int newHp = Math.max(0, oldHp-e.getDamage());
			
			p.setHealth(newHp);
			System.out.print("HIT" + p.getName() + "by" + e.getType() + "for" + e.getDamage() + "HP" + oldHp + "---" + newHp);
		}
		public void addEnemy(Enemy e) {
			if(enemyCount==enemies.length) {
				System.out.print("Nema mjesta za novog neprijatelja");
				return;
			}
			enemies[enemyCount]=e;
			enemyCount++;
			System.out.print("Dodaj" + e);
		}
		
       public Enemy[] collidingWithPlayer() {
    	   int cnt=0;
    	   for(int i=0;i<enemyCount;i++) {
    		   if(checkCollision(player,enemies[i]))
    			   cnt++;
    	   }
    	   Enemy[]result= new Enemy[cnt];
    	   int k=0;
    	   for(int i=0;i<enemyCount;i++) {
    		   if(checkCollision(player,enemies[i]))
    			   result[k]=enemies[i];
    		   k++;
    	   }
    	   return result;
       }
       
       public void resolveCollisions() {
    	   for(Enemy e: collidingWithPlayer()) {
    		   decreaseHealth(player,e);
    	   }
       }
       
       public static void main(String [] args) {
    	   Player p = new Player("player 1 ",10,5,32,32,85);
    	   Game game = new Game(p);
    	   game.addEnemy(new Enemy("Gremlin",100,100,20,20,30));
    	   

    	   
       }
}
 
     