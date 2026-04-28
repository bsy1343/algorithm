# [Platinum V] Zebra Herd - 5168

[문제 링크](https://www.acmicpc.net/problem/5168)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 6, 맞힌 사람: 6, 정답 비율: 46.154%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Zebras are very social animals. Like other members of the horse family, they form groups that tend to stick together and hang out fairly regularly, though not exclusively. (Humans also come to mind in this respect.) Lately, researchers have been trying to understand just how the communities of zebras evolve over time, what triggers changes, and so forth. Of course, all they have to go by is observations of where the zebras are over time. From that, we&rsquo;d like to figure out what are the most natural groups. The assumptions are that (a) if a zebra is part of a group, it tends to spend time close to others in that group, (b) if a zebra is not part of a group, it tends to spend time further away from others in that group, and (c) zebras don&rsquo;t change their group membership very often.</p>

<p>Let&rsquo;s make this more precise. You will be given a sequence of observations of zebras. For each observation time, you will have the exact location of each zebra. The distance between two zebras is exactly their Euclidean (straight-line) distance. We assume that there are exactly two groups of zebras in the herd, and will denote them by two colors. What we want to do is color each zebra either red or blue for each time step, expressing membership to one or the other group. To express assumption (c) above, we will assess a penalty of some given number c every time a zebra changes colors. To express assumptions (a) and (b), we look at the distance d(i, j) between every pair i, j of zebras. If i and j are of the same color, then we assess a penalty of a &middot; d(i, j) for this pair. If i and j are of opposite colors, then we assess a penalty of &minus;b &middot; d(i, j) (i.e., we give a bonus).</p>

<p>Thus, if you are given a proposed labeling of all zebras with either red or blue for each time step, you can compute how good an explanation of zebra activity it is. Your goal is to find the best possible labeling, in the sense that it has the smallest possible total penalty. But you&rsquo;ll only need to output the total penalty of the labeling, not the labeling itself.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line of each data set contains two integers z, t, the number of zebras 2 &le; z &le; 10, and the number of time steps 2 &le; t &le; 50. Next comes a line with three floating point numbers a, b, c &ge; 0, the penalty multipliers. This is followed by t lines, describing zebra positions. Each line contains 2z floating point numbers, giving the positions of the zebras in the form x1 y1 x2 y2 . . . xz yz. The first line contains the positions at time 1, the second line at time 2, and so forth.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output the minimum penalty that can be achieved by any grouping over time of the zebras, rounded to two decimals. Each data set should be followed by a blank line.</p>