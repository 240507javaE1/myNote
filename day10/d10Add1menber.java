class Add1
{
	public static void main(String[] args) {
		Member[][][] m=new Member[2][][];
		m[0]=new Member[2][];
		m[0][0]=new Member[2];
		m[0][1]=new Member[3];


		m[1]=new Member[3][];
		m[1][0]=new Member[2];
		m[1][1]=new Member[3];
		m[1][2]=new Member[4];

		m[0][0][0]=new Member("a1","台北");
		m[0][0][1]=new Member("a2","台北");

		m[0][1][0]=new Member("b1","台北");
		m[0][1][1]=new Member("b2","台北");
		m[0][1][2]=new Member("b3","台北");




		m[1][0][0]=new Member("c1","台北");
		m[1][0][1]=new Member("c2","台北");

		m[1][1][0]=new Member("d1","台北");
		m[1][1][1]=new Member("d2","台北");
		m[1][1][2]=new Member("d3","台北");

		m[1][2][0]=new Member("e1","台北");
		m[1][2][1]=new Member("e2","台北");
		m[1][2][2]=new Member("e3","台北");
		m[1][2][3]=new Member("e4","台北");




		System.out.println(m);
		for(int i=0;i<m.length;i++)
		{
			System.out.println("\t"+m[i]);
			for(int j=0;j<m[i].length;j++)
			{
				System.out.println("\t\t"+m[i][j]);
				for(int k=0;k<m[i][j].length;k++)
				{
					System.out.println("\t\t\t"+m[i][j][k]+"\t"+m[i][j][k].show());
				}

			}
		}

		System.out.println("=======================");
		System.out.println(m);
		for(Member[][] o:m)
		{
			System.out.println("\t"+o);
			for(Member[] u:o)
			{
				System.out.println("\t\t"+u);
				for(Member v:u)
				{
					System.out.println("\t\t\t"+v+"\t"+v.show());
				}
			}
		}

	}
}