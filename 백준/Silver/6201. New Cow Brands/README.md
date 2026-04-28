# [Silver II] New Cow Brands - 6201

[문제 링크](https://www.acmicpc.net/problem/6201)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 162, 정답: 73, 맞힌 사람: 58, 정답 비율: 48.333%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>The cows are beside themselves: Farmer John has decided to use RFID tags instead of branding the cows with red-hot irons that cause intense pain.</p>

<p>The RFID tags contain a code that is N (3 &lt;= N &lt;= 15) characters (each in the range &#39;A&#39;..&#39;Z&#39;) in length. No character appears twice in the code. The character chosen for any given position in the code is chosen from a supplied set for that position. The set is always given in alphabetical order.</p>

<p>A machine generates the codes in alphabetical order. Each new batch &nbsp; &nbsp;of cows uses the next unused set of codes. FJ keeps track of the number of codes he has already used.<br />
&nbsp;<br />
Help FJ confirm the RFID brands to be used for the next set of cows. &nbsp; Given the count of the starting and finishing brands (1 &lt;= start &lt; finish &lt;= 22,000,000 and finish-start &lt; 2000), print (in alphabetical order) the brands that will be used. See the I/O specifications for an example.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers, respectively: N, start, and finish.</li>
	<li>Lines 2..N+1: Line i+1 contains a number (1..26) of characters that are the valid characters for position i in the RFID code</li>
</ul>

<p>&nbsp;</p>

### 출력

<p>Lines 1..finish-start+1: Line i contains RFID code # start+i-1</p>

### 힌트

<p>Here are the first 20 codes:</p>

<pre>
 1 ACFB    5 ADFC    9 AEFB   13 ALCB   17 ALHC
 2 ACHB    6 ADHB   10 AEFC   14 ALFB   18 AQCB
 3 ADCB    7 ADHC   11 AEHB   15 ALFC   19 AQFB
 4 ADFB    8 AECB   12 AEHC   16 ALHB   20 AQFC</pre>