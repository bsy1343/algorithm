# [Platinum II] The Fortress Defense - 27204

[문제 링크](https://www.acmicpc.net/problem/27204)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 11, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

수학, 다이나믹 프로그래밍, 누적 합, 조합론

### 문제 설명

<p>The Flatlanders are building a fortress on a grid of square cells. The fortress will have several contours of defense. Each contour is a rectangle with sides along the borders of the cells.</p>

<p>The first, outer, defense contour is a rectangle of size $h \times w$. Each next contour is strictly inside all previous ones. Defense contours should not have common points.</p>

<p>The level of cell defense is the number of defense contours inside which this cell lies. The defense level of a fortress is equal to the sum of the defense levels of all its cells. For example, the fortress defense level in the picture is $16 \cdot 1 + 8\cdot 2 + 3 = 35$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27204.%E2%80%85The%E2%80%85Fortress%E2%80%85Defense/d388e01d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27204.%E2%80%85The%E2%80%85Fortress%E2%80%85Defense/d388e01d.png" data-original-src="https://upload.acmicpc.net/5ab2f973-572f-4d94-868b-086587841adb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 233px; height: 233px;" /></p>

<p>The Flatlanders are interested in all possible ways to build a fortress. They calculate the defense level of the fortress for each possible way, then calculate the sum of values of all ways. You should help the Flatlanders to calculate this sum. The answer can be large, output its modulo $10^9 + 7$.</p>

### 입력

<p>In the first line of input there are two integers $h$ and $w$ ($1 \le h, w \le 400$).</p>

### 출력

<p>Output single integer: the sum of defense levels for all ways to build a fortress modulo $10^9 + 7$.</p>

### 힌트

<p>All possible ways to build a fortress from the first sample are in the picture.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27204.%E2%80%85The%E2%80%85Fortress%E2%80%85Defense/82361fad.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27204.%E2%80%85The%E2%80%85Fortress%E2%80%85Defense/82361fad.png" data-original-src="https://upload.acmicpc.net/f7da3cb0-605b-4790-a297-96e24e8f2e24/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 342px; height: 119px;" /></p>

<p>All possible ways to build a fortress from the second sample are in the picture.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27204.%E2%80%85The%E2%80%85Fortress%E2%80%85Defense/90263d03.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27204.%E2%80%85The%E2%80%85Fortress%E2%80%85Defense/90263d03.png" data-original-src="https://upload.acmicpc.net/54909973-3949-4885-9579-1be3af0bc3ce/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 630px; height: 392px;" /></p>