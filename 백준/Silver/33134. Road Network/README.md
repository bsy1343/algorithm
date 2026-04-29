# [Silver II] Road Network - 33134

[문제 링크](https://www.acmicpc.net/problem/33134)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 31, 정답: 24, 맞힌 사람: 23, 정답 비율: 76.667%

### 분류

그래프 이론, 그래프 탐색

### 문제 설명

<p>There are $N$ cities and $N$ two-way roads in Potokoland. The cities are numbered from $0$ to $N-1$. The roads are also numbered from $0$ to $N-1$. The road number $i$ connects cities $i$ and $(3 \cdot i + 7) \bmod N$, where $x \bmod N$ is the remainder from dividing $x$ by $N$.</p>

<p>Determine if it is possible to travel from any city to any other city using the roads. If not, find a pair of cities that are not connected.</p>

### 입력

<p>The first line contains $N$ ($1 \le N \le 10^6$), the number of cities in Potokoland.</p>

### 출력

<p>Output the word '<code>YES</code>' if it is possible to travel from any city to any other city.</p>

<p>Otherwise, output the word '<code>NO</code>' on the first line. On the second line, output any two cities $A$ and $B$ ($0 \le A, B \le N-1$; $A \ne B$) such that it is impossible to travel from $A$ to $B$ using the roads. If there are several possible answers, output any one of them.</p>