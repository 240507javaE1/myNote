class AddStudent//		javac -encoding utf-8 AddStudent.java(有用到Student資料表,Student會一起javac)
{		//執行有main的,	java AddStudent
	public static void main(String[] args) { int example=-2+3;//先做右邊-2+3,再放進【能裝int】的【盒子example】
		Student s1=new Student("Tony",65,74);//新增學生new Student(一定要先做的事),放進【能裝學生】的【盒子s1】
		Student s2=new Student("Andy",55,74);//新增學生new Student(先給name,chi,eng),放進【能裝學生】的【盒子s2】
		s1.showField(); //請 學生s1.做showField(),Student查showField是void=這動作做完不用吐東西
		s2.showField();	//請 學生s2.做showField(),Student查showField是void=這動作做完不用吐東西
		System.out.println("===============================================================");
		s1.modifyCE(70,70); //請 學生s1.做modifyCE(給70,70),回Student查modifyCE是void=這動作做完不用吐東西
		s2.modifyCE(85,90);	//請 學生s2.做modifyCE(給85,90),回Student查modifyCE是void=這動作做完不用吐東西

		System.out.println("總分合計="+(s1.modifyCEgetSum(70,70)+s2.modifyCEgetSum(85,90)));
		s1.showField();//			﹌ ﹌﹌﹌﹌﹌﹌﹌﹌		 ﹌ ﹌﹌﹌﹌﹌﹌﹌﹌
		s2.showField();//		學生s1.這動作吐了個int	 學生s2.這動作吐了個int
		
		//void x=s1.modifyCE(70,70);//error: illegal start of expression
		//^							好像不能宣告void當盒子,不清楚為啥,有機會再問老師或同學
		//System.out.println(x);	//盒子x沒成功做出來,當然不能印出
		System.out.println("===============================================================");
		//s1.chi=-50;//error: chi has private access in Student
		//  ^           大概是說chi被private鎖住,螢幕前的你不能主動改學生s1.的chi=?,只能請 學生自己.做動作()來改
		s1.setChi(-50); //請 學生s1.做setChi(給-50),回Student查setChi是void=這動作做完不用吐東西
		System.out.println("國文="+s1.getChi());/*
								   ﹌ ﹌﹌﹌
					跟上面一樣,學生s1.這動作吐了int
		有些書會稱呼這種,給Field的動作稱get-er,設Field的動作稱set-er
			例如,咖啡色java工具書9-14頁*/

		System.out.println("===============================================================");
		s1.showField();	//請 學生s1.做showField(),回Student查showField是void=這動作做完不用吐東西
	}
}