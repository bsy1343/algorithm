# [Platinum IV] Monitoring Ski Paths - 16632

[문제 링크](https://www.acmicpc.net/problem/16632)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 25, 맞힌 사람: 20, 정답 비율: 50.000%

### 분류

그래프 이론, 자료 구조, 그리디 알고리즘, 그래프 탐색, 트리, 집합과 맵, 깊이 우선 탐색, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>Fresh powder on a sunny day: it is a great time to ski! Hardcore skiers flock to a large mountain in the Rockies to enjoy these perfect conditions. The only way up the mountain is by helicopter; skiers jump out and ski down the mountain.</p>

<p>This process sounds a bit chaotic, so some regulations are in place. Skiers can only enter or exit the mountain at a set of designated locations called junctions. Once on the mountain, they are only allowed to travel along designated ski paths, each of which starts at one junction and ends at another junction lower on the mountain. Multiple ski paths might start at the same junction, but no two ski paths end at the same junction to avoid collisions between skiers.</p>

<p>Finally, each skier must register a ski plan a day in advance with the helicopter service. The ski plan specifies the junction they fly up to and the junction lower on the mountain where they get picked up. If a skier shows up to the mountain, they must follow their plan; but some skiers get sick and do not show up at all.</p>

<p>Your job is to look through the ski plans and set up monitors at some of the junctions to count how many skiers actually show up. To keep operating costs as low as possible, you should determine the minimum number of junctions that need to be monitored so that each skier passes through at least one monitored junction.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/94f7663f-1792-4d8d-8206-845483f59b66/-/preview/" style="width: 314px; height: 217px;" /></p>

<p style="text-align: center;">Figure I.1: Illustration of the first sample input.</p>

<p>Figure I.1 shows the first sample input. The dashed lines indicate the five different plans that were registered by skiers. By monitoring junctions 5, 9, and 10, you can ensure that all plans include at least one monitored junction. Monitoring fewer functions would miss some skiers.</p>

### 입력

<p>The first line of input has three integers n, k, and m, where n (2 &le; n &le; 250 000) is the number of junctions, k (1 &le; k &lt; n) is the number of ski paths, and m (1 &le; m &le; 250 000) is the number of routes.</p>

<p>Then k lines follow, each containing two integers 1 &le; u, v &le; n indicating that there is a ski path that starts at junction u and ends at junction v.</p>

<p>Then m lines follow, each containing two distinct integers 1 &le; s, t &le; n. Each line indicates that a skier plans to land at junction s and ski down the mountain to junction t. It is guaranteed it is possible to reach junction t from junction s by following ski paths and that junction t is at the base of the mountain (i.e. no ski paths start at t). No (s, t) pair appears more than once.</p>

### 출력

<p>Output the minimum number of junctions that need to be monitored so each ski plan includes at least one monitored junction.</p>