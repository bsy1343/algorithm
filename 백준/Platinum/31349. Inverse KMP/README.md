# [Platinum I] Inverse KMP - 31349

[문제 링크](https://www.acmicpc.net/problem/31349)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 68, 정답: 29, 맞힌 사람: 22, 정답 비율: 44.000%

### 분류

수학, 자료 구조, 문자열, 조합론, 분리 집합, KMP

### 문제 설명

<p>bobo has just learnt Knuth-Morris-Pratt (KMP) algorithm.</p>

<p>For string $S = s_{1} s_{2} \dots s_{n}$, $\mathrm{KMP}(S) = (f_2, f_3, \dots, f_n)$ where $f_i$ is the maximum $j &lt; i$ where $s_{1} s_{2} \dots s_{j} = s_{i - j + 1} s_{i - j + 2} \dots s_{i}$.</p>

<p>Given $f_2, f_3, \dots, f_n$ and the size of alphabet, find out the number of strings $S$ where $\mathrm{KMP}(S) = (f_2, f_3, \dots, f_n)$ modulo $(10^9 + 7)$.</p>

### 입력

<p>The first line contains $2$ integers $n$ and $c$, which denotes the length of the string and the size of alphabet, respectively ($2 \leq n \leq 2 \cdot 10^5, 1 \leq c \leq 10^9$).</p>

<p>The second line contains $(n - 1)$ integers $f_2, f_3, \dots, f_n$ ($0 \leq f_i &lt; i$).</p>

<p>It is guaranteed that there exists at least one solution.</p>

### 출력

<p>A single integer denotes the number of strings.</p>