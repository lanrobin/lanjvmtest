package icu.mianshi.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;

public class JModMain {
    public static void main(String[] args) throws IOException {
        String jmodFile = "file:///E:/java.base.jmod";
        String ourDir = "file:///D:/ourdir";
        extract(jmodFile, ourDir);
    }

    private static  boolean extract(String jmodFile, String outDir) throws IOException {
        Path dir = Path.of(URI.create(outDir));
        try (JmodFile jf = new JmodFile(Path.of(URI.create(jmodFile)))) {
            jf.stream().forEach(e -> {
                try {
                    ZipEntry entry = e.zipEntry();
                    String name = entry.getName();
                    int index = name.lastIndexOf("/");
                    if (index != -1) {
                        Path p = dir.resolve(name.substring(0, index));
                        if (Files.notExists(p))
                            Files.createDirectories(p);
                    }

                    try (OutputStream os = Files.newOutputStream(dir.resolve(name))) {
                        jf.getInputStream(e).transferTo(os);
                    }
                } catch (IOException x) {
                    throw new UncheckedIOException(x);
                }
            });

            return true;
        }
    }
}
