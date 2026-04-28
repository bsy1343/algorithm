# [Platinum I] 직사각형 색칠 - 14275

[문제 링크](https://www.acmicpc.net/problem/14275)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 79, 정답: 59, 맞힌 사람: 47, 정답 비율: 83.929%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>단위 정사각형으로 나누어져 있는 N&times;M 크기의 직사각형이 주어졌을 때, 아래 조건을 만족하게 색칠하는 방법의 수를 구하는 프로그램을 작성하시오.</p>

<ul>
	<li>모든 칸은 색칠되어 있거나 비어있어야 한다.</li>
	<li>색칠된 칸과 인접한 색칠된 칸의 개수는 짝수가 되어야 한다.</li>
</ul>

<p>아래 그림은 N=4, M=7인 경우의 예이다. (노란색: 색칠, 검정색: 빈 칸)</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/d7acfe95-8e12-45c5-9cc1-6ec7493efc30/-/preview/" style="width: 428px; height: 250px;" /></p>

<p>N과 M이 주어졌을 때, 색칠하는 방법의 수를 구하는 프로그램을 작성하시오.&nbsp;</p>

### 입력

<p>첫째 줄에 N과 M이 주어진다. (1 &le; N &le; 100, 1 &le; M &le; 8)</p>

### 출력

<p>첫째 줄에 입력으로 주어진 직사각형을 색칠하는 방법의 수를 1,000,000,007로 나눈 나머지를 출력한다.</p>

### 힌트

<p>예제 2의 경우 아래와 같은 8가지 방법이 가능하다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/bf151c88-e762-40d8-98f9-1b5411c3e52e/-/preview/" style="width: 605px; height: 300px;" /></p>