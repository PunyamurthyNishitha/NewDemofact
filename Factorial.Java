Public Class Factorail{
    Public Class long cal(int n){
        if (n<0) Throw Illegal Assertion Exception 
        res=1; 
        for(int i=2;i<=n;i++){
            res*=i; 
        
        } 
    } 
    return res; 
} 
Public Class Main{
    Public Class Void Main(String[] args){
        int n=5; 
        System.out.Println(cal(n)); 
    }
}