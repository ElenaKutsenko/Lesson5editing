import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

class massive  {
    public static void main(String args[ ]) {

        float [] arr = generateRandomArray();
    }
    public static float @NotNull [] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        float [] arr = new float [30];
        for (float i = 0; i < arr.length; i++)  {
            arr[(int) i] = random.nextInt(100_000) + 100_000;{
                System.out.println(arr[(int)i]);}}
        int sum = 0;
        for (float  element: arr) {
            sum += element;}
        {
            System.out.println("����� ���� ��������� "+sum+" ������");}


        Arrays.sort(arr);
        System.out.println("����������� ����� ���� �� ���� ��������� "+arr[0]+" ������" );
        System.out.println("������������ ����� ���� �� ���� ��������� "+arr[29]+" ������" );
        float middle = sum/30f;
        System.out.println("������� ����� ���� �� ����� ��������� "+middle+" ������" );

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};{
            char length = 0;
            for (int element : reverseFullName)
            {
                length++;
            }
            for (int i = length - 1; i >= 0; i--)
            {
                System.out.print(reverseFullName[i]);
            }


            return arr;



        }}}




