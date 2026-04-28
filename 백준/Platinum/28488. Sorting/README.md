# [Platinum III] Sorting - 28488

[문제 링크](https://www.acmicpc.net/problem/28488)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

애드 혹, 정렬

### 문제 설명

<p>Sashka regularly takes part in online programming competitions. The prize for the current one is participation in a summer programming camp in the Maldives. Especially for this contest she has set her username to be <strong><span style="color:#ff0000;">Sorting</span></strong>. One of the tasks is the following:</p>

<p>The jury has come up with a permutation $p_1, p_2, p_3, \dots , p_N$ of the numbers from $1$ to $N$. The task is to find the permutation and in order to do so you can ask the jury the following two types of questions:</p>

<ol>
	<li>Given two positions $x$ and $y$ in the permutation ($1 &le; x, y &le; N$), is it true that $p_x &lt; p_y$?</li>
	<li>Given a number $d$ and two positions $x$ and $y$ in the permutation ($1 &le; x, y, d &le; N$), is it true that $|p_x &minus; p_y| &equiv; 0 \pmod d$. In other words, is it true that the difference of the elements in the permutation at the $x$-th and $y$-th positions is divisible by $d$?</li>
</ol>

<p>You have to ask as few questions as possible from the first type (see the scoring section below), but the number of questions of the second type is unlimited.</p>

<p>Help Sashka by writing a program <code>sorting</code>, which by given $N$ restores the permutation. It must contain the function <code>solve</code>, which will be compiled and executed with a jury&rsquo;s program.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$2 &le; N &le; 500\,000$</li>
	<li>$1 &le; p_i &le; N$ for each $1 &le; i &le; N$.</li>
	<li>$p_i \ne p_j$ for each $1 &le; i &lt; j &le; N$.</li>
</ul>