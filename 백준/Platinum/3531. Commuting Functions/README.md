# [Platinum II] Commuting Functions - 3531

[문제 링크](https://www.acmicpc.net/problem/3531)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 31, 정답: 10, 맞힌 사람: 10, 정답 비율: 40.000%

### 분류

수학, 순열 사이클 분할

### 문제 설명

<p>Two functions f and g (f, g : X &rarr; X) are commuting if and only if f(g(x)) = g(f(x)) for each x &isin; X. For example, functions f(x) = x + 1 and g(x) = x &minus; 2 are commuting, whereas functions f(x) = x + 1 and g(x) = 2x are not commuting.</p>

<p>Each function h (h : N<sub>n</sub> &rarr; N<sub>n</sub>, where Nn = 1, 2, . . . , n and n is positive integer) can be represented as a value list &mdash; a list in which the i-th element is equal to h(i). For example, a function h(x) = &lceil;x/2&rceil; from N<sub>5</sub> to N<sub>5</sub> has the value list [1, 1, 2, 2, 3].</p>

<p>The value lists are ordered lexicographically: list [a<sub>1</sub> . . . a<sub>n</sub>] is smaller than list [b<sub>1</sub> . . . b<sub>n</sub>] if and only if there exists such an index k that a<sub>k</sub> &lt; b<sub>k</sub>, and a<sub>l</sub> = b<sub>l</sub> for any index l &lt; k.</p>

<p>The function f (f : X &rarr; X) is bijective if for every y in X, there is exactly one x in X such that f(x) = y.</p>

<p>Given a bijective function f (f : Nn &rarr; Nn, n is positive integer), find the function g that is commuting with f and has the lexicographically smallest possible value list.</p>

### 입력

<p>The first line contains single integer number n &mdash; the number of the elements in the value list of bijective function f (1 &le; n &le; 200 000).</p>

<p>The second line of the input file contains the value list of the function f.</p>

### 출력

<p>The single line of the output file must contain n integer numbers &mdash; the value list of function g that commutes with the function f and has the lexicographically smallest value list.</p>