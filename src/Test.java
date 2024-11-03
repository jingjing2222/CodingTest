import java.util.Base64;

public class Test {
    public static void main(String[] args){
        String encodedStr = "TGlmZSBpdHNlbGYgaXMgYSBxdW90YXRpb24u";
        byte[] decodedBytes = Base64.getDecoder().decode(encodedStr);
        String decodedStr = new String(decodedBytes);

        System.out.println("decoded string: " + decodedStr);
    }
}
