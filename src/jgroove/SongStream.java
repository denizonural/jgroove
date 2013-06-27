package jgroove;

import java.io.InputStream;

public class SongStream {
	private int size;
	private InputStream stream;
	public SongStream(int contentLength, InputStream inputStream) {
		setSize(contentLength);
		setStream(inputStream);
	}
	public int getSize() {
		return size;
	}
	public void setSize(int length) {
		this.size = length;
	}
	public InputStream getStream() {
		return stream;
	}
	public void setStream(InputStream stream) {
		this.stream = stream;
	}

}
