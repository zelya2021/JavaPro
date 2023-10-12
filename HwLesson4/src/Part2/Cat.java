package Part2;

public class Cat implements Participant{
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private boolean participating = true;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " ran " + distance + " meters.");
        } else {
            System.out.println(name + " couldn't run " + distance + " meters. Can only run " + maxRunDistance + " meters.");
            participating = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " jumped " + height + " meters.");
        } else {
            System.out.println(name + " couldn't jump " + height + " meters. Can only jump " + maxJumpHeight + " meters.");
            participating = false;
        }
    }

    @Override
    public boolean isParticipating() {
        return participating;
    }

    @Override
    public String getName() {
        return name;
    }
}
