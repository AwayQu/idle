package tsp.language;

import java.util.ArrayList;

public class ObjectiveC extends Language {

    public ObjectiveC() {
        this.name = Constant.LANGUAGE_OBJECTIVE_C;
        this.fileExtensions = new ArrayList<>();
        this.fileExtensions.add(Constant.EXTENSION_H);
        this.fileExtensions.add(Constant.EXTENSION_M);
        this.ignores = new ArrayList<>();
        this.ignores.add(Constant.IGNORE_PODS);
    }
}
