# [Platinum IV] Amazing Race - 11639

[문제 링크](https://www.acmicpc.net/problem/11639)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 32, 정답: 16, 맞힌 사람: 9, 정답 비율: 42.857%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 외판원 순회 문제

### 문제 설명

<p>A scavenger hunt is being organized for programming contest participants. In addition to the starting and ending locations of the race, there are n (n &le; 20) other locations for competitors to travel to. At each location i (1 &le; i &le; n), there is a task that must be performed to earn p<sub>i</sub> points. The task at each location takes t<sub>i</sub> minutes to complete. However, each task can only be performed once, so a competitor may not travel to the same location more than once. The competitor cannot return to the starting location after the race begins, and the race finishes as soon as the ending location is reached.</p>

<p>The scavenger hunt must be completed within T minutes. That is, the time between leaving the starting location and arriving at the ending location must be no more than T minutes. In addition, some tasks have a specific deadline d<sub>i</sub>, meaning that the task must be completed within d<sub>i</sub> minutes since leaving the starting location. Again, note that if a competitor arrives at location i, the task at location i must be performed. If the competitor were to arrive at the location too late and would not finish the task at that location by the deadline, then the competitor would not be allowed to travel to the location at all.</p>

<p>What is the maximum total number of points that can be obtained from the tasks?</p>

### 입력

<p>The input consists of one case. The first line of input contains two positive integers n and T (T &le; 1440). Each of the next n lines contains three integers p<sub>i</sub> (1 &le; p<sub>i</sub> &le; 100), t<sub>i</sub> (1 &le; t<sub>i</sub> &le; 1440), and d<sub>i</sub> (&minus;1 &le; d<sub>i</sub> &le; 1440). If d<sub>i</sub> = &minus;1 then there is no deadline for task i. Finally, the last n + 2 lines each contains n + 2 nonnegative integers. The entry in the ith row and jth column is the number of minutes (&le; 1440) it takes to travel from location i to location j. The indices of the starting and ending locations are n + 1 and n + 2, respectively.</p>

<p>It is guaranteed that the time to travel from a location to itself is 0, but the time to travel between two locations in different directions may not be the same (e.g. uphill instead of downhill).</p>

### 출력

<p>Print the maximum total number of points that can be obtained on the first line. In the second line, print a set of indices of the tasks that need to be performed to achieve this maximum. The indices should be separated by a single space. If there are multiple sets of tasks that can achieve the maximum, print the one that is lexicographically smallest. That is, if two sets of tasks achieve the same maximum, the index of the first task in the set should be as small as possible. If there is a tie, the index of the second task in the set should be as small as possible, and so on.</p>

<p>If the maximum number of points that can be obtained is 0, output a blank line for the indices of the tasks&nbsp;to be performed.</p>