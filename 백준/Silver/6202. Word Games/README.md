# [Silver V] Word Games - 6202

[문제 링크](https://www.acmicpc.net/problem/6202)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 69, 정답: 40, 맞힌 사람: 24, 정답 비율: 63.158%

### 분류

구현, 문자열

### 문제 설명

<p>The cows are playing Scrabble but, sad to say, they do not have the vocabulary to play at the tournament level. Bessie wants your help for just the first move. Given her rack (a &quot;rack&quot; is a holder of Scrabble letters) of N (3 &lt;= N &lt;= 10) letters (which might or might not be unique and might include one or more blank &quot;wild card&quot; tiles) along with a scrabble dictionary of D (10 &lt;= D &lt;= 50000) words, print the words she might use (by searching the dictionary).</p>

<p>The 27 possible letters are upper-case &#39;A&#39;..&#39;Z&#39; and the &#39;#&#39; symbol, which represents a &quot;wildcard&quot; and can stand for any letter. If two &#39;#&#39;s appear in one rack, each can represent a different letter when played.</p>

<p>The dictionary words can be read, one per line, from file whose name is &#39;scrbl.txt&#39; (the file name is all lower case letters, unlike the file&#39;s contents). The letters in Bessie&#39;s rack can always be used to make at least one word. Each word in the dictionary is unique. Remember that you are running on Linux: each input line ends with a &#39;\n&#39; character; no &#39;return&#39; characters are present.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers, N and D.</li>
	<li>Line 2: N letters (with no intervening blanks) that are the letters in Bessie&#39;s Scrabble rack.</li>
</ul>

### 출력

<ul>
	<li>Lines 1..??: Each line contains a single word that appears in the scrbl.txt dictionary. Print the output in the order the words appear in the dictionary.</li>
</ul>