

import zzhiDubboapi.service.ISpiDemo;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SpiDemoFactory {
	public static Iterator<ISpiDemo> getSpiDemo(){
		ServiceLoader<ISpiDemo> spiDemos = ServiceLoader.load(ISpiDemo.class);
		return spiDemos.iterator();
	}
}