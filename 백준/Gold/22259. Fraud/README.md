# [Gold II] Fraud - 22259

[문제 링크](https://www.acmicpc.net/problem/22259)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 185, 정답: 59, 맞힌 사람: 42, 정답 비율: 33.071%

### 분류

수학, 구현

### 문제 설명

<p>You have been put in charge of the 24th National Olympiad in Informatics!</p>

<p>This year, the competition consisted of N contestants and 2 rounds. The i<sup>th</sup> contestant scored A<sub>i</sub> points in the first round and B<sub>i</sub> points in the second round.</p>

<p>Furthermore, the rounds have associated <strong>positive integer</strong> weightages X and Y respectively. The i<sup>th</sup> contestant&rsquo;s final score Si is given by S<sub>i</sub> = A<sub>i</sub> &times; X + B<sub>i</sub> &times; Y.</p>

<p>As the chairman, you have been given the freedom to select the values of X and Y as you wish.</p>

<p>Alas, Squeaky the Mouse has bribed you into committing fraud. To be exact, he has promised to reward you handsomely if you select some X and Y such that S<sub>i</sub> &gt; S<sub>j</sub> for all 1 &le; i &lt; j &le; N.</p>

<p>But is it even possible to do so?</p>

### 입력

<p>Your program must read from standard input.</p>

<p>The first line contains a single integer N, the number of contestants.</p>

<p>The second line contains N space-separated integers, A<sub>1</sub>, . . . , A<sub>N</sub>.</p>

<p>The third line contains N space-separated integers, B<sub>1</sub>, . . . , B<sub>N</sub>.</p>

### 출력

<p>Your program must print to standard output.</p>

<p>Output <code>YES</code> if it is possible to commit fraud and <code>NO</code> otherwise.</p>

### 제한

<ul>
	<li>2 &le; N &le; 3 &times; 10<sup>5</sup></li>
	<li>0 &le; A<sub>i</sub>, B<sub>i</sub> &le; 10<sup>6</sup></li>
</ul>