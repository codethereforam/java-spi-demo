package priv.thinkam.spi.demo.impl1;

import priv.thinkam.spi.demo.api.DemoApi;

public class DemoImpl1 implements DemoApi {

	@Override
	public String hello(String name) {
		return "hello, " + name;
	}

}
