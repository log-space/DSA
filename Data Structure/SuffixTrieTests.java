public class SuffixTrieTests {

    @Test
    public void testSuffixTrie() {
        String bookkeeper = "bookkeeper";
        SuffixTrie<String> trie = new SuffixTrie<String>(bookkeeper);
        assertTrue(SuffixTreeTest.suffixTreeTest(trie, bookkeeper));
    }
}
