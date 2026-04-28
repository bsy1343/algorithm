# [Gold V] 무한 수열 2 - 1354

[문제 링크](https://www.acmicpc.net/problem/1354)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 4018, 정답: 2103, 맞힌 사람: 1490, 정답 비율: 51.611%

### 분류

다이나믹 프로그래밍, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>무한 수열 A는 다음과 같다.</p>

<ul>
	<li>A<sub>i</sub> = 1 (i &le; 0)</li>
	<li>A<sub>i</sub>&nbsp;= A<sub>&lfloor;i/P&rfloor;-X</sub> + A<sub>&lfloor;i/Q&rfloor;-Y</sub> (i &ge; 1)</li>
</ul>

<p>N, P, Q, X, Y가 주어질 때, A<sub>N</sub>을 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 5개의 정수 N, P, Q, X, Y가 주어진다.</p>

### 출력

<p>첫째 줄에 A<sub>N</sub>을 출력한다.</p>

### 제한

<ul>
	<li>0 &le; N &le; 10<sup>13</sup></li>
	<li>2 &le; P, Q &le; 10<sup>9</sup></li>
	<li>0 &le; X, Y &le; 10<sup>9</sup></li>
</ul>

### 힌트

<p>&lfloor;x&rfloor;는 x를 넘지 않는 가장 큰 정수이다.</p>