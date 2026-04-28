# [Gold III] Scorched Earth - 11105

[문제 링크](https://www.acmicpc.net/problem/11105)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 96, 정답: 19, 맞힌 사람: 16, 정답 비율: 17.978%

### 분류

물리학

### 문제 설명

<p>General Arne Heisveis is a victim of the constant cuts in funding for the Norwegian defence. There is basically no money available, and Arne is forced to spend his workdays in a dull office doing nothing.</p>

<p>To avoid an unworthy death from boredom, one of Arne&rsquo;s colleagues found an old computer game called Scorched Earth, which the generals now play all day. The problem is that Arne is not very talented in this game, but still very competitive. He therefore wants you to write a program to help him cheat.</p>

<p>A screen-shot from Scorched Earth is shown above. The generals&rsquo; contest will be a series of battles between two players, and the only allowed weapons are small missiles. Each player controls a tank, and the objective is to destroy the opponents tank by shooting it. The players take turns in shooting, and control the angle and initial velocity of their missiles. The initial velocity can never exceed 300.0 m/s, and can of course never be negative.</p>

<p>In order for a projectile to hit, it must avoid all the mountains in the field, and have the correct velocity and angle to hit the opponent. The gravity is always 9.8 m/s<sup>2</sup>, and there may also be wind. To keep things simple, we assume that the wind gives the projectile a constant acceleration.</p>

<p>Arne is quite confident in finding an angle that will avoid all the mountains in the battlefield, but needs your help adjusting the velocity of the shot.</p>

### 입력

<p>The input has n &le; 1000 cases, where n is given by the first line of input. Each test case is described by a line with 6 floating point numbers x<sub>u</sub>, y<sub>u</sub>, x<sub>o</sub>, y<sub>o</sub>, w, d. Your tank is positioned at (x<sub>u, </sub>y<sub>u</sub>) in meters, and your opponents at (x<sub>o</sub>, y<sub>o</sub>), where 0.0 &le; x<sub>u</sub>,&nbsp;x<sub>o</sub> &le; 1000.0 and 0.0 &le; y<sub>u</sub>, y<sub>o</sub> &le; 800.0. The number &minus;2.0 &le; w &le; 2.0 gives the acceleration in m/s<sup>2</sup> of the projectile along the x-axis caused by the wind. The angle chosen by Arne is given by 0 &le; d &le; 180 in degrees. An angle d = 0 implies a shot along the increasing x-axis, and d = 90 would have implied a shot along the increasing y-axis.</p>

### 출력

<p>Output for each test case a line with an initial velocity within the bounds which will ensure a hit, with 5 digits precision. If this is not possible, output a line with the text &ldquo;impossible&rdquo;.</p>