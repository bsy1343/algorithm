# [Platinum II] Minimizing Maximizer - 3459

[문제 링크](https://www.acmicpc.net/problem/3459)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 18, 맞힌 사람: 15, 정답 비율: 41.667%

### 분류

다이나믹 프로그래밍, 자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>The company Chris Ltd. is preparing a new sorting hardware called Maximizer. Maximizer has n inputs numbered from 1 to n. Each input represents one integer. Maximizer has one output which represents the maximum value present on Maximizer&#39;s inputs.</p>

<p>Maximizer is implemented as a pipeline of sorters Sorter(i<sub>1</sub>, j<sub>1</sub>), ..., Sorter(i<sub>k</sub>, j<sub>k</sub>). Each sorter has n inputs and n outputs. Sorter(i, j) sorts values on input i, i+1, ..., j in non-decreasing order and lets the other inputs pass through unchanged. The n-th output of the last sorter is the output of the Maximizer.</p>

<p>An intern (a former ACM contestant) observed that some sorters could be excluded from the pipeline and Maximizer would still produce the correct result. What is the length of the shortest subsequence of the given sequence of sorters in the pipeline still producing correct results for all possible combinations of input values?</p>

<p>Write a program that:</p>

<ul>
	<li>reads the description of a Maximizer, i.e. the initial sequence of sorters in the pipeline,</li>
	<li>computes the length of the shortest subsequence of the initial sequence of sorters still producing correct results for all possible input data,</li>
	<li>writes the result.</li>
</ul>

### 입력

<p>The first line of the input contains two integers n and m (2 &le; n &le; 50 000, 1 &le; m &le; 500 000) separated by a single space. Integer n is the number of inputs and integer m is the number of sorters in the pipeline. The initial sequence of sorters is described in the next m lines. The k-th of these lines contains the parameters of the k-th sorter: two integers i<sub>k</sub> and j<sub>k</sub> (1 &le; i<sub>k</sub> &lt; j<sub>k</sub> &le; n) separated by a single space.</p>

### 출력

<p>The output consists of only one line containing an integer equal to the length of the shortest subsequence of the initial sequence of sorters still producing correct results for all possible data.</p>