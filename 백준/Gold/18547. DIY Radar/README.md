# [Gold II] DIY Radar - 18547

[문제 링크](https://www.acmicpc.net/problem/18547)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 15, 맞힌 사람: 14, 정답 비율: 56.000%

### 분류

기하학, 수학

### 문제 설명

<p>This is an interactive problem.</p>

<p>Pin is an avid inventor who creates awesome mechanisms and robots from junk. While constructing his new junkyard worker robot, Pin made a mistake of activating the robot&#39;s AI earlier than usual, which made the robot unpredictably run away into the junkyard.</p>

<p>Pin wants to go into the junkyard to pick the robot up, but the area is just too big. The robot ran away before having a GPS tracker installed, so Pin has no information about the robot&#39;s exact coordinates. If only there was a way to get a rough estimate of where the robot could be...</p>

<p>Pin remembered the robot had an autonomous radio repeater in one of its parts. If Pin would send a specific radio signal, the reply would give him at least some important information: the distance between him and the robot, which can be used for triangulation.</p>

<p>Pin&#39;s junkyard is a huge square with its opposite corners lying at points $(0, 0)$ and $(100, 100)$, and small paths run parallel to square sides between junk piles, intersecting at integer points. Robot&#39;s AI is programmed to situate himself in a random path intersection at the junkyard (including the junkyard&#39;s border) and work around there. Unfortunately for Pin, a security algorithm in the rogue robot complicates the task. Every time the robot detects a searching radio signal, it would move to an adjacent intersection. Pin decided that it would be easier and more sensible to find the intersection where the robot initially was, and then search for it through a number of surrounding intersections.</p>

<p>Pin does not want to step into the junkyard before knowing where the robot is, so he will use his radio from the area around it. But he will not go beyond his privately owned area, which contains every point that is no further than $1000$ vertically or horizontally from the junkyard&#39;s border.</p>

### 입력



### 출력

