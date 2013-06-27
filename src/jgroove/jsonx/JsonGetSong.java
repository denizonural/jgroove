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

import jgroove.json.JsonHeader;

/**
 * Json class representing the object returned by the Grooveshark's method
 * getSongFromIDEx. streamKey and ip are the fields needed to retrieve a song.
 * @author Aitor Ruano Miralles <0x077d@gmail.com>
 */
public class JsonGetSong {
    /**
     * Response of the method. Ip contains the url to the host that has the song,
     * streamKey is the key needed to retrieve it
     */
    public static class Result{
        public int uSecs;
        public String FileToken;
        public String streamKey;
        public int streamServerID;
        public String ip;
    }

    public JsonHeader header;
    public Result result;
}
