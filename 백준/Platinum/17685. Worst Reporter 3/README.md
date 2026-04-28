# [Platinum III] Worst Reporter 3 - 17685

[문제 링크](https://www.acmicpc.net/problem/17685)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 76, 정답: 60, 맞힌 사람: 55, 정답 비율: 82.090%

### 분류

이분 탐색

### 문제 설명

<p>At the opening ceremony of IOI 2018, N contestants marches along a line, which is represented by a number line. All contestants head for the positive direction of the number line. At time 0, the i-th contestant (1 &le; i &le; N, counted from the front) stands at coordinate &minus;i. In addition, IOI-chan, the flag-bearer, stands at coordinate 0.</p>

<p>Each contestant has a value called <strong>slowness</strong>. The i-th contestant has slowness D<sub>i</sub>. The contestants keep the following rule:</p>

<ul>
	<li>If the i-th contestant is at a distance greater than or equal to D<sub>i</sub> + 1 from the person (a contestant or IOIchan) right in front of him or her, the i-th contestant moves to the position at a distance 1 from that person. Otherwise, the i-th contestant does not move.</li>
</ul>

<p>IOI-chan moves a distance 1 in the positive direction on the line per unit time. A contestant moves instantly whenever the condition described above is satisfied.</p>

<p>You are a reporter to cover the opening ceremony. You had to take photos, but you were fast asleep during the whole ceremony. It couldn&rsquo;t be helped&mdash;you decided to cheat by taking photos of the hall and then drawing pictures of the people on them.</p>

<p>In order not to get caught cheating, or to estimate the time to draw pictures, you want to know the following Q values:</p>

<ul>
	<li>the number of people standing at coordinate between Lj and Rj , inclusive, at time T<sub>j</sub> (1 &le; j &le; Q).</li>
</ul>

<p>Given the slowness of each contestant and the data of the Q questions, write a program which calculates the number of people satisfying the condition for each question.</p>

### 입력

<p>Read the following data from the standard input.</p>

<ul>
	<li>The first line of the input contains two space separated integers N and Q. This means there are N contestants (not including IOI-chan) and there are Q questions.</li>
	<li>The i-th line (1 &le; i &le; N) of the following N lines contains an integer D<sub>i</sub>. This means the i-th contestant from the front has slowness D<sub>i</sub>.</li>
	<li>The j-th line (1 &le; j &le; Q) of the following Q lines contains three space separated integers T<sub>j</sub> , L<sub>j</sub> and R<sub>j</sub>. These values represent the j-th question.</li>
</ul>

### 출력

<p>Write Q lines to the standard output. The j-th line (1 &le; j &le; Q) of the output should contain the answer to the j-th question.</p>

### 제한

<ul>
	<li>1 &le; N &le; 500 000.</li>
	<li>1 &le; Q &le; 500 000.</li>
	<li>1 &le; D<sub>i</sub> &le; 1 000 000 000 (1 &le; i &le; N).</li>
	<li>1 &le; T<sub>j</sub> &le; 1 000 000 000 (1 &le; j &le; Q).</li>
	<li>1 &le; L<sub>j</sub> &le; R<sub>j</sub> &le; 1 000 000 000 (1 &le; j &le; Q).</li>
</ul>