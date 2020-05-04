package icu.mianshi.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class NativeMethodClass {
    public native long memberNativeMethod(int a, long b, String f, File[] files);

    public static native Long staticNativeMethod(String f, char a, double m, List<File> files);
    public static native Long staticNativeMethod(char a, double m, Runnable r, List<File> files) throws FileNotFoundException;
    public static native Long staticNativeMethod(byte a, double m, Runnable r, List<File> files) throws IOException;

    public long callMemberNative(int a, long b, String f, File[] files) {
        return memberNativeMethod(a, b, f, files);
    }

    public static Long callStaticNativeMethod(char a, double m, Runnable r, File[] files) {
        try {
            var listFiles = Arrays.asList(files);
            Long creturn = staticNativeMethod(a, m, r, listFiles);
            byte b = 0x0F;
            var breturn = staticNativeMethod(b, m, r, listFiles);
            return creturn > 100 ? creturn : breturn;
        }catch (FileNotFoundException e) {
            handleFileNotFoundException(e);
        }catch (IOException e) {
            handleIOException(e);
        }
        return 0L;
    }

    private static void handleFileNotFoundException(FileNotFoundException e) {

    }

    private static void handleIOException(IOException e) {

    }
}
