/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    // gump test
    public static String PROXIMITY_REPORTER = "00001803-0000-1000-8000-00805f9b34fb";
    public static String IMMEDIATE_ALERT = "00001802-0000-1000-8000-00805f9b34fb";
    public static String LINK_LOSS = "00001803-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_ALERT_LEVEL = "00002a06-0000-1000-8000-00805f9b34fb";

    static {
        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");

        // 对应到att.h中
        // gump test Services
        // attributes.put("00001800-0000-1000-8000-00805f9b34fb", "A");
        // attributes.put("00001801-0000-1000-8000-00805f9b34fb", "B");
        attributes.put(IMMEDIATE_ALERT, "Immediate Alert");
        attributes.put(LINK_LOSS, "Link Loss");
        attributes.put("00001804-0000-1000-8000-00805f9b34fb", "Tx Power");

        // gump test Characteristics.

        attributes.put("00002a00-0000-1000-8000-00805f9b34fb", "Device Name");
        attributes.put(CLIENT_ALERT_LEVEL, "Alert Level");
        attributes.put("00002a07-0000-1000-8000-00805f9b34fb", "Tx Power Level");
        attributes.put("00002a24-0000-1000-8000-00805f9b34fb", "Model Name Strings");
        attributes.put("00002a28-0000-1000-8000-00805f9b34fb", "System Version");
        attributes.put("00002a23-0000-1000-8000-00805f9b34fb", "System ID");

    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
