package chapter15_1;

public enum Size {
	LARGE{
		@Override
		public int max() {
			return 200;
		}
	},
	MEDIUM{
		@Override
		public int max() {
			return 150;
		}		
	},
	SMALL{
		@Override
		public int max() {
			return 100;
		}		
	};
	
	abstract int max();
}
