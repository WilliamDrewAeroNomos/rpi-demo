/**
 * 
 */
package com.aeronomos.rpidemo.probes;

import java.util.concurrent.atomic.AtomicBoolean;

import org.springframework.stereotype.Component;

/**
 * @author <a href=mailto:support@governmentcio.com>support
 *
 */
@Component
public class ManualHealthHolder {

	private AtomicBoolean healthy = new AtomicBoolean(true);

	public void switchHealth() {
		healthy.set(!healthy.get());
	}

	public boolean isHealthy() {
		return healthy.get();
	}
}