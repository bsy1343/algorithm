# [Gold II] Swamp Kangaroo - 5167

[문제 링크](https://www.acmicpc.net/problem/5167)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

구현, 그래프 이론, 최단 경로, 데이크스트라, 격자 그래프

### 문제 설명

<p>Kangaroos are fascinating creatures. For one, the idea of carrying around their offspring in a pouch is very cute, and it reminds us of our own ways of transporting babies. For another, they can jump really far. That can be quite useful, in particular if you&rsquo;re a kangaroo stuck in a swamp with only small islands of land, and crocodiles swimming around. In that case, you&rsquo;d rather not land in the water. Besides mere jumping strength, it&rsquo;s also useful to have some computational power to compute how exactly to use that jumping strength to get where you need to go. That&rsquo;s where &mdash; if you&rsquo;re a swamped Kangaroo &mdash; your USC programming buddies come in.</p>

<p>Here&rsquo;s how we model Kangaroo movement. Kangaroos can only move North-South or East-West; no other directions (such as diagonals). Kangaroos can jump any integer distance between 1 and 5 in one hop, which takes them one unit of time. However, after a longer jump, they have to rest before being able to jump again. Specifically, after jumping distance d, the Kangaroo has to rest (d &minus; 1)<sup>2</sup> time units before being able to jump again. Also, if the next jump is in a different direction from the previous one, the Kangaroo takes an extra one time unit between the jumps to turn around.</p>

<p>The swamp will be described by a two-dimensional grid. Each entry is either water, denoted by a dot &lsquo;.&rsquo;, or land, denoted by &lsquo;X&rsquo;. Two locations will be marked with special symbols. &lsquo;K&rsquo; denotes the initial position of the Kangaroo, and &lsquo;G&rsquo; is the goal the Kangaroo wants to reach (both of these are of course land). You are to find the shortest time in which the Kangaroo could get to the goal (if at all). It does not matter if the kangaroo is tired when it arrives at its destination; it doesn&rsquo;t have to rest.</p>

### 입력

<p>The first line contains the number K of data sets. This is followed by K data sets, each of the following form:</p>

<p>The first line contains two number h, w (1 &le; h, w &le; 30). These give the height and width of the swamp map. This is followed by h lines, each containing exactly w characters. Each character is either a &lsquo;.&rsquo;, an &lsquo;X&rsquo;, a &lsquo;K&rsquo;, or a &lsquo;G&rsquo;. Together, these h &times; w characters describe the swamp.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, on the next line, output the minimum amount of time in which the Kangaroo can reach the goal position. If there is no way to reach the goal, then output &ldquo;Impossible&rdquo; instead. Each data set should be followed by an empty line.</p>