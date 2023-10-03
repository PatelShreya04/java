class Capital
{
	public static void main(String[] args)
	{
		String s ="My Name is ShreyA";
		String[] token = s.split(" ");
		int capitalCount = 0;
        char c;
		for(int i = 0; i< token.length; i++)
		{
	 		char ch=token[i].charAt(0);
			boolean bl = Character.isUpperCase(ch);
			if(bl) {
				capitalCount++;
                 System.out.println(token[i] +'\t' + " starts with capital letter");
			}
		}
       
	System.out.println("Number of words that starts with capital letters:" + capitalCount);
	}
}




