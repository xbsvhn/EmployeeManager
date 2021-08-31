package entity;

import java.util.Date;

public class Certificate {

    private int certificatedID;
    private String certificateName;
    private String certificateRank;
    private Date certificatedDate;

    public Certificate(int certificatedID, String certificateName, String certificateRank, Date certificatedDate) {
        super();
        this.certificatedID = certificatedID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificatedDate = certificatedDate;
    }
    public Certificate() {
        super();
    }
    public int getCertificatedID() {
        return certificatedID;
    }
    public void setCertificatedID(int certificatedID) {
        this.certificatedID = certificatedID;
    }
    public String getCertificateName() {
        return certificateName;
    }
    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }
    public String getCertificateRank() {
        return certificateRank;
    }
    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }
    public Date getCertificatedDate() {
        return certificatedDate;
    }
    public void setCertificatedDate(Date certificatedDate) {
        this.certificatedDate = certificatedDate;
    }
}
