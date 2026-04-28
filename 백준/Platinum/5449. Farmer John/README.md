# [Platinum IV] Farmer John - 5449

[문제 링크](https://www.acmicpc.net/problem/5449)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 135, 정답: 55, 맞힌 사람: 41, 정답 비율: 40.196%

### 분류

그래프 이론, 기하학, 최단 경로, 데이크스트라, 선분 교차 판정

### 문제 설명

<p>Farmer John owns a lot of cows that graze in the fields and walk around happily. However, cow Bessie is very lazy and always takes the shortest route to the barn to get food. Farmer John wants to give Bessie some more walking exercises, so he placed some extra fences to make sure that Bessie cannot always take the shortest route and has to walk around the fences.</p>

<p>Given the current location of Bessie, the location of the barn with the food, and all locations of the fences (modelled as line segments), farmer John wants you to compute the minimum distance that Bessie has to walk. Bessie is not allowed to cross any fence on her route, but she is allowed to touch the fences.</p>

### 입력

<p>The first line of the input contains a single number: the number of test cases to follow. Each test case has the following format:</p>

<ul>
	<li>One line with four integers Bx, By, Fx and Fy satisfying &minus;10, 000 &le; Bx,By,Fx,Fy &le; 10, 000: the location of Bessie and the location of the food.</li>
	<li>One line with one integer N satisfying 0 &le; N &le; 100: the number of fences.</li>
	<li>N lines, one for each fence, with four integers x1, y1, x2 and y2 satisfying &minus;10, 000 &le; x1,y1,x2,y2 &le; 10, 000 and x1 &ne; x2 or y1 &ne; y2: the x- and y-coordinates of the begin and end points of this fence.</li>
</ul>

<p>Integers on the same line are separated by single spaces. The current location of Bessie and the location of the food will not lie on a fence, and fences will not touch or overlap.</p>

### 출력

<p>For every test case in the input, the output should contain a single real number, rounded and displayed to six digits after the decimal point, on a single line: the minimum walking distance.</p>