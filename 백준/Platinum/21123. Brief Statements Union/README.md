# [Platinum I] Brief Statements Union - 21123

[문제 링크](https://www.acmicpc.net/problem/21123)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 38, 정답: 9, 맞힌 사람: 9, 정답 비율: 39.130%

### 분류

구현, 누적 합, 비트마스킹

### 문제 설명

<p>Egor learned about the secret organization called <em>Brief Statements Union</em> (BSU), whose ultimate goal is to make statements of all competitive programming problems clear and concise, and eliminate those long, boring, and unnecessary tales in the statements.</p>

<p>Egor decided to join the organization. For this purpose, he wrote the following problem with a short statement:</p>

<p><em>You are given an integer $n$ and $k$ conditions. The $i$-th condition states that bitwise AND of all integers $a_{l_i}, a_{l_i + 1}, \ldots, a_{r_i}$ is equal to $x_i$.</em></p>

<p><em>For each condition $i$, determine if there exists an array $a_1, a_2, \ldots, a_n$ of $n$ integers which satisfies all the conditions except the condition $i$. Note that it is OK if the array satisfies the condition $i$ too.</em></p>

<p>The committee of the organization liked Egor&#39;s problem statement. And this is how he got accepted into the organization. Now, Egor has decided to offer the problem to this contest, so you have to solve it.</p>

### 입력

<p>The first line contains two integers $n$ and $k$, denoting the required length of the array and the number of the conditions ($1 \le n, k \le 10^6$).</p>

<p>Then $k$ lines follow, the $i$-th of them contains three integers $l_i$, $r_i$, $x_i$, describing the $i$-th condition ($1 \le l_i \le r_i \le n$, $0 \le x_i \le 10^{18}$).</p>

### 출력

<p>Print the binary string of $k$ characters. The $i$-th character must be equal to &#39;<code>1</code>&#39; if there is an array of length $n$ which satisfies all the conditions with the $i$-th one being removed. Otherwise, the $i$-th character must be equal to &#39;<code>0</code>&#39;.</p>