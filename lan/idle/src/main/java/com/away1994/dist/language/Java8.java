package com.away1994.dist.language;

import java.util.ArrayList;

public class Java8 extends Language {
    public Java8() {
        this.name = Constant.LANGUAGE_JAVA8;

        this.fileExtensions = new ArrayList<>();
        this.fileExtensions.add(Constant.EXTENSION_JAVA);

        this.ignores = new ArrayList<>();
    }

}

