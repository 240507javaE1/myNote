class Member {
	private String name;
	private String address;

	//con
	Member(String name,String address) {
		this.name=name;
		this.address=address;
	}
	
	//method
	String show()
	{
		return "名:"+name+"\t地址:"+address;
	}
}