# [Gold II] Backpack Buddies - 17902

[문제 링크](https://www.acmicpc.net/problem/17902)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 20, 맞힌 사람: 15, 정답 비율: 48.387%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>The prudent Mr. Day and adventurous Dr. Knight have decided to be backpack buddies and go trekking in the gorgeous Norwegian mountains. Of course they will use the trails marked by the Norwegian Trekking Association (DNT), like any sane trekkers would; such trails all start and end at some cabin where it is possible to lay over. Mr. Day for one likes sleeping comfortably, so he immediately suggested that they sleep in a cabin every night.</p>

<p>However, Dr. Knight was of a different opinion; she argued that they&rsquo;d arrive at their destination much quicker if they went for as long as possible each day, and then slept in tents in between two cabins if need be. Even though Mr. Day agreed that reaching the destination as quickly as possible was desirable, he was not willing to sacrifice the comfort of a proper bed.</p>

<p>After a fierce argument, Mr. Day and Dr. Knight decided to split up, each to follow their own strategy. Assuming they both walk at the same pace, how long will Dr. Knight need to wait at the final destination before Mr. Day shows up?</p>

### 입력

<p>The first line of input contains two integers, n (1 &le; n &le; 100 000) the number of cabins, and m (1 &le; m &le; 100 000) the number of trails. Then follows m lines, each describing a trail. The i&rsquo;th such line contains three integers, u<sub>i</sub>, v<sub>i</sub> and d<sub>i</sub> (0 &le; u<sub>i</sub>, v<sub>i</sub> &lt; n, 0 &le; d<sub>i</sub> &le; 12) meaning that there is a trail between cabin u<sub>i</sub> and cabin v<sub>i</sub> which will take exactly d hours to traverse. (There can be more than one trail between two cabins, and some trails could lead back to the same cabin from where it started).</p>

<p>Mr. Day and Dr. Knight start in cabin 0 and their destination is cabin n &minus; 1. Each day they start walking at 08:00 in the morning, and then walks non-stop for (at most) 12 hours before settling down for the night.</p>

### 출력

<p>Output a single integer, the number of hours Dr. Knight needs to wait at the destination before Mr. Day shows up.</p>