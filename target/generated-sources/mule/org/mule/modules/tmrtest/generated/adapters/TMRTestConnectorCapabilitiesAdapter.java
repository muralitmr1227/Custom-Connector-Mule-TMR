
package org.mule.modules.tmrtest.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.tmrtest.TMRTestConnector;


/**
 * A <code>TMRTestConnectorCapabilitiesAdapter</code> is a wrapper around {@link TMRTestConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-05-31T12:59:16+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class TMRTestConnectorCapabilitiesAdapter
    extends TMRTestConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
