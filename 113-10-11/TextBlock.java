public class TextBlock {
    public static void main(String[] args) {
        String html =
        """
                <!DCTYPE html>
                <html lang="zh-tw'>
                <head>
                    <tittle>%s</title>
                    </head>
                        %s
                        </html>
                """;
                String title = "Java Tutorial";
                String content = "<b>Hello, World</b>" ;

                System.out.println(html.formatted(title , content));
    }
    
}
