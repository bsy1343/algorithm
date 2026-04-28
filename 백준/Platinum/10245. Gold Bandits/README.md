# [Platinum III] Gold Bandits - 10245

[문제 링크](https://www.acmicpc.net/problem/10245)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 21, 정답: 11, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

백트래킹, 브루트포스 알고리즘, 데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>In the hills of a distant land there is a valley with many villages. The villages are all ruled by a cruel king who demands that each village pay him tribute in gold each year. The villages are required to bring gold to the king as quickly as possible when he demands it.</p>

<p>There is a bandit village in the kingdom. The bandit village has saved no gold for the king, because they spent every bit of gold that they had! What are they going to do? Well, since they&rsquo;re bandits, when they travel through other villages to get to the castle, they may (or may not) choose to steal the gold from any of those villages on their path to the castle, and present it to the king as their own.</p>

<p>The bandits travel through as few villages as possible to reach the castle. They also have one other consideration&ndash;after delivering the gold to the king the bandits must be able to return home. They consider it unsafe to return home traveling through a village from whom they stole gold. The bandits do not otherwise care how long it takes to return home.</p>

<p>Determine the maximum amount of gold the bandits can steal on their way to the king&rsquo;s castle and still be able to return home safely.</p>

### 입력

<p>There will be several test cases in the input. Each test case will begin with a line with two integers, n (3&le;n&le;36) and m (n-1&le;m&le;n(n-1)/2), where n is the number of villages, and m is the number of roads. The villages are numbered 1..n. Village 1 is the bandit&rsquo;s home, and village 2 holds the king&rsquo;s castle. On the next line will be n-2 space-separated integers g (1&le;g&le;5,000), which are the amount of gold in each village 3, 4, &hellip;, n, skipping the bandit&rsquo;s home and the king&rsquo;s castle. On each of the following m lines will be two integers, a and b (1&le;a&lt;b&le;n) indicating that there is a road between villages a and b. All roads are two-way. All m (a,b) pairs will be unique. There will be a path, direct or indirect, from every village to every other village. The input will end with a line with two 0s.</p>

### 출력

<p>For each test case, output a single integer, indicating the maximum amount of gold that the bandits can purloin and still get safely home. Output each integer on its own line, with no spaces. Do not print any blank lines between outputs.</p>