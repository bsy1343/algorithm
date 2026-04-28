# [Gold III] Invitation Cards - 3494

[문제 링크](https://www.acmicpc.net/problem/3494)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 8, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>In the age of television, not many people attend theater performances. Antique Comedians of Malidinesia are aware of this fact. They want to propagate theater and, most of all, Antique Comedies. They have printed invitation cards with all the necessary information and with the programme. A lot of students were hired to distribute these invitations among the people. Each student volunteer has assigned exactly one bus stop and he or she stays there the whole day and gives invitation to people travelling by bus. A special course was taken where students learned how to influence people and what is the difference between influencing and robbery.</p>

<p>The transport system is very special: all lines are unidirectional and connect exactly two stops. Buses leave the originating stop with passangers each half an hour. After reaching the destination stop they return empty to the originating stop, where they wait until the next full half an hour, e.g. X:00 or X:30, where &#39;X&#39; denotes the hour. The fee for transport between two stops is given by special tables and is payable on the spot. The lines are planned in such a way, that each round trip (i.e. a journey starting and finishing at the same stop) passes through a&nbsp;<em>Central Checkpoint Stop</em>&nbsp;(CCS) where each passenger has to pass a thorough check including body scan.</p>

<p>All the ACM student members leave the CCS each morning. Each volunteer is to move to one predetermined stop to invite passengers. There are as many volunteers as stops. At the end of the day, all students travel back to CCS. You are to write a computer program that helps ACM to minimize the amount of money to pay every day for the transport of their employees.</p>

### 입력

<p>The input consists of&nbsp;<var>N</var>&nbsp;cases. The first line of the input contains only positive integer&nbsp;<var>N</var>. Then follow the cases. Each case begins with a line containing exactly two integers&nbsp;<var>P</var>&nbsp;and&nbsp;<var>Q</var>,<var>1 &lt;= P,Q &lt;= 1000000</var>.&nbsp;<var>P</var>&nbsp;is the number of stops including CCS and&nbsp;<var>Q</var>&nbsp;the number of bus lines. Then there are&nbsp;<var>Q</var>&nbsp;lines, each describing one bus line. Each of the lines contains exactly three numbers - the originating stop, the destination stop and the price. The CCS is designated by number&nbsp;<var>1</var>. Prices are positive integers the sum of which is smaller than<var>1000000000</var>. You can also assume it is always possible to get from any stop to any other stop.</p>

### 출력

<p>For each case, print one line containing the minimum amount of money to be paid each day by ACM for the travel costs of its volunteers.</p>