package Observer_pattern;
import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService{

	List<INotificationObserver> members=new ArrayList<INotificationObserver>();
	
	@Override
	public void addSubscriber(INotificationObserver member) {
		// TODO Auto-generated method stub
		members.add(member);
	}

	@Override
	public void removeSubscriber(INotificationObserver member) {
	
		members.remove(member);
	}

	@Override
	public void notifySubscriber() {
		
		for(INotificationObserver m : members) {
			m.OnBooking();
		}
	}

}