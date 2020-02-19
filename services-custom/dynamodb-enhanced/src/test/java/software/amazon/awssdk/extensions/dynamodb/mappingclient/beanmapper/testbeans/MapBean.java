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

import java.util.Map;
import software.amazon.awssdk.extensions.dynamodb.mappingclient.beanmapper.annotations.DynamoDbBean;
import software.amazon.awssdk.extensions.dynamodb.mappingclient.beanmapper.annotations.DynamoDbPartitionKey;

@DynamoDbBean
public class MapBean {
    private String id;
    private Map<String, String> stringMap;
    private Map<String, Map<String, String>> nestedStringMap;

    @DynamoDbPartitionKey
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public Map<String, Map<String, String>> getNestedStringMap() {
        return nestedStringMap;
    }

    public void setNestedStringMap(Map<String, Map<String, String>> nestedStringMap) {
        this.nestedStringMap = nestedStringMap;
    }
}
