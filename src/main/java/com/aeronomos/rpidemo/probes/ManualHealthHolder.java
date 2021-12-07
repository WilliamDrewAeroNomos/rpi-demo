/**
 * 
 */
package com.aeronomos.rpidemo.probes;

import java.util.concurrent.atomic.AtomicBoolean;

import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class ManualHealthHolder {

	private AtomicBoolean healthy = new AtomicBoolean(true);

	public boolean isHealthy() {
		return healthy.get();
	}
}
