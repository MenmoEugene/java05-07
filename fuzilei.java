/*
�Ӹ�����ֺ����Ա���ص㣺
���г�Ա��
1.����
2.����
3.���캯��

����
��������г��ַ�˽�е�ͬ����Ա����ʱ��
����Ҫ���ʱ����еı�������this
����Ҫ���ʸ����е�ͬ����������super

super��this��ʹ�ü���һ��
this������Ǳ�����������
super������Ǹ�����������
*/
class fuzilei 
{
	public static void main(String[] args) 
	{
		zi z = new zi();
		z.show();
	}
}

class fu
{
	int num = 4;
}

class zi extends fu
{
	int num = 6;
	void show()
	{
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}