package Part2;

public class Wall implements Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Participant participant) {
        if (participant.isParticipating()) {
            participant.jump(height);
        }
    }

    public int getHeight() {
        return height;
    }
}
