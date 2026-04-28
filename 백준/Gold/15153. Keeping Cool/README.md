# [Gold I] Keeping Cool - 15153

[문제 링크](https://www.acmicpc.net/problem/15153)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 185, 정답: 19, 맞힌 사람: 19, 정답 비율: 18.269%

### 분류

그래프 이론, 기하학, 최단 경로, 데이크스트라

### 문제 설명

<p>Kevin has just gotten back to his car after a morning at the beach and is about to drive away when he realises that he has left his ball somewhere. Thankfully, he remembers exactly where it is! Unfortunately for Kevin, it is extremely hot outside and any sand that is exposed to direct sunlight is very hot. Kevin&rsquo;s pain tolerance allows him to only run for at most k seconds in the hot sand at one time. Kevin runs at exactly 1 metre per second on hot sand.</p>

<p>Scattered around the beach are umbrellas. Each umbrella is a perfect circle and keeps the sand underneath it cool. Each time Kevin reaches an umbrella, he will wait there until his feet cool down enough to run for another k seconds on the hot sand. Note that Kevin will not run more than k seconds in the hot sand at one time, so if two umbrellas are more than k metres apart, Kevin will not run between them.</p>

<p>Determine the minimum amount of time that Kevin must be in the sun in order to retrieve his ball and return back to the car.</p>

### 입력

<p>The first line of input contains four integers n (0 &le; n &le; 100), which is the number of umbrellas, k (1 &le; k &le; 100), which is the number of metres that Kevin can run on the hot sand, x (&minus;100 &le; x &le; 100) and y (&minus;100 &le; y &le; 100), which are the coordinates of the beach ball. Kevin starts at his car at (0, 0). You may treat Kevin and the ball as single points.</p>

<p>The next n lines describe the umbrellas. Each of these lines contains three integers x (&minus;100 &le; x &le; 100), y (&minus;100 &le; y &le; 100) and r (1 &le; r &le; 100). The umbrella is a circle centred at (x, y) with radius r.</p>

<p>There may be multiple items (ball, umbrella(s) or Kevin) at a single location. All measurements are in metres.</p>

### 출력

<p>Display the minimum amount of time (in seconds) that Kevin must be in the sun. If it is impossible for Kevin to get to the ball and return back to the car, display -1 instead. Your answer should have an absolute or relative error of less than 10<sup>&minus;6</sup>.</p>