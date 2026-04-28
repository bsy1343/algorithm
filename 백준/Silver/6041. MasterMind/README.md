# [Silver II] MasterMind - 6041

[문제 링크](https://www.acmicpc.net/problem/6041)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 82, 정답: 40, 맞힌 사람: 39, 정답 비율: 54.167%

### 분류

브루트포스 알고리즘, 구현

### 문제 설명

<p>Jessie was learning about programming contests at Bessie&#39;s knee. &quot;Do they play games?&quot; she asked.</p>

<p>&quot;Oh yes,&quot; Bessie nodded sagely. &quot;Here&#39;s a classic.&quot;</p>

<p>MasterMind is a classic two player game. One of the players is the &#39;codemaker&#39;; she picks a four digit secret number S (1000 &lt;= S &lt;= 9999). The other player is the &#39;codebreaker&#39; who repeatedly guesses four digit numbers until she solves the code.</p>

<p>The codemaker provides feedback that comprises two integers for each codebreaker guess G_i (1000 &lt;= G_i &lt;= 9999). For each codebreaker guess, the codemaker&#39;s feedback comprises two integers:</p>

<p>The first integer C_i (0 &lt;= C_i &lt;= 4) specifies how many of the guess&#39;s digits are correct and in their correct location in the secret number</p>

<p>The second integer W_i (0 &lt;= W_i &lt;= 4-C_i) specifies how many of the remaining digits (i.e., those not described by C_i) are correct but in the wrong location.</p>

<p>For example, suppose codemaker&#39;s secret number is 2351. If codebreaker guesses 1350, the codemaker provides the feedback &quot;2 1&quot;, since 3 and 5 are in correct locations in the number, and 1 is in the wrong location. As another example, if the secret number is 11223 (in a five-digit version of mastermind) and the guess is 12322, then the feedback would be &quot;2 2&quot;.</p>

<p>Below is a sample game where the secret number is 2351:</p>

<pre>
        Correct digits in correct location
        | Correct digits in wrong location
Guess   | |
3157    1 2
1350    2 1
6120    0 2
2381    3 0
2351    4 0</pre>

<p>For this task, you are given N (1 &lt;= N &lt;= 100) guesses with their feedback in the middle of a game. You are asked to output the smallest four digit number which can be a candidate for codemaker&#39;s secret code (i.e., which satisfies all the constraints).</p>

<p>If there are no such numbers, output &quot;NONE&quot; (without the quotes).</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i+1 contains guess i and its two responses expressed as three space-separated integers: G_i, C_i, and W_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the smallest four-digit number (same range as the secret integer: 1000..9999) which could be the secret code. If there are no such numbers, output a single line containing the word &quot;NONE&quot; (without quotes).</li>
</ul>

<p>&nbsp;</p>