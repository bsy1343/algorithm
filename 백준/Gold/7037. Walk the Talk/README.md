# [Gold III] Walk the Talk - 7037

[문제 링크](https://www.acmicpc.net/problem/7037)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 33, 정답: 12, 맞힌 사람: 9, 정답 비율: 32.143%

### 분류

다이나믹 프로그래밍, 누적 합, 문자열

### 문제 설명

<p>Farmer John has set up a puzzle for his cows to solve. At the entrance to the barn, he has laid out an H x W (1 &lt;= H &lt;= 30, 1 &lt;= W &lt;= 30) grid of letters. Before a cow can enter the barn, she must spell out a valid English word by jumping from square to square, creating a sequence of letters. She can start at any square but may only jump to a subsequent square that is located to the right and/or above the current square (i.e., neither to the left nor lower). The next square can be any distance from the current one since the cows are world-class jumpers!</p>

<p>No two cows may traverse the exact same path, although two cows are allowed to spell the same word via different paths.</p>

<p>As an example, consider this grid (presuming &#39;TO&#39; and &#39;OX&#39; are words):</p>

<pre>
<code>T X X O
T X Q T
X T X Q</code></pre>

<p>Four paths are valid, all spelling &#39;TO&#39; (one spelling requires a &#39;T&#39; from the bottom row and an &#39;O&#39; from the top row). &#39;OX&#39; is a valid word, but would require jumping to an &#39;X&#39; square left of the &#39;O&#39;, which is not allowed.</p>

<p>Given the grid and a list of valid words, compute the number of cows that can enter the barn without any cow repeating a path. See a copy of the list <a href="https://upload.acmicpc.net/cc33b2da-a711-49a1-b809-aa4495021fe4/">here</a>.</p>

### 입력

<ul>
	<li>Line 1: Two integers: H and W</li>
	<li>Lines 2..H+1: Each line contains W characters, without spaces, representing a row in the grid. The first row is the top row.The first character in each row is the left-most character.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The number of cows that can enter the barn without repeating a path.</li>
</ul>