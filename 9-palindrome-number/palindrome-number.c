bool isPalindrome(int x) {
    if(x<0){
        return false;
    }
    long org=x;
    long rev=0;
    while(x!=0){
        int dig=x%10;
        rev=rev*10 + dig;
        x=x/10;
    }
    if(rev==org)
    {
        return true;
    }
    else{
        return false;
    }
    
}