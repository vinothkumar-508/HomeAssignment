package Week3.Day1HomeAssignment;

public class APIClient {
	public void sendRequest() {
	System.out.println("sendRequest: ");
}
public void sendRequest(String endpoint) {
	System.out.println(""+endpoint+"");
	
	
}
public void sendRequest(String endpoint, String requestBody,boolean requestStatus ) {
	System.out.println(""+endpoint+"  "+" "+requestBody+"  "+" "+requestStatus);
}

public static void main(String[] args) {
	APIClient ol = new APIClient();
	ol.sendRequest();
	ol.sendRequest("Overloading");
	ol.sendRequest("Overloading", "Overloaded", false);

}
}
