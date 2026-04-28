# [Gold IV] Secret Cow Code - 14454

[문제 링크](https://www.acmicpc.net/problem/14454)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 711, 정답: 251, 맞힌 사람: 217, 정답 비율: 35.927%

### 분류

재귀

### 문제 설명

<p>&nbsp;</p>

<p>The cows are experimenting with secret codes, and have devised a method for creating an infinite-length string to be used as part of one of their codes.</p>

<p>Given a string&nbsp;s, let&nbsp;F(s) be&nbsp;s&nbsp;followed by&nbsp;s&nbsp;&quot;rotated&quot; one character to the right (in a right rotation, the last character of&nbsp;s&nbsp;rotates around and becomes the new first character). Given an initial string&nbsp;s, the cows build their infinite-length code string by repeatedly applying&nbsp;F; each step therefore doubles the length of the current string.</p>

<p>Given the initial string and an index&nbsp;N, please help the cows compute the character at the&nbsp;Nth position within the infinite code string.</p>

<p>&nbsp;</p>

### 입력

<p>The input consists of a single line containing a string followed by&nbsp;N. The string consists of at most 30 uppercase characters, and&nbsp;N &le; 10<sup>18</sup>.</p>

<p>Note that&nbsp;N&nbsp;may be too large to fit into a standard 32-bit integer, so you may want to use a 64-bit integer type (e.g., a &quot;long long&quot; in C/C++).</p>

### 출력

<p>Please output the&nbsp;Nth character of the infinite code built from the initial string. The first character is&nbsp;N=1.</p>

### 힌트

<p>In this example, the initial string COW expands as follows:</p>

<pre>
COW -&gt; COWWCO -&gt; COWWCOOCOWWC
                 12345678</pre>