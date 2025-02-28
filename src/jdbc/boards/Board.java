package jdbc.boards;

import lombok.Data;

import java.sql.Blob;
import java.util.Date;

@Data
public class Board {

    public int bno;
    public String btitle;
    public String bcontent;
    public String bwriter;
    public Date bdate;
    public String bfilename;
    public Blob bfiledata;
}
