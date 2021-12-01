package com.aeronomos.rpidemo.probes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class ManualHealthIndicator implements HealthIndicator {

	@Autowired
	private ManualHealthHolder manualHealthHolder;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.boot.actuate.health.HealthIndicator#health()
	 */
	public Health health() {
		boolean healthy = manualHealthHolder.isHealthy();
		if (healthy) {
			return Health.up().build();
		}
		return Health.down().build();
	}
}
