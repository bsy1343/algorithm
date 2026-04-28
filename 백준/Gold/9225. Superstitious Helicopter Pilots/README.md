# [Gold III] Superstitious Helicopter Pilots - 9225

[문제 링크](https://www.acmicpc.net/problem/9225)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 7, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 그래프 이론

### 문제 설명

<p>Helicopter pilots are both conservative and superstitious. They have a set of preferred hops (e.g. 10 km East, and 20 km North) which are ranked according to their desirability. Further, there are some locations on which they are unwilling to land (e.g. the pig farm 20 km East and 50 km North of here).</p>

<p>Your task is to fill out a flight plan for a journey, if possible. This journey must only use the pilot&rsquo;s preferred hops, and must never land at a forbidden point. Furthermore, each hop must be chosen to be the most preferred one which allows the remainder of the journey to be completed.</p>

<p>So, for instance, if the goal is to travel 30 km East and 40 km North, using hops of, in order, (10, 10) and (0, 10) but not passing through the point (30, 30), then one could do 1 northerly hop followed by three northeasterly ones , i.e. (0, 10) 3*(10, 10); but a preferable flight plan is to do two north-easterly hops followed by an northerly hop and a final north-easterly hop, i.e. 2*(10,10) (0, 10) (10,10). On the other hand, if the point (20,30) were also forbidden then no flight plan would be possible.</p>

<p>In all cases, the journey to be undertaken consists of a fixed positive distance east, and a fixed positive distance north and each preferred hop consists of a non-negative distance east and a non-negative distance north, not both 0.</p>

### 입력

<p>Input will consist of a number of journeys. Each journey will start with a line containing four integers: trip distance east, trip distance north, # of preferred hops, # of forbidden points. This will be followed by the preferred hops, in order, most preferred first, followed by the forbidden points, in both cases in the form: east-distance north-distance. Note that some hops may not be used and some forbidden points may be beyond the destination. The file will be terminated by a line containing 4 zeroes (0 0 0 0).</p>

### 출력

<p>Output will consist of one line per journey. Each line will start with the word &lsquo;Trip&rsquo;, followed by a space, the journey number (a running number starting at 1), a colon and a space (&lsquo;: &rsquo;) and a description of the trip in terms of hops. Note that successive identical hops are collected as in the above example. If the trip cannot be achieved then the description consists of the word &lsquo;impossible&rsquo;.</p>