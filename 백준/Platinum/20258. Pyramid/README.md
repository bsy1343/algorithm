# [Platinum IV] Pyramid - 20258

[문제 링크](https://www.acmicpc.net/problem/20258)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 64, 정답: 32, 맞힌 사람: 30, 정답 비율: 50.847%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Consider an n&times;n grid where nodes are labelled as (i, j) for 0 &le; i, j &lt; n. We rotate it 45 degree in clockwise direction and keep only its top half part. Then you get a pyramid, as shown in Figure 1. All of the nodes laid on the anti-diagonal of the grid have labels (n &minus; 1 &minus; j, j) for 0 &le; j &lt; n. They are located at the bottom line of the pyramid. For simplicity and clarity, we name node (n &minus; 1 &minus; j, j) as exit j. Node (0, 0) is called the starting point (labelled as P in Figure 1). When you insert a ball from the starting point, this ball will roll down to some of the exits. A ball located at node (i, j) can only roll down to either node (i + 1, j) or node (i, j + 1), and the ball shall never be broken or split. There is a tiny switch equipped on every node other than the exits that controls the move direction of the ball, and this switch always works well. The switch has exactly two states: either L or R, indicates that the ball can move to node (i + 1, j) or (i, j + 1), respectively. After the ball leaves this node, the switch changes immediately to the other state. The default setting for a switch is at L.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20258.%E2%80%85Pyramid/2c052574.png" data-original-src="https://upload.acmicpc.net/213ee378-e937-494c-9b4f-3ca6979406dc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 480px; height: 205px;" /></p>

<p style="text-align: center;">Figure 1: An example for n = 5.</p>

<p>When you insert the first ball into P, this ball will reach exit 0, and the states of nodes (i, 0) for 0 &le; i &lt; n &minus; 1 are now all R&rsquo;s. Then you insert the second, third, and so on so forth, one by one, until the k<sup>th</sup> ball finishes. The status of every switch accumulates with these balls. Please write a program to determine the number of the exit point for the k<sup>th</sup> ball.</p>

### 입력

<p>The first line of the input is a number that specifies the number of test cases. Each test case has only one line that gives you two space-delimited numbers n and k.</p>

### 출력

<p>Please output the exit number of the k<sup>th</sup>&nbsp;ball in one line.</p>

### 제한

<ul>
	<li>There are at most 20 test cases.</li>
	<li>1 &le; n &le; 10<sup>4</sup>.</li>
	<li>1 &le; k &le; 10<sup>8</sup>.</li>
</ul>