public class task2 {
    public static void main(String[] args) {
        String str ="aarr kgkl popo frfr erj yy ";
        String [] words = str.split(" ");
        int last=words.length-1;
        for(int i=0; i< words.length/2+1;i++){
            String temp = words[i];
            words[i]=words[last];
            words[last]=temp;
            last--;
        }
        for(int i=0; i< words.length;i++) {
            System.out.print(words[i]+" ");
        }
        StringBuilder newstr = new StringBuilder("");
        for(int i=0; i< words.length/2+1;i++){
            newstr.append(words[words.length-i-1]);
            newstr.append(" ");
        }
        System.out.println(newstr.toString());
    }
}
