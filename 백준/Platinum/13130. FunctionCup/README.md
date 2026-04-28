# [Platinum I] FunctionCup - 13130

[문제 링크](https://www.acmicpc.net/problem/13130)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 140, 정답: 84, 맞힌 사람: 61, 정답 비율: 62.887%

### 분류

수학, 다이나믹 프로그래밍, 조합론, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>민혁이는 집합 S = 1, 2, &hellip;, N에 대해서 함수 f : S -&gt; S를 만들었다. 민혁이가 만든 함수는 재미있는 성질을 갖고 있다.</p>

<ul>
	<li>1) f(f(&hellip;f(1)&hellip;)) = 1 (단, f는 총 A<sub>1</sub>개)</li>
	<li>2) f(f(&hellip;f(2)&hellip;)) = 2 (단, f는 총 A<sub>2</sub>개)</li>
	<li>&hellip;</li>
	<li>N) f(f(&hellip;f(N)&hellip;)) = N (단, f는 총 A<sub>N</sub>개)</li>
</ul>

<p>민혁이는 이런 성질을 만족하는 서로 다른 함수를 총 몇 개나 만들 수 있을지 궁금해졌다. 민혁이를 도와 A<sub>1</sub>, A<sub>2</sub>, &hellip;, A<sub>N</sub>이 주어졌을 때 서로 다른 함수를 총 몇 개 만들 수 있는지 구하는 프로그램을 작성하여라. 두 함수 g, h에 대해서 g(x)&ne;h(x)를 만족하는 x가 있다면 g, h는 서로 다른 함수이다.</p>

### 입력

<p>첫 번째 줄에 정의역의 크기 N이 주어진다. (3 &le; N &le; 16)</p>

<p>두 번째 줄에는 조건에 해당되는 N개의 양의 정수 A<sub>1</sub>, A<sub>2</sub>, &hellip;, A<sub>N</sub>이 주어진다. (1 &le; A<sub>i</sub> &le; 1,000,000)</p>

### 출력

<p>첫 번째 줄에 조건을 만족하도록 함수를 만드는 방법의 수를 출력한다.</p>