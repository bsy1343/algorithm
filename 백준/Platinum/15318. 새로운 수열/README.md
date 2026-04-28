# [Platinum V] 새로운 수열 - 15318

[문제 링크](https://www.acmicpc.net/problem/15318)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 458, 정답: 160, 맞힌 사람: 108, 정답 비율: 35.410%

### 분류

수학, 누적 합

### 문제 설명

<p>다음과 같은 수열 A가 주어졌을 때,</p>

<p style="text-align:center">A = {a<sub>0</sub>, a<sub>1</sub>, ..., a<sub>N-2</sub>, a<sub>N-1</sub>}</p>

<p>새로운 수열 B는 다음과 같이 정의된다.</p>

<p style="text-align:center">B = {b<sub>0</sub>, b<sub>1</sub>, ..., b<sub>N-2</sub>, b<sub>N-1</sub>}</p>

<p style="text-align:center">\[b_i = \sum_{k=0}^{N-1}{((-1)^k \times (k+1) \times a_{(i+k)\%N})}\]</p>

<p>수열 A가 주어지면, 수열 B를 구해보자.</p>

### 입력

<p>첫 줄에 N(1 &le; N &le; 300,000)이 주어진다. 두 번째 줄에 N개의 정수 a<sub>i</sub> (|a<sub>i</sub>| &le;&nbsp;10<sup>9</sup>)가 공백으로 구분되어 주어진다.</p>

### 출력

<p>첫 번째 줄에 수열 B를 구성하는 N개의 정수 b<sub>i</sub>를 공백으로 구분하여 출력한다. |b<sub>i</sub>| &le; 10<sup>18</sup>인 입력만 주어진다.</p>

### 힌트

<p>예제1에서 의 B는 다음과 같이 구해진다.</p>

<ul>
	<li>b<sub>0</sub> = 4 &ndash; 2 + (-9) = -7</li>
	<li>b<sub>1</sub> = 1 &ndash; (-6) + 12 = 19</li>
	<li>b<sub>2</sub> = (-3) &ndash; 8 + 3 = -8</li>
</ul>