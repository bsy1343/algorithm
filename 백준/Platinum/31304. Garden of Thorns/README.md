# [Platinum II] Garden of Thorns - 31304

[문제 링크](https://www.acmicpc.net/problem/31304)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 40, 정답: 23, 맞힌 사람: 22, 정답 비율: 75.862%

### 분류

미적분학, 도형에서의 불 연산, 기하학, 그린 정리, 수학

### 문제 설명

<p>Eddy owns a rectangular garden and has noticed some trespassers stomping through his garden. There are some plants that he wants to protect. He hires an assistant, Zyra, to patrol and protect his garden.</p>

<p>Zyra cannot be bothered to monitor his garden, so she plants a circle of thorns centered at a randomly chosen location within the boundaries of his garden. A plant is considered protected if it is strictly inside the circle of thorns - that is, the distance from the plant to the center of the circle of thorns is less than the circle&#39;s radius. The circle of thorns may extend outside of the boundary of the rectangular garden, though all plants will be inside or on the boundary of the garden.</p>

<p>Given the random nature of the placement of Zyra&#39;s circle of thorns, compute the expected value of the plants that will be protected. Note that Zyra&#39;s circle of thorns does not have to be centered at integer coordinates.</p>

### 입력

<p>The first line of input contains four integers $n$ ($1 \le n \le 10$), $r$ ($1 \le r \le 2\,000$), $w$ and $h$ ($1 \le w,h \le 1\,000$), where $n$ is the number of plants in Eddy&#39;s garden, $r$ is the radius of Zyra&#39;s circle of thorns, $w$ is the width of Eddy&#39;s garden and $h$ is the height of the garden.</p>

<p>Each of the next $n$ lines contains three integers $x$ ($0 \le x \le w$), $y$ ($0 \le y \le h$) and $v$ ($1 \le v \le 1\,000$), where $(x,y)$ denotes the position of a plant from the lower left corner of Eddy&#39;s garden, and $v$ is the value of that plant. No two plants will be at the same position.</p>

### 출력

<p>Output a single real number, which is the expected value of plants which will be protected by Zyra&#39;s circle of thorns. Any answer within an absolute or relative error of $10^{-9}$ will be accepted.</p>