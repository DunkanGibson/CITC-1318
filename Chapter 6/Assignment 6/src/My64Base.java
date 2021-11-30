import java.util.Base64;

public class My64Base {


    public My64Base() {
    }


    public String doEncoding(String s){
        String encodedString  = Base64.getEncoder().encodeToString(s.getBytes()); //base64 java encoder is used here
        return encodedString ;
    }

    public String doDecoding(String s){
        byte[] base64decodedBytes = Base64.getDecoder().decode(s);
        String decodedString = new String(base64decodedBytes);
        return decodedString;
    }
}