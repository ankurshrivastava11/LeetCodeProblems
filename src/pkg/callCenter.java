package pkg;

public class callCenter {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private void changeName(String name)
	{
		this.name = name;
	}
	public static void main(String[] args)
	{
		employee emp = new employee();
		emp.setName("Ankur");
		emp.setId(1);
		emp.setDes("manager");
		System.out.println(emp.getName()+" "+ emp.getId()+" "+ emp.getDes());
		emp.setName("Vicky");
		System.out.println(emp.getName()+" "+ emp.getId()+" "+ emp.getDes());
		callCenter cc = new callCenter();
		System.out.println(cc.getName());
		cc.changeName("Adios");
		System.out.println(cc.getName());
	}

}
