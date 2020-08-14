/*******************************************************************************
 * Copyright (c) 2006, 2010 TH4 SYSTEMS GmbH and others.
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.oneofour.utils.concurrent;

import java.util.concurrent.Callable;

import org.eclipse.oneofour.utils.concurrent.internal.FutureTaskNotifier;

public class FutureTask<T> extends java.util.concurrent.FutureTask<T> implements NotifyFuture<T>
{

    private final FutureTaskNotifier<T> notifier;

    public FutureTask ( final Callable<T> callable )
    {
        super ( callable );
        this.notifier = new FutureTaskNotifier<T> ( this );
    }

    public FutureTask ( final Runnable runnable, final T result )
    {
        super ( runnable, result );
        this.notifier = new FutureTaskNotifier<T> ( this );
    }

    @Override
    public void addListener ( final FutureListener<T> listener )
    {
        this.notifier.addListener ( listener );
    }

    @Override
    public void addListener ( final Runnable listener )
    {
        this.notifier.addListener ( listener );
    }

    @Override
    public void removeListener ( final FutureListener<T> listener )
    {
        this.notifier.removeListener ( listener );
    }

    @Override
    public void removeListener ( final Runnable listener )
    {
        this.notifier.removeListener ( listener );
    }

    @Override
    protected void done ()
    {
        this.notifier.done ();
    }
}
