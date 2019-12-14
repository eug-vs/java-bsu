package core;

import java.util.ArrayList;


public class DataBase {
    private final static String ROOT = "data/";
    private final ArrayList<Entity> entities = new ArrayList<Entity>();

    public void addEntity(Entity entity) {
        this.entities.add(entity);
    }

    public String toString(){
        final StringBuilder builder = new StringBuilder();
        final int size = this.entities.size();
        if (size > 0) {
            builder.append("Database entities (");
            builder.append(size);
            builder.append("):\n");

            for (Entity entity : this.entities) {
                builder.append('\t');
                builder.append(entity);
                builder.append('\n');
            }
        } else {
            builder.append("Database contains no entities!\n");
        }
        return builder.toString();
    }
}
