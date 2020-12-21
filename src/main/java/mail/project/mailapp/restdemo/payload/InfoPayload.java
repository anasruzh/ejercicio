package mail.project.mailapp.restdemo.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoPayload {
	 @JsonProperty(value = "comment")
	    private String comment;

	    @JsonProperty(value = "annotation")
	    private final AnnotationInfo annotation = new AnnotationInfo();

	    public AnnotationInfo getAnnotation() {
	        return this.annotation;
	    }

	    public static class AnnotationInfo {

	        @JsonProperty(value = "version")
	        private String version;

	        @JsonProperty(value = "author")
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


