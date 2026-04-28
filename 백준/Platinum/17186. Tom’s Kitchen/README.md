# [Platinum I] Tom’s Kitchen - 17186

[문제 링크](https://www.acmicpc.net/problem/17186)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 96, 정답: 41, 맞힌 사람: 33, 정답 비율: 46.479%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Tom&rsquo;s Kitchen is a very popular restaurant. One of the reasons for its popularity is that every single meal is prepared by at least K different chefs. Today, there are N meals to be prepared, with meal i needing A<sub>i</sub> hours of work.</p>

<p>There are M chefs which Tom can hire to prepare all the meals but the chef j will work at most B<sub>j</sub> hours. Additionally, even when he works less, he still wants to be paid for the full Bj hours. A chef can work on several meals for different amounts of time, but any meal will be properly prepared only if at least K chefs take part in preparing it and the total time they spend is exactly A<sub>i</sub>. When a chef takes part in preparing a meal, he always works on it some positive integer number of hours.</p>

<p>Tom needs help in choosing the optimal subset of chefs such that the sum of hours where the chefs are getting paid without working is minimized.</p>

### 입력

<p>The first line contains the integers N, M, and K.</p>

<p>The second line contains N integers A<sub>i</sub> and the third line M integers B<sub>j</sub>.</p>

### 출력

<p>The only line should contain the number of hours the chefs spend not working but still getting paid when Tom chooses the optimal subset to hire. If there is no way to prepare all the N meals according to the rules described above, output &ldquo;Impossible&rdquo;.</p>