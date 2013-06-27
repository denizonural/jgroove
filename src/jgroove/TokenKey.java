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
package jgroove;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TokenKey {

	private File tokenFile = new File(System.getProperty ("user.dir")+File.separator+"token.properties");
	private Properties prop;
	private String jsToken, jsVersion,htmlToken, htmlVersion;

	public TokenKey() throws FileNotFoundException, IOException{

		prop = new Properties();

		prop.load(new FileInputStream(tokenFile));
		setJsToken(prop.getProperty("jsToken"));
		setJsVersion(prop.getProperty("jsVersion"));
		setHtmlToken(prop.getProperty("htmlToken"));
		setHtmlVersion(prop.getProperty("htmlVersion"));


	}

	public String getJsVersion() {
		return jsVersion;
	}

	public void setJsVersion(String jsVersion) {
		this.jsVersion = jsVersion;
	}

	public String getHtmlVersion() {
		return htmlVersion;
	}

	public void setHtmlVersion(String htmlVersion) {
		this.htmlVersion = htmlVersion;
	}

	public String getHtmlToken() {
		return htmlToken;
	}

	public void setHtmlToken(String htmlToken) {
		this.htmlToken = htmlToken;
	}

	public String getJsToken() {
		return jsToken;
	}

	public void setJsToken(String jsToken) {
		this.jsToken = jsToken;
	}


}
