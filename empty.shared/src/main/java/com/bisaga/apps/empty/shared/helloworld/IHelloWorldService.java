package com.bisaga.apps.empty.shared.helloworld;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;

import com.bisaga.apps.empty.shared.helloworld.HelloWorldFormData;

/**
 * <h3>{@link IHelloWorldService}</h3>
 *
 * @author igorb
 */
@TunnelToServer
public interface IHelloWorldService extends IService {
	HelloWorldFormData load(HelloWorldFormData input);
}
