package aprendendoSintaxeJava;

public class MetodosAulaTres {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV Ligada ? " + smartTv.on);
		System.out.println("Canal Atual ? " + smartTv.channel);
		System.out.println("Volume Atual ? " + smartTv.volume);

		smartTv.turnOn();
		System.out.println("New Status -> TV On ? " + smartTv.on);
		
		smartTv.turnOff();
		System.out.println("New Status -> TV On ? " + smartTv.on);
		
		smartTv.increaseVolume();
		smartTv.increaseVolume();
		System.out.println("Current volume: " + smartTv.volume);
		
		smartTv.decreaseVolume();
		System.out.println("Current volume: " + smartTv.volume);
		
		smartTv.increaseChannel();
		smartTv.increaseChannel();
		smartTv.increaseChannel();
		smartTv.increaseChannel();
		smartTv.increaseChannel();
		System.out.println("Current channel: " + smartTv.channel);
		
		smartTv.decreaseChannel();
		smartTv.decreaseChannel();
		System.out.println("Current channel: " + smartTv.channel);
		
		smartTv.changeChannel(13);
		System.out.println("Current channel: " + smartTv.channel);
	}

}
