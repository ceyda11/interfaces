package interfaces;
//implement etmek demek logger i smsLogger a uyarla, gerekli olan kodlar� yaz demek.
public class SmsLogger implements Logger {

	@Override
	public void log(String message) {

		System.out.println("Sms g�nderildi :" + message);
	}

}
