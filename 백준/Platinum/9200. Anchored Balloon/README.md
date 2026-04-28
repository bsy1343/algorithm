# [Platinum II] Anchored Balloon - 9200

[문제 링크](https://www.acmicpc.net/problem/9200)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 14, 맞힌 사람: 10, 정답 비율: 37.037%

### 분류

수학, 브루트포스 알고리즘, 기하학, 삼분 탐색, 물리학

### 문제 설명

<p>A balloon placed on the ground is connected to one or more anchors on the ground with ropes. Each rope is long enough to connect the balloon and the anchor. No two ropes cross each other. Figure E-1 shows such a situation.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9200.%E2%80%85Anchored%E2%80%85Balloon/f1ebf9e6.png" data-original-src="https://upload.acmicpc.net/94212498-8776-4b0b-b56a-4573925113f6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Figure E-1: A balloon and ropes on the ground</p>

<p>Now the balloon takes off, and your task is to find how high the balloon can go up with keeping the rope connections. The positions of the anchors are fixed. The lengths of the ropes and the positions of the anchors are given. You may assume that these ropes have no weight and thus can be straightened up when pulled to whichever directions. Figure E-2 shows the highest position of the balloon for the situation shown in Figure E-1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9200.%E2%80%85Anchored%E2%80%85Balloon/618eabb4.png" data-original-src="https://upload.acmicpc.net/2fb5976b-1c39-4c8f-899c-300664c696ea/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Figure E-2: The highest position of the balloon</p>

### 입력

<p>The input consists of multiple datasets, each in the following format.</p>

<pre>
<i>n</i>
<i>x</i><sub>1</sub> <i>y</i><sub>1</sub> <i>l</i><sub>1</sub>
...
<i>x</i><sub><i>n</i></sub> <i>y</i><sub><i>n</i></sub> <i>l</i><sub><i>n</i></sub></pre>

<p>The first line of a dataset contains an integer <i>n</i> (1 &le; <i>n</i> &le; 10) representing the number of the ropes. Each of the following <i>n</i> lines contains three integers, <i>x</i><sub><i>i</i></sub>, <i>y</i><sub><i>i</i></sub>, and <i>l</i><sub><i>i</i></sub>, separated by a single space. <i>P</i><sub><i>i</i></sub> = (<i>x</i><sub><i>i</i></sub>, <i>y</i><sub><i>i</i></sub>) represents the position of the anchor connecting the <i>i</i>-th rope, and <i>l</i><sub><i>i</i></sub> represents the length of the rope. You can assume that &minus;100 &le; <i>x</i><sub><i>i</i></sub> &le; 100, &minus;100 &le; <i>y</i><sub><i>i</i></sub> &le; 100, and 1 &le; <i>l</i><sub><i>i</i></sub> &le; 300. The balloon is initially placed at (0, 0) on the ground. You can ignore the size of the balloon and the anchors.</p>

<p>You can assume that <i>P</i><sub><i>i</i></sub> and <i>P</i><sub><i>j</i></sub> represent different positions if <i>i</i> &ne; <i>j</i>. You can also assume that the distance between <i>P</i><sub><i>i</i></sub> and (0, 0) is less than or equal to <i>l</i><sub><i>i</i></sub>&minus;1. This means that the balloon can go up at least 1 unit high.</p>

<p>Figures E-1 and E-2 correspond to the first dataset of Sample Input below.</p>

<p>The end of the input is indicated by a line containing a zero.</p>

### 출력

<p>For each dataset, output a single line containing the maximum height that the balloon can go up. The error of the value should be no greater than 0.00001. No extra characters should appear in the output.</p>