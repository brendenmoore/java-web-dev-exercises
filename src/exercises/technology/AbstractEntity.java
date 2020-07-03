package exercises.technology;

public abstract class AbstractEntity {
    private int id;
    private static int nextID = 0;

    public AbstractEntity() {
        this.id = nextID;
        nextID++;
    }

    public int getId() {
        return id;
    }
}
