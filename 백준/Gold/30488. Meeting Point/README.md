# [Gold II] Meeting Point - 30488

[문제 링크](https://www.acmicpc.net/problem/30488)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 106, 정답: 71, 맞힌 사람: 59, 정답 비율: 67.045%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>Your friend Pedro always gets very excited for group activities. In his excitement, he runs so fast to the meeting point that he gets tired before arriving. One day, you decided to gather data on this phenomenon and, surprisingly, noticed that he consistently gets tired exactly at the midpoint of his route. In other words, he gets tired when he has traveled half the distance he was going to travel.</p>

<p>Your city has N crossroads identified by distinct integers from 1 to N, and M two-way roads. Each road has a length and connects a specific pair of crossroads, in such a way that there is a path in the city between every pair of crossroads. The distance between two crossroads is the length of a minimum path between those crossroads.</p>

<p>Pedro lives at crossroad P, and your group of friends decided to meet at crossroad G later today. After thinking for a while, you devised the following plan so that Pedro arrives on time. You will tell him a misleading meeting point so that he gets tired exactly at G. To make this plan work, crossroad G must belong to every path that Pedro could possibly take while going from P to the misleading meeting point, and for each such path, Pedro must get tired exactly at G. Fortunately, you know that Pedro is a good planner and would never take a path longer than needed.</p>

<p>Now you wonder, which crossroads would work as that misleading meeting point?</p>

### 입력

<p>The first line contains two integers N (2 &le; N &le; 10<sup>5</sup>) and M (1 &le; M &le; 10<sup>5</sup>), indicating respectively the number of crossroads and the number of roads in the city. Each crossroad is identified by a distinct integer from 1 to N.</p>

<p>The second line contains two integers P and G (1 &le; P, G &le; N and P &ne; G), denoting respectively the crossroad where Pedro lives and the correct meeting point.</p>

<p>Each of the next M lines describes a road with three integers U, V and D (1 &le; U, V &le; N, U &ne; V and 1 &le; D &le; 10<sup>9</sup>), representing that there is a two-way road of length D between crossroads U and V.</p>

<p>It is guaranteed that there is a path between each pair of crossroads using the given roads, and there is at most one road between each pair of crossroads.</p>

### 출력

<p>Output a single line with an increasing list of integers indicating the crossroads that would work for your plan. If no crossroad would work, output the character &ldquo;*&rdquo; (asterisk) instead.</p>