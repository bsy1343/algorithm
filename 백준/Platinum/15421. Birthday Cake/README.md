# [Platinum III] Birthday Cake - 15421

[문제 링크](https://www.acmicpc.net/problem/15421)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 70, 정답: 19, 맞힌 사람: 17, 정답 비율: 39.535%

### 분류

자료 구조, 기하학, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>On his birthday, John&rsquo;s parents made him a huge birthday cake! Everyone had a wonderful dinner, and now it&rsquo;s time to eat the cake. There are n candles on the cake. John wants to divide the cake into n pieces so that each piece has exactly one candle on it, and there are no leftover pieces. For that, he made m cuts across the cake. Could you help check if John&rsquo;s cuts successfully divide the candles on the cake?</p>

<p>Formally, the cake is a circle of radius r centered at (0, 0). The candles are n distinct points located strictly inside the circle. Each cut is a straight line ax + by + c = 0, described by three coefficients a, b, and c.</p>

### 입력

<p>Input starts with three integers n (1 &le; n &le; 50), m (1 &le; m &le; 15), and r (1 &le; r &le; 100) on the first line.</p>

<p>The next n lines give the locations of the candles. Each line has two integers x and y giving the coordinates of one candle (0 &le; sqrt(x<sup>2</sup> + y<sup>2</sup>) &lt; r).</p>

<p>The next m lines give the coefficients of the cutting lines. Each line has three integers a, b, and c (0 &le; |a|, |b| &le; 100, 0 &le; |c| &le; 20 000) describing a line of the form ax + by + c = 0. The values a and b are not both zero.</p>

<p>All candles and lines are distinct. No candle is on a cut line. No line is completely outside or tangent to the cake. The input guarantees that the number of cake pieces remains the same if any cut line is shifted by at most 10<sup>&minus;4</sup> in any direction. The input also guarantees that each candle remains in the interior of the same piece of cake if its position is shifted by at most 10<sup>&minus;4</sup> in any direction.</p>

### 출력

<p>Output &ldquo;yes&rdquo; if John&rsquo;s cuts successfully divide the cake so that each piece he obtains has exactly one candle on it. Otherwise, output &ldquo;no&rdquo;.</p>