package icu.mianshi.classviewer.struct;

import java.util.ArrayList;

public class ClazzFile {
    public int magic;
    public short minorVersion;
    public short majorVersion;
    public short constantPoolCount;
    public ArrayList<ConstantPoolInfo> constantPool = new ArrayList<ConstantPoolInfo>();
    public short accessFlags;
    public short thisClazz;
    public short superClazz;
    public short interfacesCount;
    public ArrayList<Short> interfaces = new ArrayList<Short>();
}
