package org.zalando.nakadi.domain.storage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KafkaConfiguration {
    private final ZookeeperConnection zookeeperConnection;

    public KafkaConfiguration(
            @JsonProperty(value = "zookeeper_connection") final ZookeeperConnection zookeeperConnection) {
        this.zookeeperConnection = zookeeperConnection;
    }

    public ZookeeperConnection getZookeeperConnection() {
        return zookeeperConnection;
    }

    @Override
    public String toString() {
        return "KafkaConfiguration{" + zookeeperConnection + '}';
    }
}
