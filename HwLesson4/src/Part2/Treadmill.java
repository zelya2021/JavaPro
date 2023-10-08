package Part2;

public class Treadmill implements Obstacle{
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Participant participant) {
        if (participant.isParticipating()) {
            participant.run(length);
        }
    }

    public int getLength() {
        return length;
    }
}
