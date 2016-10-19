package security;

public class Code
{
    // ������
    static long power(long p, long n, long m)
    {
        long sq = 1L;
        while (n > 0)
        {
            if (n % 2 == 1)
                sq = (sq * p) % m;
            p = (p * p) % m;
            n = n / 2;
        }
        return sq % m;
    }

    public static void main(String[] args)
    {
    	int count=0;
    	double result=0;
    	for(int i=0;i<100;i++)
    	{
    	
    	count++;
    	double start=System.currentTimeMillis(); //��ȡ��ʼʱ��
        // ��֪��������Կ��n=4294967297, e=7
        long n = 4294967297L, e = 7L;
        long m1, c1;
       m1=12;

    
        // ����m1������c1������
        c1 = power(m1, e, n);
        System.out.println("��1��\t��֪��m1 = " + m1);
        System.out.println("\t\t��ã�c1 = " + c1);  
      
        double end=System.currentTimeMillis(); //��ȡ����ʱ��
        
        System.out.println("��������ʱ�䣺 "+(end-start)+"ms"); 
        System.out.println("��"+count+"�ν��");
        result=result+(end-start);
    	}
       result=result/100;
       System.out.println("ƽ������ʱ��Ϊ��"+result+"ms");
    }
}
