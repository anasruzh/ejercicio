package mail.project.mailapp.restdemo.service;

import mail.project.mailapp.restdemo.payload.InfoPayload;
import mail.project.mailapp.restdemo.properties.RestProperties;

public class InfoService {

    private RestProperties restProperties;

    public InfoService(RestProperties restProperties) {
        this.restProperties = restProperties;
    }

    public String getVersion() {
        return this.restProperties.getAnnotation().getVersion();
    }

    public InfoPayload getInfo() {
        InfoPayload infoPayload = new InfoPayload();
        infoPayload.setComment(this.restProperties.getComment());
        infoPayload.getAnnotation().setAuthor(this.restProperties.getAnnotation().getAuthor());
        infoPayload.getAnnotation().setVersion(this.restProperties.getAnnotation().getVersion());

        return infoPayload;
    }
}
