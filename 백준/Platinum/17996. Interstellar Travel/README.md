# [Platinum II] Interstellar Travel - 17996

[문제 링크](https://www.acmicpc.net/problem/17996)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 59, 정답: 25, 맞힌 사람: 16, 정답 비율: 57.143%

### 분류

구현, 수학, 누적 합, 정렬, 스위핑

### 문제 설명

<p>You are planning to travel in interstellar space in hope of finding habitable planets. You have already identified <em>n</em> stars that can recharge your spaceship via its solar panels. The only work left is to decide the orientation of the spaceship that maximizes the distance it can travel.</p>

<p>Space is modeled as a 2D plane, with the Earth at the origin. The spaceship can be launched from the Earth in a straight line, in any direction. A star can provide enough energy to travel a certain distance if the spaceship is launched at a certain angle with the <em>X</em>-axis. If the angle is not perfectly aligned, then the spaceship gets less energy.</p>

<p>Each star has a distance <em>t</em> that the spaceship can travel if launched at an angle <em>a</em> with the <em>X</em>-axis, and a multiplier <em>s</em> which indicates the decay of distance as angles diverge from <em>a</em>. if the launch direction makes an angle of <em>b</em> with the <em>X</em>-axis, then the spaceship gets enough energy to travel a distance of:</p>

<p style="text-align: center;">max(0, <em>t</em> - <em>s</em>&nbsp;&middot; dist[<em>a</em>, <em>b</em>])</p>

<p>where dist[<em>a</em>, <em>b</em>] is the minimum non-negative radians needed to go between angles <em>a</em> and <em>b</em>. The total distance that the spaceship can travel is simply the sum of the distances that each star contributes.</p>

<p>Find the maximum distance that the starship can travel.</p>

### 입력

<p>The first line of input contains a single integer <em>n</em> (1 &le; <em>n</em> &le; 10<sup>5</sup>), which is the number of stars.</p>

<p>Each of the next <em>n</em> lines contains three space-separated real numbers</p>

<p style="text-align: center;"><em>t</em> (0.0 &lt; <em>t</em> &le; 1000.0) <em>s</em> (0.0 &le; <em>s</em> &le; 100.0) <em>a</em> (0.0 &le; <em>a</em> &lt; 2&pi;)</p>

<p>where <em>t</em> is the greatest distance that star&rsquo;s energy can support, <em>s</em> is that star&rsquo;s decay multiplier, and <em>a</em> is the best angle for achieving the greatest distance from energy from that star.</p>

### 출력

<p>Output a single real number, which is the maximum distance that the spacecraft can travel. Your answer must be accurate to within 10<sup>-6</sup>&nbsp;absolute or relative error.</p>