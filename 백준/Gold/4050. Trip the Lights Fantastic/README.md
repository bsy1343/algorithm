# [Gold II] Trip the Lights Fantastic - 4050

[문제 링크](https://www.acmicpc.net/problem/4050)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 22, 정답: 6, 맞힌 사람: 4, 정답 비율: 40.000%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>Bob Roberts (father of Little Bobby of problem D) works at the Traffic Commission for a medium size town. Bob is in charge of monitoring the traffic lights in the city and dispatching repair crews when necessary. Needless to say, Bob has a lot of free time, so to while away the hours he tries to figure out the quickest way to take short trips between various points in the city. Bob has at his disposal a lot of information: the layout of streets in the city and the location and cycle times for all of the traffic lights. To simplify the solution process, he makes the following assumptions:</p>

<ol>
	<li>All cars travel at the same top speed, and, if sitting at a red light, take 5 seconds to react and get up to speed. (That is, Bob assumes the car is essentially standing still for 5 seconds, then proceeds at top speed. Bob also assumes the light will not have turned back to red in the 5 seconds it takes to get going.)</li>
	<li>Each car approaches a light at full speed and either passes through the light if it is green or yellow, or comes to an immediate stop if it is red. Cars are allowed to pass through a light if they hit it just as it is turning to green. Cars must stop if they reach the light just as it is turning to red.</li>
	<li>The time to make turns through a light is ignored. It is possible to travel between any two lights, although perhaps not directly.</li>
</ol>

<p>Furthermore, no u-turns are allowed nor will routes revisit an intersection. Even given these assumptions, Bob has difficulty coming up with minimum time paths. Let&rsquo;s see if you can help him.</p>

### 입력

<p>The first line of each test case will contain four positive integers n, m, s, and e, where n (2 &le; n &le; 100) is the number of traffic lights (numbered 0 through n &minus; 1), m is the number of roads between the traffic lights, and s and e (s &ne; e) are the starting and ending lights for the desired trip. There will then follow n lines of the form g y r indicating the number of seconds that each light is green, then yellow, then red. (1 &le; g,y,r &le; 100.) The first of these lines refers to light 0, the second to light 1, and so on. Following these n lines will be m lines, each describing one road. These lines will have the form l1 l2 t, where l1 and l2 are the two lights being connected by the road and t is the time (in seconds, t &le; 500) to travel the length of the road at full speed &mdash; you should add 5 to this value to obtain the travel time when driving the road beginning at a standstill. All roads are two way. At time 0, all lights are just starting their green period and your car is considered to be at a standstill at traffic light s. Since it takes 5 seconds to get going, you may assume that g + y is never less than or equal to 5. The last test case is followed by a line containing 0 0 0 0 indicating end-of-input.</p>

### 출력

<p>For each test case, output a single line containing the minimum time to travel from the start light to the end light. Output your results in the form mm:ss indicating the number of minutes and seconds the trip takes. If the number of seconds is less than 10 then preface it with a 0 (i.e., output 4:05, not 4:5). Likewise, if the number of minutes is less than 10, print just one digit (as in 4:05).</p>