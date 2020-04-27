package icu.mianshi.main;

public class TestAttributes extends AbstractTestAttributes implements IAttributible{
    @Override
    public boolean attribite(Object obj) {
        return false;
    }

    private char cA = 'A';
    private static final char finalChar = '中';

    private long fLong = 1984L;

    @AnnotationFieldDouble
    private static final double sflong = 10999L;


    @AnnotationMethod
    public static int annotationMethod() {
        return 19888;
    }

    private static InnerEnum defaultValue = InnerEnum.China;

    private static enum InnerEnum{
        Hello,
        World,
        China,
    };

    public int[] arr1Dimension = new int[] {1,2,3,4,5};
    public long[][] arr2Dimension = new long[][] {
            {1,2,3,4},
            {5,6,7,8},
            {9,0,1,2}
    };
}
