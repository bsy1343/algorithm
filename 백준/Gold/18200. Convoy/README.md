# [Gold IV] Convoy - 18200

[문제 링크](https://www.acmicpc.net/problem/18200)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 121, 정답: 40, 맞힌 사람: 34, 정답 비율: 42.500%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐, 매개 변수 탐색

### 문제 설명

<p>You and your friends have gathered at your house to prepare for the Big Game, which you all plan to attend in the afternoon at the football stadium across town. The problem: you only have k cars between you, with each car seating five people (including the driver), so you might have to take multiple trips to get all n people to the stadium. In addition, some of your friends know the city better than others, and so take different amounts of time to drive to the stadium from your house. You&rsquo;d like to procrastinate as long as possible before hitting the road: can you concoct a transportation plan that gets all people to the stadium in the shortest amount of time possible?</p>

<p>More specifically, each person i currently at your house can drive to the stadium in ti minutes. All k cars are currently parked at your house. Any person can drive any car (so the cars are interchangeable). After a car arrives at the stadium, any person currently at the stadium can immediately start driving back to your house (and it takes person i the same amount of time ti to drive back as to drive to the stadium), or alternatively, cars can be temporarily or permanently parked at the stadium. Drivers driving to the stadium can take up to four passengers with them, but drivers driving back can NOT take any passenger. You care only about getting all n people from your house to the stadium&mdash;you do NOT need to park all k cars at the stadium, if doing so would require more time than an alternative plan that leaves some cars at your house.</p>

### 입력

<p>The first line of input contains two space-separated integers n and k (1 &le; n, k &le; 20 000), the number of people at your house and the number of available cars. Then follow n lines containing a single integer each; the ith such integer is the number of seconds t<sub>i</sub> (1 &le; t<sub>i</sub> &le; 1 000 000) that it takes person i to drive from your house to the stadium, or vice-versa.</p>

### 출력

<p>Print the minimum number of seconds it takes to move all n people from your house to the stadium, if all people coordinate and drive optimally.</p>