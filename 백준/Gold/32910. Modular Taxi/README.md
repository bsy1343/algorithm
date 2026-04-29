# [Gold V] Modular Taxi - 32910

[문제 링크](https://www.acmicpc.net/problem/32910)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 34, 정답: 12, 맞힌 사람: 11, 정답 비율: 35.484%

### 분류

그리디 알고리즘, 수학, 유클리드 호제법, 정수론

### 문제 설명

<p>Longlandia is a very long country. All of its $n$ cities are located along a line segment. If we enumerate them from the beginning to the end of the segment, the $i$-th city has $a_i$ inhabitants.</p>

<p>You need to get from city $s$ to city $f$. For this purpose, an infinite number of taxis called Kaban-2, Kaban-3, Kaban-4, Kaban-5, ... operate in Longlandia. A taxi named Kaban-$m$ can take you from city $i$ to city $j$ if the numbers of inhabitants in all cities from $i$ to $j$ inclusive are congruent modulo $m$. Formally, for any integer $k$ such that $\min\{i, j\} \le k \le \max\{i, j\}$, the relation $a_k \equiv a_i \pmod m$ must hold.</p>

<p>Find the smallest number $Q$ of taxi calls required to get from city $s$ to city $f$, and output $Q$ lines describing the route. If it is impossible to reach the destination by taxi, output "<code>Impossible</code>".</p>

### 입력

<p>The first line contains an integer $n$: the number of cities in Longlandia ($2 \le n \le 2 \cdot 10^5$).</p>

<p>The second line contains $n$ integers $a_1, a_2, \ldots, a_n$: the population of each city ($1 \le a_i \le 10^9$).</p>

<p>The third line contains two integers $s$ and $f$: the starting and finishing city numbers ($1 \le s, f \le n$; $s \ne f$).</p>

### 출력

<p>Let $Q$ be the smallest number of taxi calls required to get from city $s$ to city $f$. Output $Q$ lines of the form "<code>Kaban-$m_i$ $s_i$ $f_i$</code>", indicating that the $i$-th trip will be made by taxi Kaban-$m_i$ and will take you from city $s_i$ to city $f_i$ ($1 \le s_i, f_i \le n$; $2 \le m_i \le 10^9$). The following equalities must hold: $s_1 = s$; $f_Q = f$; $s_{i + 1} = f_i$. And, of course, taxi Kaban-$m_i$ must be able to take you from city $s_i$ to city $f_i$.</p>

<p>If it is impossible to reach from $s$ to $f$ with any number of taxi calls, output the word "<code>Impossible</code>".</p>

<p>Letter case does not matter, so you can output, for example, "<code>kaBAN</code>" and "<code>IMPossiBle</code>".</p>