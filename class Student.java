class Student{
	String s1;
	String s2;
	Student (String s1){
	    s2=s1;
	}
	Student()
		{
		s2 =  "Unknown";
		}

	public static void main(String args[])
		{
		Student obj1 = new Student();
		obj1.s1 = "sahil";
		System.out.println(obj1.s1);
}
