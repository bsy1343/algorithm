# [Platinum V] Intergalactic Team - 32847

[문제 링크](https://www.acmicpc.net/problem/32847)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 54, 정답: 15, 맞힌 사람: 14, 정답 비율: 32.558%

### 분류

분리 집합, 자료 구조, 집합과 맵

### 문제 설명

<p>The Intergalactic Competitive Programming Contest (ICPC) is coming up, and it’s time to choose a team that will represent our planet in this esteemed competition. The ICPC president has announced the team size for this year’s competition to all planets that want to compete. The Earth ICPC committee needs to form a team that consists of exactly this number of members.</p>

<p>To maximize compatibility and teamwork between team members, a set of people can form a team if for any pair of members $(u, v)$ in the set, $u$ must specify $v$ as someone they want to work with and vice versa. In addition, as part of the competitors’ demand, if two competitors specify that they want to work with each other, then either both of them or neither of them shall be in the team.</p>

<p>Earth has $n$ eligible competitors to participate in this year’s competition. Earth has collected data regarding for every competitor who they want to work with as teammates. With this information available, can you help the Earth ICPC committee determine the number of ways to choose a team of the required size for the upcoming competition? Two team configurations are considered different if there is at least one member that is in one configuration but not in the other.</p>

### 입력

<p>The first line of input contains three integers $n$, $m$, and $k$ ($1 ≤ n ≤ 10^5$, $1 ≤ m ≤ \min(n \cdot (n - 1), 10^6)$, $1 ≤ k ≤ n$), where $n$ is the number of prospective competitors, $m$ is the number of entries specifying that which competitors are willing to work with which competitors, and k is the exact team size required for this year’s ICPC.</p>

<p>The competitors are numbered $1$ to $n$. The next $m$ lines each contain two integers $x$ and $y$ ($1 ≤ x, y ≤ n$, $x \ne y$), denoting that competitor $x$ wants to work with competitor $y$. It is guaranteed that all those entries are unique.</p>

### 출력

<p>Output a single integer, the number of ways for the Earth ICPC committee to choose a team for the upcoming ICPC.</p>