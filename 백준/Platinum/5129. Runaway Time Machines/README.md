# [Platinum III] Runaway Time Machines - 5129

[문제 링크](https://www.acmicpc.net/problem/5129)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 5, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

그래프 이론, 최단 경로, 이분 매칭, 플로이드–워셜

### 문제 설명

<p>Tim the time-traveling salesman owns several time machines that he uses to travel to different points in space-time. These time machines navigate a network of wormholes, with each wormhole connecting two points and taking a certain amount of time to cross. Tim&rsquo;s time machines are fully automated: they always take the shortest path to their destination.</p>

<p>A recent and violent wormhole storm has caused some of Tim&rsquo;s time machines to go haywire. These machines loaded up the pre-programmed destinations stored in their memory banks and took off. When each time machine ended its trip it broadcasted a diagnostics signal containing the starting point and length in time of the trip. Tim doesn&rsquo;t remember the pre-programmed destination for each time machine. However, he does know that no two time machines were programmed for the same destination. Can Tim determine for all of the time machines exactly where (and when) they ended up?</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line contains three integers 1 &le; M &le; 20, 2 &le; N &le; 100, N &minus; 1 &le; W &le; 500, where M is the number of missing time machines, N is the number of space-time locations in the wormhole network, and W is the number of wormholes. Machines are numbered from 1 to M and space-time points are numbered from 1 to N. Next come W lines containing three integers a<sub>i</sub> b<sub>i</sub> c<sub>i</sub>, the space-time locations that wormhole i connects and the number of seconds required to traverse it. No wormhole requires more than 1,000 seconds to cross. Finally there are M lines each containing integers s<sub>i</sub> t<sub>i</sub>, the starting point and travel time in seconds of time machine i. It is guaranteed that all time machines followed a valid shortest path and reached their destination.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. If Tim can determine for all the time machines where they ended their trips, output the ending point for each machine starting from machine 1 and going to machine M on a single line. Two ending points should be separated by a single space. There should be no leading or trailing whitespace on a line. If Tim cannot determine the destination of one or more of the time machines, output &ldquo;impossible&rdquo; instead. Each data set should be followed by a blank line.</p>