package observer_patteren;

public interface INotificationObserver {
	
	String name="";
	public void OnServerDown();
	public String getName();
}