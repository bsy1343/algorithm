# [Silver II] Dihedral Group - 31952

[문제 링크](https://www.acmicpc.net/problem/31952)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB (추가 메모리 없음)

### 통계

제출: 102, 정답: 75, 맞힌 사람: 70, 정답 비율: 76.087%

### 분류

구현, 문자열

### 문제 설명

<p>In mathematics, the dihedral group $D_n$ is the group of symmetries of a regular $n$-gon. Rotations and reflections are elements of $D_n$, and in fact all elements of the dihedral group can be expressed as a series of rotations and reflections. Elements of $D_n$ <em>act</em> on the $n$-gon by permuting its vertices. For example, consider a regular pentagon with vertices initially labeled $1$, $3$, $5$, $4$, $2$ (clockwise, starting from the top):</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/2821423d-5e70-49b8-a884-eca07f7a074e/-/preview/" style="width: 592px; height: 100px;" /></p>

<p>Applying the above three dihedral actions to the pentagon (a rotation, reflection, and then another rotation) produces the following relabelings of the pentagon&#39;s vertices:</p>

<p style="text-align: center;">$1, 3, 5, 4, 2 \rightarrow 2, 1, 3, 5, 4 \rightarrow 2, 4, 5, 3, 1 \rightarrow 1, 2, 4, 5, 3.$</p>

<p>You are given an arbitrary clockwise labeling of the vertices of a regular $n$-gon using the integers $1$ through $n$, and a second sequence to test. Determine whether it&#39;s possible to apply some series of dihedral actions to the $n$-gon so that the test sequence appears as a contiguous clockwise sequence of vertex labels on the transformed polygon.</p>

### 입력

<p>The first line of input has two integers $n$ and $m$, ($1 \leq m \leq n \leq 5 \cdot 10^{4}$) where $n$ is the number of vertices of the polygon and $m$ is the length of the sequence to be tested.</p>

<p>The next line contains $n$ space-separated integers $d$ ($1 \le d \le n$). This is the initial labeling of the polygon vertices. It is guaranteed that each integer from $1$ to $n$ appears exactly once.</p>

<p>The next line contains $m$ space-separated integers $t$ ($1 \le t \le n$). This is the sequence to be tested.</p>

### 출력

<p>Output a single integer, which is $1$ if the test sequence could appear as a contiguous sequence of vertex labels after applying some series of dihedral actions to the initial polygon, and $0$ otherwise.</p>