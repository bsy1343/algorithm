# [Platinum III] XOR 부분 행렬 - 16905

[문제 링크](https://www.acmicpc.net/problem/16905)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 156, 정답: 43, 맞힌 사람: 40, 정답 비율: 27.397%

### 분류

자료 구조, 트리, 트라이

### 문제 설명

<p>크기가 N인 배열 V와 크기가 M인 배열 V를 이용해서 크기가 N&times;M인 행렬 A를 만들 수 있다. 이때, A<sub>ij</sub> = V<sub>i</sub> xor U<sub>j</sub> 이다.</p>

<p>A의 부분 행렬 중에서, 부분 행렬에 포함된 원소를 모두 xor한 값이 가장 큰 것을 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 배열의 크기 N과 M이 주어진다. 둘째 줄에는 V<sub>1</sub>, V<sub>2</sub>, ..., V<sub>N</sub>이, 셋째 줄에는 U<sub>1</sub>, U<sub>2</sub>, ..., U<sub>M</sub>이 주어진다.</p>

### 출력

<p>A의 부분 행렬 중에서, 부분 행렬에 포함된 원소를 모두 xor한 값이 가장 큰 것을 출력한다.</p>

### 제한

<ul>
	<li>1 &le; N, M &le; 1,000</li>
	<li>0 &le; V<sub>i</sub>, U<sub>j</sub> &lt; 2<sup>29</sup></li>
</ul>