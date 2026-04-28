# [Platinum II] Bless You Autocorrect! - 13355

[문제 링크](https://www.acmicpc.net/problem/13355)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 93, 정답: 43, 맞힌 사람: 36, 정답 비율: 46.753%

### 분류

너비 우선 탐색, 자료 구조, 그래프 이론, 그래프 탐색, 트리, 트라이

### 문제 설명

<p>Typing on phones can be tedious. It is easy to make typing&nbsp;mistakes, which is why most phones come with an autocorrect&nbsp;feature. Autocorrect not only fixes common typos, but also suggests&nbsp;how to finish the word while you type it. Jenny has recently&nbsp;been pondering how she can use this feature to her advantage, so&nbsp;that she can send a particular message with the minimum amount&nbsp;of typing.</p>

<p>The autocorrect feature on Jenny&rsquo;s phone works like this: the&nbsp;phone has an internal dictionary of words sorted by their frequency&nbsp;in the English language. Whenever a word is being typed,&nbsp;autocorrect suggests the most common word (if any) starting with&nbsp;all the letters typed so far. By pressing tab, the word being typed&nbsp;is completed with the autocorrect suggestion. Autocorrect can&nbsp;only be used after the first character of a word has been typed &ndash;&nbsp;it is not possible to press tab before having typed anything. If no&nbsp;dictionary word starts with the letters typed so far, pressing tab&nbsp;has no effect.</p>

<p>Jenny has recently noticed that it is sometimes possible to use autocorrect to her advantage&nbsp;even when it is not suggesting the correct word, by deleting the end of the autocorrected&nbsp;word. For instance, to type the word &ldquo;autocorrelation&rdquo;, Jenny starts typing &ldquo;aut&rdquo;, which then&nbsp;autocorrects to &ldquo;autocorrect&rdquo; (because it is such a common word these days!) when pressing&nbsp;tab. By deleting the last two characters (&ldquo;ct&rdquo;) and then typing the six letters &ldquo;lation&rdquo;, the whole&nbsp;word can be typed using only 3 (&ldquo;aut&rdquo;) + 1 (tab) + 2 (backspace twice) + 6 (&ldquo;lation&rdquo;) = 12&nbsp;keystrokes, 3 fewer than typing &ldquo;autocorrelation&rdquo; without using autocorrect.</p>

<p>Given the dictionary on the phone and the words Jenny wants to type, output the minimum&nbsp;number of keystrokes required to type each word. The only keys Jenny can use are the letter&nbsp;keys, tab and backspace.</p>

### 입력

<p>The first line of input contains two positive integers n (1 &le; n &le; 10<sup>5</sup>), the number of words in&nbsp;the dictionary, and m (1 &le; m &le; 10<sup>5</sup>), the number of words to type. Then follow n lines with&nbsp;one word per line, sorted in decreasing order of how common the word is (the first word is the&nbsp;most common). No word appears twice in the dictionary. Then follow m lines, containing the&nbsp;words to type.</p>

<p>The dictionary and the words to type only use lower case letters &lsquo;a&rsquo;-&lsquo;z&rsquo;. The total size of&nbsp;the input file is at most 1 MB.</p>

### 출력

<p>For each word to type, output a line containing the minimum number of keystrokes required to&nbsp;type the corresponding word.</p>