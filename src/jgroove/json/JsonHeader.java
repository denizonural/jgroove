/*******************************************************************************
 * Copyright (c) 2013 Ale46.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Aitor Ruano Miralles <0x077d@gmail.com> - initial API and implementation
 ******************************************************************************/


package jgroove.json;

/**
 * Basic Json header used commonly by all methods.
 * @author Aitor Ruano Miralles <0x077d@gmail.com>
 */
public class JsonHeader {
    public String session;
    public String serviceVersion;
    public boolean prefetchEnabled;
}
