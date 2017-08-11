package main.com.singleton2;

import java.util.ArrayList;
import java.util.Random;

@SuppressWarnings("all")
public class Emperor {
	private static int maxNumOfEmperor = 2; // ���ֻ���������ʵ�
	private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor); // �ʵ۽�ʲô����
	private static ArrayList emperorList = new ArrayList(maxNumOfEmperor); // װ�ʵ۵��б�
	private static int countNumOfEmperor = 0; // ���ڱ�����Ƶ����Ǹ��ʵ�
	// �Ȱ�2���ʵ۲�������
	static {
		// �����еĻʵ۶���������
		for (int i = 0; i < maxNumOfEmperor; i++) {
			emperorList.add(new Emperor("��" + (i + 1) + "��"));
		}
	}

	// ����ô��ʵ��ˣ����������ƾ�һ���ʵ�(new һ���ʵۣ�
	private Emperor() {
		// ���׺͵���Լ���㣬Ŀ�ľ��ǲ���������ڶ����ʵ�
	}

	private Emperor(String info) {
		emperorInfoList.add(info);
	}

	public static Emperor getInstance() {
		Random random = new Random();
		countNumOfEmperor = random.nextInt(maxNumOfEmperor); // �������һ���ʵۣ�ֻҪ�Ǹ���������ͳ�
		return (Emperor) emperorList.get(countNumOfEmperor);
	}

	public static Emperor getInstance(int i) throws Exception {	
		countNumOfEmperor = i;
		if(i>=2){
			throw new Exception("ֻ�������ʵ�");
		}
		return (Emperor) emperorList.get(i);
	}

	// �ʵ۽�ʲô����ѽ
	public static void emperorInfo() {
		System.out.println(emperorInfoList.get(countNumOfEmperor));
	}
}
