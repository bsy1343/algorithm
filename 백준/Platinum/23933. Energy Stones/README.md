# [Platinum III] Energy Stones - 23933

[문제 링크](https://www.acmicpc.net/problem/23933)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 37, 맞힌 사람: 30, 정답 비율: 62.500%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬, 배낭 문제

### 문제 설명

<p>Duda the rock monster lives in the enchanted forest and has collected&nbsp;<b>N</b>&nbsp;<i>energy stones</i>&nbsp;for lunch. Since he has a small mouth, he eats energy stones one at a time. Some stones are tougher than others! The i-th stone takes him&nbsp;<b>S<sub>i</sub></b>&nbsp;seconds to eat.</p>

<p>Duda eats energy stones to get&nbsp;<i>energy</i>. Different stones give him different amounts of energy. Furthermore, the stones lose energy over time. The i-th stone initially contains&nbsp;<b>E<sub>i</sub></b>&nbsp;units of energy and will lose&nbsp;<b>L<sub>i</sub></b>&nbsp;units of energy each second. When Duda starts to eat a stone, he will receive all the energy the stone contains immediately (no matter how much time it takes to actually finish eating the stone). The stone&#39;s energy stops decreasing once it hits zero.</p>

<p>What is the largest amount of energy Duda could receive from eating his stones?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case starts with a line containing the integer&nbsp;<b>N</b>, the number of energy stones Duda has. Then, there are&nbsp;<b>N</b>&nbsp;more lines, the i-th of which contains the three integers&nbsp;<b>S<sub>i</sub></b>,&nbsp;<b>E<sub>i</sub></b>&nbsp;and&nbsp;<b>L<sub>i</sub></b>, as described above.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximum amount of energy Duda could receive from eating stones.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>N</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>S<sub>i</sub></b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>E<sub>i</sub></b>&nbsp;&le; 10<sup>5</sup>.</li>
	<li>0 &le;&nbsp;<b>L<sub>i</sub></b>&nbsp;&le; 10<sup>5</sup>.</li>
</ul>