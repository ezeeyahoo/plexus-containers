package org.codehaus.plexus.lifecycle.avalon.phase;

import org.apache.avalon.framework.activity.Startable;
import org.codehaus.plexus.component.manager.ComponentManager;
import org.codehaus.plexus.lifecycle.phase.AbstractPhase;

public class StartPhase
    extends AbstractPhase
{
    public void execute( Object object, ComponentManager manager )
        throws Exception
    {
        if ( object instanceof Startable )
        {
            ( (Startable) object ).start();
        }
    }
}