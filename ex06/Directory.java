import java.util.ArrayList;
import java.util.List;

public class Directory extends Entity {
    private List<Entity> entities = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public int getSize() {
        int total = 0;
        for (Entity entity : entities) {
            total += entity.getSize();
        }
        return total;
    }

    public void add(Entity entity) {
        entities.add(entity);
    }

    public void display() {
        for (Entity entity : entities) {
            System.out.print(entity.getName() + " ");
        }
        System.out.println();
        System.out.println(this.getSize() + " bytes");
    }
}
