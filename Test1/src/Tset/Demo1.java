package Tset;

/*
 * �Ƚ�String��StringBuffer������
 * ���н����
 * 		ѧ�����Ŀ�����
		String ��str1 ��hascodeΪ��-2054942391
		String ��str1 ��hascodeΪ��1658835910
		ѧ�����Ŀ����ۣ��˼������ǲ�ɣ
		StringBuffer �� hascode Ϊ��366712642
		����ַ�����StringBuffer��hascodeΪ��366712642
		sb1=���ӹ�,ʥ��,���ɰٴ���
		sb2=���ӹ�,ʥ��,���ɰٴ���
 * */
public class Demo1 {
	public static void main(String[] args) {
		//String��ʵ��
		String str1 = "ѧ�����Ŀ�����";
		System.out.println(str1);
		System.out.println("String ��str1 ��hascodeΪ��" + str1.hashCode());
		str1 = str1 + "���˼������ǲ�ɣ";
		System.out.println("String ��str1 ��hascodeΪ��" + str1.hashCode());
		System.out.println(str1);
		
		//StringBuffer��ʵ��Ƚ�
		StringBuffer sb1 = new StringBuffer("���ӹ�");
		System.out.println("StringBuffer �� hascode Ϊ��" + sb1.hashCode());
		StringBuffer sb2 = sb1.append(",ʥ�˽�");  //ע��sb1��sb2ָ��ͬһ����ַ
		System.out.println("����ַ�����StringBuffer��hascodeΪ��" + sb2.hashCode());
		sb2.insert(6, ",���ɰٴ�");
		System.out.println("sb1=" + sb1);
		System.out.println("sb2=" + sb2);
	}
}
