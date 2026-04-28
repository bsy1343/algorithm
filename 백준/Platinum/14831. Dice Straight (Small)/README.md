# [Platinum III] Dice Straight (Small) - 14831

[문제 링크](https://www.acmicpc.net/problem/14831)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 98, 정답: 56, 맞힌 사람: 27, 정답 비율: 50.000%

### 분류

두 포인터, 이분 매칭

### 문제 설명

<p>You have a special set of&nbsp;<strong>N</strong>&nbsp;six-sided dice, each of which has six different positive integers on its faces. Different dice may have different numberings.</p>

<p>You want to arrange some or all of the dice in a row such that the faces on top form a&nbsp;<em>straight</em>&nbsp;(that is, they show consecutive integers). For each die, you can choose which face is on top.</p>

<p>How long is the longest straight that can be formed in this way?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case begins with one line with&nbsp;<strong>N</strong>, the number of dice. Then,&nbsp;<strong>N</strong>&nbsp;more lines follow; each of them has six positive integers&nbsp;<strong>D<sub>ij</sub></strong>. The j-th number on the i-th of these lines gives the number on the j-th face of the i-th die.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>D<sub>ij</sub></strong>&nbsp;&le; 10<sup>6</sup>&nbsp;for all i, j.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the length of the longest straight that can be formed.</p>

### 힌트

<p>In sample case #1, a straight of length 4 can be formed by taking the 2 from the fourth die, the 3 from the third die, the 4 from the first die, and the 5 from the second die.</p>

<p>In sample case #2, there is no way to form a straight larger than the trivial straight of length 1.</p>

<p>In sample case #3, you can take a 1 from one die, a 2 from another, and a 3 from the remaining unused die. Notice that this case demonstrates that there can be multiple dice with the same set of values on their faces.</p>