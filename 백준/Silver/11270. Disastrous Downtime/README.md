# [Silver IV] Disastrous Downtime - 11270

[문제 링크](https://www.acmicpc.net/problem/11270)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 170, 정답: 116, 맞힌 사람: 93, 정답 비율: 70.992%

### 분류

구현

### 문제 설명

<p>You&rsquo;re investigating what happened when one of your computer systems recently broke down. So far you&rsquo;ve concluded that the system was overloaded; it looks like it couldn&rsquo;t handle the hailstorm of incoming requests. Since the incident, you have had ample opportunity to add more servers to your system, which would make it capable of handling more concurrent requests. However, you&rsquo;ve simply been too lazy to do it&mdash;until now. Indeed, you shall add all the necessary servers . . . very soon!</p>

<p>To predict future requests to your system, you&rsquo;ve reached out to the customers of your service, asking them for details on how they will use it in the near future. The response has been pretty impressive; your customers have sent you a list of the exact timestamp of every request they will ever make!</p>

<p>You have produced a list of all the n upcoming requests specified in milliseconds. Whenever a request comes in, it will immediately be sent to one of your servers. A request will take exactly 1000 milliseconds to process, and it must be processed right away.</p>

<p>Each server can work on at most k requests simultaneously. Given this limitation, can you calculate the minimum number of servers needed to prevent another system breakdown?</p>

### 입력

<p>The first line contains two integers 1 &le; n &le; 100 000 and 1 &le; k &le; 100 000, the number of upcoming requests and the maximum number of requests per second that each server can handle.</p>

<p>Then follow n lines with one integer 0 &le; t<sub>i</sub> &le; 100 000 each, specifying that the ith request will happen t<sub>i</sub> milliseconds from the exact moment you notified your customers. The timestamps are sorted in chronological order. It is possible that several requests come in at the same time.</p>

### 출력

<p>Output a single integer on a single line: the minimum number of servers required to process all the incoming requests, without another system breakdown.</p>