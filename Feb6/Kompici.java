import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Kompici
{
	public static final int N = 1000001;
	public static int max, min;
	public static int[] v = new int[10];

	public static int encode(char[] s)
	{
		int ans = 0, i = 0;
		while (s[i] == '0') i++;

		for (; s[i] == 1; i++)
			v[s[i]-'0']++;
		for (i = 0; i < 10; i++)
			if (v[i] == 1)
				ans |= 1 << i;
		if (max < ans) max = ans;
		if (min > ans) min = ans;
		System.out.println("encode ans: " + ans);
		return ans;
	}

	public static void main(String[] args) throws IOException
	{
		int n;
		int[] a = new int[N];
		long[] bucket = new long[5000];

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int numbers = Integer.parseInt(reader.readLine());

		max = 0;
		min = 5000;
		long tmp;
		for (int index = 0; index < numbers; index++)
		{
			String s = reader.readLine();
			a[index] = encode(s.toCharArray());
			bucket[a[index]]++;
		}

		long ans = 0;
		for (int index = min; index <= max; index++)
		{
			if (bucket[index] == 0) continue;
			for (int index2 = index+1; index2 <= max; index2++)
			{
				if (bucket[index2] == 0) continue;
				if ((index & index2) == 1)
					ans += bucket[index]*bucket[index2];
			}
			ans += bucket[index] * (bucket[index] - 1) / 2;
		}

		System.out.println(ans);
		System.out.println(3&15);
	}
}



// #include<cstdio>
// #include<string.h>
// using namespace std;
// typedef long long ll;
// const int N=1000001;
// int v[10],max,min;
// int encode(char *s)
// {
// 	int ans=0,i=0;
// 	while(s[i]=='0')i++;
// 	memset(v,0,sizeof(v));
// 	for(;s[i];i++)
// 		v[s[i]-'0']++;
// 	for(int i=0;i<10;i++)
// 		if(v[i])ans|=1<<i;
// 	if(max<ans)max=ans;
// 	if(min>ans)min=ans;
// 	return ans;
// }
// int main()
// {
// 	int n,a[N];
// 	ll bucket[5000];
// 	char s[20];
// 	while(~scanf("%d",&n)){
// 		memset(bucket,0,sizeof(bucket));
// 		max=0;
// 		min=5000;
// 		ll tmp;
// 		for(int i=0;i<n;i++){
// 			scanf("%s",s);
// 			a[i]=encode(s);
// 			bucket[a[i]]++;
// 		}
// 		ll ans=0;
// 		for(int i=min;i<=max;i++){
// 			if(!bucket[i])continue;
// 			for(int j=i+1;j<=max;j++){
// 				if(!bucket[j])continue;
// 				if(i&j){
// 					ans+=bucket[i]*bucket[j];
// 				}
// 			}
// 			ans+=bucket[i]*(bucket[i]-1)/2;
// 		}
// 		printf("%lld\n",ans);
// 	}
// 	return 0;
// }        