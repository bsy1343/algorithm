# [Platinum II] Doubles Horseback Wrestling - 32423

[문제 링크](https://www.acmicpc.net/problem/32423)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 11, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

그리디 알고리즘, 스위핑

### 문제 설명

<p>The Nomadic Games Exploratory Committee (NGEC) is floating the idea of a doubles horseback wrestling tournament with pairs of riders astride single horses. They have advertised a pilot tournament, and $n$ eager riders have signed up to compete! So now the NGEC needs to pair the riders in order to make the tournament both fair and exciting.</p>

<p>The Central Asian Audaryspak League (CAAL) maintains a list of all horseback wrestlers and their ratings. From their previous experience with ordinary horseback wrestling, the NGEC has decided that the pairs are best balanced if the ratings of their two riders add up to a particular integer, $s$.</p>

<p>For obscure licensing reasons, the CAAL refuses to release the exact rating of each rider. But the NGEC has some good estimates, knowing that any rider $i$’s true rating $r_i$ lies in an interval $[l_i, u_i]$. So the NGEC would consider pairing two riders $i$ and $j$ if there are ratings $r_i \in [l_i, u_i]$ and $r_j \in [l_j , u_j]$ such that $r_i + r_j = s$.</p>

<p>The NGEC wants to form as many non-intersecting pairs of riders as possible. You need to help them.</p>

### 입력

<p>The first line contains two integers $n$ and $s$ ($2 ≤ n ≤ 2 \cdot 10^5$, $1 ≤ s ≤ 10^9$), denoting the number of riders and the desired sum of ratings of riders in a pair. Riders are numbered $1$ to $n$. This is followed by $n$ lines, where the $i$th line contains two integers $l_i$ and $u_i$ ($1 ≤ l_i ≤ u_i ≤ 10^9$), denoting the rating range of the $i$th rider.</p>

### 출력

<p>Output $k$, the maximum number of riding pairs that can be formed, followed by $k$ pairs of integers, denoting the numbers of the riders forming each pair. If there are multiple ways to pair off the riders, output any one.</p>