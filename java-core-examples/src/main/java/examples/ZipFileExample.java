package examples;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipFileExample {
    public static void main(String[] args) throws IOException {
        ZipFile zipFile = new ZipFile("C:\\data\\grow2021\\java-core-examples\\text.zip");
        ZipEntry zipEntry = zipFile.getEntry("text.txt");
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        System.out.println(inputStream);
        String collect = new BufferedReader(new InputStreamReader(inputStream))
                .lines().collect(Collectors.joining("\n"));
        System.out.println(collect);

        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        Iterator<? extends ZipEntry> it = entries.asIterator();
        while (it.hasNext()) {
            Object entry = it.next();
            System.out.println(entry);
        }
    }
}
