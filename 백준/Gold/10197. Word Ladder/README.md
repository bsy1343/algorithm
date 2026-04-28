# [Gold IV] Word Ladder - 10197

[문제 링크](https://www.acmicpc.net/problem/10197)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 89, 정답: 24, 맞힌 사람: 17, 정답 비율: 24.286%

### 분류

너비 우선 탐색, 자료 구조, 그래프 이론, 그래프 탐색, 해시를 사용한 집합과 맵, 문자열, 집합과 맵

### 문제 설명

<p>As minions continue to learn English, they start playing various games to improve their vocabulary. One of the games they play is word ladder. Word ladder (also known as Doublets, word-links, or Word golf) is a word game invented by Lewis Carroll. A word ladder puzzle begins with two words, and to solve the puzzle one must find a chain of other words to link the two, in which two adjacent words (that is, words in successive steps) differ by one letter.</p>

<p>For example, given words COLD and WARM, here is a word ladder between the two:</p>

<p style="text-align: center;">COLD &rarr; CORD &rarr; CARD &rarr; WARD &rarr; WARM</p>

<p>Another solution is:</p>

<p style="text-align: center;">COLD &rarr; WOLD &rarr; WORD &rarr; WARD &rarr; WARM</p>

<p>Whichever player finds the shortest such word ladder between the given two words (if one exists), wins the game. If two players find different shortest word ladders, we look at the first word in the word ladder, and if they are different, the player who uses the word that comes earlier in lexicographical order wins. For example, comparing the above two word ladders, the player who plays the first word ladder wins (since CORD comes before WOLD in lexicographical order). If the two ladders use the same first word, then we look at the second word, and so on.</p>

<p>Your task is to help Kevin the Minion win at this game.</p>

### 입력

<p>The first line in the test data file contains the number of test cases (&lt; 10). Each test case contains one dictionary, and pairs of words for which you have to find a word ladder using only the words in the dictionary. Each test case begins with the number of words in the dictionary, followed by the list of the words in the dictionary (e.g., in the first example below, the dictionary contains 6 words). The next number is the number of pairs of words for which you have to find the word ladder using that dictionary, followed by the pairs themselves. You can assume that the words are provided in all lowercase letters (i.e., &ldquo;gru&rdquo;, not &ldquo;Gru&rdquo;).</p>

### 출력

<p>For each test case, for each pair of words provided, you have to find a word ladder using only the words in that dictionary. You are to output the word ladder itself. If there are multiple word ladders between two words, you are to output the one containing fewest words; further, if there are multiple shortest word ladders, you are to output the one that comes lexicographically first. The exact format is shown below in the examples.</p>

<p>As an example: in the second test case below, for the pair of words man and how, there are several shortest word ladders (e.g., man &rarr; can &rarr; con &rarr; cow &rarr; how, is another word ladder that only uses 3 words). Since &ldquo;ban&rdquo; comes lexicographically before &rdquo;can&rdquo;, you should output the one that uses &rdquo;ban&rdquo;, &rdquo;bon&rdquo;, &rdquo;bow&rdquo; (as shown below).</p>