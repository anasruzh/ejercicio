package mail.project.mailapp.restdemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mail.project.mailapp.restdemo", ignoreUnknownFields = false)
public class RestProperties {

    private String comment;

    private final Annotation annotation = new Annotation();

    public Annotation getAnnotation() {
        return this.annotation;
    }

    public static class Annotation {

        private String version;

        private String author;

        public String getVersion() {
            return this.version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getAuthor() {
            return this.author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}