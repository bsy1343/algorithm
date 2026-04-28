# [Bronze I] Password Attacker (Small) - 12198

[문제 링크](https://www.acmicpc.net/problem/12198)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 139, 정답: 108, 맞힌 사람: 100, 정답 비율: 79.365%

### 분류

수학, 브루트포스 알고리즘, 조합론

### 문제 설명

<p>Passwords are widely used in our lives: for ATMs, online forum logins, mobile device unlock and door access. Everyone cares about password security. However, attackers always find ways to steal our passwords. Here is one possible situation:</p>

<p>Assume that Eve, the attacker, wants to steal a password from the victim Alice. Eve cleans up the keyboard beforehand. After Alice types the password and leaves, Eve collects the fingerprints on the keyboard. Now she knows which keys are used in the password. However, Eve won&#39;t know how many times each key has been pressed or the order of the keystroke sequence.</p>

<p>To simplify the problem, let&#39;s assume that Eve finds Alice&#39;s fingerprints only occurs on&nbsp;<b>M</b>&nbsp;keys. And she knows, by another method, that Alice&#39;s password contains&nbsp;<b>N</b>&nbsp;characters. Furthermore, every keystroke on the keyboard only generates a single, unique character. Also, Alice won&#39;t press other irrelevant keys like &#39;left&#39;, &#39;home&#39;, &#39;backspace&#39; and etc.</p>

<p>Here&#39;s an example. Assume that Eve finds Alice&#39;s fingerprints on&nbsp;<b>M</b>=3 key &#39;3&#39;, &#39;7&#39; and &#39;5&#39;, and she knows that Alice&#39;s password is&nbsp;<b>N</b>=4-digit in length. So all the following passwords are possible: 3577, 3557, 7353 and 5735. (And, in fact, there are 32 more possible passwords.)</p>

<p>However, these passwords are not possible:</p>

<pre>
1357  // There is no fingerprint on key &#39;1&#39;
3355  // There is fingerprint on key &#39;7&#39;,
         so &#39;7&#39; must occur at least once.
357   // Eve knows the password must be a 4-digit number.
</pre>

<p>With the information, please count that how many possible passwords satisfy the statements above. Since the result could be large, please output the answer modulo 1000000007(10<sup>9</sup>+7).</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.</p>

<p>For the next&nbsp;<b>T</b>&nbsp;lines, each contains two space-separated numbers&nbsp;<b>M</b>&nbsp;and&nbsp;<b>N</b>, indicating a test case.</p>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the total number of possible passwords modulo 1000000007(10<sup>9</sup>+7).</p>

### 제한

<ul>
	<li><b>T</b>&nbsp;= 15.</li>
	<li>1 &le;&nbsp;<b>M</b>&nbsp;&le;&nbsp;<b>N</b>&nbsp;&le; 7.</li>
</ul>