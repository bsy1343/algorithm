# [Platinum I] Road Work - 10268

[문제 링크](https://www.acmicpc.net/problem/10268)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 10, 맞힌 사람: 10, 정답 비율: 83.333%

### 분류

다이나믹 프로그래밍, 많은 조건 분기

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10268.%E2%80%85Road%E2%80%85Work/584d3d30.png" data-original-src="https://www.acmicpc.net/upload/images2/road.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:210px; width:208px" />Per is repairing roads. The job is concentrated on roads with one lane in each direction. Thus, when Per closes down the lane in one direction, all traffic has to go through the other lane. This is done by allowing only one direction of travel at any time. Per is often assigned the task of directing the traffic through this lane.</p>

<p>No car drives before being given a &ldquo;go&rdquo; signal from Per, and all the cars drive through the maintained segment at the same speed. Because there is only one lane, cars in one direction must leave the segment before cars in the other direction can enter. For safety reasons, cars driving in the same direction have to keep a distance of at least 3 seconds between each other.</p>

<p>For example, if cars A and B arrive at the west endpoint at second 10, Per can let them go at earliest second 10 and 13 in the order they arrived. If it, in this example, takes 8 seconds to pass and car C arrives at the east endpoint at second 17, then car C has to wait 4 seconds until Per lets it go at second 21.</p>

<p>There is a problem of drivers getting irritated with Per; they think they have to stop for too long. Per has been logging how long they can bear to wait before they get irritated. One day, to be able to evaluate his work, Per noted down when the cars arrived at the two endpoints of the segment. Per&rsquo;s question is the following: what is the least number of drivers that can be irritated? We assume that a driver gets irritated if the time between the moment he arrives at the maintained segment and the moment he is actually given the &ldquo;go&rdquo; exceeds his irritation time limit.</p>

### 입력

<p>The first line of the input contains two integers t and n (4 &le; t &le; 180 and 1 &le; n &le; 250), where t is the time in seconds needed for a car to pass the segment under maintenance, and n is the total number of cars arriving at the segment. The following n lines describe the cars. The i-th line contains the description of the i-th car in the following format:</p>

<ul>
	<li>one character d, being W for cars arriving at the west endpoint of the segment, and E for the ones that arrive at the east endpoint; and</li>
	<li>two integers a and r (0 &le; a &lt; 86 400 and 0 &le; r &le; 3 600), where a denotes the arrival time in seconds after midnight, and r denotes the time in seconds it takes for the driver to get irritated.</li>
</ul>

<p>The cars arrive in the order specified in the input and they cannot overtake each other. In particular, a car whose driver is already irritated has to stay in the queue until eventually receiving the &ldquo;go&rdquo; and passing the maintained segment.</p>

### 출력

<p>Output one line with the least possible number of irritated drivers.</p>