# [Gold V] Bessie Slows Down - 9878

[문제 링크](https://www.acmicpc.net/problem/9878)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 349, 정답: 143, 맞힌 사람: 103, 정답 비율: 42.562%

### 분류

구현, 자료 구조, 정렬, 시뮬레이션, 우선순위 큐

### 문제 설명

<p>Bessie the cow is competing in a cross-country skiing event at the winter Moolympic games.  She starts out at a speed of 1 meter per second. However, as she becomes more tired over time, she begins to slow down. Each time Bessie slows down, her speed decreases: she moves at 1/2 meter per second after slowing down once, then 1/3 meter per second after slowing down twice, and so on.</p><p>You are told when and where Bessie slows down, in terms of a series of events.  An event like this:</p><p>T 17</p><p>means that Bessie slows down at a specific time -- here, 17 seconds into the race.  An event like this:</p><p>D 10</p><p>means that Bessie slows down at a specific distance from the start -- in this case, 10 meters.</p><p>Given a list of N such events (1 &lt;= N &lt;= 10,000), please compute the amount of time, in seconds, for Bessie to travel an entire kilometer.  Round your answer to the nearest integer second (0.5 rounds up to 1).</p>

### 입력

<ul><li>Line 1: The value of N.</li><li>Lines 2..1+N: Each line is of the form &quot;T x&quot; or &quot;D x&quot;, indicating a time event or a distance event.  In both cases, x is an integer that is guaranteed to place the event before Bessie reaches one kilometer of total distance.  It is possible for multiple events to occur simultaneously, causing Bessie to slow down quite a bit all at once.  Events may not be listed in order.</li></ul>

### 출력

<ul><li>Line 1: The total time required for Bessie to travel 1 kilometer.</li></ul>

### 힌트

<h4>Input Details</h4><p>Bessie slows down at time t = 30 and at distance d = 10.</p><h4>Output Details</h4><p>Bessie travels the first 10 meters at 1 meter/second, taking 10 seconds. She then slows down to 1/2 meter/second, taking 20 seconds to travel the next 10 meters.  She then reaches the 30 second mark, where she slows down again to 1/3 meter/second.  The remaining 980 meters therefore take her 980 * 3 = 2940 seconds.  The total time is therefore 10 + 20 + 2940 = 2970.</p>