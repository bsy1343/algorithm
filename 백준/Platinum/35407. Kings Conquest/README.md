# [Platinum V] Kings Conquest - 35407

[문제 링크](https://www.acmicpc.net/problem/35407)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 2048 MB

### 통계

제출: 20, 정답: 12, 맞힌 사람: 12, 정답 비율: 70.588%

### 분류

많은 조건 분기, 세그먼트 트리, 자료 구조

### 문제 설명

<p>There are $N$ chess kings placed in an infinite grid. Each of them occupies a different cell. The conquered area of the grid is defined as the number of cells in the smallest rectangular subgrid that contains all the cells occupied by the kings. The picture below shows two scenarios; on the left, the conquered area is $12$; on the right, it is $16$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35407.%E2%80%85Kings%E2%80%85Conquest/e22a4704.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35407-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 377px; height: 156px;"></p>

<p>You are allowed to perform a sequence of $K$ moves. In each move, you select any king and move it to any of its eight adjacent cells, as a regular king moves in chess. No two kings may occupy the same cell at the same time.</p>

<p>What is the largest conquered area that can be achieved after performing $K$ moves?</p>

### 입력

<p>The first line contains two integers $N$ and $K$ ($1 \le N, K \le 10^5$).</p>

<p>Each of the next $N$ lines contains two integers $R$ and $C$ ($-10^6 \le R, C \le 10^6$), indicating that a king occupies the cell at row $R$ and column $C$. It is guaranteed that all kings occupy different cells.</p>

<p> </p>

### 출력

<p>Output a single line with an integer representing the largest conquered area that can be achieved after performing $K$ moves.</p>