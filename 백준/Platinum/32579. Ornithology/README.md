# [Platinum V] Ornithology - 32579

[문제 링크](https://www.acmicpc.net/problem/32579)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 43, 정답: 28, 맞힌 사람: 28, 정답 비율: 66.667%

### 분류

세그먼트 트리, 자료 구조

### 문제 설명

<p>On the outskirts of the town, close to the farm, there stand two parallel power lines, separated by a narrow dirt road. The power lines were a favorite resting spot for a variety of birds.</p>

<p>Today, on this cool autumn morning, the lines are filled with a group of birds. On the first line there are $n$ consecutive positions for birds numbered $0, 1, \dots , n - 1$. On the second power line there are also $n$ positions numbered in the same manner.</p>

<p>Initially, every position of the first line is occupied by some birds (possibly zero) and there are no birds on the second power line. Each bird has its desired position to fly to on the second line. No two birds on the same position on the first line share the same desired position.</p>

<p>At one moment, all the birds at once will decide to fly to their desired positions. Every bird flies along the straight line segment connecting its initial and desired position.</p>

<p>It can happen that some pairs of birds crash into each other during their flight. This can happen when their corresponding line segments cross. We shall call such unordered pair of birds <em>dangerous</em> pair.</p>

<p>For example, if a bird on position $2$ wants to go to position $1$ and the bird on position 1 wants to go to position $2$, their paths cross.</p>

<p>The birds will not collide if their paths have the same desired position (on the second line) or if they start from the same position (on the first line). In other words a pair of birds with the same initial or desired positions is not considered a dangerous pair.</p>

<p>The task is very simple. Compute the number of dangerous pairs of birds.</p>

### 입력

<p>First line of input contains an integer $n$ ($1 ≤ n ≤ 2 \cdot 10^5$) representing the number of positions on both power lines.</p>

<p>Each of the next $n$ lines describe the desired positions of the birds. The $i$-th line starts with an integer $p_i$ ($0 ≤ p_i ≤ n$) representing the number of birds on position $i$.</p>

<p>Then, there are $p_i$ distinct numbers $q_{i,1}, \dots , q_{i,p_i}$ ($0 ≤ q_{i,j} ≤ n-1$) representing the desired places of the $p_i$ birds.</p>

<p>It is guaranteed that the sum $\sum_{i=0}^{n-1}{p_i}$ does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>Output exactly one line containing one integer – the number of dangerous pairs of birds.</p>