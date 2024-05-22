class Student {//【資料表class】 【名稱Student】  /**免責聲明:這些【奇怪用語】是讓我自己有個形象概念而已,不是什麼工程師用語*/
//老師舉例過excel,沒有main的這個class老師稱資料表,看到class Student時,會想像我開了個Student.xls之類的excel表
//					﹌﹌﹌﹌﹌﹌﹌﹌⬊有看過這種沒有main的class被叫靜態class,能跟人溝通都沒差
//field欄位,學生Student打從一開始就該有的東西
	private String name;	//加private能上鎖,把資料上鎖是好習慣,螢幕前的你不能主動改學生.的資料=?,只能請 學生.做動作()來幫你
	private int chi;	//這就是this.chi 		咖啡色java工具書右下9-13頁說:
	private int eng;	//這就是this.eng 		●除非有公開的必要,否則最好所有成員變數都加上private
	private int sum;	//這就是this.sum 	   就是左邊name/chi/eng/sum這些⬈﹌﹌﹌﹌

//constructor,【新增學生new Student】時(一定要先做的事)		⬈new Student("Tom",65,87)
	Student(String name,int chi,int eng) {		//【新增學生new Student】時(先給字串name,整數chi,整數eng)
		if(chi>=0 && eng>=0) {//用if限制(先給的國文chi>=0 且 先給的英文eng>=0),因為不想讓你給負整數
			this.name=name;	//把(先給學生的name)放進this.name(就是上面field欄位的name)
			this.chi=chi;	//把(先給學生的chi)放進this.chi(就是上面field欄位的chi)
			this.eng=eng;	//把(先給學生的eng)放進this.eng(就是上面field欄位的eng)
			//下行是比較隨興的寫法,這區沒宣告sum,會找上面的sum,
			sum=chi+eng;	//把(先給學生的chi+eng)放進sum,這區沒宣告sum,找到上面field欄位的sum放進去
			//下行是比較嚴謹的寫法,javac都能過,不會錯誤
			this.sum=this.chi+this.eng;//把上面field欄位的chi+eng放進this.sum(就是上面field欄位的sum)
			System.out.println("【新增學生new Student】(先給的名子,成績)已被填入");
		} else {
			System.out.println("【新增學生new Student】(國文,英文有負數)印這行,if區跳過沒做,只放預設值0");
		}	
	}

//method的get-er/set-er動作,請 學生.給Xxx()/請 學生.設Xxx(給東西),來操作因為好習慣而鎖住的field欄位

	//因為field欄位name被鎖不給改,所以用setName設name
	void setName(String name) {	//請 學生s1.做setName(給字串name)	 ➡️ s1.setName("Tom")
		this.name=name;//把(給的name)放進this.name(就是上面field欄位的name)
	}//void 動作,不用【你吐】東西
	//			    【return】
	//宣告String,請 你吐String,用getName給name
	String getName() { 	//請 學生s1.做getName()					➡️	s1.getName()
		return this.name;
	}//請 你吐 this.name(就是上面field欄位的name)

	//因為field欄位chi被鎖不給改,所以用setChi設chi
	void setChi(int chi) {	//請 學生s1.做setChi(給整數chi) 		➡️ s1.setChi(100)
		if(chi>=0) {//用if限制(給的國文>=0),因為不想讓你給負整數
			this.chi=chi;//把(給的chi)放進this.chi(就是上面field欄位的chi)
			//改完國文分數要重算總分,否則總分會留在沒改分數前的總分
			this.sum=this.chi+this.eng;//把上面field欄位的chi+eng放進this.sum(就是上面field欄位的sum)
		} else {
			System.out.println("學生s1.setChi(國文給負整數)印這行,if區跳過沒做,所以國文跟總分都沒重算");
		}
	}//void 動作,不用【你吐】東西
	//			  【return】
	//宣告int,請 你吐int, 用getChi給chi
	int getChi() {	//請 學生s1.做getChi()						➡️	s1.getChi()
		return chi;	
	}//請 你吐 chi(這區沒宣告chi,找到上面field欄位的chi放進去)

//method的set-er跟get-er動作寫在以上這區,在Java中tab縮排/空白鍵大多是排版給人讀的方便,只要javac能過就好
//我自己覺得把set-er/get-er,跟method的一般動作分開排版,對我自己或給人看都方便而已,以下是method的一般動作


//method的一般動作,可以請 學生.做動作(給需要的東西),取名因人而異,好懂就好
	void showField() { 	//請 學生s1.做showField() 							➡️ s1.showField()
		System.out.println("姓名:"+name+"\t國文:"+chi+"\t英文:"+eng+"\t總分:"+sum);
	}//void 動作,這動作是{印出(姓名:name (tab)國文:chi (tab)英文:eng (tab)總分:sum),做完不用吐東西}

	void modifyCE(int chi,int eng) {//請 學生s1.做modifyCE(給整數chi,整數eng) ➡️ s1.modifyCE()
		this.chi=chi;//把(給的chi)放進this.chi(就是上面field欄位的chi)
		this.eng=eng;//把(給的eng)放進this.eng(就是上面field欄位的eng)
		this.sum=this.chi+this.eng;//把上面field欄位的chi+eng放進this.sum(就是上面field欄位的sum)
	}//void 動作,這動作是{大括號區內3行處理完,做完不用吐東西}


	//宣告int,請 你吐int,
	int modifyCEgetSum(int chi,int eng) {//請 學生s1.做modifyCEgetSum(整數chi,整數eng)➡️s1.modifyCEgetSum()
		this.chi=chi;//把(給的chi)放進this.chi(就是上面field欄位的chi)
		this.eng=eng;//把(給的eng)放進this.eng(就是上面field欄位的eng)
		this.sum=this.chi+this.eng;//把上面field欄位的chi+eng放進this.sum(就是上面field欄位的sum)
		return this.sum; 
	}//請 你吐 this.sum(就是上面field欄位的sum)
}