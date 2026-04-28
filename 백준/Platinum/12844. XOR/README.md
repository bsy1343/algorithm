# [Platinum III] XOR - 12844

[문제 링크](https://www.acmicpc.net/problem/12844)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 9182, 정답: 3785, 맞힌 사람: 2505, 정답 비율: 37.305%

### 분류

자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>크기가 N인 수열 A<sub>0</sub>, A<sub>1</sub>, ..., A<sub>N-1</sub>이 주어졌을 때, 다음 두 종류의 쿼리를 수행해보자.</p>

<ul>
	<li><code>1 i&nbsp;j k</code>: A<sub>i</sub>, A<sub>i+1</sub>, ..., A<sub>j</sub>에 k를 xor한다.</li>
	<li><code>2 i j</code>: A<sub>i</sub>, A<sub>i+1</sub>, ..., A<sub>j</sub>를 모두 xor한 다음 출력한다.</li>
</ul>

### 입력

<p>첫 번째 줄에 수열의 크기 N이 주어진다.</p>

<p>두 번째 줄에는 A<sub>0</sub>, A<sub>1</sub>, ..., A<sub>N-1</sub>이 차례대로 주어지며, 공백 한 칸으로 구분되어져 있다.</p>

<p>세 번째 줄에는 쿼리의 개수 M이 주어지고, 다음 M개의 줄에 쿼리가 한 줄에 하나씩 주어진다.</p>

### 출력

<p>2번 쿼리의 결과를 모두 출력한다.</p>

### 제한

<ul>
	<li>1 &le; N, M &le; 500,000</li>
	<li>0 &le; A<sub>i</sub> &le; 100,000</li>
	<li>A<sub>i</sub>는 정수</li>
	<li>쿼리 1, 2
	<ul>
		<li>0 &le; i &le; j &lt; N</li>
	</ul>
	</li>
	<li>쿼리 1
	<ul>
		<li>0 &le; k &le; 100,000</li>
		<li>k는 정수</li>
	</ul>
	</li>
</ul>