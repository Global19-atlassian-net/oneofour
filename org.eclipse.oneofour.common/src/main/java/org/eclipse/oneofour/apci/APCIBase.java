/*******************************************************************************
 * Copyright (c) 2014 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.oneofour.apci;

public abstract class APCIBase
{
    private final APCIType type;

    public APCIBase ( final APCIType type )
    {
        this.type = type;
    }

    public APCIType getType ()
    {
        return this.type;
    }
}
