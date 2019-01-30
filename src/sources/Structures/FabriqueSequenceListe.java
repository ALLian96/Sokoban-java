package sources.Structures;

public class FabriqueSequenceListe implements FabriqueSequence{
	@Override
	public Sequence nouvelle() {
		return new SequenceListe();
	}
}
