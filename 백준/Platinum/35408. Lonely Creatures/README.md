# [Platinum III] Lonely Creatures - 35408

[문제 링크](https://www.acmicpc.net/problem/35408)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 19, 정답: 8, 맞힌 사람: 7, 정답 비율: 43.750%

### 분류

값 / 좌표 압축, 기하학, 세그먼트 트리, 자료 구조

### 문제 설명

<p>There are $N$ creatures, numbered from $1$ to $N$, that live in an infinite city represented by the 2D plane. Creature $i$ lives on the straight line $y = M_i \cdot x + C_i$; it may move anywhere along that line. No two creatures share the same line, but a meeting occurs if their lines intersect. In that case, the intersection point is called a <em>meeting point</em> of the two creatures.</p>

<p>The city has just built a new playground. The playground’s boundary is the (axis-aligned) parabola $y = A \cdot x^2 + B$, where $A &gt; 0$. The playground is the open region $y &gt; A \cdot x^2 + B$, so points exactly on the boundary are not inside the playground.</p>

<p>Now the city officials want to know whether the new playground is reducing loneliness, and that’s where your help is needed. Your task is to count how many distinct pairs of creatures have a meeting point that lies strictly inside the playground. Each pair is counted once; the order of the creatures in a pair does not matter.</p>

### 입력

<p>The first line contains three integers $N$ ($2 \le N \le 10^5$), $A$ ($1 \le A \le 10^4$) and $B$ ($-10^4 \le B \le 10^4$), indicating that there are $N$ creatures and that the playground is the open region of the 2D plane $y &gt; A \cdot x^2 + B$. Each creature is identified by a distinct integer from $1$ to $N$.</p>

<p>The $i$-th of the next $N$ lines contains two integers $M_i$ and $C_i$ ($-10^4 \le M_i, C_i \le 10^4$), representing that creature $i$ lives on the straight line $y = M_i \cdot x + C_i$. It is guaranteed that no two lines are identical.</p>

### 출력

<p>Output a single line with an integer indicating the number of distinct pairs of creatures whose meeting point lies strictly inside the playground.</p>