# [Gold IV] Boarding Queue - 34613

[문제 링크](https://www.acmicpc.net/problem/34613)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 45, 정답: 31, 맞힌 사람: 26, 정답 비율: 76.471%

### 분류

구현

### 문제 설명

<p>You are on your way to compete in The 2025 ICPC Asia Pacific Championship. Unfortunately, you are in the process of the worst part of flying: waiting in the boarding queue.</p>

<p>You are in a queue with $n$ travelers, numbered from $1$ to $n$ ordered from the front of the queue to the back of the queue.</p>

<p>The boarding area is represented by a grid of $r$ rows and $c$ columns, where the rows are numbered from $1$ to $r$ (top to bottom) and the columns are numbered from $1$ to $c$ (left to right). Each traveler occupies exactly one distinct cell in the grid. Two travelers are <em>adjacent</em> if the cells they are in share an edge. Traveler $t$ and traveler $t − 1$ are guaranteed to be adjacent, for any $2 ≤ t ≤ n$.</p>

<p>For example, Figure L.1 illustrates a possible location of the travelers. In this example, traveler $1$ is adjacent to travelers $2$ and $10$ but not adjacent to traveler $11$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34613.%E2%80%85Boarding%E2%80%85Queue/af982d73.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34613-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 178px; height: 145px;"></p>

<p style="text-align: center;">Figure L.1: Example location of the travelers.</p>

<p>At each boarding step, all of the following happen simultaneously:</p>

<ul>
<li>The frontmost traveler in the queue, say traveler $t$, boards the aircraft and leaves the boarding area.</li>
<li>For each $t'$ ($t + 1 ≤ t' ≤ n$), traveler $t'$ takes the cell that traveler $t' − 1$ was occupying immediately before the step.</li>
</ul>

<p>For example, Figure L.2 illustrates the locations of the travelers after the first three boarding steps from the initial location above.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34613.%E2%80%85Boarding%E2%80%85Queue/dc99fee7.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34613-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 560px; height: 145px;"></p>

<p style="text-align: center;">Figure L.2: Location of the travelers after $1$, $2$, and $3$ boarding steps respectively.</p>

<p>You are traveler $p$ (that is, there are $p − 1$ travelers in front of you). You know that your team coach is somewhere in the queue, but you do not know where. Assuming your team coach is equally likely to be any of travelers $1$ to $n$ (except $p$), you want to calculate the probability that you will be adjacent to your team coach at some point before you board the aircraft. Formally, you will be adjacent to traveler $q$ at some point before you board the aircraft if there exists an integer $s$ ($0 ≤ s &lt; p$) such that traveler $p$ and traveler $q$ are adjacent after s boarding steps.</p>

### 입력

<p>The first line of input contains four integers $r$, $c$, $n$, and $p$ ($1 ≤ r, c ≤ 1000$; $2 ≤ n ≤ r \times c$; $1 ≤ p ≤ n$). Each of the next $r$ lines contains $c$ integers. The $j$-th integer in the $i$-th line denotes $G_{i,j}$ ($0 ≤ G_{i,j} ≤ n$), where a non-zero value of $G_{i,j}$ means that traveler $G_{i,j}$ initially occupies the cell at row $i$ and column $j$ of the boarding area, while a zero value of $G_{i,j}$ means that no traveler occupies the cell. Across all pairs $(i, j)$, each of the integers $1$ to $n$ appears exactly once in $G_{i,j}$. The input guarantees that traveler $t$ and traveler $t − 1$ are adjacent, for all $2 ≤ t ≤ n$.</p>

### 출력

<p>Output a fraction in the $x/y$ format indicating the probability that you will be adjacent to your team coach at some point before you board the aircraft. The value of $y$ must be equal to $n − 1$. Note that there must not be spaces between the integers and the <code>/</code> delimiter.</p>