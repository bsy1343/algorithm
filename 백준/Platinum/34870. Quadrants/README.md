# [Platinum I] Quadrants - 34870

[문제 링크](https://www.acmicpc.net/problem/34870)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 81, 정답: 46, 맞힌 사람: 38, 정답 비율: 69.091%

### 분류

각도 정렬, 기하학, 두 포인터, 스위핑, 정렬, 차분 배열 트릭

### 문제 설명

<p>This problem is about quadrants. What are quadrants? Let us begin with any two perpendicular lines $\ell$ and $\ell '$ in the plane $\mathbb{R}^2$. If you subtract the two lines $\ell$ and $\ell '$ from the whole plane $\mathbb{R}^2$, you obtain four connected, unbounded regions. Each of the four regions is called a quadrant. Note that the boundary of a quadrant does not belong to itself.</p>

<p>Now, consider a set $P$ of points in the plane $\mathbb{R}^2$. We are interested in quadrants defined by the set $P$ of points. Specifically, let $\mathcal{Q}$ be the set of quadrants $Q$ such that the boundary of $Q$ contains exactly three points of $P$. Each quadrant $Q ∈ \mathcal{Q}$ is called a $k$-quadrant if $Q$ contains exactly $k$ points of $P$ in its interior. The figure below shows an example in which the set $P$ consists of $14$ points (small circles) and you can see a $5$-quadrant $Q ∈ \mathcal{Q}$ (shaded in cyan), whose boundary contains three points $p, q, r ∈ P$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34870.%E2%80%85Quadrants/5c979ac3.png" data-original-src="https://boja.mercury.kr/assets/problem/34870-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 171px;"></p>

<p>Given a set $P$ of $n$ points as input, write a program that computes the number of $k$-quadrants for every $0 ≤ k ≤ n − 3$.</p>

### 입력

<p>Your program is to read from standard input. The input starts with a line containing a single integer $n$ ($3 ≤ n ≤ 2\,000$), where $n$ is the number of points in the input set $P$. In each of the following $n$ lines, given are two integers $x$ and $y$, both ranging from $−10^6$ to $10^6$, inclusively, that represent the $x$- and $y$-coordinates of an input point $(x, y)$ in $P$. You may assume that no two input points have the same coordinates, that there are no three points in $P$ lying in a line, and that there are no two perpendicular lines $\ell$ and $\ell '$ in the plane $\mathbb{R}^2$ such that $| \ell ∩ P| ≥ 2$ and $|\ell ' ∩ P| ≥ 2$.</p>

### 출력

<p>Your program is to write to standard output. Print exactly $n − 2$ lines. The $i$-th line of your output for each $1 ≤ i ≤ n − 2$ must contain a single integer that represents the number of $(i − 1)$-quadrants with respect to the input set $P$ of $n$ points.</p>