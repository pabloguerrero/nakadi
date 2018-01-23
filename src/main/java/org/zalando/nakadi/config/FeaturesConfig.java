package org.zalando.nakadi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@ConfigurationProperties(prefix="nakadi.features")
public class FeaturesConfig {

    private final Map<String, Boolean> defaultFeatures = new HashMap<>();

    public Set<String> getFeatures() {
        return defaultFeatures.keySet();
    }

    public Map<String, Boolean> getDefaultFeatures() {
        return defaultFeatures;
    }

    public boolean getDefault(final String featureName) {
        return defaultFeatures.get(featureName);
    }
}