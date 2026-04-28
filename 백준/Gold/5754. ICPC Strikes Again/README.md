# [Gold I] ICPC Strikes Again - 5754

[문제 링크](https://www.acmicpc.net/problem/5754)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

그래프 이론, 위상 정렬, 방향 비순환 그래프

### 문제 설명

<p>International Concrete Projects Company (ICPC) is a construction company which specializes in building houses for the high-end market. The company is the most profitable company in the world due to a very efficient land division method which has been used in its housing development projects since last year. Recently there was a chaos at ICPC, because employees refused to work arguing that they did not earn enough. Worried about the loss in profit due to the strike, the company board proposed a new method to calculate the salaries which was luckily accepted by everyone.</p>

<p>The salary of a worker reflects the significance of the tasks that he/she has to perform and is influenced by the way tasks depend on each other.</p>

<p>A task X depends on a task Y if either (i) X depends directly on Y , or (ii) there exists a task T such that X depends directly on T and T depends on Y . Since in ICPC all tasks must be performed, there is no circularity in the task dependence relation. Also, a task may be performed by more than one worker.</p>

<p>A basic significance is associated with each task reflecting its importance (for example, developing the efficient land division method is more important than building the houses themselves). The significance of a task T is then defined as the basic significance of T plus the significance of every task which depends directly on T. Note that if no other tasks depend directly on task T, the basic significance and the significance of T are the same.</p>

<p>The salary of a worker is the sum of the significances of all the tasks he/she performs which do not depend on any other task performed by him/her. In other words, a value equal to the significance of task X will be added to the salary of a worker W that works in task X if there is no other task Y on which X depends, and W works also in Y .</p>

<p>ICPC wants you to help them to determine the salary of each of its employees.</p>

### 입력

<p>The input contains several test cases.</p>

<p>The first line of a test case contains two integers T and E indicating respectively the number of tasks and the number of employees (1 &le; T &le; 1000 and 1 &le; E &le; 1000). Tasks are numbered from 1 to T and employees from 1 to E.</p>

<p>Then it will come a sequence of lines describing the tasks 1 to T in ascending order. Each task is described by two lines. The first of these lines contains three integers BS, ND and NE, representing respectively the basic significance of the task, the number of tasks that depend directly on it, and the number of employees who perform it (1 &le; BS &le; 1000, 0 &le; ND &lt; T and 1 &le; NE &le; E). The second line contains ND +NE integers corresponding first to the ND directly dependent tasks and then the NE employees who perform the task.</p>

<p>The end of input is indicated by T = E = 0.</p>

### 출력

<p>Test cases must be answered in the order that they were presented. For each test case you must print:</p>

<ul>
	<li>a single line containing five stars ***** indicating the beginning of the case</li>
	<li>for each employee i, one line with two integers i and s, separated by a blank, meaning that i has a salary of s.</li>
</ul>