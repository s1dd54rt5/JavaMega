public class CommandLine {
    public static void main(String[] args) {
        String value = args[0];
        int start = 0;
        int end = 0;
        try {
            start = Integer.valueOf(args[1]);
        } catch(Exception e){
            System.out.println(e);
        }
        try {
            end = Integer.valueOf(args[2]);
        } catch(Exception e){
            System.out.println(e);
        }
        String subs = value.substring(start,end+1);
        byte[] strAsByteArray = subs.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        System.out.println(new String(result));
    }
}
