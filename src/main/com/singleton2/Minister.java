package main.com.singleton2;

@SuppressWarnings("all")
public class Minister {
	public static void main(String[] args) throws Exception {
		int ministerNum =10; //10����
		Emperor emperor = null;
		for(int i=0;i<ministerNum;i++){
		if((i+1)%2 == 0){
		    System.out.print("��"+(i+1)+"���󳼲ΰݵ��ǣ�");
            emperor = Emperor.getInstance(1);
		    Emperor.emperorInfo();}
		else{
			System.out.print("��"+(i+1)+"���󳼲ΰݵ��ǣ�");
			emperor = Emperor.getInstance(0);
		    Emperor.emperorInfo();
		}
		}
		}
}
