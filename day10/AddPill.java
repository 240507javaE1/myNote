class AddPill//		javac -encoding utf-8 AddPill.java(有用到Pill資料表,Pill會一起javac)
{	//執行有main的,	java AddPill
	public static void main(String[] args) {//程式按下去,會從main這裡開始一行一行往下完成程式碼
		

		//Pill[],Pill[][],Pill[][][]是請你開一堆【能裝Pill】的[格子],這些[格子]類似從屬關係(用樹狀圖想像的話)or排序方式(用格子排列想像的話)
		//最後這些[格子]要新增塞滿的是【Pill】,在那之前只是開[框框格子位置]決定哪裡有幾個格子要放幾個Pill

		System.out.println("===========================================================================================");
		//新增Pill[有7格],放進【能裝Pill的[格子組]】那個有7個格子的東西叫pillBoxWeekly,裡面有pillBoxWeekly[0]
		Pill[] pillBoxWeek=new Pill[7];
		//開個7格,嘗試【能裝Pill】的格子[1],格子[3]放Pill
		pillBoxWeek[1]=new Pill("VtaminC",2);//										pillBoxWeekly[1]
		pillBoxWeek[3]=new Pill("維生素B群",1,true);//										...			共7格能裝Pill
		System.out.println("藥盒pillBoxWeekly在: "+pillBoxWeek);//						pillBoxWeekly[5]
		for(Pill whatInEachBox:pillBoxWeek) {
			System.out.println("\t\t\t這7格依序是: "+whatInEachBox);
		}
		System.out.println("===========================================================================================");
		System.out.println("\t"+pillBoxWeek[1].showField()+pillBoxWeek[1]);//		pillBoxWeekly[6]
		System.out.println("\t"+pillBoxWeek[3].showField()+pillBoxWeek[3]);//
		

		System.out.println("===========================================================================================");
		Pill[][] pillBoxMonth=new Pill[4][7];//新增Pill[像4*7的格子組],

		pillBoxMonth[0][2]=new Pill("VtaminC",2);//
		pillBoxMonth[1][4]=new Pill("維生素B群",1,true);	
		pillBoxMonth[2][6]=new Pill("VtaminC",2);//		
		pillBoxMonth[3][5]=new Pill("維生素B群",1,true);//

		System.out.println("藥盒pillBoxMonthly在: "+pillBoxMonth);
		for(Pill[] eachRowArePillBoxWeek:pillBoxMonth) {
			System.out.println("\t這4排依序是: "+eachRowArePillBoxWeek);
			for(Pill whatInEachBox:eachRowArePillBoxWeek) {
			System.out.println("\t\t這排的7格依序是: "+whatInEachBox);
			}
		}


		System.out.println("===========================================================================================");
		Pill[][][] pillBoxYear=new Pill[12][4][7];//新增Pill[像4*7格再往上疊12片的格子組],大概有336格空格子
		


		System.out.println("///////////////////////////////////////////////////////////////////////////////");
	}
}