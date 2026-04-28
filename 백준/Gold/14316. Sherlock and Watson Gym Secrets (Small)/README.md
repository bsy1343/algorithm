# [Gold V] Sherlock and Watson Gym Secrets (Small) - 14316

[문제 링크](https://www.acmicpc.net/problem/14316)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 97, 정답: 44, 맞힌 사람: 33, 정답 비율: 42.308%

### 분류

분할 정복을 이용한 거듭제곱, 수학

### 문제 설명

<p>Watson and Sherlock are gym buddies.</p>

<p>Their gym trainer has given them three numbers,&nbsp;A,&nbsp;B, and&nbsp;N, and has asked Watson and Sherlock to pick two different&nbsp;positive integers&nbsp;i and j, where i and j are both less than or equal to&nbsp;N. Watson is expected to eat exactly i<sup>A</sup>&nbsp;sprouts every day, and Sherlock is expected to eat exactly j<sup>B</sup>&nbsp;sprouts every day.</p>

<p>Watson and Sherlock have noticed that if the total number of sprouts eaten by them on a given day is divisible by a certain integer&nbsp;K, then they get along well that day.</p>

<p>So, Watson and Sherlock need your help to determine how many such pairs of&nbsp;(i, j)&nbsp;exist, where i != j. As the number of pairs can be really high, please output it modulo&nbsp;10<sup>9</sup>+7 (1000000007).</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each test case consists of one line with 4 integers&nbsp;A,&nbsp;B,&nbsp;N&nbsp;and&nbsp;K, as described above.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the required answer.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;A&nbsp;&le; 10<sup>6</sup>.</li>
	<li>0 &le;&nbsp;B&nbsp;&le; 10<sup>6</sup>.</li>
	<li>1 &le;&nbsp;K&nbsp;&le; 10000.</li>
	<li>1 &le;&nbsp;N&nbsp;&le; 1000.</li>
</ul>

### 힌트

<p>In Case 1, the possible pairs are (1, 2), (1, 5), (2, 1), (2, 4), (4, 2), (4, 5), (5, 1), and (5, 4).</p>

<p>In Case 2, the possible pairs are (1, 2), (1, 3), and (4, 1).</p>

<p>In Case 3, No possible pairs are there, as i != j.</p>