class Superclass {
	Superclass(int i){
		System.out.println(i);
	}
}

public class Subclass extends Superclass {
	int index;

	Subclass(int i) {
		super(i);
		this.index = 1;
		System.out.println(index);
	}

	public static void main(String[] args) {
		Subclass a = new Subclass(1);
	}
}