class Member {//資料表 Member 	/*免責聲明:這些奇怪用語只是讓我自己有個圖象概念,不是什麼工程師或程式術語*/
//Field欄位,身為Member一開始就該有的東西
	//private上鎖,只能請 Member的誰.做動作()來給name/設name
	private String name;
	private String whereFrom;

//Constructor,新增new Member時(一定要先做的事)
	Member(String name,String whereFrom) {//new Member時(先給字串name,字串whereFrom)
		this.name=name;
		this.whereFrom=whereFrom;
	}

//Method的get-er/set-er動作,請 學生.給Xxx()/請 學生.設Xxx(給東西)
/*
	String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name=name;
	}

	String getWhereFrom() {
		return this.name;
	}
	void setWhereFrom(String name) {
		this.name=name;
	}
*/	//main那邊沒有請 Member的誰.getXxx一類的,所以註解或有寫沒寫都可以

//Method的一般動作,可以請 SchoolMember的誰.做動作(給需要的東西),取名因人而異,好懂就好
	String showField() {
		return "有個Member是:"+name+"\t來自:"+whereFrom+"\t在 ";
	}
}