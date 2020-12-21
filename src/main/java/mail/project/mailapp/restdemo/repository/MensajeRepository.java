package mail.project.mailapp.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mail.project.mailapp.restdemo.model.Mensaje;

public interface MensajeRepository extends JpaRepository<Mensaje, Integer>{

}
