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

/**
 * Json class representing the object returned by the Grooveshark's methods
 * ArtistGetSongs and AlbumGetSongs. HashMap[] songs contains the list of songs
 * found with they respective information when the string returned by callMethod
 * is deserialized.
 * @author Aitor Ruano Miralles <0x077d@gmail.com>
 */
public class JsonSongs {
     /**
     * Response of the method. HashMap[] songs contains the list of songs
     */
    public static class Result {
        public HashMap<String, String>[] songs;
        public boolean hasMore;
    }

    public JsonHeader header;
    public Result result;
}
