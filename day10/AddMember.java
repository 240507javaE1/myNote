class AddMember//		javac -encoding utf-8 AddMember.java(有用到Member資料表,Member會一起javac)
{		//執行有main的,	java AddMember
	public static void main(String[] args) {//程式按下去,會從main這裡開始一行一行往下完成程式碼
		

		System.out.println("===========================================================================================");
		//Pill[],Pill[][],Pill[][][]是請你開一堆【能裝Pill】的[格子],這些[格子]有種從屬關係(用樹狀圖想像的話)or排序方式(用格子排列想像的話)
		//最後這些[格子]要新增塞滿的是【Pill】,在那之前只是開[框框格子位置]決定哪裡有幾個格子要放幾個Pill

		Pill[] pillBoxWeekly=new Pill[7];
		//新增Pill[有7格],放進【能裝Pill的[格子組]】那個有7個格子的東西叫pillBoxWeekly,裡面有pillBoxWeekly[0]
		pillBoxWeekly[1]=new Pill("VtaminC",2);//										pillBoxWeekly[1]
		pillBoxWeekly[3]=new Pill("維生素B群",1,true);//										...			共7格能裝Pill
		System.out.println("藥盒pillBoxWeekly在 "+pillBoxWeekly);//						pillBoxWeekly[5]
		System.out.println("\t"+pillBoxWeekly[1].showField()+pillBoxWeekly[1]);//		pillBoxWeekly[6]
		System.out.println("\t"+pillBoxWeekly[3].showField()+pillBoxWeekly[3]);//
		Pill[][] pillBoxMonthly=new Pill[4][7];//新增Pill[像4*7的格子組],
		Pill[][][] pillBoxYearly=new Pill[12][4][7];//新增Pill[像4*7格再往上疊12片的格子組],剛new大概有336空格子
		


		System.out.println("===========================================================================================");
		//Member[][][]是請你開一堆【能裝Member】的[格子],這些[格子]有種從屬關係(用樹狀圖想像的話)or排序方式(用格子排列想像的話)
		//最後這些[格子]要新增塞滿的是【Member】,在那之前只是開[框框格子位置]決定哪裡有幾個格子要放幾個Member

		//新增Member[有2格分校][還不知道幾個班][還不知道幾個人],放進【能裝Member的[一套格子組]】那套格子組叫gjun
		Member[][][] gjun=new Member[2][][];
			gjun[0]=new Member[2][];//新增Member[有2格班][還不知道幾個人],放進gjun[分校0]➡️gjun[0].length=有2個班
				gjun[0][0]=new Member[2];//新增Member[有2個人],放進gjun[校0][班0]➡️gjun[0][0].length=有2個人
					gjun[0][0][0]=new Member("校0班0某0","台北");
					gjun[0][0][1]=new Member("校0班0某1","台中");						
				gjun[0][1]=new Member[3];//新增Member[有3個人],放進gjun[校0][班1]➡️gjun[0][1].length=有3個人
					gjun[0][1][0]=new Member("校0班1某0","板橋");
					gjun[0][1][1]=new Member("校0班1某1","南港");
					gjun[0][1][2]=new Member("校0班1某2","日本");
			
			gjun[1]=new Member[3][];//新增Member[有3格班][還不知道幾個人],放進gjun[校1]➡️gjun[1].length=有3個班
				gjun[1][0]=new Member[3];//新增Member[有3個人],放進gjun[校1][班0]➡️gjun[1][0].length=有3個人
					gjun[1][0][0]=new Member("校1班0某0","高雄");
					gjun[1][0][1]=new Member("校1班0某1","嘉義");
					gjun[1][0][2]=new Member("校1班0某2","台南");
				gjun[1][1]=new Member[4];//新增Member[有4個人],放進gjun[校1][班1]➡️gjun[1][1].length=有4個人
					gjun[1][1][0]=new Member("校1班1某0","桃園");
					gjun[1][1][1]=new Member("校1班1某1","新北");
					gjun[1][1][2]=new Member("校1班1某2","新竹");
					gjun[1][1][3]=new Member("校1班1某3","宜蘭");
				gjun[1][2]=new Member[5];//新增Member[有5個人],放進gjun[校1][班2]➡️gjun[1][2].length=有5個人
					gjun[1][2][0]=new Member("校1班2某0","淡水");
					gjun[1][2][1]=new Member("校1班2某1","汐止");
					gjun[1][2][2]=new Member("校1班2某2","花蓮");
					gjun[1][2][3]=new Member("校1班2某3","苗栗");
					gjun[1][2][4]=new Member("校1班2某4","內湖");



		System.out.println("gjun總部在 "+gjun);
		for(int branch=0;branch<gjun.length;branch++) {//gjun.幾個單位長,2個分校
			System.out.println("\t分校"+branch+"在\t"+gjun[branch]);
			for(int course=0;course<gjun[branch].length;course++) {
				System.out.println("\t\t課程"+course+"在\t"+gjun[branch][course]);
				for(int who=0;who<gjun[branch][course].length;who++) {
					System.out.println("\t\t\t"+gjun[branch][course][who].showField()+gjun[branch][course][who]);
				}
			}
		}

		System.out.println("=======================================================");
		System.out.println("gjun總部在 "+gjun);
		for(int branch=0;branch<gjun.length;branch++) {//gjun.length=2個分校
			System.out.println("\t分校"+branch+"在\t"+gjun[branch]);
			for(int course=1;course<gjun[branch].length;course++) {
				System.out.println("\t\t課程"+course+"在\t"+gjun[branch][course]);
				for(int who=0;who<gjun[branch][course].length;who=who+2) {
					System.out.println("\t\t\t"+gjun[branch][course][who].showField()+gjun[branch][course][who]);
				}
			}
		}






		System.out.println("=====只能從第1個數到最後============================");
		System.out.println("gjun總部在 "+gjun);
		for(SchoolMember[][] branch:gjun) {//把gjun下面那2個東西列出來
			System.out.println("\t"+branch);
			for(SchoolMember[] course:branch) {
				System.out.println("\t\t"+course);
				for(SchoolMember who:course) {
					System.out.println("\t\t\t"+who);
				}
			}
		}


















/*


		school[0][1][0]=new SchoolMember("b1","台北");
		school[0][1][1]=new SchoolMember("b2","台北");
		school[0][1][2]=new SchoolMember("b3","台北");

		school[1][0][0]=new SchoolMember("c1","台北");
		school[1][0][1]=new SchoolMember("c2","台北");

		school[1][1][0]=new SchoolMember("d1","台北");
		school[1][1][1]=new SchoolMember("d2","台北");
		school[1][1][2]=new SchoolMember("d3","台北");

		school[1][2][0]=new SchoolMember("e1","台北");
		school[1][2][1]=new SchoolMember("e2","台北");
		school[1][2][2]=new SchoolMember("e3","台北");
		school[1][2][3]=new SchoolMember("e4","台北");
*/
/*		

		System.out.println("=======================================================");
		System.out.println(gjun);
		for(SchoolMember[][] branch:gjun) {
			System.out.println("\t"+branch);
			for(SchoolMember[] course:branch) {
				System.out.println("\t\t"+course);
				for(SchoolMember who:course) {
					System.out.println("\t\t\t"+who);
				}
			}
		}


		*/
	}
}