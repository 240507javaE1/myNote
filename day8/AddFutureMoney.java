class AddFutureMoney//	javac -encoding utf-8 AddFutureMoney.java(有用到FutureMoney資料表,FutureMoney會一起javac)
{		//執行有main的,	java AddFutureMoney
	public static void main(String[] args) {//程式按下去,會從main這裡開始一行一行往下做動作
		/*  資料表名稱.大家共用的資料
		➡️FutureMoney.大家共用的資料
		➡️FutureMoney.的共用資料*/
		//FutureMoney.capital=200000;//被鎖capital不能我去改			//【FutureMoney.共用資料】可在【new新增前】先用
		

		/*資料表名稱.大家共用的動作()
	  ➡️FutureMoney.大家共用的動作()
	  ➡️FutureMoney.的共用動作()*/
		FutureMoney.setCapital(10000);								//【FutureMoney.共用動作】可在【new新增前】先用
	//請 FutureMoney.做setCapital(給10000),這動作做完不用吐東西
		System.out.println(FutureMoney.calculate(10,20));			//【FutureMoney.共用動作】可在【new新增前】先用
		//			印出1行(FutureMoney.這動作吐了個int)
		System.out.println("==========================");
		System.out.println(FutureMoney.titleString());				//【FutureMoney.共用動作】可在【new新增前】先用
		//		   印出1行(FutureMoney.這動作吐了String)
		
		
		FutureMoney f1=new FutureMoney(0.014,2);//新增理專new FutureMoney(先給利率,期數),放進【能裝FutureMoney】盒子f1
		FutureMoney f2=new FutureMoney(0.013,3);//新增理專new FutureMoney(先給利率,期數),放進【能裝FutureMoney】盒子f2
		FutureMoney f3=new FutureMoney(0.012,4);//新增理專new FutureMoney(先給利率,期數),放進【能裝FutureMoney】盒子f3
		FutureMoney f4=new FutureMoney(0.011,5);//新增理專new FutureMoney(先給利率,期數),放進【能裝FutureMoney】盒子f4

		f1.showField();//請 理專f1.做showField(),這動作做完不用吐東西
		f2.showField();//請 理專f2.做showField(),這動作做完不用吐東西
		f3.showField();//請 理專f3.做showField(),這動作做完不用吐東西
		f4.showField();//請 理專f4.做showField(),這動作做完不用吐東西
		System.out.println("=============================================================");

		//  資料表名稱.的共用資料
		//FutureMoney.capital=5000;//資料capital上鎖不能你去改,只能請 FutureMoney自己.做動作()來改
		//資料表名稱.的共用動作()
		FutureMoney.setCapital(200000);	//請 FutureMoney自己.做setCapital(給200000),這動作做完不用吐東西
		
		//f2.rate=0.0115;//error: rate has private access in FutureMoney
		//^					大概是說rate被private鎖住,不能直接改,只能請 FutureMoney自己.做動作()來改
		f2.setRate(0.0115);//請 理專f2.做setRate(給小數rate)
		//														或FutureMoney.做titleString()⬊
		System.out.println(f1.titleString());//titleString()是共用動作,是f1.做titleString()➡️動作結果都一樣
		f1.showField();//請 理專f1.做showField(),這動作做完不用吐東西
		f2.showField();//請 理專f2.做showField(),這動作做完不用吐東西
		f3.showField();//請 理專f3.做showField(),這動作做完不用吐東西
		f4.showField();//請 理專f4.做showField(),這動作做完不用吐東西

	}
}