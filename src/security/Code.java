package security;

public class Code
{
    // 快速幂
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
    	double start=System.currentTimeMillis(); //获取开始时间
        // 已知条件：公钥中n=4294967297, e=7
        long n = 4294967297L, e = 7L;
        long m1, c1;
       m1=12;

    
        // 计算m1的密文c1，加密
        c1 = power(m1, e, n);
        System.out.println("（1）\t已知：m1 = " + m1);
        System.out.println("\t\t求得：c1 = " + c1);  
      
        double end=System.currentTimeMillis(); //获取结束时间
        
        System.out.println("程序运行时间： "+(end-start)+"ms"); 
        System.out.println("第"+count+"次结果");
        result=result+(end-start);
    	}
       result=result/100;
       System.out.println("平均运算时间为："+result+"ms");
    }
}
