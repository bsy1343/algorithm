# [Bronze III] Three Points for a Win - 21022

[문제 링크](https://www.acmicpc.net/problem/21022)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 478, 정답: 430, 맞힌 사람: 390, 정답 비율: 91.765%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Three points for a win is a common point system used in competitions such as football (soccer) leagues or group tournaments. In this system, a team is awarded 3 points if they win a match, 1 point for a draw, and 0 points if they lose. Finally, the team with the most points wins the league.</p>

<p>Supposed BINUS&rsquo; football team joins a league and has played N matches. At the i<sup>th</sup> match, BINUS&rsquo; team scores A<sub>i</sub> vs B<sub>i</sub> against their opponent. If A<sub>i</sub> &gt; B<sub>i</sub>, then BINUS&rsquo; team wins the i<sup>th</sup> match; if A<sub>i</sub> &lt; B<sub>i</sub>, then BINUS&rsquo; team loses the match; otherwise, if A<sub>i</sub> = B<sub>i</sub>, then it&rsquo;s a draw. Given the score of each match, your task is to determine the total points accumulated by BINUS&rsquo; team.</p>

<p>For example, let N = 4 where A<sub>1..4</sub> = {3, 0, 2, 4} and B<sub>1..4</sub> = {1, 1, 2, 3}.</p>

<ul>
	<li>At the first match, BINUS&rsquo; team wins by 3 vs 1.</li>
	<li>At the second match, BINUS&rsquo; team loses by 0 vs 1.</li>
	<li>The third match is a draw (both have the same score of 2).</li>
	<li>At the fourth match, BINUS&rsquo; team wins by 4 vs 3.</li>
</ul>

<p>Therefore, the total points accumulated by BINUS&rsquo; team in this example is: 3 + 0 + 1 + 3 = 7.</p>

### 입력

<p>Input begins with a line containing an integer: N (1 &le; N &le; 100) representing the number of matches. The next line contains N integers: A<sub>i</sub> (0 &le; A<sub>i</sub> &le; 10) representing the score of BINUS&rsquo; team. The next line contains N integers: B<sub>i</sub> (0 &le; B<sub>i</sub> &le; 10) representing the score of BINUS&rsquo; opponent team.</p>

### 출력

<p>Output in a line an integer representing the total points accumulated by BINUS&rsquo; team.</p>