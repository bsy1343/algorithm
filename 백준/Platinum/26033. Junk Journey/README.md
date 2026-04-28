# [Platinum III] Junk Journey - 26033

[문제 링크](https://www.acmicpc.net/problem/26033)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 16, 맞힌 사람: 14, 정답 비율: 56.000%

### 분류

구현

### 문제 설명

<p>You are MALL-E, the mall scooter scooper robot. Your job is to fetch all the misplaced mall scooters at the end of the day and return them to the scooter depot. The mall is an infinite grid, containing $n$ scooters that need to be returned. You can move in one of four directions: up, down, left, or right, and each move takes one second. If you move to a location that contains a scooter, that scooter moves to the next location in the same direction you were moving. If a scooter moves into a location that contains another scooter, the same thing happens, so there is never more than one scooter at each location and you never occupy the same location as a scooter. If a scooter moves to the scooter depot, it disappears. However, the robot can freely move over the scooter depot.</p>

<p>The mall will soon open. You need to find a way to get all the scooters to the depot in at most $10^5$ seconds.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26033.%E2%80%85Junk%E2%80%85Journey/75113bc0.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26033.%E2%80%85Junk%E2%80%85Journey/75113bc0.png" data-original-src="https://upload.acmicpc.net/d493510b-f5bd-4cbb-be28-3dee35417e7e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 224px; height: 228px;" /></p>

<p style="text-align: center;">A picture of Sample Input 2. The two leftmost scooters can be pushed in the depot by moving up three times and moving right twice.</p>

### 입력

<p>The first line of the input contains a single integer $n$ ($1 \leq n \leq 50$). The next line contains four integers $x_0$, $y_0$, $x_t$, and $y_t$ ($0 \leq x_0, y_0, x_t, y_t \leq 30$). This indicates that you start at $(x_0, y_0)$ and the depot is located at $(x_t, y_t)$. Then follow $n$ lines, each containing two integers $x$ and $y$ ($0 \leq x, y \leq 30$). This indicates that there is a scooter located at $(x, y)$. You, the depot, and all the scooters will all have distinct locations.</p>

### 출력

<p>The output should contain a sequence of instructions, each on its own line. An instruction is one of the following strings: &quot;up&quot;. &quot;down&quot;, &quot;left&quot;, or &quot;right&quot;.</p>