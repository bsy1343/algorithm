# [Platinum V] 가장 긴 증가하는 부분 수열 ks - 18892

[문제 링크](https://www.acmicpc.net/problem/18892)

### 성능 요약

시간 제한: 0.25 초, 메모리 제한: 512 MB

### 통계

제출: 864, 정답: 247, 맞힌 사람: 155, 정답 비율: 32.495%

### 분류

다이나믹 프로그래밍, 역추적

### 문제 설명

<p>N개의 정수로 이루어진 수열 A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>에서, 가장 긴 증가하는 부분 수열(LIS)의 길이를 L이라고 하자. LIS는 하나 또는 그 이상 있을 수 있다. 모든&nbsp;LIS를 사전 순으로 정렬했을 때, K번째 오는 수열을 구해보자.</p>

<p>두 LIS A<sub>i<sub>1</sub></sub>, A<sub>i<sub>2</sub></sub>, ..., A<sub>i<sub>L</sub></sub>와 A<sub>j<sub>1</sub></sub>, A<sub>j<sub>2</sub></sub>, ..., A<sub>j<sub>L</sub></sub>이 있을 때, i<sub>k</sub> &ne; j<sub>k</sub>를 만족하는 k가 하나라도 존재하면 다른 LIS이다.</p>

### 입력

<p>첫째 줄에 N과 K가 주어진다. 둘째 줄에 공백으로 구분된 A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>이&nbsp;주어진다.&nbsp;</p>

### 출력

<p>K번째 LIS를 공백으로 구분해서 출력한다. K번째 LIS가 없을 때는 -1을 출력한다.</p>

### 제한

<ul>
	<li>1 &le; N &le; 500</li>
	<li>1 &le; K &le; 10<sup>9</sup></li>
	<li>1 &le; A<sub>i</sub> &le; N</li>
	<li>수열 A에는 중복되는 수가 없다.</li>
</ul>