 class StringBufferStringBuilderdynamic {
    public static void main(String args[]) {
        StringBuffer stringBuffer = new StringBuffer();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            stringBuffer.append("Test");
        }
        System.out.println("String buffer time " + (System.currentTimeMillis() - startTime));

        StringBuilder stringBuilder = new StringBuilder();
        long builderStartTime = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            stringBuilder.append("Test");
        }
        System.out.println("String builder time " + (System.currentTimeMillis() - builderStartTime));

    }
}