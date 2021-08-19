package abstrac_factory_pattern;
public class ToysOrder extends Order{

	public ToysOrder(Channel channel) {
		// TODO Auto-generated constructor stub
		super(channel, ProductType.TOY);
		processOrder();
	}
	
	@Override
	void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Processing toys order");
	}

}