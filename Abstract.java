/*
��������г�����ͬ���ܣ����ǹ������岻ͬ��
���ǿ��Խ������ϳ�ȡ��ֻ��ȡ���ܶ��壬������ȡ�������塣

���󼴿�������

������ص㣺
	1�����󷽷�һ���ڳ������С�
	2�����󷽷��ͳ����඼���뱻abstract�ؼ������Ρ�
	3�������಻������new����������Ϊ���ó��󷽷�û���塣
	4���������еĳ��󷽷�Ҫ��ʹ�ã����������ิд�����еĳ��󷽷��󣬽������������á�
		�������ֻ�����˲��ֳ��󷽷�����ô�����໹��һ�������ࡣ

�������һ����û��̫��Ĳ�ͬ��
������������������������ֻ���������������һЩ�������Ķ�����
��Щ��ȷ���Ĳ��֣�Ҳ�Ǹ�����Ĺ��ܣ���Ҫ��ȷ���֡������޷��������塣
ͨ�����󷽷�����ʾ��

�������һ������˸������������������п��Զ�����󷽷���
�����಻����ʵ������

���⣺�������п��Բ�������󷽷��������������ǲ��ø��ཨ������
*/
abstract class Student 
{
	private String name;
	private String sex;
	private int age;
	Student(String name,String sex,int age)
	{
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public abstract void live();
}

class Personal extends Student
{
	private String hobby;
	Personal(String name,String sex,int age,String hobby)
	{
		super(name,sex,age);
		this.hobby = hobby;
		System.out.println("<"+name+",\""+sex+"\","+age+">");
	}
	public void live()
	{
		System.out.println("easy to live");
	}
}

class Classmate extends Student
{
	private String custom;
	Classmate(String name,String sex,int age,String custom)
	{
		super(name,sex,age);
		this.custom = custom;
		System.out.println("<"+name+",\""+sex+"\","+age+">");
	}
	public void live()
	{
		System.out.println("active to live");
	}
}

class Abstract 
{
	public static void main(String[] args) 
	{
		Classmate c = new Classmate("xml","female",23,"up and down");
		c.live();
		Personal p = new Personal("menmo","male",24,"sport");
		p.live();
	}
}
