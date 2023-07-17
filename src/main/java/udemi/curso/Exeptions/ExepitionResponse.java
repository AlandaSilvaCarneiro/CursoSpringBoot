package udemi.curso.Exeptions;
import java.io.Serializable;
import java.util.Date;

public class ExepitionResponse  implements Serializable{
    private static final long serialVersionUID = 1L;
    private Date timestamp;
    private String mesagen;
     private String details;


     
    public ExepitionResponse(Date timestamp, String mesagen, String details) {
        this.timestamp = timestamp;
        this.mesagen = mesagen;
        this.details = details;
    }




    public Date getTimestamp() {
        return timestamp;
    }



    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }



    public String getMesagen() {
        return mesagen;
    }



    public void setMesagen(String mesagen) {
        this.mesagen = mesagen;
    }



    public String getDetails() {
        return details;
    }



    public void setDetails(String details) {
        this.details = details;
    }

    
}
