# [Platinum II] Floor Tiles in a Park - 25645

[문제 링크](https://www.acmicpc.net/problem/25645)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

백트래킹, 많은 조건 분기, 조합론, 수학

### 문제 설명

<p>Grammy is enjoying her holiday in Pigeland City Park. She was interested in the floor tiles in the park. After careful examination, she found out that each of the floor tiles is a $W \times H$ rectangle grid with vertical and/or horizontal colored segments on it. The colored segments have ends on grid points, and they split the rectangle into exactly $k$ subrectangles.</p>

<p>For instance, the following illustration shows a floor tile with $W = 9$, $H = 5$, $k = 4$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25645.%E2%80%85Floor%E2%80%85Tiles%E2%80%85in%E2%80%85a%E2%80%85Park/6162d0d4.png" data-original-src="https://upload.acmicpc.net/53dd18b6-c4f8-409e-a6ed-95b1c2ee4fbb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Grammy wants to know the number of different floor tiles satisfying the condition. Please tell her the answer. Since the answer may be very large, you should output the number modulo $998\,244\,353$.</p>

<p>Note that two floor tiles are considered different if and only if a grid line is colored in one tile but not in the other. If two tiles can turn into the same by rotation or reflection, they may still be considered as different tiles.</p>

### 입력

<p>The only line contains three integers $W,$ $H,$ $k$ ($1 \leq W, H \leq 10^9$, $1 \leq k \leq \min(5, W \cdot H)$).</p>

### 출력

<p>Output a single integer denoting the number of different floor tiles modulo $998\,244\,353$.</p>