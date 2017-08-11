package main.com.singleton2;

@SuppressWarnings("all")
public class Minister {
	public static void main(String[] args) throws Exception {
		int ministerNum =10; //10个大臣
		Emperor emperor = null;
		for(int i=0;i<ministerNum;i++){
		if((i+1)%2 == 0){
		    System.out.print("第"+(i+1)+"个大臣参拜的是：");
            emperor = Emperor.getInstance(1);
		    Emperor.emperorInfo();}
		else{
			System.out.print("第"+(i+1)+"个大臣参拜的是：");
			emperor = Emperor.getInstance(0);
		    Emperor.emperorInfo();
		}
		}
		}
}
