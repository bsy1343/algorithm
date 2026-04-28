# [Platinum III] Math Homework - 21620

[문제 링크](https://www.acmicpc.net/problem/21620)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 105, 정답: 44, 맞힌 사람: 32, 정답 비율: 39.506%

### 분류

자료 구조, 그리디 알고리즘, 느리게 갱신되는 세그먼트 트리, 수학, 정수론, 누적 합, 세그먼트 트리

### 문제 설명

<p>Your math teacher has given you an assignment involving coming up with a sequence of N integers A<sub>1</sub>, . . . , A<sub>N</sub>, such that 1 &le; A<sub>i</sub> &le; 1 000 000 000 for each i.</p>

<p>The sequence A must also satisfy M requirements, with the i<sup>th</sup> one stating that the GCD (Greatest Common Divisor) of the contiguous subsequence A<sub>X<sub>i</sub></sub> , . . . , A<sub>Y<sub>i</sub></sub> (1 &le; X<sub>i</sub> &le; Y<sub>i</sub> &le; N) must be equal to Z<sub>i</sub>. Note that the GCD of a sequence of integers is the largest integer d such that all the numbers in the sequence are divisible by d.</p>

<p>Find <em>any</em> valid sequence A consistent with all of these requirements, or determine that no such sequence exists.</p>

### 입력

<p>The first line contains two space-separated integers, N and M.</p>

<p>The next M lines each contain three space-separated integers, X<sub>i</sub>, Y<sub>i</sub>, and Z<sub>i</sub> (1 &le; i &le; M).</p>

### 출력

<p>If no such sequence exists, output the string <code>Impossible</code> on one line. Otherwise, on one line, output N space-separated integers, forming the sequence A<sub>1</sub>, . . . , A<sub>N</sub>. If there are multiple possible valid sequences, any valid sequence will be accepted.</p>

### 제한

<ul>
	<li>1 &le; N &le; 150 000</li>
	<li>1 &le; M &le; 150 000</li>
	<li>1 &le; Z<sub>i</sub> &le; 16 for each i</li>
</ul>