# [Platinum I] Antimatter Rain - 21204

[문제 링크](https://www.acmicpc.net/problem/21204)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 17, 맞힌 사람: 15, 정답 비율: 93.750%

### 분류

자료 구조, 세그먼트 트리, 스위핑, 스택, 값 / 좌표 압축

### 문제 설명

<p>You&#39;ve heard of acid rain but have you heard of antimatter rain? Antimatter rain is so potent that when it comes into contact with another object, it immediately disintegrates both itself and the object. Kayla&#39;s job as a SpaceFleet Researcher is gathering weather data on exotic planets. This time, their assignment is to monitor the antimatter rainfall.</p>

<p>Sensors are set up in the planet&#39;s atmosphere and are about to be rained on with antimatter rain. Oh no! Kayla monitors a single 2D section. Each sensor is either a single horizontal strip or a single point. When one or more antimatter droplet fall on a single sensor, all of those droplets and the sensor disintegrate simultaneously. That is, they disappear. All other droplets will drop past where the sensor used to be.</p>

<p>Kayla sees all the antimatter rain drops the moment before they all start to fall. All droplets fall at exactly the same rate.</p>

<p>For each droplet, Kayla wants to know if and where it will disintegrate. Help them out with this demanding task!</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/21204.%E2%80%85Antimatter%E2%80%85Rain/e130eb4c.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/21204.%E2%80%85Antimatter%E2%80%85Rain/e130eb4c.png" data-original-src="https://upload.acmicpc.net/8d4d5fb4-8009-4ff6-ae88-1cee6362646d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 318px;" /></p>

<p>Illustration of the first sample. The vertical lines connect the drops to the sensor they hit. The drop with no associated vertical line will not hit any sensor.</p>

### 입력

<p>The first line of input contains two integers $D$ ($1 \leq D \leq 100\,000$), which is the number of antimatter droplets, and $S$ ($1 \leq S \leq 100\,000$), which is the number of sensors.</p>

<p>The next $D$ lines describe the droplets, in order. Each of these lines contains two integers $x$ ($1 \leq x \leq 10^9$), which is the $x$-coordinate of the droplet and $y$ ($1 \leq y \leq 10^9$), which is the $y$-coordinate of the droplet.</p>

<p>The next $S$ lines describe the sensors. Each line contains three integers $x_1$, $x_2$ ($1 \leq x_1 \leq x_2 \leq 10^9$), which is the leftmost and the rightmost $x$-coordinate of the sensor, and $y$ ($1 \leq y \leq 10^9$), which is the $y$-coordinate of the sensor.</p>

<p>It is guaranteed that no two drops will start in the same location, no drop will start on any sensor, and no two sensors touch (not even at a single point).</p>

### 출력

<p>For each droplet, in order, display a single number indicating the $y$-coordinate that it will disintegrate. If the droplet does not disintegrate, display $0$ instead. These values should appear on separate lines.</p>