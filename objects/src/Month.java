
public enum Month {

	JANUARY {
		@Override
		public int days() {
			return 31;
		}
	}, 
	FEBRUARY{
		@Override
		public int days() {
			return 28;
		}
	}, 
	MARCH{
		@Override
		public int days() {
			return 31;
		}
	}, 
	APRIL{
		@Override
		public int days() {
			return 30;
		}
	};
	
	public abstract int days();
	
	public static void main(String args[]){
		
		System.out.println(JANUARY.days());
		
	}
}
