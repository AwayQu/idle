package com.away1994.jgit.url;

import java.io.File;


public class GitURL {
    public enum URLType {
        // http://
        GitHTTP,
        // git://
        GitURL,
        // /www/example/project
        GitLocal;

        URLType() {

        }

    }

    public class URLInfo {
        URLType urlType;
        String url;

        public URLType getUrlType() {
            return urlType;
        }

        public void setUrlType(URLType urlType) {
            this.urlType = urlType;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public URLInfo(URLType urlType, String url) {
            this.urlType = urlType;
            this.url = url;
        }
    }

    public class GitURLFormatErrorException extends Exception {
    }

    public class GitURLNameNotFoundException extends Exception {
    }

    /**
     * git@github:example.git
     */
    private String originDescription;

    public GitURL(String originDescription) {
        this.originDescription = originDescription;
    }


    public URLInfo getURL() throws GitURLFormatErrorException {

        if (originDescription.startsWith("http")) {
            if (originDescription.endsWith(".git")) {

                return new URLInfo(URLType.GitHTTP, originDescription);
            } else {
                return new URLInfo(URLType.GitHTTP, originDescription + ".git");
            }
        } else if (originDescription.startsWith("git")) {
            return new URLInfo(URLType.GitURL, originDescription);
            //isLocalPath
        } else if (new File(originDescription).isDirectory()) { //  TODO: verify path
            return new URLInfo(URLType.GitLocal, originDescription);
        } else {
            throw new GitURLFormatErrorException();
        }
    }

    public String getRepositoryName() throws GitURLNameNotFoundException {
        Boolean isLocalPath = true;
        if (originDescription.startsWith("http")) {
            return extractName();
        } else if (originDescription.startsWith("git")) {
            return extractName();
            // /isLocalPath
        } else if (new File(originDescription).isDirectory()) { //  TODO: verify path
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
