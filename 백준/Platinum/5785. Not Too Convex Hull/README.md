# [Platinum II] Not Too Convex Hull - 5785

[문제 링크](https://www.acmicpc.net/problem/5785)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 89, 정답: 21, 맞힌 사람: 17, 정답 비율: 20.988%

### 분류

다이나믹 프로그래밍, 기하학, 볼록 껍질

### 문제 설명

<p>Nails and Rubber Bands. That is the suggestive name of a game played by a group of children (all of them offspring of geometry teachers). The children fix a number of nails on a plank of wood, randomly placed. Then they choose one of the nails to be the Origin, and a number B of rubber bands. The challenge is to use the B rubber bands to wrap the nails so that (i) each rubber band wraps a subset of the nails; (ii) all nails are inside some wrapping; (iii) wrappings do not overlap each other except at the Origin nail, which is touched by all rubber bands; (iv) rubber bands must form wrappings which are convex polygons with at least three corners; and (v) the total area inside the wrappings is the smallest among all possible ways of wrapping the nails. An instance of the game is shown in Figure 1.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/5785/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%205.22.09.png" style="height:193px; width:257px" /><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/5785/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%205.22.09.png" style="height:193px; width:257px" /></p>

<p>Figure 1: A game with 19 nails and 2 rubber bands</p>

### 입력

<p>Your program should solve several instances of the game. Each game description starts with a line containing two integers B and N, indicating respectively the number of rubber bands and the number of nails (2 &le; B &le; 50 and 2B+1 &le; N &le; 101). The following N lines describe the position of the nails, each line containing two integers X and Y (&ndash;10000 &le; X, Y &le; 10000). The origin is the first nail in the input. The end of input is indicated by B = N = 0.</p>

<p>In all instances in the input:</p>

<ul>
	<li>no two nails are in the same point;&nbsp;</li>
	<li>no three nails are in the same line;</li>
	<li>the origin nail does not belong to the convex hull of all nails (that is, if you use one rubber band to wrap all nails, it does not touch the origin nail).</li>
</ul>

### 출력

<p>For each game in the input your program should output one line, describing the smallest total area inside the wrappings. The area must be printed as a real number with two-digit precision, and the last decimal digit must be rounded. The input will not contain test cases where differences in rounding are significant.</p>