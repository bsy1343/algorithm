# [Gold V] Mall Mania - 4268

[문제 링크](https://www.acmicpc.net/problem/4268)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 41, 정답: 21, 맞힌 사람: 17, 정답 비율: 56.667%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Waterloo has two giant shopping malls, each enclosing several city blocks. Kim and Pat like to shop and to walk within the malls but they don&#39;t like walking between the malls because such walking does not contribute directly to the task at hand: shopping. They would therefore like to know the minimum crossing distance between the malls.</p>

<p>Each city block is a unit square delimited by streets and avenues. Streets run east-west and avenues run north-south. Both are identified by consecutive integers between 0 and 2000. (Lower numbered avenues are west of higher numbered avenues and lower numbered streets are south of higher numbered streets.) Streets and avenues are narrow so their thickness may be assumed to be 0.</p>

<p>Each mall is a contiguous set of complete city blocks. By contiguous we mean that any two blocks are connected by some sequence of blocks such that consecutive pairs of blocks in the sequence share a side. The malls do not intersect and do not surround any empty blocks; that is, the blocks not in any mall are themselves contiguous.</p>

### 입력

<p>Standard input contains several test cases. Each test case contains the description of the two malls. Each mall&#39;s description consists of an integer p &ge; 4, the perimeter of the mall, followed by one or more lines containing p pairs (a,s) giving the coordinates of the avenue-street intersections contained in the perimeter, in clockwise order. A line containing 0 follows the last test case.</p>

### 출력

<p>For each case, output a single integer d -- the minimum walking distance between the malls, assuming that Kim and Pat always walk along streets and avenues.</p>