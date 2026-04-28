# [Gold I] Forgotten Password - 5982

[문제 링크](https://www.acmicpc.net/problem/5982)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 238, 정답: 83, 맞힌 사람: 65, 정답 비율: 38.235%

### 분류

다이나믹 프로그래밍, 문자열

### 문제 설명

<p>As has happened to so many of us, Bessie has forgotten her cowtube password. She does, however, remember some handy bits of information about it.</p>

<p>First, she remembers that her password (denoted as variable P) has length L (1 &lt;= L &lt;= 1,000) roman characters and can be split into one or more words (not necessarily unique) from a dictionary composed of NW (1 &lt;= NW &lt;= 1,000) unique words. &nbsp;A word W_i is defined as a sequence of 1..20 lowercase letters of the Roman alphabet (&#39;a&#39;..&#39;z&#39;).</p>

<p>She also remembers certain letters from her password along with their positions.</p>

<p>Consider the following example. Bessie knows that her password looks like &quot;a??l?ban???????&quot; (&#39;?&#39; represents a letter she cannot remember), and her dictionary has the following words:</p>

<pre>
apple
cow
farmer
banana
bananas
pies</pre>

<p>The two possible passwords for Bessie to have are &quot;applebananapies&quot; and &quot;applebananascow&quot;.</p>

<p>Given the dictionary, and the letters that Bessie remembers, please find her password. If more than one password is valid, find the lexicographically least string that works.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: L and NW</li>
	<li>Line 2: A string of length L: P</li>
	<li>Lines 3..NW+2: Line i+2 contains the ith word in the dictionary: W_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: The lexicographically least password that fits</li>
</ul>

<p>&nbsp;</p>