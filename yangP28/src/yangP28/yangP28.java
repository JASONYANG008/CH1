package yangP28;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yangP28 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("Ոݔ��һ������");

		BufferedReader br1 =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		
		int num = Integer.parseInt(str1);
		
		System.out.println("��ݔ��Ĕ�����:"+num);
		
		System.out.println("Ոݔ���ִ�");
		
		BufferedReader br2 =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str2 = br2.readLine();
		
		System.out.println("����ݔ����ִ���:"+str2);
		
}
}
