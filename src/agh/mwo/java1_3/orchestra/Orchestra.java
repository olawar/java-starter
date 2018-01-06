package agh.mwo.java1_3.orchestra;

import java.util.ArrayList;

public class Orchestra implements Instrument {

	private ArrayList<Instrument> instruments = new ArrayList<Instrument>();

	public void addInstrument(Instrument instrument) {
		this.instruments.add(instrument);
	}

	public void play() {
		for (Instrument instrument : this.instruments) {
			instrument.play();
		}
	}

	public static void main(String[] args) {
		Orchestra orchestra = new Orchestra();

		Instrument guitar = new Guitar();
		orchestra.addInstrument(guitar);

		Instrument flute = new Flute();
		orchestra.addInstrument(flute);

		Instrument trombone = new Trombone();
		orchestra.addInstrument(trombone);

		orchestra.play();
	}
}
