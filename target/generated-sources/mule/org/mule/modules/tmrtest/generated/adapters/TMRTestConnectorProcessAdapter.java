
package org.mule.modules.tmrtest.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.tmrtest.TMRTestConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>TMRTestConnectorProcessAdapter</code> is a wrapper around {@link TMRTestConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-05-31T12:59:16+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class TMRTestConnectorProcessAdapter
    extends TMRTestConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<TMRTestConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, TMRTestConnectorCapabilitiesAdapter> getProcessTemplate() {
        final TMRTestConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,TMRTestConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, TMRTestConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, TMRTestConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
