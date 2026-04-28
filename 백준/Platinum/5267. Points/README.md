# [Platinum IV] Points - 5267

[문제 링크](https://www.acmicpc.net/problem/5267)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

기하학

### 문제 설명

<p>You and your friends have invented an interesting game called &ldquo;Trivial Points&rdquo;. It&rsquo;s played between 2 players and involves placing points in a 3D space in a special way respecting a certain set of rules. Being very excited about this game, you, together with your friends, have decided to create a computer version in which one of the players is a human and the other is computer.</p>

<p>For the purposes of the development of this game you are responsible to write a program that receives a set of points in a 3D space and computes how many different lines are there so that each contains at least 3 of the given points.</p>

### 입력

<p>Input contains on the first line a single integer number n, which is the number of given points. Then n lines follow, each containing the 3 integer coordinates of a point, more specifically the i-th of these n lines contains the integer coordinates x<sub>i</sub>, y<sub>i</sub>, z<sub>i</sub>, separated by single spaces, of the i-th point.</p>

### 출력

<p>Output will contain on the first line a single integer number that is the number of lines asked in problem&rsquo;s statement.</p>

### 제한

<ul>
	<li>4 &le; n &le; 1000.</li>
	<li>Coordinates x<sub>i</sub>, y<sub>i</sub>, z<sub>i</sub> are integers.</li>
	<li>-10 000 &le; x<sub>i</sub>, y<sub>i</sub>, z<sub>i</sub> &le; 10 000, i = 1, 2, 3, ..., n.</li>
</ul>

### 힌트

<p>The first line contains points (-5; -5; -5), (1; 1; 1), (2; 2; 2), and (3; 3; 3), and the second line contains points (1; 0; -1), (2; 2; 2), (3; 4; 5).</p>