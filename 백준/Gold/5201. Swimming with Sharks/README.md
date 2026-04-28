# [Gold IV] Swimming with Sharks - 5201

[문제 링크](https://www.acmicpc.net/problem/5201)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 11, 맞힌 사람: 11, 정답 비율: 78.571%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>It appears that at one of the beaches in La Jolla, there is a fairly large number of leopard sharks right by the pier (those are only about 4 feet long, a lot smaller than most sharks). And apparently, some people consider it a very exciting experience to actually swim in the water with those sharks. We don&rsquo;t know about you, but all of the contest organizers seem to be unanimous in their agreement that this does not seem like the greatest idea. We also all agree that if we were in the water with a bunch of leopard sharks, our main goal would be to stay as far away from them as possible. Luckily, the computer could help us with that (in particular if it were water-proof).</p>

<p>We model the water as a \(w\) &times; \(h\) two-dimensional grid of integer coordinates. At time 1, you start at point (1, 1). In each time step, you can swim one square to the right, left, up, or down, or stay where you are (so long as you don&rsquo;t leave the area, of course). You will be given the position at which sharks are at all given times, as well as a time horizon \(t\) to consider. You are to find a way to stay as far from all sharks as possible for \(t\) steps. More precisely, let \(d\) be the closest you ever came to any shark during any of the \(t\) time steps. (Distance between two points (\(x_1\), \(y_1\)) and (\(x_2\), \(y_2\)) is measured in the Euclidean norm \(d = \sqrt{(x_1 &minus; x_2)^2 + (y_1 &minus; y_2)^2}\). Then, the goal is to find a &ldquo;move plan&rdquo; making \(d\) as large as possible, while ending up at position (1, 1) again at time \(t\).</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of each data set contains integer numbers \(w\), \(h\), \(t\), \(s\). 1 &le; \(w\), \(h\) &le; 10 are the width and height of the water expanse we are considering. 1 &le; \(t\) &le; 100 is the time for which you are in the water. 1 &le; \(s\) &le; 10000 is the number of &ldquo;shark sightings&rdquo; in the file.</p>

<p>This is followed by s lines, each containing three integer numbers \(x_i\), \(y_i\), \(t_i\) (with 1 &le; \(x_i\) &le; \(w\), 1 &le; \(y_i\) &le; \(h\), 1 &le; \(t_i\) &le; \(t\)). This means that at time \(t_i\), there is a shark at position (\(x_i\), \(y_i\)). These are not necessarily sorted by any parameter.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the closest you ever came in contact with a shark in the best possible solution, rounded to two decimals. (Notice that an output of 0 means that you cannot avoid occupying the same square as a shark at some point.)</p>