class WordFilter {
    TrieNode trie;
    public WordFilter(String[] words) {
        trie = new TrieNode();
        for (int weight = 0; weight < words.length; ++weight) {
            String word = words[weight] + "{";
            for (int i = 0; i < word.length(); ++i) {
                TrieNode cur = trie;
                cur.weight = weight;
                for (int j = i; j < 2 * word.length() - 1; ++j) {
                    int k = word.charAt(j % word.length()) - 'a';
                    if (cur.children[k] == null) {
                        cur.children[k] = new TrieNode();
                    }
                    cur = cur.children[k];
                    cur.weight = weight;
                }
            }
        }
    }
    public int f(String prefix, String suffix) {
        TrieNode cur = trie;
        for (char letter: (suffix + '{' + prefix).toCharArray()) {
            if (cur.children[letter - 'a'] == null) {
                return -1;
            }
            cur = cur.children[letter - 'a'];
        }
        return cur.weight;
    }
}

class TrieNode {
    TrieNode[] children;
    int weight;
    public TrieNode() {
        children = new TrieNode[27];
        weight = 0;
    }
}


// class WordFilter {

//     // 그러니까 처음에 주어지는게 
//     // WordFilter 함수라고 지정한 게 주어지고
//     // f 함수라고 지정한게 주어진다.

//     // 그 다음 입력할 단어를 주고
//     public WordFilter(String[] words) {
//         // 처음에 주어지는 words 배열이 있다.
        
//     }
    
//     // prefix와 suff를 준다.
//     // 해당하는 단어의 인덱스가 언제 나오는지 작성하라
//     public int f(String pref, String suff) {
        
//     }
// }

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(pref,suff);
 */