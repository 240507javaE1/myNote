class AddMember//		javac -encoding utf-8 AddMember.java(有用到Member資料表,Member會一起javac)
{		//執行有main的,	java AddMember
	public static void main(String[] args) {//程式按下去,會從main這裡開始一行一行往下完成程式碼
		

		//Member[][][]是請你開一堆【能裝Member】的[格子],這些[格子]類似從屬關係(用樹狀圖想像的話)or排序方式(用格子排列想像的話)
		//最後這些[格子]要新增塞滿的是【Member】,在那之前只是開[框框格子位置]決定哪裡有幾個格子位置要放幾個Member


		//新增Member[有2格分校][還不知道幾格班][還不知道幾個人],放進【能裝Member的[一套格子組]】那套格子組叫gjun
		Member[][][] gjun=new Member[2][][];
			gjun[0]=new Member[2][];//新增Member[有2格班][還不知道幾個人],放進gjun[分校0]➡️gjun[0].length=有2格班
				gjun[0][0]=new Member[2];//新增Member[有2格要放人],放進gjun[校0][班0]➡️gjun[0][0].length=有2格要放人
					gjun[0][0][0]=new Member("校0班0某0","台北");
					gjun[0][0][1]=new Member("校0班0某1","台中");						
				gjun[0][1]=new Member[3];//新增Member[有3格要放人],放進gjun[校0][班1]➡️gjun[0][1].length=有3格要放人
					gjun[0][1][0]=new Member("校0班1某0","板橋");
					gjun[0][1][1]=new Member("校0班1某1","南港");
					gjun[0][1][2]=new Member("校0班1某2","日本");
			
			gjun[1]=new Member[3][];//新增Member[有3格班][還不知道幾個人],放進gjun[校1]➡️gjun[1].length=有3格班
				gjun[1][0]=new Member[3];//新增Member[有3格要放人],放進gjun[校1][班0]➡️gjun[1][0].length=有3格要放人
					gjun[1][0][0]=new Member("校1班0某0","高雄");
					gjun[1][0][1]=new Member("校1班0某1","嘉義");
					gjun[1][0][2]=new Member("校1班0某2","台南");
				gjun[1][1]=new Member[4];//新增Member[有4格要放人],放進gjun[校1][班1]➡️gjun[1][1].length=有4格要放人
					gjun[1][1][0]=new Member("校1班1某0","桃園");
					gjun[1][1][1]=new Member("校1班1某1","新北");
					gjun[1][1][2]=new Member("校1班1某2","新竹");
					gjun[1][1][3]=new Member("校1班1某3","宜蘭");
				gjun[1][2]=new Member[5];//新增Member[有5格要放人],放進gjun[校1][班2]➡️gjun[1][2].length=有5格要放人
					gjun[1][2][0]=new Member("校1班2某0","淡水");
					gjun[1][2][1]=new Member("校1班2某1","汐止");
					gjun[1][2][2]=new Member("校1班2某2","花蓮");
					gjun[1][2][3]=new Member("校1班2某3","苗栗");
					gjun[1][2][4]=new Member("校1班2某4","內湖");


		System.out.println("==常見的for應用1,暫時設ijk然後i++,j++,k++...,該圈i,j,k=?就帶進去使用=======================");
		//這裡for好多圈...如果取名太長影響裡閱讀的話,可能先看老師i,j,k,短名的那個for迴圈,揣摩順序是怎樣跑的
		System.out.println("gjun總部在 "+gjun);
		for(int branch=0;branch<gjun.length;branch++) {
			System.out.println("\t分校"+branch+"在\t"+gjun[branch]);
			for(int course=0;course<gjun[branch].length;course++) {
				System.out.println("\t\t課程"+course+"在\t"+gjun[branch][course]);
				for(int who=0;who<gjun[branch][course].length;who++) {
					System.out.println("\t\t\t"+gjun[branch][course][who].showField()+gjun[branch][course][who]);
				}
			}
		}





		System.out.println("==常見的for應用2,暫時設ijk後對ijk另外定規律...,該圈ijk=?就帶進去使用======================");

		System.out.println("gjun總部在 "+gjun);
		for(int branch=0;branch<gjun.length;branch++) {
			System.out.println("\t分校"+branch+"在\t"+gjun[branch]);//								➡️因為course++等同course=course+1
			for(int course=1;course<gjun[branch].length;course++) {//這裡course=1,所以course首先=1,下圈=2,下圈=3...
				System.out.println("\t\t課程"+course+"在\t"+gjun[branch][course]);
				for(int who=0;who<gjun[branch][course].length;who=who+2) {//這裡who=who+2,所以who首先=0,下圈=2,下圈=4...
					System.out.println("\t\t\t"+gjun[branch][course][who].showField()+gjun[branch][course][who]);
				}
			}
		}




		System.out.println("==for each用法,只能從第[0]個數到最後,不能像上面對ijk另外定規律============================");
		System.out.println("gjun總部在 "+gjun);					
		for(Member[][] eachBranch:gjun)//➡️如果不知道gjun內的東西是文字/數字/還是啥,隨便打個int eachBranch,黑畫面cmd那javac錯誤會說int要改成啥
		{		//類似eachBranch=gjun[0],把gjun內的東西【依序】從gjun[0]放進eachBranch,下圈放gjun[1]...到gjun[最後]
			System.out.println("\t"+eachBranch);//這eachBranch先印gjun[分校0的位置],下圈印gjun[分校1的位置]...到gjun[最後]
			for(Member[] eachCourse:eachBranch)
			{		//像eachCourse=eachBranch[0],把eachBranch內的東西【依序】從eachBranch[0]放進eachCourse,下圈放eachBranch[1]...到eachBranch[最後]
				System.out.println("\t\t"+eachCourse);//這eachCourse先印eachBranch[班0的位置],下圈印eachBranch[班1的位置]...到eachBranch[最後]
				for(Member eachWho:eachCourse)
				{	//類似eachWho=eachCourse[0],把eachCourse內的東西【依序】從eachCourse[0]放進eachWho,下圈放eachCourse[1]...到eachCourse[最後]
					System.out.println("\t\t\t"+eachWho.showField()+eachWho);
				}//eachCourse[0]放進eachWho的是Member,有Member.動作(),所以能用eachWho.showField
			}
		}


	}
}