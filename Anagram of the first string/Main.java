#include <bits/stdc++.h>
using namespace std;
int main()
{
  string s1,s2;
  cin>>s1>>s2;
  int freq[128]={0},i;
  for(i=0;i<s1.length();i++)
    freq[s1[i]]++;
  for(i=0;i<s2.length();i++)
    freq[s2[i]]--;
  for(i=0;i<128;i++)
  {
    if(freq[i]!=0)
    {
      cout<<"Not anagrams";
      return 0;
    }
  }
  cout<<"Anagram";
  return 0;
}
    