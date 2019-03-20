package tecworld.doislucas.services.exceptions;

import java.time.LocalDateTime;

public class ErroClass {
    
    private Integer status;
    private String mensagem;
    private LocalDateTime timeStamp;

    public ErroClass(Integer status, String mensagem, LocalDateTime timeStamp) {
        super();
        this.status = status;
        this.mensagem = mensagem;
        this.timeStamp = timeStamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
