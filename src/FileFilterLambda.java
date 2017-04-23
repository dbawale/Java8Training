import java.io.FileFilter;
import java.io.File;

public class FileFilterLambda {
    public static void main(String[] args){
        FileFilter javaFileFilter = (File file) -> file.getName().endsWith(".java");
        File dir = new File("C:\\Users\\Deven Bawale\\Documents\\Java Practice\\src");
        File[] javaFiles = dir.listFiles(javaFileFilter);
        if (javaFiles != null) {
            for(File file:javaFiles){
                System.out.println(file.getName());
            }
        }
    }
}

//Complete Implementation
//class JavaFileFilter implements FileFilter{
//
//    /**
//     * Whether the given file is accepted by this filter.
//     *
//     * @param f File
//     */
//    @Override
//    public boolean accept(File f) {
//        return f.getName().endsWith(".java");
//    }
//}

// JavaFileFilter javaFileFilter = new JavaFileFilter();
//FileFilter javaFileFilter = new FileFilter(){
//        @Override
//        public boolean accept(File pathname) {
//            return pathname.getName().endsWith(".java");
//        }
//    };