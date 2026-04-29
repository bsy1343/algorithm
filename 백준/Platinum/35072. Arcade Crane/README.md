# [Platinum V] Arcade Crane - 35072

[문제 링크](https://www.acmicpc.net/problem/35072)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 17, 정답: 17, 맞힌 사람: 17, 정답 비율: 100.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 브루트포스 알고리즘, 해 구성하기

### 문제 설명

<p>The local arcade just installed a new game, which is a new take on the classic claw machine. Inside the machine, there are $n$ plushies arranged in a row, and above this row there is a mechanical claw which is operated by coins. For each coin inserted into the machine, the claw can be used once to grab exactly three consecutive plushies out of the row and then re-insert them somewhere in the row. The remaining plushies can always be pushed around (without changing their order) to make room for the re-insertion. The goal of the game is to sort the plushies by cuteness, and once they are sorted, the machine opens up and the person who achieves this wins <em>all</em> the plushies.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35072.%E2%80%85Arcade%E2%80%85Crane/42b18afe.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35072-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 768px; height: 284px;"></p>

<p style="text-align: center;">Figure A.1: Illustration of Sample Output 1.</p>

<p>Uli really wants to win the plushies, so they have done some research and found out that each plushie has a distinct cuteness value from $1$ to $n$. To win, they need to sort the plushies in increasing order of these values. Equipped with the knowledge of all the cuteness values and a large stash of $5000$ coins, how can they operate the machine to ensure they win the plushies?</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($5 \leq n \leq 1000$), the number of plushies.</li>
<li>One line with $n$ distinct integers $a_1, \ldots, a_n$ ($1 \le a_i \le n$ for each $i$), where $a_i$ is the cuteness value of the $i$th plushie.</li>
</ul>

### 출력

<p>First, output an integer $q$ ($0 \le q \le 5000$), the number of operations. Then output $q$ pairs of integers $i$ and $j$ ($1 \le i,j \le n-2$), describing the operations in order. The plushie positions in the machine are indexed from $1$ to $n$. In an operation described by $i$ and $j$, the plushies at positions $i$, $i+1$ and $i+2$ are grabbed and then re-inserted into the sequence such that they are in positions $j$, $j+1$ and $j+2$ after the operation.</p>

<p>It can be shown that a solution using at most $5000$ operations always exists.</p>

<p>If there are multiple valid solutions, you may output any one of them. In particular, you do not need to minimize the number of operations.</p>