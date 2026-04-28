# [Gold I] Railway Connection - 7018

[문제 링크](https://www.acmicpc.net/problem/7018)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 53, 정답: 17, 맞힌 사람: 15, 정답 비율: 29.412%

### 분류

구현, 다이나믹 프로그래밍, 그래프 이론, 최단 경로, 데이크스트라, 플로이드–워셜

### 문제 설명

<p>Tokyo has a very complex railway system. For example, there exists a partial map of lines and stations as shown in Figure D-1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7018.%E2%80%85Railway%E2%80%85Connection/6c353ea0.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7018/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:174px; width:231px" /></p>

<p style="text-align: center;">Figure D-1: A sample railway network&nbsp;</p>

<p>Suppose you are going to station D from station A. Obviously, the path with the shortest distance is A&rarr;B&rarr;D. However, the path with the shortest distance does not necessarily mean the minimum cost. Assume the lines A-B, B-C, and C-D are operated by one railway company, and the line B-D is operated by another company. In this case, the path A&rarr;B&rarr;C&rarr;D may cost less than A&rarr;B&rarr;D. One of the reasons is that the fare is not proportional to the distance. Usually, the longer the distance is, the fare per unit distance is lower. If one uses lines of more than one railway company, the fares charged by these companies are simply added together, and consequently the total cost may become higher although the distance is shorter than the path using lines of only one company.</p>

<p>In this problem, a railway network including multiple railway companies is given. The fare table (the rule to calculate the fare from the distance) of each company is also given. Your task is, given the starting point and the goal point, to write a program that computes the path with the least total fare.</p>

### 입력

<p>The input consists of multiple datasets, each in the following format.</p>

<pre>
n m c s g
x<sub>1</sub> y<sub>1</sub> d<sub>1</sub> c<sub>1</sub>
...
x<sub>m</sub> y<sub>m</sub> d<sub>m</sub> c<sub>m</sub>
p<sub>1</sub> ... p<sub>c</sub>
q<sub>1,1</sub> ... q<sub>1,p<sub>1</sub>-1</sub>
r<sub>1,1</sub> ... r<sub>1,p<sub>1</sub></sub>
...
q<sub>c,1</sub> ... q<sub>c,p<sub>c</sub>-1</sub>
r<sub>c,1</sub> ... r<sub>c,p<sub>c</sub></sub></pre>

<p>Every input item in a dataset is a non-negative integer. Input items in the same input line are separated by a space.</p>

<p>The first input line gives the size of the railway network and the intended trip. n is the number of stations (2 &le; n &le; 100). m is the number of lines connecting two stations (0 &le; m &le; 10000). c is the number of railway companies (1 &le; c &le; 20). s is the station index of the starting point (1 &le; s &le; n ). g is the station index of the goal point (1 &le; g &le; n, g &ne; s ).</p>

<p>The following m input lines give the details of (railway) lines. The i -th line connects two stations x<sub>i</sub> and y<sub>i</sub> (1 &le; x<sub>i</sub> &le; n, 1 &le; y<sub>i</sub> &le; n, x<sub>i</sub> &ne; y<sub>i</sub> ). Each line can be traveled in both directions. There may be two or more lines connecting the same pair of stations. d<sub>i</sub> is the distance of the i -th line (1 &le; d<sub>i</sub> &le; 200). c<sub>i</sub> is the company index of the railway company operating the line (1 &le; c<sub>i</sub> &le; c ).</p>

<p>The fare table (the relation between the distance and the fare) of each railway company can be expressed as a line chart. For the railway company j , the number of sections of the line chart is given by p<sub>j</sub> (1 &le; p<sub>j</sub> &le; 50). q<sub>j,k</sub> (1 &le; k &le; p<sub>j</sub>-1) gives the distance separating two sections of the chart (1 &le; q<sub>j,k</sub> &le; 10000). r<sub>j,k</sub> (1 &le; k &le; p<sub>j</sub>) gives the fare increment per unit distance for the corresponding section of the chart (1 &le; r<sub>j,k</sub> &le; 100). More precisely, with the fare for the distance z denoted by f<sub>j</sub>(z), the fare for distance z satisfying q<sub>j,k-1</sub>+1 &le; z &le; q<sub>j,k</sub> is computed by the recurrence relation f<sub>j</sub>(z) = f<sub>j</sub>(z-1)+r<sub>j,k</sub>. Assume that q<sub>j,0</sub> and f<sub>j</sub>(0) are zero, and q<sub>j,p<sub>j</sub></sub> is infinity.</p>

<p>For example, assume p<sub>j</sub> = 3, q<sub>j,1</sub> = 3, q<sub>j,2</sub> = 6, r<sub>j,1</sub> = 10, r<sub>j,2</sub> = 5, and r<sub>j,3</sub> = 3. The fare table in this case is as follows.</p>

<table class="table table-bordered" style="width:30%">
	<tbody>
		<tr>
			<th>distance</th>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td>6</td>
			<td>7</td>
			<td>8</td>
			<td>9</td>
		</tr>
		<tr>
			<th>fare</th>
			<td>10</td>
			<td>20</td>
			<td>30</td>
			<td>35</td>
			<td>40</td>
			<td>45</td>
			<td>48</td>
			<td>51</td>
			<td>54</td>
		</tr>
	</tbody>
</table>

<p>q<sub>j,k</sub> increase monotonically with respect to k. r<sub>j,k</sub> decrease monotonically with respect to k .</p>

<p>The last dataset is followed by an input line containing five zeros (separated by a space).</p>

### 출력

<p>For each dataset in the input, the total fare for the best route (the route with the minimum total fare) should be output as a line. If the goal cannot be reached from the start, output &quot;-1&quot;. An output line should not contain extra characters such as spaces.</p>

<p>Once a route from the start to the goal is determined, the total fare of the route is computed as follows. If two or more lines of the same railway company are used contiguously, the total distance of these lines is used to compute the fare of this section. The total fare of the route is the sum of fares of such &quot;sections consisting of contiguous lines of the same company&quot;. Even if one uses two lines of the same company, if a line of another company is used between these two lines, the fares of sections including these two lines are computed independently. No company offers transit discount.</p>