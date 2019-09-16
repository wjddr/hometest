package test;

public class Tdemo {

	public static void main(String[] args) {// 第三种
		IMessage msg = Factory.get("message");
		msg.send("ss");
	}

}

interface IMessage {
	public void send(String str);
}

class MessageImpl implements IMessage {
	public void send(String str) {
		System.out.println("消息发送:" + str);
	}
}

class Factory { // 第三种
	public static <T> T get(String className) {

		if ("message".equals(className)) {
			return  (T) new MessageImpl();

		} else {
			return null;
		}
	}
}
