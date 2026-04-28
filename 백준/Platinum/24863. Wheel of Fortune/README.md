# [Platinum V] Wheel of Fortune - 24863

[문제 링크](https://www.acmicpc.net/problem/24863)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 15, 맞힌 사람: 14, 정답 비율: 22.581%

### 분류

문자열, 브루트포스 알고리즘, 해 구성하기

### 문제 설명

<p>Katya&#39;s old dream to be in the &quot;Wheel of Fortune&quot; game has come true.</p>

<p>Let&#39;s remind the rules of the &quot;Wheel of Fortune&quot; game:&nbsp;</p>

<ul>
	<li>The goal of the game is to guess a word hidden by the game host. The contestants make turns by naming a letter.&nbsp;</li>
	<li>If the named letter occurs in the hidden word, then the host opens all its occurrences in the word, and the contestant can name a new letter.&nbsp;</li>
	<li>If the contestant names a letter that doesn&#39;t occur in the hidden word, the turn of the next contestant starts.</li>
</ul>

<p>The host of the game hides the word of length $L$. Katya really wanted to win the game, so she hacked the game editor&#39;s computer. She found out that the hidden word will be one of $N$ words.</p>

<p>Katya has the first turn in the game. Help Katya to understand if she can guarantee to win the game. Is it true that Katya will be able to guess any word from the stolen list &nbsp;without loosing the turn?</p>

### 입력

<p>In the first line there are two integers $L$ and $N$ --- the length of the hidden word and the number of stolen words ($1 \le L \le 10^6$, $1 \le N \le 10^5$).</p>

<p>In the next $N$ lines there are different words of length $L$. They consist of lowercase English letters.</p>

<p>It is guaranteed that the total length of all words does not exceed $10^6$.</p>

### 출력

<p>Output &quot;<code>YES</code>&quot;, if Katya is able guarantee herself a win, otherwise output &quot;<code>NO</code>&quot;.</p>

### 힌트

<p>In the first sample Katya can win, if she first names the letter &quot;<code>l</code>&quot;. Seeing the opened letters, she can determine he hidden word.</p>

<p>In the third sample for all Katya&#39;s strategies there is a risk of naming a wrong letter and loosing the turn.</p>