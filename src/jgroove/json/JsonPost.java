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

import jgroove.TokenKey;

import java.util.HashMap;

import java.io.IOException;

import jgroove.JGroove;

import jgroove.jsonx.JsonCountry;

/**
 * Class that represents the basic Json post object to make the petition to a
 * Grooveshark's service, it is mainly used by callMethod and should not be
 * used out of there but if you want to complicate your life.
 * @author Aitor Ruano Miralles <0x077d@gmail.com>
 */

public class JsonPost {



	public final HashMap<String, Object> header = new HashMap<String, Object>();
	{
		header.put("country", country);
		header.put("uuid", JGroove.uuid);
		header.put("privacy", 0);
		header.put("session", JGroove.getCurrentSessionID());
	}
	public static final HashMap<String, String> country = new HashMap<String, String>();
	static {
		JsonCountry jcountry = new JsonCountry();
		//try {
		//jcountry = JGroovex.getCountry();
		//CountryUtil c = new CountryUtil();
/*		c.initCountryCode();
		jcountry = c.getCountryCode();*/
		//} catch (IOException e) { //if error default country values
		//if (jcountry == null){
		jcountry.IPR = "1201";
		jcountry.ID = "223";
		jcountry.CC1 = "0";
		jcountry.CC2 = "0";
		jcountry.CC3 = "0";
		jcountry.CC4 = "2147483648";
			//e.printStackTrace();
		//}
		country.put("ID", jcountry.ID);
		country.put("CC1", jcountry.CC1);
		country.put("CC2", jcountry.CC2);
		country.put("CC3", jcountry.CC3);
		country.put("CC4", jcountry.CC4);
		country.put("IPR", jcountry.IPR);
	}

	public HashMap<String, Object> parameters;
	public String method;


	/**
	 * Attach the parameters and the method to the JsonPost abstract class to
	 * send it via http, it will also automatically get the session id if it
	 * hasn't been done already
	 * @param parameters Paramaters to post
	 * @param method Method to call
	 */
	public JsonPost(HashMap<String, Object> parameters, String method) throws IOException{

		this.parameters = parameters;
		this.method = method;

		//System.out.println("DEBUGGGGG:"+method);



		if (JGroove.jsMethod.contains(method)){
			this.header.put("client", JGroove.nameJS);
			this.header.put("clientRevision", new TokenKey().getJsVersion());

		}
		else if (JGroove.htmlMethod.contains(method)){
			this.header.put("client", JGroove.nameHTML);
			this.header.put("clientRevision",new TokenKey().getHtmlVersion());
		}

		if (JGroove.getCurrentSessionID().isEmpty()){
			this.header.put("session", JGroove.getSessionID());
		} else {
			this.header.put("session", JGroove.getCurrentSessionID());
		}


	}
}
