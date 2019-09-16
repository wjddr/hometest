package test;

public class Tdemo {

	public static void main(String[] args) {// ������
		IMessage msg = Factory.get("message");
		msg.send("ss");
	}

}

interface IMessage {
	public void send(String str);
}

class MessageImpl implements IMessage {
	public void send(String str) {
		System.out.println("��Ϣ����:" + str);
	}
}

class Factory { // ������
	public static <T> T get(String className) {

		if ("message".equals(className)) {
			return  (T) new MessageImpl();

		} else {
			return null;
		}
	}
}
