# [Gold I] Pasture 7 - 29858

[문제 링크](https://www.acmicpc.net/problem/29858)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

기하학, 그리디 알고리즘, 구현, 시뮬레이션

### 문제 설명

<p>Farmer John has $N$ posts on his pasture. The pasture can be modeled as a coordinate plane where each post has integer coordinates.</p>

<p>John wants to connect the posts with wire segments that do not cross (in other words, the wire segments may only touch at their common endpoints) and form a number of triangular enclosures for his sheep. The sheep are fairly selfish, so each of them needs to be in a separate enclosure.</p>

<p>As the business is not going particularly well at the moment, John would like to use as litte wire as possible. Help him arrange the wire segments so that the total length of wire used is as small as possible, but he can accommodate the maximal number of sheep. John has a limited amount of wire and cannot use more than that.</p>

### 입력

<p>The first line contains $N$, the number of posts on the pasture ($3 \le N \le 10\,000$), and the integer $M$, the total length of wire that John has ($1 \le M \le 10^{10}$). Each of the following $N$ lines contains two integers $X_i$ and $Y_i$, the coordinates of one fencepost ($-10^5 \le X_i, Y_i \le 10^5$). The posts are numbered $1 \ldots N$ in the order of their appearance in the input.</p>

### 출력

<p>The first line should contain $K$, the number of wire segments, and $L$, the total length of wire spent. Each of the following $K$ lines should contain two integers $A$ and $B$, indicating that one of the wire segments should connect the posts $A$ and $B$. The total length of wire, $L$, should be given with exactly $6$ decimal digits.</p>