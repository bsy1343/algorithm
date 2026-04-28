# [Bronze II] Beekeeper - 24769

[문제 링크](https://www.acmicpc.net/problem/24769)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 232, 정답: 116, 맞힌 사람: 101, 정답 비율: 49.754%

### 분류

구현, 문자열

### 문제 설명

<p>It&rsquo;s Bill the beekeeper again. In this problem, we learn that didn&#39;t choose his career for the best reason. Bill chose to be a beekeeper because he really, really likes the look of the double e&#39;s in the word &quot;beekeeper&quot;. Your task is to help identify other words Bill will really like.</p>

<p>Bill&#39;s affinity for a word is determined by how many pairs of double vowels it has, where vowels are the letters {a,e,i,o,u,y}. Given a list of words, find the word that has the most pairs of double vowels, as it will be Bill&#39;s favorite word.</p>

<p>Notes:</p>

<ul>
	<li>It is guaranteed that there will be a unique correct answer. That is, one word in the list will have strictly more pairs of vowels than all other words in the list.</li>
	<li>No word in the input will have three or more of the same vowel consecutively, because that would just be too much for poor Bill.</li>
</ul>

### 입력

<p>The first line of each case contains N, the number of words in that case (0 &lt; N &le; 1000). The next N lines will contain the words that make up that case. Each word will contain only lowercase English letters <code>[a-z]</code>, and no word will be longer than 80 characters. Words will not necessarily be actual English words, but they will contain at least one letter. The input will be terminated by a line containing a single zero.</p>

### 출력

<p>For each case, print Bill&#39;s favorite word. Each output should be printed on its own line.</p>