# [Platinum IV] Laser Shot - 4480

[문제 링크](https://www.acmicpc.net/problem/4480)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 16, 맞힌 사람: 8, 정답 비율: 42.105%

### 분류

브루트포스 알고리즘, 유클리드 호제법, 기하학, 수학, 정수론

### 문제 설명

<p>You&#39;re a droid, and you want to try to shoot a Jedi in the room. It&#39;s well known that a Jedi can block a laser with his light saber, so shooting him directly won&#39;t work. What you can do, though, is shoot two lasers in such a way that they hit him simultaneously from different angles, in which case he can&#39;t block both. Conveniently, the (square) room is mirrored, so you can bounce laser shots off the walls. However, these are not perfectly silvered mirrors, so each laser can only bounce a limited number of times before it dissipates.</p>

<p>As a droid, you have other tasks to complete, so you want to minimize the time spent between firing the two laser shots. You have two laser pistols and droid reflexes, so you can shoot them off at an arbitrarily small interval (including simultaneously).</p>

<p>The room is a square, 1,000,000 feet on each side. Its lower left corner is at (0, 0) and its upper right corner is at (1,000,000, 1,000,000). You are at (x<sub>1</sub>, y<sub>1</sub>) and the Jedi is at (x<sub>2</sub>, y<sub>2</sub>). A laser that bounces around and then passes through (x<sub>1</sub>, y<sub>1</sub>) will continue along its path (you planned the shot, after all, so you can dodge it), but a laser immediately halts as soon as it hits (x<sub>2</sub>, y<sub>2</sub>). A laser fired at a wall follows the normal rules of reflection (angle of incidence = angle of reflection, and reflection introduces no extra delay). A laser fired directly at a corner will rebound exactly opposite the direction it was fired, and will count as having bounced twice. For simplicity, assume the speed of light (and therefore of the laser) is 1 foot per nanosecond.</p>

### 입력

<p>Each test case consists of a single line of 5 space-separated integers x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>, n, where x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, and y<sub>2</sub> are as described above, and n is the maximum number of bounces. 1 &le; x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub> &le; 999,999, and 1 &le; n &le; 100. You are guaranteed that the droid and Jedi are not in the same location, i.e., (x<sub>1</sub>, y<sub>1</sub>) != (x<sub>2</sub>, y<sub>2</sub>). The last test case is followed by &ldquo;0 0 0 0 0&rdquo;, which should not be processed.</p>

<p>&nbsp;</p>

### 출력

<p>For each test case, print on a single line the minimum delay between the firing of the lasers in nanoseconds, accurate to 5 decimal places. Note that the test data have been constructed to ensure that no answers are within 1e-6 of a rounding boundary.</p>