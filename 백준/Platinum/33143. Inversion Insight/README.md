# [Platinum I] Inversion Insight - 33143

[문제 링크](https://www.acmicpc.net/problem/33143)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 27, 정답: 15, 맞힌 사람: 10, 정답 비율: 47.619%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>In MathemIsland, the wildlife is very diverse. There are roots, trees, leaves, pigeons – everything you’d find in a math book. And everywhere you look, there is a permutation.</p>

<p>ICPC University has devised a systematic way to catalog these permutations. Specifically, because inversions are of utmost importance in studying wildlife genetics, ICPC University has decided to sort all $N!$ permutations of the integers from $1$ to $N$: first by the number of inversions and, in the case of a tie, by lexicographic order. This approach uniquely identifies each permutation by an integer from $1$ to $N!$, indicating its position in the sorted list of all $N!$ permutations.</p>

<p>Thus, the identity permutation $(1, 2, \dots , N)$, which is the only permutation with zero inversions, is assigned the identifier $1$, while the reverse identity permutation $(N, N - 1, \dots , 1)$, which is the only one with the maximum number of inversions, is assigned the identifier $N!$.</p>

<p>As part of the team implementing the ICPC University database, your task is to retrieve a specific permutation based on its identifier. Write a program that, given two integers $N$ and $K$, outputs the permutation of the integers from $1$ to $N$ corresponding to identifier $K$.</p>

<p>Remember that the number of inversions in a permutation is the number of pairs of elements that are out of their natural order. That is, for a permutation $π$ with $N$ elements, its number of inversions $\text{inv}(π)$ is defined as</p>

<p>$$\text{inv}(π) = |\{(i, j) : 1 ≤ i &lt; j ≤ N ∧ π(i) &gt; π(j)\}|$$</p>

### 입력

<p>The input consists of a single line that contains two integers $N$ ($1 ≤ N ≤ 2 \cdot 10^5 $) and $K$ ($1 ≤ K ≤ \min(N!, 4 \cdot 10^{18})$).</p>

### 출력

<p>Output a single line with $N$ integers, describing the $K$-th permutation of the integers from $1$ to $N$, considering permutations sorted according to the university’s criteria.</p>