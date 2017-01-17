package com.bisaga.apps.empty.server.helloworld;

import com.bisaga.apps.empty.server.ServerSession;
import com.bisaga.apps.empty.shared.helloworld.HelloWorldFormData;
import com.bisaga.apps.empty.shared.helloworld.IHelloWorldService;

/**
 * <h3>{@link HelloWorldService}</h3>
 *
 * @author igorb
 */
public class HelloWorldService implements IHelloWorldService {

	@Override
	public HelloWorldFormData load(HelloWorldFormData input) {
		StringBuilder msg = new StringBuilder();
		msg.append("Hello ").append(ServerSession.get().getUserId()).append('!');
		input.getMessage().setValue(msg.toString());
		return input;
	}
}
