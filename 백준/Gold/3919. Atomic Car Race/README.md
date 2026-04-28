# [Gold III] Atomic Car Race - 3919

[문제 링크](https://www.acmicpc.net/problem/3919)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 17, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>In the year 2020, a race of atomically energized cars will be held. Unlike today&rsquo;s car races, fueling is not a concern of racing teams. Cars can run throughout the course without any refueling. Instead, the critical factor is tire (tyre). Teams should carefully plan where to change tires of their cars.</p>

<p>The race is a road race having n checkpoints in the course. Their distances from the start are a<sub>1</sub>, a<sub>2</sub>, &middot;&middot;&middot;, and a<sub>n</sub> (in kilometers). The n-th checkpoint is the goal. At the i-th checkpoint (i&lt;n), tires of a car can be changed. Of course, a team can choose whether to change or not to change tires at each checkpoint. It takes b seconds to change tires (including overhead for braking and accelerating). There is no time loss at a checkpoint if a team chooses not to change tires.</p>

<p>A car cannot run fast for a while after a tire change, because the temperature of tires is lower than the designed optimum. After running long without any tire changes, on the other hand, a car cannot run fast because worn tires cannot grip the road surface well. The time to run an interval of one kilometer from x to x + 1 is given by the following expression (in seconds). Here x is a nonnegative integer denoting the distance (in kilometers) from the latest checkpoint where tires are changed (or the start). r, v, e and f are given constants.</p>

<ul>
	<li>1/(v &minus; e &times; (x &minus; r)) (if x &ge; r)</li>
	<li>1/(v &minus; f &times; (r &minus; x)) (if x&lt;r)</li>
</ul>

<p>Your mission is to write a program to determine the best strategy of tire changes which minimizes the total time to the goal.</p>

### 입력

<p>The input consists of multiple datasets each corresponding to a race situation. The format of a dataset is as follows.</p>

<pre>
n
a<sub>1</sub> a<sub>2</sub> ... a<sub>n</sub>
b
r v e f</pre>

<p>The meaning of each of the input items is given in the problem statement. If an input line contains two or more input items, they are separated by a space.</p>

<p>n is a positive integer not exceeding 100. Each of a<sub>1</sub>, a<sub>2</sub>, &middot;&middot;&middot;, and a<sub>n</sub> is a positive integer satisfying 0 &lt; a<sub>1</sub> &lt; a<sub>2</sub> &lt; ... &lt; a<sub>n</sub> &le; 10000. b is a positive decimal fraction not exceeding 100.0. r is a nonnegative integer satisfying 0 &le; r &le; a<sub>n</sub> &minus; 1. Each of v, e and f is a positive decimal fraction. You can assume that v &minus; e &times; (a<sub>n</sub> &minus; 1 &minus; r) &ge; 0.01 and v &minus; f &times; r &ge; 0.01.</p>

<p>The end of the input is indicated by a line with a single zero.</p>

### 출력

<p>For each dataset in the input, one line containing a decimal fraction should be output. The decimal fraction should give the elapsed time at the goal (in seconds) when the best strategy is taken. An output line should not contain extra characters such as spaces.</p>

<p>The answer should not have an error greater than 0.001. You may output any number of digits after the decimal point, provided that the above accuracy condition is satisfied.</p>