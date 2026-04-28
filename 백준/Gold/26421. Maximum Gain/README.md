# [Gold IV] Maximum Gain - 26421

[문제 링크](https://www.acmicpc.net/problem/26421)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 23, 맞힌 사람: 20, 정답 비율: 74.074%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Charles is participating in an event of <a href="https://goo.gle/cs-kick-start-2022" target="_blank">Crowdsource </a>tasks and he is most enthusiastic to gain the maximum points from there! There are two Crowdsource tasks: Audio Validation Task and Image Labeler Task. Each task consists of a list of questions. Charles is given two arrays ($\mathbf{A}$ and $\mathbf{B}$) representing the two tasks. Each element of an array indicates the number of points that Charles will gain by answering the corresponding question.</p>

<p>Charles is allowed to answer $\mathbf{K}$ questions in total, from both tasks, one at a time. At each step, he is allowed to choose a task (that is, choose one of the two arrays) that has remaining unanswered questions. He is then allowed to answer either the first or the last question, from the list of remaining questions of this task. Once he answers the question, he gets the corresponding points and the answered question is removed from the task.</p>

<p>Can you help Charles choose the questions that will give him the maximum possible points?</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow.</p>

<p>The first line of each test case contains an integer $\mathbf{N}$, which denotes the number of elements in the first array.</p>

<p>The second line of each test case contains $\mathbf{N}$ integers $\mathbf{A_1}, \mathbf{A_2}, \dots, \mathbf{A_N}$. $\mathbf{A_i}$ denotes the points gained for answering the $i$-th question of Audio Validation Task.</p>

<p>The third line of each test case contains an integer $\mathbf{M}$, which denotes the number of elements in the second array.</p>

<p>The fourth line of each test case contains $\mathbf{M}$ integers $\mathbf{B_1}, \mathbf{B_2}, \dots, \mathbf{B_M}$. $\mathbf{B_i}$ denotes the points gained for answering the $i$-th question of Image Labeler Task.</p>

<p>The fifth line of each test case contains an integer $\mathbf{K}$, which denotes the number of elements to be selected in total, from both arrays, using the process described above.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the maximum number of points that Charles can gain in this test case.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le \mathbf{N} \le 6000$.</li>
	<li>$1 \le \mathbf{M} \le 6000$.</li>
	<li>$1 \le \mathbf{A_i}, \mathbf{B_i} \le 10^9$, for all $i$.</li>
	<li>$1 \le \mathbf{K} \le \mathbf{N}+\mathbf{M}$.</li>
</ul>