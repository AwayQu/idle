package com.away1994.jgit.url;

import java.security.PublicKey;

public class GitURL {

    public class GitURLFormatErrorException extends Exception {}

    public class GitURLNameNotFoundException extends Exception {}

    /**
     * git@github:example.git
     */
    private String originDescription;

    public GitURL(String originDescription) {
        this.originDescription = originDescription;
    }



    public String getURL() throws GitURLFormatErrorException {

        if (originDescription.startsWith("http")) {
           if (originDescription.endsWith(".git")) {
               return originDescription;
           } else {
               return originDescription + ".git";
           }
        } else if (originDescription.startsWith("git")){
            return originDescription;
        } else {
            throw new GitURLFormatErrorException();
        }
    }

    public String getRepositoryName() throws GitURLNameNotFoundException {
        if (originDescription.startsWith("http")) {
            return extractName();
        } else if (originDescription.startsWith("git")){
            return extractName();
        } else {
            throw new GitURLNameNotFoundException();
        }
    }

    private String extractName() throws GitURLNameNotFoundException {
        if (originDescription.endsWith(".git")) {
            int index = originDescription.lastIndexOf("/");
            if (index == -1) {
                throw new GitURLNameNotFoundException();
            }
            return originDescription.substring(index + 1, originDescription.length() - 4);
        } else {
            int index = originDescription.lastIndexOf("/");
            if (index == -1) {
                throw new GitURLNameNotFoundException();
            }
            return originDescription.substring(index, originDescription.length());
        }
    }
}
