class FutureMoney {//資料表 FutureMoney *免責聲明:這些【奇怪用語】只是讓我自己有個圖象概念,不是什麼工程師或程式術語
//Field欄位,身為FutureMoney一開始就該有的東西,private上鎖,【static大家共用的】
	private static int capital;/*static本金=【大家共用的capital】
							➡️【FutureMoney的大家共用的capital】
								➡️FutureMoney.的共用capital
								  ➡️FutureMoney.capital
							*/
	private double rate;	//利率=this.rate
	private int nTime;		//期數=this.nTime
	private double total;	//本利和(單利)=this.total

//Constructor,【新增理專new FutureMoney】時(一定要先做的事)

	//大家共用的capital,每次給是多餘步驟,放到外面給1次就好(另外capital上鎖了,要用set-er)
	//FutureMoney(i̶n̶t̶ ̶c̶a̶p̶i̶t̶a̶l̶,̶(多餘步驟,砍掉)double rate,int nTime) {	
	FutureMoney(double rate,int nTime) {//【新增理專new FutureMoney】時(先給小數rate,整數nTime)➡️new FutureMoney(0.014,2)
		//this.capital=capital;//給capital是多餘步驟,不用這裡一直給,所以不需要這一行了
		this.rate=rate;		//把(先給的rate),放進this.rate(就是上面Field欄位的rate)
		this.nTime=nTime;	//把(先給的nTime),放進this.nTime(就是上面Field欄位的nTime)
		this.total=capital*(1+rate*nTime);//把上面的共用capital*(先給的rate*nTime),放進this.total=上面Field欄的total
	}

//method的get-er/set-er動作,請 學生.給Xxx()/請 學生.設Xxx(給東西),來操作因為好習慣而鎖住的Field欄位


	//										【大家共用的不是我這個的,我這個的不是大家共用的】
	//static(大家共用的)跟this(我這個)會衝突到, 【有static不能有this】,【有this不能有static】
	/*static*/void setRate(double rate) {//請 理專f2.做setRate(給小數rate)➡️f2.setRate(0.0115)
		if(rate>=0) {//用if限制(給的rate>=0),	因為不想讓你給負小數
			this.rate=rate;//把(給的rate),放進【this.rate=我這個f2.rate】
		}
	}//void 動作,不用【你吐】東西
	//				【return】	



	//											➡️FutureMoney.capital
	//										  ➡️FutureMoney.的共用capital
	//能static,因為裡面只有【大家共用的capital】➡️FutureMoney大家共用的capital						
	static void setCapital(int capital) {//請 理專f2.做setCapital(給整數capital)➡️f̶2̶.̶s̶e̶t̶C̶a̶p̶i̶t̶a̶l̶(̶1̶0̶0̶0̶0̶)̶➡️static void setCapital()
		if(capital>=0) {//用if限制(給的capital>=0),因為不想讓你給負整數							   ➡️大家共用的.動作setCapital()
			FutureMoney.capital=capital;//把(給的capital),放進【FutureMoney大家共用的capital】		 ➡️FutureMoney.setCapital()
		}//								➡️把(給的capital),放進FutureMoney.capital
	}//void 動作,不用【你吐】東西

//Method的一般動作,可以請 理專.做動作(給需要的東西),取名因人而異,好懂就好


	//宣告String,請 你吐String
	//能static,因為裡面沒有【rate/nTime/total=我這個f3.rate/nTime/total】,所以可以是【大家共用的.動作】
	static String titleString() {	//請 理專f3.做titleString()➡️f̶3̶.̶t̶i̶t̶l̶e̶S̶t̶r̶i̶n̶g̶(̶)̶➡️static String titleString()
		return "本金:"+ "\t利率:"+ "\t期數:"+ "\t本利和:";//					  ➡️大家共用的.動作titleString()
	}//請 你吐 "本金: (tab)利率: (tab)期數: (tab)本利和:"						➡️FutureMoney.titleString()

	//宣告int,請 你吐int	
	//能static,因為裡面沒有【rate/nTime/total=我這個f3.rate/nTime/total】,所以可以是【大家共用的.動作】
	static int calculate(int x,int y) {	//請 理專f3.做calculate(給整數x,整數y)➡️f̶3̶.̶c̶a̶l̶c̶u̶l̶a̶t̶e̶(̶1̶0̶.̶2̶0̶)̶➡️static int calculate()
		return x*y;//																		    ➡️大家共用的.動作calculate()
	}//請 你吐 x*y 																			  ➡️FutureMoney.calculate()
	

	//														【我這個的不是大家共用的】
	//裡面有【rate/nTime/total=我這個f4.rate/nTime/total】➡️裡面【有this不能有static】
	void showField() { //請 理專f4.做showField()➡️f4.showField()
		this.total=capital*(1+rate*nTime);//把大家共用的capital*(我這個f4.rate*nTime),放進【this.total=我這個f4.total】
		System.out.println("本金:"+capital+ "\t利率:"+rate+ "\t期數:"+nTime+ "本利和:"+total);
	}//void 動作,這動作是{大括號區內2行處理完,做完不用吐東西}
}