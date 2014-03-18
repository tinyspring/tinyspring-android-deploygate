package com.tinyspring.android.deploygate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.deploygate.sdk.DeployGate;
import com.tinyspring.android.Application;
import com.tinyspring.android.plugin.IApplicationPlugin;

/**
 * The plugin for DeployGate.
 * 
 * @author Tomas Adamek
 * 
 */
public class Plugin implements IApplicationPlugin {

	private static final Logger log = LoggerFactory.getLogger(Plugin.class);

	@Override
	public void onApplicationCreate(Application application) {
		log.debug("Tinyspring Android Plugin: installing DeployGate...");
		DeployGate.install(application);
		log.debug("Tinyspring Android Plugin: DeployGate loaded...");
	}
}
