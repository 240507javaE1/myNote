interface MyInterface {
//Method,"auto public" in interface,只有同樣是public才能override覆蓋,
	String runInterfaceMethod(String yourText);
	//上面是一個通常的interface方法,子類/下屬必須{自行實現}並且override覆蓋這個方法
	
	default void runDefaultMethod()
	{
		System.out.println("This is a default method(in myInterface)");
	}//上面是一個有default關鍵字的方法{可以寫怎樣實現},他的下屬可以查這方法來用

	static void runStaticMethod()
	{
		System.out.println("This is a static method(in myInterface)");
	}//上面是一個有static關鍵字的方法{可以寫怎樣實現},MyInterfaceExample專用,不給下屬用
}	//使用方式只有MyInterfaceExample.runStaticMethod()

//==上面是一個interface,叫MyInterface,======================================



class MySubClass implements MyInterface {
//這MySubClass有繼承關係,必須implement(實現) MyInterface{沒寫實現}的方法

	//簡單理解就是把MyInterfaceExample沒實現的方法複製下來,補寫{你要實現的東西}
	public String runInterfaceMethod(String yourText) 
	{
		return "這個方法在subclass{自行實現},變成了這句話+給的字:"+yourText;
	}//上面是MyInterfaceExample{沒寫實現}的方法,身為子類必須{自行實現},
	
	public void mySubClassMethod() 
	{
		System.out.println("這是一個mySubClass自己的method,");
	}//這是一個mySubClass自己的方法,當mySubClass在myInterface位置上時不能做
} 

//==上面是一個class,叫MySubClass,==================

//==下面是有main的東西,檔名要跟main的class一樣,此例叫InterfaceExample===============

public class InterfaceExample {
	//如果InterfaceExample{內部}除了main以外有寫東西的話,
	//就當這個InterfaceExample主體是一個class,就是類似Member/Student的東西
	//然後這個main就當作測試用拿來run的平台,省的還要寫個有main的Ex1,還去run那個Ex1
	public static void main(String[] args) { //有main才能run,只run{main區塊},其他查表用

		MyInterface testObj = new MySubClass(); 
		//new了個MySubClass,放在MyInterface的位置上,叫testObj,
		//因為放在MyInterface的位置上,所以只能做MyInterface有寫的事

		System.out.println(testObj.runInterfaceMethod("下屬自己實現"));
	//	testObj.mySubClassMethod(); //mySubClassMethod沒寫在MyInterface的位置上,不能做
		testObj.runDefaultMethod();
	//	testObj.runStaticMethod();  //runStaticMethod是MyInterface專屬的,不給下屬用
	//	MyInterface.runDefualtMethod(); //interface不自己做default,但能給下屬用
		MyInterface.runStaticMethod();	//interface會自己做static方法,不給下屬用

	System.out.println("\n==分隔線上下是沒有任何關係的2件事===========================\n");
		InterfaceExample testObj_2 = new InterfaceExample();
		//new了個InterfaceExample,放在他自己的位置上,叫testObj_2,
		//new的左右一樣時,可以當作這個東西能做他自己有寫的所有事

		System.out.println(testObj_2.runInterfaceMethod("下屬自己實現"));
		testObj_2.mySubClassMethod();
		testObj_2.runStaticMethod();
		InterfaceExample.runStaticMethod();

	}//程式執行時會run的main區塊到此結束,其他地方大多就當查表用途

//==因為InterfaceExample也是一個class,所以也能做屬於InterfaceExample的Method
//==下面是屬於這個InterfaceExample的Method,跟MyInterface和MySubClass"沒有任何關係"
	public String runInterfaceMethod(String yourText) 
	{
		return "InterfaceExample的這個方法,變成了這句話+給的字:"+yourText;
	}
	
	public void mySubClassMethod() 
	{
		System.out.println("這是一個InterfaceExample的method,");
	}

	/*
	default void runDefaultMethod()	//error: modifier default not allowed here
	{
		System.out.println("This is a default method(in myInterface)");
	}
	*/

	static void runStaticMethod()
	{
		System.out.println("This is a static method(in InterfaceExample)");
	}//這static是給class叫"InterfaceExample"用的,用途是給屬於InterfaceExample的大家能共用



}