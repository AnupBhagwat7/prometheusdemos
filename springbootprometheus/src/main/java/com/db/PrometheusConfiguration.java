package com.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
//@EnablePrometheusEndpoint
public class PrometheusConfiguration {



    /*private MetricRegistry dropwizardMetricRegistry;

    @Autowired
    public PrometheusConfiguration(MetricRegistry dropwizardMetricRegistry) {
        this.dropwizardMetricRegistry = dropwizardMetricRegistry;
    }

    @PostConstruct
    public void registerPrometheusCollectors() {
        CollectorRegistry.defaultRegistry.clear();
        new StandardExports().register();
        new MemoryPoolsExports().register();
        new DropwizardExports(dropwizardMetricRegistry).register();
        // more metric exports
    }*/
}
