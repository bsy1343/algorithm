# [Gold III] Shark Tour - 10199

[문제 링크](https://www.acmicpc.net/problem/10199)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 26, 정답: 8, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 구현, 파싱, 문자열

### 문제 설명

<p>The minions who rode in Lucy&rsquo;s car for an underwater trip were very impressed by the many sharks they saw on the trip. When they got home they told the other minions. Now everyone wants to go back and see the sharks!</p>

<p>As before, Lucy&rsquo;s car&rsquo;s sonar can detect the depth and length of the tunnel, as well as the size and distance of several stalagmites sticking up from the bottom of the tunnel. For the shark tour Lucy has modified her car&rsquo;s sonar to also report how many sharks can be seen from each tunnel location. Because of viewing conditions, any shark can only be seen from exactly one location in the tunnel.</p>

<p>There is a strong current flowing through the tunnel that is carrying Lucy&rsquo;s car 1 meter forward each second. She can steer the car to either move up 1 meter, stay at the same depth, or move down 1 meter each second.</p>

<p>Your goal is to analyze all possible paths Lucy can take through the tunnel (while avoiding tunnel ceiling, floor, and stalagmites), and select the action sequence for the path that will allow the greatest number of shark sightings. Assume there always exists at least one path through the tunnel.</p>

<p>Lucy&rsquo;s car starts at the top left corner of the tunnel (distance = 0, depth = 0). It travels to the right, and is considered to have safely reached the end of the tunnel if it travels n &minus; 1 meters into a tunnel of length n.</p>

<p>A path through the tunnel will consist of n &minus; 1 actions for a tunnel of length n. Each action is represented by one of the characters &and;, &gt;, and v, indicating whether Lucy should steer the car up (decrease depth by 1 meter), keep it at the same depth, or steer the car down (increase depth by 1 meter) as it travels through the tunnel.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/3b1b8073-42b5-4867-bbd0-4ed0431cec7f/-/preview/" style="width: 342px; height: 233px;" /></p>

<p>In the example above, Lucy is trying to travel through a tunnel of depth 3 and length 5. There are two stalagmites. One is 1 meter high and 2 meters distant. The second is 2 meters high and 3 meters distant. There are 4 shark sightings at 2 meters distant (0 and 1 meter down), 4 meters distant (1 meter down). and 1 meter distant (2 meters down).</p>

<p>From the location 2 meters distant and 1 meter down, 4 sharks may be seen. From the position 4 meters distant and 1 meter down, 2 sharks may be seen. The action sequence &gt;v&and;&gt; takes Lucy&rsquo;s car through the tunnel along a path that passes through both of these locations, allowing a total of 6 sharks to be seen.</p>

<p>The parameters of this problem may be quite large. The tunnel may be long, with several thousand shark sightings. Exhaustively checking all possible paths through the tunnel will not work within the time allowed.</p>

### 입력

<p>The first line in the test data file contains the number of test cases. Each test case begins with a description of the depth and length of the tunnel. After that is the number of stalagmites, followed by the size and distance of each stalagmite on a separate line. Next is the number of shark sightings, followed by the number and location of each shark sighting on a separate line.</p>

### 출력

<p>For each test case, you are to output the maximum number of sharks possibly seen, and the action sequence required to see them using the following format: &rdquo;Saw n sharks for sequence actions&rdquo;</p>

<p>The exact desired input/output format is shown below in the examples.</p>