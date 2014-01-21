#include<cstdio>
#include<string.h>
using namespace std;
typedef long long ll;
const int N=1000001;
int v[10],max,min;
int encode(char *s)
{
    int ans=0,i=0;
    while(s[i]=='0')i++;
    memset(v,0,sizeof(v));
    for(;s[i];i++)
        v[s[i]-'0']++;
    for(int i=0;i<10;i++)
        if(v[i])ans|=1<<i;
    if(max<ans)max=ans;
    if(min>ans)min=ans;
    return ans;
}
int main()
{
    int n,a[N];
    ll bucket[5000];
    char s[20];
    while(~scanf("%d",&n)){
        memset(bucket,0,sizeof(bucket));
        max=0;
        min=5000;
        ll tmp;
        for(int i=0;i<n;i++){
            scanf("%s",s);
            a[i]=encode(s);
            bucket[a[i]]++;
        }
        ll ans=0;
        for(int i=min;i<=max;i++){
            if(!bucket[i])continue;
            for(int j=i+1;j<=max;j++){
                if(!bucket[j])continue;
                if(i&j){
                    ans+=bucket[i]*bucket[j];
                }
            }
            ans+=bucket[i]*(bucket[i]-1)/2;
        }
        printf("%lld\n",ans);
    }
    return 0;
}                                 