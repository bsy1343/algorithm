# [Silver I] Come Minion! - 26329

[문제 링크](https://www.acmicpc.net/problem/26329)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 23, 맞힌 사람: 14, 정답 비율: 93.333%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Welcome treasure hunter! I am the great and powerful interplanetary ninja and you are my minion. We must hurry to save this planet from the evil, &ldquo;Dialog Not Found&rdquo;. We must travel across the land so that I may prevent &ldquo;Dialog Not Found&rdquo; from their evil plans. Also just so you know, minion, I am unable to triumph over a great many trials. Some of these include being looked at, handshakes, and even stairs.</p>

<p>Given a map of locations, routes between locations, and the trials which exist along routes, help the interplanetary ninja reach their target. You must avoid any of the trials that the ninja is unable to triumph over. Then tell the interplanetary ninja if they are able to reach their target and save the world.</p>

### 입력

<p>The first input line contains a positive integer, m, indicating the number of maps to check. Each map will start with an integer on a new line, t (0 &le; t &le; 50), that describes the number of trials that the ninja is unable to accomplish. On the next t lines these trials are listed, one per line. The following line will contain two integers, n (2 &le; n &le; 30) and e (0 &le; e &le; 500). n indicates the number of locations on the map (numbered 0 through n-1) and e indicates the total number of routes between locations on the map. Assume the ninja&rsquo;s starting location number is 0 and the ninja&rsquo;s target location is n-1.</p>

<p>The following e lines each describe a route between a pair of locations, and the trial on that route. These lines will consist of two integers L<sub>a</sub> and L<sub>b</sub> and a string Q. The ninja can travel between location L<sub>a</sub> and location L<sub>b</sub>, or between L<sub>b</sub> and L<sub>a</sub>, as long as he does not have the trial (Q) on that route. For example, if ninja has the trial &ldquo;xyz&rdquo; and the route also has the trial &ldquo;xyz&rdquo;, then ninja cannot travel on that route. Assume that there is at most one route between any two locations and exactly one trial for a route.</p>

<p>All locations are numbered from 0 to n-1, inclusive. All trials are named using only lowercase letters, 1 to 20 in length. If a trial is not on the &ldquo;unable to accomplish&rdquo; list of ninja, then the ninja will be able to accomplish it. Successive values on a line are separated by exactly one space. There are no leading or trailing spaces on any line.</p>

### 출력

<p>For each map, output a line that contains only a 1 if the ninja can reach his target and a 0 if the ninja is unable to reach his target. Each answer must be on a separate line.</p>