# [Platinum V] Aerobatics - 1 - 21779

[문제 링크](https://www.acmicpc.net/problem/21779)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 23, 맞힌 사람: 23, 정답 비율: 43.396%

### 분류

다이나믹 프로그래밍, 기하학, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 외판원 순회 문제

### 문제 설명

<p>Bitaro will participate in an aerobatics competition. In this competition, Bitaro will fly an airplane. The airplane will keep a certain altitude, and pass through the checkpoints. The area where the airplane will fly is considered as a coordinate plane. There are $N$ checkpoints, numbered from $1$ to $N$. The coordinate of the checkpoint $i$ ($1 \le i \le N$) is ($X_i, Y_i$).</p>

<p>During the competition, the airplane must pass through each checkpoint once. More precisely, the airplane must fly in the following way.</p>

<ol>
	<li>First, Bitaro chooses the starting checkpoint, and the airplane will start flying from there.</li>
	<li>Repeat the following $N - 1$ times. Among the checkpoints which are not yet chosen, Bitaro chooses a checkpoint as the next checkpoint. Then the airplane will fly straight from the current checkpoint to the next checkpoint.</li>
	<li>When the airplane arrived at the last checkpoint, the flight is finished.</li>
</ol>

<p>Here, in the step 2, we consider the starting checkpoint as an already chosen checkpoint. The airplane must fly straight from a checkpoint to the next checkpoint. It is forbidden to draw a curve or make a turn on the way.</p>

<p>The route of the airplane is a polygonal line. During the flight, the airplane will change its direction at most&nbsp;$N - 2$ times. If the angle of the polygonal line at a checkpoint is small, the change of the direction of the airplane at that checkpoint is large, and there is a risk of failure of the flight.</p>

<p>Therefore, Bitaro wants to make the minimum angle of the polygonal line at the $N - 2$ checkpoints, except for the starting checkpoint and the last checkpoint, as large as possible.</p>

<p>Given the coordinates of the checkpoints, find an order of the checkpoints to pass so that the minimum angle of the polygonal line is as large as possible.</p>

### 입력

<p>The input data is given in the following format. Given values are all integers. Here, $Z_0$ is a parameter used by the grader.</p>

<blockquote>
<p>$N Z_0$</p>

<p>$X_1 Y_1$</p>

<p>$\vdots$</p>

<p>$X_N Y_N$</p>
</blockquote>

### 출력

<p>The output should consist of $N$ lines. The $k$-th line ($1 \le k \le N$) of the output should contain the integer $P_k$&nbsp;($1 \le P_k&nbsp;\le N$), which is the $k$-th checkpoint in the route of the airplane. Here, the starting checkpoint is the first checkpoint $P_1$.</p>

### 제한

<ul>
	<li>$3 \le N \le 1 000$.</li>
	<li>$\sqrt{X_i^2 + Y_i^2} \le 10 000 000$ ($1 \le i \le N$).</li>
	<li>($X_i, Y_i$) $\ne$ ($X_j, Y_j$) ($1 \le i &lt; j \le N$).</li>
	<li>$1 \le Z_0 \le 179$.</li>
</ul>