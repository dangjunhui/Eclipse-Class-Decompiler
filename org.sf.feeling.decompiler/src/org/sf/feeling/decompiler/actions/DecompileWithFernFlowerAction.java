/*******************************************************************************
 * Copyright (c) 2016 Chen Chao(cnfree2000@hotmail.com).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Chen Chao  - initial API and implementation
 *******************************************************************************/

package org.sf.feeling.decompiler.actions;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.action.Action;
import org.sf.feeling.decompiler.JavaDecompilerPlugin;
import org.sf.feeling.decompiler.i18n.Messages;
import org.sf.feeling.decompiler.util.UIUtil;

public class DecompileWithFernFlowerAction extends Action
{

	public DecompileWithFernFlowerAction( )
	{
		super( Messages.getString(
				"JavaDecompilerActionBarContributor.Action.DecompileWithFernFlower" ) ); //$NON-NLS-1$
		this.setImageDescriptor( JavaDecompilerPlugin
				.getImageDescriptor( "icons/fernflower_16.png" ) ); //$NON-NLS-1$
	}

	public void run( )
	{
		try
		{
			new DecompileWithFernFlowerHandler( ).execute( null );
		}
		catch ( ExecutionException e )
		{
		}
	}

	public boolean isEnabled( )
	{
		return UIUtil.getActiveEditor( ) != null
				|| UIUtil.getActiveSelection( ) != null;
	}
}