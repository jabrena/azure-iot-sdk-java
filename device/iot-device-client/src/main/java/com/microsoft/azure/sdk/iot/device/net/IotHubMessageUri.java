// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package com.microsoft.azure.sdk.iot.device.net;

/** A URI for a device to poll for messages from an IoT Hub. */
public final class IotHubMessageUri
{
    /** The path to be appended to an IoT Hub URI. */
    private static final String MESSAGE_PATH = "/messages/devicebound";

    /** The underlying IoT Hub URI. */
    private final IotHubUri uri;

    /**
     * Constructor. Returns a URI for a device to poll for messages from an
     * IoT Hub. The URI does not include a protocol.
     *
     * @param iotHubHostname the IoT Hub name.
     * @param deviceId the device ID.
     * @param moduleId the module ID. May be null
     */
    public IotHubMessageUri(String iotHubHostname, String deviceId, String moduleId)
    {
        // Codes_SRS_IOTHUBMESSAGEURI_11_001: [The constructor returns a URI with the format "[iotHubHostname]/devices/[deviceId]/messages/devicebound?api-version=2016-02-03".]
        this.uri = new IotHubUri(iotHubHostname, deviceId, MESSAGE_PATH, moduleId);
    }

    /**
     * Returns the string representation of the IoT Hub message URI.
     *
     * @return the string representation of the IoT Hub message URI.
     */
    @Override
    public String toString()
    {
        // Codes_SRS_IOTHUBMESSAGEURI_11_002: [The string representation of the IoT Hub event URI shall be constructed with the format "[iotHubHostname]/devices/[deviceId]/messages/devicebound?api-version=2016-02-03".]
        return (this.uri != null ? this.uri.toString() : null);
    }

    /**
     * Returns the string representation of the IoT Hub hostname.
     *
     * @return the string representation of the IoT Hub hostname.
     */
    public String getHostname()
    {
        // Codes_SRS_IOTHUBMESSAGEURI_11_003: [The function shall return the hostname given in the constructor.]
        return (this.uri != null ? this.uri.getHostname() : null);
    }

    /**
     * Returns the string representation of the IoT Hub path.
     *
     * @return the string representation of the IoT Hub path.
     */
    public String getPath()
    {
        // Codes_SRS_IOTHUBMESSAGEURI_11_004: [The function shall return a URI with the format '/devices/[deviceId]/messages/devicebound.]
        return (this.uri != null ? this.uri.getPath() : null);
    }

    @SuppressWarnings("unused")
    protected IotHubMessageUri()
    {
        this.uri = null;
    }
}
