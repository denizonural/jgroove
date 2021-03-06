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
package jgroove.jsonx;

import java.util.HashMap;

import jgroove.json.JsonHeader;


public class JsonPlaylist {
    public static class Result {
        public HashMap<String, String>[] Playlists;
    }

    public JsonHeader header;
    public Result result;
}
