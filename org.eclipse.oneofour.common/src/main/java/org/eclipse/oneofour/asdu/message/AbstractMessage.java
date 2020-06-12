/*******************************************************************************
 * Copyright (c) 2014, 2016 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.oneofour.asdu.message;

import org.eclipse.oneofour.asdu.ASDUHeader;
import org.eclipse.oneofour.asdu.Dumpable;
import org.eclipse.oneofour.asdu.Dumper;
import org.eclipse.oneofour.asdu.DumperHelper;

public abstract class AbstractMessage implements Dumpable, Encodeable
{
    protected static final int MAX_INFORMATION_ENTRIES = 127;

    protected final ASDUHeader header;

    public AbstractMessage ( final ASDUHeader header )
    {
        this.header = header;
    }

    public ASDUHeader getHeader ()
    {
        return this.header;
    }

    @Override
    public void dump ( final Dumper dumper )
    {
        dumper.fields ( this );
    }

    @Override
    public String toString ()
    {
        return DumperHelper.dump ( this );
    }

}