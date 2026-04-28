# [Gold I] 보고 정렬 - 18192

[문제 링크](https://www.acmicpc.net/problem/18192)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 614, 정답: 240, 맞힌 사람: 176, 정답 비율: 36.820%

### 분류

정렬, 무작위화

### 문제 설명

<p>Bogo sort는 정렬이 될 때까지 랜덤 셔플하는 것을 반복하는 정렬 알고리즘이다.</p>

<p>이 문제에서 Grader는 0부터 (<em>N</em> - 1)까지의 정수로 이루어진 길이 <em>N</em>의 순열 <em>A</em><sub>0</sub>, &middot;&middot;&middot;, <em>A</em><sub><em>N</em>-1</sub>를 가지고 있다. 여러분은 순열에서 어떤 연속한 구간을 잡아 랜덤 셔플하는 동작만을 반복하여 그 순열을 정렬해야 한다.</p>

<p>다행히, 랜덤 셔플이 어떻게 이루어졌는지 &#39;<em>보고</em>&#39;&nbsp;다음 동작을 결정할 수 있다.</p>

### 입력

<p>Sample Grader는 다음과 같은 정보를 표준 입력을 통하여 읽어들인다. 여러분은 어떠한 입력도 받으면 안된다.</p>

<p>첫 번째 줄에 순열의 길이를 나타내는 자연수 <em>N</em>이 주어진다.</p>

<p>두번째 줄에 <em>N</em>개의 정수 <em>A</em><sub>0</sub>, &middot;&middot;&middot;, <em>A</em><sub><em>N</em>-1</sub>가 사이에 공백을 두고 주어진다.</p>

### 출력

<p>Sample Grader는 다음과 같은 정보를 표준 출력을 통하여 출력한다. 여러분은 어떠한 출력도 하면 안된다.</p>

<p>여러분이 올바르게 순열을 정렬한 경우, Sample Grader는 첫 번째 줄에 &quot;<code>Accepted</code>&quot;를 출력한다.&nbsp;또한 두번째 줄에 두 함수 <code>copy_array</code>와&nbsp;<code>shuffle_array</code>를 호출한 횟수를 각각 출력한다.</p>

### 제한

<p>모든 입력 데이터는 다음 조건을 만족한다.</p>

<ul>
	<li>1 &le;&nbsp;<em>N</em>&nbsp;&le;&nbsp;200</li>
	<li>0 &le;&nbsp;<em>A<sub>i</sub></em> &lt; <em>N</em>&nbsp;(0 &le; <em>i</em> &lt; <em>N</em>)</li>
	<li><em>A<sub>i</sub></em>&nbsp;&ne;&nbsp;<em>A<sub>j</sub></em>&nbsp;(0 &le; <em>i</em> &lt; <em>j</em> &lt;&nbsp;<em>N</em>)</li>
</ul>