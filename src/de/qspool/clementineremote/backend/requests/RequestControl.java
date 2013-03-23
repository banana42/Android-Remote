/* This file is part of the Android Clementine Remote.
 * Copyright (C) 2013, Andreas Muttscheller <asfa194@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package de.qspool.clementineremote.backend.requests;

public class RequestControl extends RequestToThread {

	public static enum Request {PLAY, PLAYPAUSE, PAUSE, STOP, NEXT, PREV, CHANGESONG, REPEAT, SHUFFLE, TRACKPOSITION};
	private Request mRequest;
	private int mValue;
	
	public RequestControl(Request request) {
		super();
		mRequest = request;
	}

	public Request getRequest() {
		return mRequest;
	}

	public int getValue() {
		return mValue;
	}

	public void setValue(int mValue) {
		this.mValue = mValue;
	}

}
