# [Gold V] Alien Security - 6451

[문제 링크](https://www.acmicpc.net/problem/6451)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 52, 정답: 11, 맞힌 사람: 6, 정답 비율: 23.077%

### 분류

너비 우선 탐색, 브루트포스 알고리즘, 깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>You are in charge of security at a top-secret government research facility. Recently your government has captured a live extra-terrestrial (ET) life form, and is hosting an open day for fellow researchers. Of course, not all the guests can be trusted, so they are assigned different security clearance levels. Only guests with a level 5 rating will be allowed into the lab where the extra-terrestrial is being held; other than that, everyone is free to roam throughout the rest of the facility. Each room in the facility is connected via one-way airlocks, so that you can pass through the door in only one direction.</p>

<p>To protect your precious ET you will put in place enhanced security measures (in the form of armed guards) on the route leading to the room containing the ET, but not in the room itself &mdash; the guards do not have sufficient clearance to enter the room containing the ET. The guards will check the identity and the security rating of all guests trying to pass through the room in which they are stationed, so you would like to place the guards where they will cause the minimum amount of irritation to the guests who have no intention of visiting the ET. The room where the guards must be placed thus satisfies the following two conditions:</p>

<ol>
	<li>In order to get to the room containing the ET, the guests must pass through the room containing the guards;</li>
	<li>There is no other room with this property that is closer to the room containing the ET &mdash; remember, the guards cannot be placed in the room containing the ET itself.</li>
</ol>

<p>The diagram below illustrates one possible map of your facility:</p>

<p>Note that placing the guards in room 2 would satisfy the first condition, but room 3 is closer to the ET, so the guards must be placed in room 3.</p>

### 입력

<p>The input begins with a single positive integer on a line by itself indicating the number of the cases following, each of them as described below. This line is followed by a blank line, and there is also a blank line between two consecutive inputs.</p>

<p>All guests enter through room 0, the entrance to your facility. Your program accepts a sequence of lines containing integers. The first line consists of two integers: the number of rooms, and the room in which the ET is being held (out of his own free will, of course). The rest of the input is a sequence of lines consisting of only two integers, specifying where the airlock-doors are located. The first number on these lines specifies the source room, and the second the destination room. Remember: you can pass only from the source room to the destination room.</p>

### 출력

<p>For each test case, the output must follow the description below. The outputs of two consecutive cases will be separated by a blank line.</p>

<p>The output of your program consists only of a single line:</p>

<pre>
Put guards in room N.</pre>

<p>where N is the room you&rsquo;ve decided to place the guards.</p>

### 힌트

<p>The diagram on the right illustrates the Sample Input sequence below.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6451.%E2%80%85Alien%E2%80%85Security/22b9a2b3.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/6451.%E2%80%85Alien%E2%80%85Security/22b9a2b3.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6451/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:353px; width:351px" /></p>