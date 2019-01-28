package priv.thinkam.spi.demo.test;

import priv.thinkam.spi.demo.api.DemoApiCall;

public class Main {

	public static void main(String[] args) {
		new DemoApiCall().call("world");
	}

}
