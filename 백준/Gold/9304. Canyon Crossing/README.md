# [Gold III] Canyon Crossing - 9304

[문제 링크](https://www.acmicpc.net/problem/9304)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 17, 맞힌 사람: 13, 정답 비율: 68.421%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 기하학, 분리 집합, 피타고라스 정리

### 문제 설명

<p>Friendship One is a brand new rover commissioned by the Astronautical Center for Machinery to explore Triton, a moon of Neptune. It is being launched into space on March 18th, and the pressure is on to finish the software in time. Your boss has given you a very important task crucial to the completion of the mission.</p>

<p>In order to gather all of the necessary samples the rover must cross a canyon. Friendship One is equipped to travel on all sorts of rocky terrain, but this canyon is littered with circular craters. Your boss is concerned that if Friendship One takes a path that travels through one of these craters, Friendship One will fall over and the mission will end in failure. Some of these craters overlap with each other, which could create large impassable regions inside the canyon. It is up to you to program Friendship One to decide whether a canyon is passable or not. Are you up to the task?</p>

<p>The diagram below indicates the first test case in the sample data. Note that Friendship One is small enough compared to the size of the craters that it can be treated as a point; it has no area.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9304.%E2%80%85Canyon%E2%80%85Crossing/43de4365.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9304/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:283px; width:514px" /></p>

### 입력

<p>The first line of input is the number of test cases that follow. Each test case starts with a line containing three integers, H, W, and N. H and W (1 &le; H, W &le; 10000) indicate the height and width of the canyon, respectively. N (0 &le; N &le; 1000) indicates the number of craters that follow. Each crater appears on a line by itself and contains three floating point values, X, Y, and R separated by spaces. X and Y (0 &lt; X &minus; R; X + R &lt; W), (0 &le; Y &le; H) represent the center of the crater, while R is the radius of the crater.</p>

<p>Friendship One always starts at X = 0, with the destination being at X = W. Note that no point on the crater will overlap with X = 0 or X = W, so Friendship One can move vertically at these positions without difficulty.</p>

### 출력

<p>For each case output &ldquo;Case x:&rdquo; where x is the case number, on a single line, followed by the string &ldquo;Clear To Go&rdquo; if the canyon is passable and &ldquo;Find Another Path&rdquo; of the craters block the path.</p>