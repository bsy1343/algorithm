# [Gold V] Toboggan Ride - 25807

[문제 링크](https://www.acmicpc.net/problem/25807)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 13, 맞힌 사람: 8, 정답 비율: 30.769%

### 분류

이분 탐색

### 문제 설명

<p>You are riding a toboggan on the straight line which can be modeled by the positive x-axis. You start at x = 0 and must get a boost to get started. Since there is friction, after that initial boost, eventually you would slow to a stop. Luckily, there are several positions along the positive x-axis where you will receive another boost! As long as you can make it to the next boosting position, you&rsquo;ll be able to finish the ride.</p>

<p>Of course, not only do you want to finish the ride, you also want to finish it within some time limit. Luckily, you are allowed to manipulate the boosts you receive. Unfortunately, you must set all boosts to the exact same value. Specifically, you must pick some constant, c, and then c meters/second will be added to your velocity instantaneously, as soon as you arrive at each boost point.</p>

<p>If you start at a position with an initial velocity of v meters/second, without any more boosts, you will travel for v seconds exactly, losing a velocity of 1 meter/second every second. At the end of the v seconds, you will be stationary and will have traveled a distance of v<sup>2</sup>/2 meters.</p>

<p>If you start at a position with an initial velocity of v and travel for t seconds, where t &lt; v, then you will travel a distance of t(v - t/2) meters.</p>

<p>Here is an example of a possible toboggan ride:</p>

<ul>
	<li>Boost value = 10 m/s</li>
	<li>Boost locations: x = 0, 32, 110</li>
	<li>End of Ride Location: x = 238</li>
</ul>

<p>Starting at x = 0 and traveling for 4 seconds, we go a distance of 4(10 - 4/2) = 32 m, arriving at the second boost point with a velocity of 6 m/s (since we lose 1 m of velocity each second).</p>

<p>The boost at x = 32 m changes our velocity from 6 m/s to 16 m/s.</p>

<p>Next, we travel for 6 seconds and go a distance of 6(16 - 6/2) = 78 m, arriving at x = 32 m + 78 m = 110 m, where we get our final boost. At this point in time, our velocity is 16 m/s - 6 m/s = 10 m/s.</p>

<p>We receive the final boost at x = 110 m, which changes our velocity from 10 m/s to 20 m/s. We travel another 8 seconds and go a distance of 8(20 - 8/2) = 128 to finish the ride at x = 238 m.</p>

<p>Thus, in order to finish the ride in 4 + 6 + 8 = 18 seconds, we must set our boost to at least 10 m/s.</p>

<p>Given the length of the toboggan ride (in meters), the locations where a boost will be provided, and an amount of time to finish the ride (in seconds), determine the least amount of boost in meters/second necessary to finish the ride by the desired goal time.</p>

### 입력

<p>The first input line contains three space separated integers: L (1 &le; L &le; 10<sup>9</sup>), indicating the length of the toboggan ride in meters, n (1 &le; n &le; 100), indicating the number of boosts, and t (1 &le; t &le; 10<sup>9</sup>), indicating the amount of time in seconds to complete the ride.</p>

<p>The second input line contains n space separated distinct integers b<sub>1</sub>, b<sub>2</sub>, b<sub>3</sub>, &hellip;., b<sub>n</sub> (0 = b<sub>1</sub> &lt; b<sub>2</sub> &lt; b<sub>3</sub> &lt; &hellip; &lt; b<sub>n</sub> &lt; L), representing the locations where the n boosts occur. Note that the first value in this list is zero (0).</p>

### 출력

<p>Print a single floating-point number representing the minimum boost necessary to finish the ride in the desired amount of time. Any answer with an absolute or relative error of 10<sup>-5</sup> will be accepted.</p>