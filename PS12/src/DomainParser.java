public class DomainParser {

    public static String getTopLevelDomain(String url) {
        return url.substring(url.lastIndexOf('.') + 1);
    }

}
