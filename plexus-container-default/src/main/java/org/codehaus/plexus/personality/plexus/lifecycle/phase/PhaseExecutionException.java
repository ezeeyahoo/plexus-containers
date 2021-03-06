package org.codehaus.plexus.personality.plexus.lifecycle.phase;

/*
 * Copyright 2001-2006 Codehaus Foundation.
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

/**
 * Describes an error that has occurred during the execution of a phase.
 *
 * @author <a href="mailto:brett@codehaus.org">Brett Porter</a>
 */
public class PhaseExecutionException extends Exception
{
    public PhaseExecutionException( String message, Throwable throwable )
    {
        super( message, throwable );
    }
}
