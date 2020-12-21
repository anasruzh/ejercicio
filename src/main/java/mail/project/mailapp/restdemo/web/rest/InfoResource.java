package mail.project.mailapp.restdemo.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mail.project.mailapp.restdemo.payload.InfoPayload;
import mail.project.mailapp.restdemo.service.InfoService;


@RestController
@RequestMapping("/api/info/")
public class InfoResource {

    @Autowired
    private InfoService infoService;

    @GetMapping
    public String getVersion() {
        return this.infoService.getVersion();
    }

    @GetMapping(path="/all/")
    public ResponseEntity<InfoPayload> getInfo() {
        return new ResponseEntity<InfoPayload>(this.infoService.getInfo(), HttpStatus.OK);
    }
}
