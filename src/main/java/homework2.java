import java.io.File;
public class homework2 {
    public static void main(String[] args) {
        File FileFind = new File("C:\\Users\\Asus ROG Strix Scar\\IdeaProjects\\luboi\\123");
        for (File file : FileFind.listFiles()) {
            String path = "";
            path=path+file;
            String[] text = path.split("\\.");
            System.out.println("Расширение файла: " + text[1]);
        }
    }
}
