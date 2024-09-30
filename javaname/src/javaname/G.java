package javaname;

public class G implements E{

	@Override
	public void mul() {
		System.out.println("multiply");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		System.out.println("add");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div() {
		System.out.println("division");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		E e=new G();
		e.mul();
	e.div();
		e.add();
		
		
	}
	

}





