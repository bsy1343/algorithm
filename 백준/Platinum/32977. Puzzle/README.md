# [Platinum II] Puzzle - 32977

[문제 링크](https://www.acmicpc.net/problem/32977)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 9, 정답: 3, 맞힌 사람: 2, 정답 비율: 28.571%

### 분류

그래프 이론, 오일러 경로, 해싱

### 문제 설명

<p>Zigmas has a rectangular jigsaw puzzle of height $H$ and width $W$. The puzzle consists of $N$ pieces. Each piece is constructed from $H$ rectangles of unit height stacked on one another. The pieces are shuffled, but neither rotated nor flipped.</p>

<p>Help Zigmas solve the puzzle by writing down how to order the pieces to get a perfect rectangle. The pieces can't be rotated or flipped, they can't overlap and there must be no gaps left.</p>

### 입력

<p>The first line contains two integers $N$ and $H$ ($2 \le N, H, N \cdot H \le 200\,000$): the number of puzzle pieces and the puzzle height, respectively.</p>

<p>Each of the remaining $N$ lines contains $2 \cdot H$ integers: $(j+1)$-st line describes the $j$-th puzzle piece as $A_{j,1}, B_{j,1}, \ldots, A_{j,H}, B_{j,H}$ ($0 \le A_{j,i} &lt; B_{j,i} \le 10^6$), where $A_{j,i}$ is the $X$-coordinate of the <em>left</em> side and $B_{j,i}$ the $X$-coordinate of the <em>right</em> side of the $i$-th rectangle of the $j$-th piece.</p>

<p>It is known that each puzzle piece is a connected figure ($A_{j,i+1} &lt; B_{j,i}$ and $A_{j,i} &lt; B_{j,i+1}$ for all $1 \le j \le N$ and $1 \le i &lt; H$).</p>

### 출력

<p>Output $N$ distinct integers, each in the range $1 \ldots N$: the numbers of the puzzle pieces in such an order that they form a perfect rectangle when laid out side by side. If there are several solutions, output any one of them. It is known that at least on soluton exists in each test case.</p>