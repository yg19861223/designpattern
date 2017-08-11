package main.com.proxy;

public class WangPo {
	private KindWomen kindWomen;
	public WangPo(){
		this.kindWomen=new PanJinLian();
	}
	public WangPo(KindWomen kindWomen){
		this.kindWomen = kindWomen;
		}
	public void jiewen(){this.kindWomen.jiewen();}
    public void xingfang(){this.kindWomen.xingfang();}
}
