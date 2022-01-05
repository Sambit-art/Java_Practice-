package billing_app;

class Bill{
	protected int val=0;
	public int inc(int price,int multipleinc) {
		val=val+price*multipleinc;
		return val;
	}
	public int dec(int price,int multipledec) {
		val=val-(price*multipledec);
		return val;
	}
}


