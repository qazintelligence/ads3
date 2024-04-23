
class Five {
    public static int countStudents(int[] students, int[] sandwiches) {
        int zeroes = 0;
        int ones = 0;
        int S = sandwiches.length;
        for(int student: students) {
            if(student == 1) ones++;
            else zeroes++;
        }
        for(int i = 0; i < S; i++) {
            if(sandwiches[i] == 0 && zeroes > 0) zeroes--;
            else if(sandwiches[i] == 1 && ones > 0) ones--;
            else return S - i;
        }
        return 0;
    }
    public static void main(String[] args){
        int[] stud = {1,1,0,0};
        int[] sand = {0,0,1,0};
        System.out.println(countStudents(stud,sand));
    }

}
