# [Platinum V] Security Badge - 15110

[문제 링크](https://www.acmicpc.net/problem/15110)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 163, 정답: 61, 맞힌 사람: 54, 정답 비율: 50.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 스위핑

### 문제 설명

<p>You are in charge of the security for a large building, with n rooms and m doors between the rooms. The rooms and doors are conveniently numbered from 1 to n, and from 1 to m, respectively.</p>

<p>Door i opens from room a<sub>i</sub> to room b<sub>i</sub>, but not the other way around. Additionally, each door has a security code that can be represented as a range of numbers [c<sub>i</sub>, d<sub>i</sub>].</p>

<p>There are k employees working in the building, each carrying a security badge with a unique, integer-valued badge ID between 1 and k. An employee is cleared to go through door i only when the badge ID x satisfies c<sub>i</sub> &le; x &le; d<sub>i</sub>.</p>

<p>Your boss wants a quick check of the security of the building. Given s and t, how many employees can go from room s to room t?</p>

### 입력

<p>The first line of input contains three space-separated integers n, m, and k (2 &le; n &le; 1,000; 1 &le; m &le; 5,000; 1 &le; k &le; 10<sup>9</sup>).</p>

<p>The second line of input contains two space-separated integers s and t (1 &le; s, t &le; n; s &ne;&nbsp;t).</p>

<p>Each of the next m lines contains four space-separated integers a<sub>i</sub>, b<sub>i</sub>, c<sub>i</sub>, and d<sub>i</sub> (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; n; 1 &le; c<sub>i</sub> &le; d<sub>i</sub> &le; k; a<sub>i</sub> &ne;&nbsp;b<sub>i</sub>), describing door i.</p>

<p>For any given pair of rooms a, b there will be at most one door from a to b (but there may be both a door from a to b and a door from b to a).</p>

### 출력

<p>Print, on a single line, the number of employees who can reach room t starting from room s.</p>