package fr.tcd.input;

import java.util.List;

public class Input {
	public final int c;
	public final int h;
	public final int p;
	public final int w;
	public final List<Info> infos;

	public Input(final int c, final int h, final int p, final int w, final List<Info> infos) {
		this.c = c;
		this.h = h;
		this.p = p;
		this.w = w;
		this.infos = infos;
	}
}

