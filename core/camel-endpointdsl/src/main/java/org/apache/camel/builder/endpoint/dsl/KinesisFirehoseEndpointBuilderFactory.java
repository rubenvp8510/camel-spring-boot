/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The aws-kinesis-firehose component is used for producing Amazon's Kinesis
 * Firehose streams.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface KinesisFirehoseEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS Kinesis Firehose component.
     */
    public interface KinesisFirehoseEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedKinesisFirehoseEndpointBuilder advanced() {
            return (AdvancedKinesisFirehoseEndpointBuilder) this;
        }
        /**
         * Amazon Kinesis Firehose client to use for all requests for this
         * endpoint.
         * 
         * The option is a:
         * <code>com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehose</code> type.
         * 
         * Group: producer
         */
        default KinesisFirehoseEndpointBuilder amazonKinesisFirehoseClient(
                Object amazonKinesisFirehoseClient) {
            setProperty("amazonKinesisFirehoseClient", amazonKinesisFirehoseClient);
            return this;
        }
        /**
         * Amazon Kinesis Firehose client to use for all requests for this
         * endpoint.
         * 
         * The option will be converted to a
         * <code>com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehose</code> type.
         * 
         * Group: producer
         */
        default KinesisFirehoseEndpointBuilder amazonKinesisFirehoseClient(
                String amazonKinesisFirehoseClient) {
            setProperty("amazonKinesisFirehoseClient", amazonKinesisFirehoseClient);
            return this;
        }
        /**
         * To define a proxy host when instantiating the DDBStreams client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KinesisFirehoseEndpointBuilder proxyHost(String proxyHost) {
            setProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the DDBStreams client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default KinesisFirehoseEndpointBuilder proxyPort(Integer proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the DDBStreams client.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default KinesisFirehoseEndpointBuilder proxyPort(String proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The region in which Kinesis client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1)You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KinesisFirehoseEndpointBuilder region(String region) {
            setProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KinesisFirehoseEndpointBuilder accessKey(String accessKey) {
            setProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KinesisFirehoseEndpointBuilder secretKey(String secretKey) {
            setProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS Kinesis Firehose component.
     */
    public interface AdvancedKinesisFirehoseEndpointBuilder
            extends
                EndpointProducerBuilder {
        default KinesisFirehoseEndpointBuilder basic() {
            return (KinesisFirehoseEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedKinesisFirehoseEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedKinesisFirehoseEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedKinesisFirehoseEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedKinesisFirehoseEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * AWS Kinesis Firehose (camel-aws-kinesis)
     * The aws-kinesis-firehose component is used for producing Amazon's Kinesis
     * Firehose streams.
     * 
     * Category: cloud,messaging
     * Available as of version: 2.19
     * Maven coordinates: org.apache.camel:camel-aws-kinesis
     * 
     * Syntax: <code>aws-kinesis-firehose:streamName</code>
     * 
     * Path parameter: streamName (required)
     * Name of the stream
     */
    default KinesisFirehoseEndpointBuilder kinesisFirehose(String path) {
        class KinesisFirehoseEndpointBuilderImpl extends AbstractEndpointBuilder implements KinesisFirehoseEndpointBuilder, AdvancedKinesisFirehoseEndpointBuilder {
            public KinesisFirehoseEndpointBuilderImpl(String path) {
                super("aws-kinesis-firehose", path);
            }
        }
        return new KinesisFirehoseEndpointBuilderImpl(path);
    }
}