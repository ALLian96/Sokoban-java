package sources.Structures;

public class FabriqueSequenceTableau implements FabriqueSequence{
		@Override
		public Sequence nouvelle() {
			return new SequenceTableau();
		}
}
