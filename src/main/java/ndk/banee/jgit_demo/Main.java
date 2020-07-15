package ndk.banee.jgit_demo;

import java.io.File;
import org.eclipse.jgit.lib.RepositoryCache;
import org.eclipse.jgit.util.FS;

public class Main {

    public static void main(String[] args) {

        File file = new File("E:\\To_Sync\\Lab_Abdulla\\Cordova_Web\\logistic-cordova");
        System.out.println("Checking for git repository on " + file.getPath());
        System.out.println(RepositoryCache.FileKey.isGitRepository(file, FS.DETECTED));
    }
}
