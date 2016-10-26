package libs.demo.medge.com.androidmusthavelibs;


public class EventBusUserEvent {

    private final String userName;
    private final String userAddress;
    private final float userRatings;

    public EventBusUserEvent(String userName, String userAddress, float userRatings) {
        this.userName = userName;
        this.userAddress = userAddress;
        this.userRatings = userRatings;
    }


    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public float getUserRatings() {
        return userRatings;
    }

}
