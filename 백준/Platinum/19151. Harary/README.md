# [Platinum II] Harary - 19151

[문제 링크](https://www.acmicpc.net/problem/19151)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 42, 정답: 17, 맞힌 사람: 17, 정답 비율: 50.000%

### 분류

수학, 조합론

### 문제 설명

<p>Frank enjoys counting graphs with given properties so much that, he even plans to write a book about it one day. He likes to invent new complicated problems in this area, however, coding the solutions is not his favorite part.</p>

<p>Right now, Frank is preparing many versions of a single task for an exam. He wants students to find the number of valid topological orderings of a given directed graph with $N$ nodes.</p>

<p>A <em>topological ordering</em>&nbsp;of a directed graph is a permutation of its vertices such that, for every arc from vertex $u_i$ to vertex $v_i$, $u_i$ comes before $v_i$ in the permutation. Two orderings are considered different if there exists a vertex which has different positions in the first ordering and in the second one, in other words, if they differ as permutations.</p>

<p>Frank considers the task to be easy if the answer is one, medium if the answer is two, and hard if the answer is three. For larger answers, he thinks the task is almost impossible to solve. He also doesn&#39;t treat all his students equally, as some of them have visited all the classes, and some will see him for the first time on the exam. However, he doesn&#39;t want students to notice his small revenge, so everybody will have the same value of $N$ in their versions of the task.</p>

<p>Now Frank asks you to count, for a fixed $N$, how many versions of the task he could prepare for each difficulty level. As these numbers can be very large, Frank wants to know them modulo $10^9 + 7$. Note that the number of arcs can be arbitrary, but self-loops and multiple edges are not allowed.</p>

### 입력

<p>The input contains a single integer $N$, the number of vertices ($1 \leq N \leq 100$).</p>

### 출력

<p>Output three integers: the number of directed graphs with $N$ vertices that have exactly one, two, and three topological orderings. Give the answers modulo $10^9 + 7$.</p>