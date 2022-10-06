
class Customer{
	int depositAmount;
	Customer(){
		this.depositAmount = 40000;
	}
}


class ShortTermCustomer extends Customer{
	int amount;
	ShortTermCustomer(){
		this.amount = 20000;
	}
}

class LongTermCustomer extends Customer{
	int amount;
	LongTermCustomer(){
		this.amount = 35000;
	}
}

public class HirarchicalInheritance{
	public static void main(String[] args){

		ShortTermCustomer STC = new ShortTermCustomer();
		LongTermCustomer LTC = new LongTermCustomer();

		System.out.println("Ttotal rent for short term customer is : " + (STC.depositAmount - STC.amount) );
		System.out.println("Total rent for long term customer is : " + (LTC.depositAmount - LTC.amount) );

	}
}