# [Silver II] Industry Improvements - 32616

[문제 링크](https://www.acmicpc.net/problem/32616)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 67, 정답: 32, 맞힌 사람: 27, 정답 비율: 44.262%

### 분류

매개 변수 탐색, 이분 탐색

### 문제 설명

<p>As a member of the Factory Planning Committee, you are responsible for overseeing the production process and ensuring that everything runs smoothly.</p>

<p>The committee aims to guarantee efficient processing of boxes by the machines in the production line without breakdowns. You recognise that a machine is more prone to breaking down when handling heavier objects, and therefore, propose to set a maximum weight capacity for the machines. Considering budget constraints, the committee also agrees to limit the number of times a machine can be started to no more than $k$ times.</p>

<p>Your task is to determine the minimum weight capacity required for a machine line to process all boxes, while ensuring that the machine line is started no more than $k$ times and the boxes are processed in the given order.</p>

<p>As an example, consider the first sample input. We can process all boxes by splitting the boxes in these three contiguous subsequences: $$\{7\}, \{3, 2, 3\}, \{1, 4\}$$ With this split, the capacity of the machine needs to be $8$ units of weight.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $k$ ($1 \leq n \leq 10^5$, $1 \leq k \leq 10^3$), the number of boxes and the number of times the machine can be started.</li>
	<li>One line with $n$ integers $x$ ($1 \leq x \leq 10^{10}$), the weights of the boxes, in the order in which they need to be processed.</li>
</ul>

### 출력

<p>Output the minimum weight capacity required by the machine to process all boxes within $k$ runs or less.</p>