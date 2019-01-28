package priv.thinkam.spi.demo.api;

import java.util.ServiceLoader;

public class DemoApiCall {

	public void call(String name) {
		ServiceLoader<DemoApi> loader = ServiceLoader.load(DemoApi.class);
		for (DemoApi demoApi : loader) {
			System.out.println(demoApi.hello(name));
		}
	}

}