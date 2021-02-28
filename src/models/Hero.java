package models;

public class Hero extends Person {
	
		public Hero(String name) {
			super(name,0);
		}
		private boolean isFlying;

		public boolean isFlying() {
			return isFlying;
		}

		public void setFlying(boolean isFlying) {
			this.isFlying = isFlying;
		}
		
		public void attack(Hero hero) {
			System.out.println(this.getName()+"와 "+ hero.getName()+ "는 쌈박질 중 입니다. ");
		}
	

}
