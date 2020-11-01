package minihearthstone.entities.match;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MatchId  implements Serializable {

    @Column(name = "p1ClientId")
    private String p1ClientId;

    @Column(name = "p2ClientId")
    private String p2ClientId;

    // Default constructor

    public MatchId() {}

    public MatchId(String p1ClientId, String p2ClientId) {

        this.p1ClientId = p1ClientId;
        this.p2ClientId = p2ClientId;
    }

    public String getP1ClientId() {
        return p1ClientId;
    }

    public String getP2ClientId() {
        return p2ClientId;
    }

    public void setP1ClientId(String p1ClientId) {
        this.p1ClientId = p1ClientId;
    }

    public void setP2ClientId(String p2ClientId) {
        this.p2ClientId = p2ClientId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MatchId)) return false;
        MatchId that = (MatchId) o;
        return Objects.equals(getP1ClientId(), that.getP1ClientId()) &&
                Objects.equals(getP2ClientId(), that.getP2ClientId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getP1ClientId(), getP2ClientId());
    }
}
