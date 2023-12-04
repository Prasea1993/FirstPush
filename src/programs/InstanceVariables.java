package programs;

public class InstanceVariables {
	
	
	public int iVariable1;
	public int iVariable2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		InstanceVariables i1=new InstanceVariables();
		i1.iVariable1=100;
		i1.iVariable2=200;
		
		InstanceVariables i2=new InstanceVariables();
		i2.iVariable1=300;
		i2.iVariable2=400;
		
		System.out.println(i2.iVariable1);
		
		

	}

}
