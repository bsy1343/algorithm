# [Gold V] Vacuum World - 9758

[문제 링크](https://www.acmicpc.net/problem/9758)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 41, 정답: 10, 맞힌 사람: 7, 정답 비율: 26.923%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>The Vacuum World is a classic example for students in the state space search topic. In this question, we add some constraint to the classic question to make it slightly more difficult. In this world, there is a row of N consecutive rooms and M vacuum cleaners. Each cleaner has three attributes, namely power (W), position (P), and moving cost (C). The power W is the maximum amount of dirt that can be cleaned per one operation. The position P is the index of the room where the cleaner is working. The moving cost C is the cost that we must spend to move the cleaner. Moreover, in each step, we can operate only one operation among all cleaners in each step. An example of the cleaner&#39;s operations is shown below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9758.%E2%80%85Vacuum%E2%80%85World/64b8276b.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9758.%E2%80%85Vacuum%E2%80%85World/64b8276b.png" data-original-src="https://upload.acmicpc.net/8b53dcc1-0263-45ae-9702-7cbba627dc3a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 410px; height: 406px;" /></p>

<p>In the example, there are four rooms, i.e. 0, 1, 2, and 3, two vacuum cleaners in room 1 and 2. The cleaner room 1 has power level 2 with moving cost 1 and the one in room 2 has power level 5 with moving cost 2. There is dirt in room 1 and 3 with the amount of 2 and 8 respectively. From the start state in figure (1), the cleaner in room 1 sucks the dirt in room 1. The result is shown in figure (2). At the state in figure (2), the cleaner in room 2 moves to room 3. Now the status is in figure (3). Then, the cleaner in room 3 sucks twice so that the state is changed to figure (4) and (5) respectively. The cost that we have to spend for all states is 1 (figure (1) &rarr; (2)) + 2(figure (2) &rarr; (3)) + 1 (figure (3) &rarr; (4)) + 1 (figure (4) &rarr; (5) = 5. Please note that moving operation cost depends on the moving cost of each cleaner while sucking operation cost is 1 unit. Moreover, you can move a cleaner across the other cleaner with the same cost as moving the cleaner to the consecutive room. As shown in the figure, moving from (a) to (b) and to (c) has the same cost that is 1 (moving cost of the cleaner in room 1 is 2).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9758.%E2%80%85Vacuum%E2%80%85World/eab570c4.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9758.%E2%80%85Vacuum%E2%80%85World/eab570c4.png" data-original-src="https://upload.acmicpc.net/05bb0257-22e4-473a-b94c-69fdc064948f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 298px; height: 166px;" /></p>

<p>In this question, the maximum number of the vacuum is just only two.</p>

### 입력

<p>The first line contains the total number of test cases. The first line of each test case contains two integers, M and N. Each of next M line has three integers, power (W), position (P), and moving cost (C). The last line stores the amount of dirt in each of N rooms. Moreover 1 &le; M &le; 2 and N &lt; 10, and the best total cost to clean up all rooms is less than 10.</p>

### 출력

<p>For each test case, you must print the least cost of operations that can clean up all rooms in a single line. (If there are 10 test cases, the output will be in 10 lines.)</p>