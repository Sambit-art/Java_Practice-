package billing_app;

class Price{
public int price=0;

//	public int fetchPrice(String item) {
//		
//		return price;
//	}

	public int getPrice() {
		return price;
	}

	public int setPrice(String item) {
		String arrItem[]=item.split(" ");
		System.out.println(arrItem[0]);
		switch (arrItem[0]) {
		case "Arabica-Arabica":
			this.price=150;
			break;
		case "Black-coffee":
			this.price=120;
			break;
		case "Latte":
			this.price=100;
			break;
		case "Cappuccino":
			this.price=80;
			break;
		case "Americano":
			this.price=130;
			break;
		case "Espresso":
			price=70;
			break;
		case "Doppio":
			this.price=90;
			break;
		case "Paneer-tikka":
			this.price=125;
			break;
		case "Handvo":
			this.price=54;
			break;
		case "Corn-cutlet":
			this.price=40;
			break;
		case "Corn-patties":
			this.price=90;
			break;
		case "Pav-bhaji":
			this.price=50;
			break;

		default:
			break;
		}
		return this.price;
	}
	
}