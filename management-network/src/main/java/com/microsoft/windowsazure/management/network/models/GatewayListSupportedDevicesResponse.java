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

package com.microsoft.windowsazure.management.network.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;

/**
* The respoonse to the get supported platform configuration request.
*/
public class GatewayListSupportedDevicesResponse extends OperationResponse {
    private ArrayList<GatewayListSupportedDevicesResponse.Vendor> vendors;
    
    /**
    * Optional. The set of supported vendors.
    * @return The Vendors value.
    */
    public ArrayList<GatewayListSupportedDevicesResponse.Vendor> getVendors() {
        return this.vendors;
    }
    
    /**
    * Optional. The set of supported vendors.
    * @param vendorsValue The Vendors value.
    */
    public void setVendors(final ArrayList<GatewayListSupportedDevicesResponse.Vendor> vendorsValue) {
        this.vendors = vendorsValue;
    }
    
    private String version;
    
    /**
    * Optional. The version for this device configuration list.
    * @return The Version value.
    */
    public String getVersion() {
        return this.version;
    }
    
    /**
    * Optional. The version for this device configuration list.
    * @param versionValue The Version value.
    */
    public void setVersion(final String versionValue) {
        this.version = versionValue;
    }
    
    /**
    * Initializes a new instance of the GatewayListSupportedDevicesResponse
    * class.
    *
    */
    public GatewayListSupportedDevicesResponse() {
        super();
        this.vendors = new ArrayList<GatewayListSupportedDevicesResponse.Vendor>();
    }
    
    public static class OSFamily {
        private String name;
        
        /**
        * Optional. The name of the os family.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. The name of the os family.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
    }
    
    /**
    * The name and supported OS Families for this vendor on the platform.
    */
    public static class Platform {
        private String name;
        
        /**
        * Optional. The platform name.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. The platform name.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private ArrayList<GatewayListSupportedDevicesResponse.OSFamily> oSFamilies;
        
        /**
        * Optional. The supported OS Families for this platform.
        * @return The OSFamilies value.
        */
        public ArrayList<GatewayListSupportedDevicesResponse.OSFamily> getOSFamilies() {
            return this.oSFamilies;
        }
        
        /**
        * Optional. The supported OS Families for this platform.
        * @param oSFamiliesValue The OSFamilies value.
        */
        public void setOSFamilies(final ArrayList<GatewayListSupportedDevicesResponse.OSFamily> oSFamiliesValue) {
            this.oSFamilies = oSFamiliesValue;
        }
        
        /**
        * Initializes a new instance of the Platform class.
        *
        */
        public Platform() {
            this.oSFamilies = new ArrayList<GatewayListSupportedDevicesResponse.OSFamily>();
        }
    }
    
    /**
    * The name and supported platforms for the vendor.
    */
    public static class Vendor {
        private String name;
        
        /**
        * Optional. The vendor name.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. The vendor name.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private ArrayList<GatewayListSupportedDevicesResponse.Platform> platforms;
        
        /**
        * Optional. The supported platforms for the vendor.
        * @return The Platforms value.
        */
        public ArrayList<GatewayListSupportedDevicesResponse.Platform> getPlatforms() {
            return this.platforms;
        }
        
        /**
        * Optional. The supported platforms for the vendor.
        * @param platformsValue The Platforms value.
        */
        public void setPlatforms(final ArrayList<GatewayListSupportedDevicesResponse.Platform> platformsValue) {
            this.platforms = platformsValue;
        }
        
        /**
        * Initializes a new instance of the Vendor class.
        *
        */
        public Vendor() {
            this.platforms = new ArrayList<GatewayListSupportedDevicesResponse.Platform>();
        }
    }
}
