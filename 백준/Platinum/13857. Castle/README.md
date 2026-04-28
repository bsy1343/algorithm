# [Platinum II] Castle - 13857

[문제 링크](https://www.acmicpc.net/problem/13857)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 256 MB

### 통계

제출: 150, 정답: 33, 맞힌 사람: 29, 정답 비율: 21.642%

### 분류

KMP, 문자열

### 문제 설명

<p>K. has stumbled upon a weird game while playing on his computer. The game consists of an initial string S of length N (1 &le; N &le; 1000) and an empty set T. The following events might occur during the game:</p>

<ul>
	<li>a character is added at the end of S, thus increasing its length by 1</li>
	<li>the string S is added to the set T</li>
	<li>the game master inquires: &ldquo;How many strings in T are suffixes of S?&rdquo;. A suffix of S is a substring which can start at any position in S, but must finish on the last position of S.</li>
</ul>

<p>Because K. wants to go visit a famous castle near his hometown, you must help him deal with the game as quickly as possible.</p>

### 입력

<p>The first line of the input contains two integers: N, the length of the initial string S and E, the number of events (E &le; 1200000).</p>

<p>The second line describes the string S; the string consists only of lowercase Roman alphabet (a-z).</p>

<p>The following E lines describe the events. Each of these lines contains an integer p, describing the event type.</p>

<ul>
	<li>If p is 1, then it is followed by a character (a-z), which will be added at the end of S.</li>
	<li>If p is 2, then the string S is added in T.</li>
	<li>If p is 3, then you must respond to the query &ldquo;How many strings in T are suffixes of the current S?&rdquo;</li>
</ul>

### 출력

<p>The output should consist of a line containing an integer for each type 3 event in the input, which represents the answer to the query.</p>

<p>Note: T is a set, so it doesn&#39;t contain duplicates.</p>

<p>Note: Large input: for C scanf and printf recommended; for C++, add &ldquo;<code>cin.tie(NULL); ios::sync_with_stdio(false);</code>&rdquo; before reading; for Java use BufferedReader and BufferedWriter.</p>