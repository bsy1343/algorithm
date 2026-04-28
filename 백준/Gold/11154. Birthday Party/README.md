# [Gold I] Birthday Party - 11154

[문제 링크](https://www.acmicpc.net/problem/11154)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 44, 정답: 27, 맞힌 사람: 21, 정답 비율: 65.625%

### 분류

수학, 그래프 이론, 조합론, 확률론, 포함 배제의 원리

### 문제 설명

<p>N persons have been invited to a somewhat special birthday party. Each person brings one present, but the recipent of each present is determined randomly. A person never receives his own present, but all other persons are equally likely recipients. What is the probability that one can find k persons at the party such that person 1 gives his present to person 2, person 2 gives his present to person 3 and so on to person k which gives his present to person 1?</p>

### 입력

<p>The first line of the input consists of a single integer T, the number of test cases. Each test case consists of two integers N and k.</p>

<ul>
	<li>0 &lt; T &le; 30</li>
	<li>2 &le; N &le; 10000000</li>
	<li>2 &le; k &le; N</li>
</ul>

### 출력

<p>For each test case, output the probability with an accuracy of at least 10<sup>&minus;6</sup>.</p>