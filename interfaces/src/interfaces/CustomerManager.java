package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;

	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	//loosly - tightly coupled
	public void add(Customer customer) {
		System.out.println("M��teri eklendi " + customer.getFirstName());
		
		Utils.runLogger(loggers, customer.getFirstName());
		}
		
	public void delete(Customer customer) {
		System.out.println("M��teri silindi " + customer.getFirstName());
		Utils.runLogger(loggers, customer.getLastName());
	
	}
	
}
