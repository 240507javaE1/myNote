class Pill {//資料表 Pill 	/*免責聲明:這些奇怪用語只是讓我自己有個圖象概念,不是什麼工程師或程式術語*/
//Field欄位,身為Pill一開始就該有的東西
	//private上鎖,只能請 哪個Pill.做動作()來給name/設name
	private String pillName;
	private int numEatEachTime;
	private boolean isBitter;

//Constructor,新增new Pill時(一定要先做的事)
	Pill(String pillName,int numEatEachTime ) {//new Pill時(給字串pillName,整數numEatEachTime)
		this.pillName=pillName;
		this.numEatEachTime=numEatEachTime;
	}
	Pill(String pillName,int numEatEachTime,boolean isBitter ) {//new Pill(給字串name,整數numEatEachTime,是否isBitter)
		this.pillName=pillName;
		this.numEatEachTime=numEatEachTime;
		this.isBitter=isBitter;
	}
//Method的get-er/set-er動作,請 哪個Pill.給Xxx()/請 學生.設Xxx(給東西)
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
*/	//main那邊沒有請 哪個Pill.getXxx一類的,所以註解或有寫沒寫都可以

//Method的一般動作,可以請 哪個Pill.做動作(給需要的東西),取名因人而異,好懂就好
	String showField() {
		return "有個Pill是:"+pillName+"\t一次幾顆:"+numEatEachTime+"\t苦嗎:"+isBitter+"\t在 ";
	}

}