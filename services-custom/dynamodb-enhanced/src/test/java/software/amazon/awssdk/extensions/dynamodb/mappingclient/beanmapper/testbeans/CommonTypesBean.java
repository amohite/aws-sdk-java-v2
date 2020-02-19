/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package software.amazon.awssdk.extensions.dynamodb.mappingclient.beanmapper.testbeans;

import java.nio.ByteBuffer;
import software.amazon.awssdk.extensions.dynamodb.mappingclient.beanmapper.annotations.DynamoDbBean;
import software.amazon.awssdk.extensions.dynamodb.mappingclient.beanmapper.annotations.DynamoDbPartitionKey;

@DynamoDbBean
public class CommonTypesBean {
    private String id;
    private Boolean booleanAttribute;
    private Integer integerAttribute;
    private Long longAttribute;
    private Short shortAttribute;
    private Byte byteAttribute;
    private Double doubleAttribute;
    private Float floatAttribute;
    private ByteBuffer byteBufferAttribute;

    @DynamoDbPartitionKey
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getBooleanAttribute() {
        return booleanAttribute;
    }

    public void setBooleanAttribute(Boolean booleanAttribute) {
        this.booleanAttribute = booleanAttribute;
    }

    public Integer getIntegerAttribute() {
        return integerAttribute;
    }

    public void setIntegerAttribute(Integer integerAttribute) {
        this.integerAttribute = integerAttribute;
    }

    public Long getLongAttribute() {
        return longAttribute;
    }

    public void setLongAttribute(Long longAttribute) {
        this.longAttribute = longAttribute;
    }

    public Short getShortAttribute() {
        return shortAttribute;
    }

    public void setShortAttribute(Short shortAttribute) {
        this.shortAttribute = shortAttribute;
    }

    public Byte getByteAttribute() {
        return byteAttribute;
    }

    public void setByteAttribute(Byte byteAttribute) {
        this.byteAttribute = byteAttribute;
    }

    public Double getDoubleAttribute() {
        return doubleAttribute;
    }

    public void setDoubleAttribute(Double doubleAttribute) {
        this.doubleAttribute = doubleAttribute;
    }

    public Float getFloatAttribute() {
        return floatAttribute;
    }

    public void setFloatAttribute(Float floatAttribute) {
        this.floatAttribute = floatAttribute;
    }

    public ByteBuffer getByteBufferAttribute() {
        return byteBufferAttribute;
    }

    public void setByteBufferAttribute(ByteBuffer byteBufferAttribute) {
        this.byteBufferAttribute = byteBufferAttribute;
    }
}
