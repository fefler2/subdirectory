//package ShowFiles;
//
//
//import java.io.File;
//
//public class ListFilesUtil {
//
//
//    public void listFilesAndFolders(String directoryName) {
//        File directory = new File(directoryName);
//        //get all the files from a directory
//        File[] fList = directory.listFiles();
//        for (File file : fList) {
//            System.out.println(file.getName());
//        }
//    }
//
//    public void listFiles(String directoryName) {
//        File directory = new File(directoryName);
//        //get all the files from a directory
//        File[] fList = directory.listFiles();
//        assert fList != null;
//        for (File file : fList) {
//            if (file.isFile()) {
//                System.out.println(file.getName());
//            }
//        }
//    }
//
//    /**
//     * List all the folder under a directory
//     *
//     * @param directoryName to be listed
//     */
//    public void listFolders(String directoryName) {
//        File directory = new File(directoryName);
//        //get all the files from a directory
//        File[] fList = directory.listFiles();
//        assert fList != null;
//        for (File file : fList) {
//            if (file.isDirectory()) {
//                System.out.println(file.getName());
//            }
//        }
//    }
//
//    /**
//     * List all files from a directory and its subdirectories
//     *
//     * @param directoryName to be listed
//     */
//    public void listFilesAndFilesSubDirectories(String directoryName) {
//        File directory = new File(directoryName);
//        //get all the files from a directory
//        File[] fList = directory.listFiles();
//        assert fList != null;
//        for (File file : fList) {
////            if (file.isFile())
//
//
//
//            if (file.isFile()) {
//                System.out.println(file.getAbsolutePath());
//                // dotad dziala
//
//            }
//
//            //
//
//            else if (  file.isDirectory() && file.isDirectory()) {
//                listFilesAndFilesSubDirectories(file.getAbsolutePath());
//            }
//
//        }
//    }
//
//    public static void main(String[] args) {
//        ListFilesUtil listFilesUtil = new ListFilesUtil();
//        final String directory = "C:\\";
//        //Windows directory example
//        final String directoryWindows = "C://test";
//        String directory2 = "";
//        System.out.println("Foldery:");
////        listFilesUtil.listFiles(directory);
//        System.out.println();
//        listFilesUtil.listFilesAndFilesSubDirectories(directory);
//    }
//}