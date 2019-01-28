package priv.thinkam.spi.demo.impl2;

import priv.thinkam.spi.demo.api.DemoApi;

public class DemoImpl2 implements DemoApi {

	@Override
	public String hello(String name) {
		return "hi, " + name;
	}

}