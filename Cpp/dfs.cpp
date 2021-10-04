#include <iostream>
#include<bits/stdc++.h>
using namespace std;
bool vis[(int)(1e5+1)];
// Creating visited note
void dfs(int u)
{
   vis[u] = true;  
   for(int i:v[u])
 //Checking adjacent
   {
   	if(!vis[i])
   		dfs(i);
   }

}

// Created void function
void dfs(int child,int parent)
{
	v[child]=parent; 
	for(int i:v[child])
	{
		if(i!=v[child])
			dfs(i,child);
	}
}
