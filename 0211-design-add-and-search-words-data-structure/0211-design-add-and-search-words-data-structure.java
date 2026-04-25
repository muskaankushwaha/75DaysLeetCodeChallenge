class WordDictionary {
    WordDictionary[] child ;
    boolean eow ; 
    WordDictionary root ;
    public WordDictionary() {
        child = new WordDictionary[26] ;
        for( int i = 0 ; i <26 ; i++){
            child[i] = null ;
        }
        eow = false ;
        root = this ;
    }
    
    public void addWord(String word) {
        WordDictionary curr = root ;
        for( int i = 0 ; i < word.length() ; i++){
            int idx = word.charAt(i) - 'a' ;
            if(curr.child[idx] == null){
                curr.child[idx] = new WordDictionary() ;
            }
            if( i == word.length()-1){
                curr.child[idx].eow = true ;
            }
            curr = curr.child[idx] ;
        }
    }
    
    public boolean search(String word) {
        return fn( word , 0 , root) ;
    }
    public boolean fn( String word , int i , WordDictionary curr){
        if( curr == null) return false; 
        if( i ==  word.length()) return curr.eow ;

        char ch = word.charAt(i) ;
        if( ch == '.'){
            for( int j = 0 ; j < 26 ;j++){
                if( fn( word , i+1 , curr.child[j])){
                    return true ;
                }
            }
            return false ; 
        }
        int idx = ch - 'a' ;
        return fn( word , i+1 ,curr.child[idx]) ;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */