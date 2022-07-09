import java.time.Instant;
import org.apache.commons.codec.digest.DigestUtils;

public class block {
    int index;
    String hash;
    String previousHash;
    String value;
    java.time.Instant time;

    public block(String previousHash, String value, int index) {
        this.index = index;
        this.previousHash = previousHash;
        this.value = value;
        this.time = Instant.now();
    }

    public void generateHash() {
        String blockAttributes = this.previousHash + this.value + this.time.toString();
        this.hash =  DigestUtils.sha256Hex(blockAttributes);
    }

    public int getIndex() {
        return index;
    }

    public String getHash() {
        return hash;
    }

    public String getValue() {
        return value;
    }

    public Instant getTime() {
        return time;
    }
}
