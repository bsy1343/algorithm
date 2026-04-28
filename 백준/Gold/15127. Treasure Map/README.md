# [Gold III] Treasure Map - 15127

[문제 링크](https://www.acmicpc.net/problem/15127)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 21, 맞힌 사람: 16, 정답 비율: 64.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You have found a treasure map! The map leads you to several gold mines. The mines each produce gold each day, but the amount of gold that they produce diminishes each day. There are paths between the mines. It may take several days to go from one mine to another. You can collect all of the day&rsquo;s gold from a mine when you are there, but you have to move on, you cannot stay for multiple days at the same mine. However, you can return to a mine after leaving it.</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. Each test case will begin with a line containing two integers n (2 &le; n &le; 1,000) and m (1 &le; m &le; 1,000), where n is the number of mines, and m is the number of paths.</p>

<p>The next n lines will each describe a mine with two integers, g (1 &le; g &le; 1,000) and d (1 &le; d &le; 1,000), where g is the amount of gold mined on day 1, and d is the amount by which the gold haul diminishes each day. For example, if g=9 and d=4, then on day 1, the mine produces 9, on day 2 it produces 5, on day 3 it produces 1, and from day 4 on, it produces 0 (the mines cannot produce negative amounts of gold). The mines are numbered 1..n in the order that they appear in the input, and you start at mine 1 on day 1.</p>

<p>The next m lines will each describe a path with three integers, a, b (1 &le; a &lt; b &le; n) and t (1 &le; t &le; 100), where the path goes from mine a to mine b, and takes t days to traverse. The paths go in both directions, so that a path that goes from a to b can also be used to go from b to a.</p>

### 출력

<p>Output a single integer, which is the maximum amount of gold that you can collect.</p>