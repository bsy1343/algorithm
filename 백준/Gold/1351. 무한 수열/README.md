# [Gold V] 무한 수열 - 1351

[문제 링크](https://www.acmicpc.net/problem/1351)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 17458, 정답: 6795, 맞힌 사람: 5600, 정답 비율: 38.134%

### 분류

다이나믹 프로그래밍, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>무한 수열 A는 다음과 같다.</p>

<ul>
	<li>A<sub>0</sub> = 1</li>
	<li>A<sub>i</sub> = A<sub>&lfloor;i/P&rfloor;</sub> + A<sub>&lfloor;i/Q&rfloor;</sub> (i &ge; 1)</li>
</ul>

<p>N, P와 Q가 주어질 때, A<sub>N</sub>을 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 3개의 정수 N, P, Q가 주어진다.</p>

### 출력

<p>첫째 줄에 A<sub>N</sub>을 출력한다.</p>

### 제한

<ul>
	<li>0 &le; N &le; 10<sup>12</sup></li>
	<li>2 &le; P, Q &le; 10<sup>9</sup></li>
</ul>

### 힌트

<p>&lfloor;x&rfloor;는 x를 넘지 않는 가장 큰 정수이다.</p>