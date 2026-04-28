# [Gold II] Uniform Chemistry - 27594

[문제 링크](https://www.acmicpc.net/problem/27594)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 43, 정답: 38, 맞힌 사람: 32, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>In a parallel universe there are $n$ chemical elements, numbered from $1$ to $n$. The element number $n$ has not been discovered so far, and its discovery would be a pinnacle of research and would bring the person who does it eternal fame and the so-called SWERC prize.</p>

<p>There are $m$ independent researchers, numbered from $1$ to $m$, that are trying to discover it. Currently, the $i$-th researcher has a sample of the element $s_i$. Every year, each researcher independently does one <em>fusion experiment</em>. In a fusion experiment, if the researcher currently has a sample of element $a$, they produce a sample of an element $b$ that is chosen uniformly at random between $a+ 1$ and $n$, and they lose the sample of element $a$. The elements discovered by different researchers or in different years are completely independent.</p>

<p>The first researcher to discover element $n$ will get the SWERC prize. If several researchers discover the element in the same year, they all get the prize. For each $i = 1, 2, \dots , m$, you need to compute the probability that the $i$-th researcher wins the prize.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($2 &le; n &le; 100$, $1 &le; m &le; 10$) &mdash; the number of elements and the number of researchers.</p>

<p>The second line contains $m$ integers $s_1, s_2, \dots , s_m$ ($1 &le; s_i &lt; n$) &mdash; the elements that the researchers currently have.</p>

### 출력

<p>Print $m$ floating-point numbers. The $i$-th number should be the probability that the $i$-th researcher wins the SWERC prize. Your answer is accepted if each number differs from the correct number by at most $10^{-8}$.</p>