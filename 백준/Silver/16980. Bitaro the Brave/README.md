# [Silver I] Bitaro the Brave - 16980

[문제 링크](https://www.acmicpc.net/problem/16980)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 262, 정답: 166, 맞힌 사람: 151, 정답 비율: 66.520%

### 분류

수학, 누적 합, 조합론

### 문제 설명

<p>Bitaro the Brave faces the Devil.</p>

<p>Bitaro is going to attack the Devil by arranging jewels, orbs and ingots on an H times W grid and casting a spell. The square at the i-th row (1 &le; i &le; H) from the top and the j-th column (1 &le; j &le; W) from the left is denoted by (i, j).</p>

<p>Now, Bitaro has arranged one of these three types on each square. Bitaro is going to cast a spell, the power of which is determined by the arrangement of jewels, orbs and ingots. Specifically, the power equals to the number of quadruplets of integers (i, j, k, ℓ) (1 &le; i &lt; k &le; H, 1 &le; j &lt; ℓ &le; W) satisfying the following condition.</p>

<blockquote>
<p>Condition: Bitaro has arranged a jewel on the square (i, j), an orb on the square (i, ℓ) and an ingot on the square (k, j).</p>
</blockquote>

<p>Bitaro is wondering the power of the spell.</p>

<p>Write a program which, given the arrangement of jewels, orbs and ingots, calculates the power of the spell Bitaro casts.</p>

### 입력

<p>Read the following data from the standard input.</p>

<pre>
H W
S<sub>1</sub>
:
S<sub>H</sub></pre>

<p>S<sub>i</sub> (1 &le; i &le; H) is a string of length W. The item arranged on the square (i, j) (1 &le; j &le; W) is a jewel if the j-th character of S<sub>i</sub> is <code>J</code>, an orb if it is <code>O</code> and an ingot if it is <code>I</code>.</p>

### 출력

<p>Write one line to the standard output. The output should contain the power of the spell Bitaro casts.</p>

### 제한

<ul>
	<li>2 &le; H &le; 3 000.</li>
	<li>2 &le; W &le; 3 000.</li>
	<li>S<sub>i</sub> is a string of length W (1 &le; i &le; H).</li>
	<li>Each character of S<sub>i</sub> is <code>J</code>, <code>O</code>, or <code>I</code> (1 &le; i &le; H).</li>
</ul>