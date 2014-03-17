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

package com.microsoft.windowsazure.management.store.models;

/**
* Represents the data passed to the Create Cloud Service API method.
*/
public class CloudServiceCreateParameters {
    private String description;
    
    /**
    * Required. The description for the cloud service to be created.
    * @return The Description value.
    */
    public String getDescription() {
        return this.description;
    }
    
    /**
    * Required. The description for the cloud service to be created.
    * @param descriptionValue The Description value.
    */
    public void setDescription(final String descriptionValue) {
        this.description = descriptionValue;
    }
    
    private String geoRegion;
    
    /**
    * Required. The geographical region to create the cloud service in.
    * @return The GeoRegion value.
    */
    public String getGeoRegion() {
        return this.geoRegion;
    }
    
    /**
    * Required. The geographical region to create the cloud service in.
    * @param geoRegionValue The GeoRegion value.
    */
    public void setGeoRegion(final String geoRegionValue) {
        this.geoRegion = geoRegionValue;
    }
    
    private String label;
    
    /**
    * Required. The label of the cloud service to be created.
    * @return The Label value.
    */
    public String getLabel() {
        return this.label;
    }
    
    /**
    * Required. The label of the cloud service to be created.
    * @param labelValue The Label value.
    */
    public void setLabel(final String labelValue) {
        this.label = labelValue;
    }
    
    private String name;
    
    /**
    * Required. The name of the cloud service to be created.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Required. The name of the cloud service to be created.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
}
