/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

/**
* Specifies the key, value, and type of the parameter.
*/
public class ResourceExtensionParameterValue {
    private String key;
    
    /**
    * Optional. Key
    * @return The Key value.
    */
    public String getKey() {
        return this.key;
    }
    
    /**
    * Optional. Key
    * @param keyValue The Key value.
    */
    public void setKey(final String keyValue) {
        this.key = keyValue;
    }
    
    private String type;
    
    /**
    * Optional. Optional. Public | Private. If this value is set to Private,
    * the parameter will not be returned by Get Deployment. You can only
    * specify one public parameter and one private parameter for a maximum of
    * two parameters.
    * @return The Type value.
    */
    public String getType() {
        return this.type;
    }
    
    /**
    * Optional. Optional. Public | Private. If this value is set to Private,
    * the parameter will not be returned by Get Deployment. You can only
    * specify one public parameter and one private parameter for a maximum of
    * two parameters.
    * @param typeValue The Type value.
    */
    public void setType(final String typeValue) {
        this.type = typeValue;
    }
    
    private String value;
    
    /**
    * Optional. Value
    * @return The Value value.
    */
    public String getValue() {
        return this.value;
    }
    
    /**
    * Optional. Value
    * @param valueValue The Value value.
    */
    public void setValue(final String valueValue) {
        this.value = valueValue;
    }
}
