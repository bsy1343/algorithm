# [Platinum III] Minimum Cost Flow - 14688

[문제 링크](https://www.acmicpc.net/problem/14688)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 108, 정답: 24, 맞힌 사람: 23, 정답 비율: 30.263%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>The city of Watermoo has buildings numbered 1, 2, . . . , N. The city has M pipes that connect pairs of buildings. Due to urban planning oversights, building 1 is the only sewage treatment plant in the city. Each pipe can be either active or inactive. The set of active pipes forms a valid plan if building 1 is directly or indirectly connected to each other building using active pipes. (Pipes directly connect pairs of buildings. Buildings X and Z are indirectly connected if X is directly or indirectly connected to Y , and Y is directly or indirectly connected to Z.)</p>

<p>The municipal government of Watermoo is currently operating a valid plan of N &minus; 1 pipes today, but they think it is too expensive! Each pipe has a monthly maintenance fee that the city must pay when it is active, and the total cost of a valid plan is the sum of the maintenance fees of its active pipes. (Inactive pipes cost nothing.)</p>

<p>Additionally, researchers at the University of Watermoo have developed an experimental pipe enhancer which you can use on one pipe of your choice. It will reduce that pipe&rsquo;s cost from C down to max(0, C &minus; D), where D is the enhancer&rsquo;s strength.</p>

<p>The city wants you to minimize the cost of the plan, and they want you to do it quickly. Every day, the city will allow you to activate one pipe, and deactivate another pipe. How many days do you need to make the set of active pipes form a valid plan, whose cost is minimum among all valid plans and all choices of enhanced pipe?</p>

<p>Note that it is possible that the plan becomes invalid while you are working, but by the end it should be a valid plan.</p>

### 입력

<p>The first line will contain the integers N, M, and D (1 &le; N &le; 100 000, N &minus; 1 &le; M &le; 200 000, 0 &le; D &le; 10<sup>9</sup>). Each of the next M lines contain three integers A<sub>i</sub>, B<sub>i</sub>, and C<sub>i</sub>, which means that there is a pipe from building A<sub>i</sub> to building B<sub>i</sub> that costs C<sub>i</sub> per month when activated (1 &le; A<sub>i</sub> , B<sub>i</sub> &le; N, 1 &le; C<sub>i</sub> &le; 10<sup>9</sup>). The first N &minus; 1 of these lines represent the valid plan the city is currently using.</p>

<p>It is guaranteed that there is at most one pipe connecting any two buildings and no pipe connects a building to itself.</p>

<p>For 3 of the 15 available marks, N &le; 8, M &le; 28 and D = 0.</p>

<p>For an additional 5 of the 15 available marks, N &le; 1 000 and M &le; 5 000 and D = 0.</p>

<p>For an additional 3 of the 15 available marks, D = 0.</p>

<p>For an additional 2 of the 15 available marks, N &le; 1 000 and M &le; 5 000.</p>

### 출력

<p>Output one integer on a single line, the minimum number of days to complete this task. If the initial valid plan is already an optimal plan, then output 0.</p>

### 힌트

<p>Explanation for Output for Sample Input 1</p>

<p>Note that it does not matter which pipe you use the pipe enhancer on because D = 0, so it will not affect the maintenance fee of any pipe.</p>

<p>On the first day, you should deactivate the pipe from building 2 to 3 and activate the pipe from building 4 to 1.</p>

<p>Explanation for Output for Sample Input 2</p>

<p>One solution using the minimum number of days is to first use the pipe enhancer on the pipe from building 1 to 2 to decrease its cost to 3. Then on the first day, replace the pipe from building 2 to 3 with the pipe from building 1 to 3, and on the second day replace the pipe from 1 to 4 with the pipe from building 1 to 5. Note that the cost of the optimal plan is 10.</p>

<p>Additionally, there are no solutions where you use the pipe enhancer on the pipe from building 1 to 3 or the pipe from building 1 to 5. Doing so would make that pipe have a maintenance fee of 0, and then any optimal plan would have cost 11 (and we have already seen that we can achieve a cost of 10).</p>

<p>Explanation for Output for Sample Input 3</p>

<p>The initial valid plan is already an optimal plan. Be careful of integer overflow when implementing your solution.</p>