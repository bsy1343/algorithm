# [Platinum IV] Water Pump - 13387

[문제 링크](https://www.acmicpc.net/problem/13387)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 16, 맞힌 사람: 15, 정답 비율: 55.556%

### 분류

자료 구조, 세그먼트 트리, 분리 집합, 스택

### 문제 설명

<p>In a big city, there are N walls arrange in a line from west to east, numbered by 1st to Nth. The walls are well designed and water-proof so water cannot pass through each wall. Unfortunately, it was raining heavily last week and the whole city had flooded by this heavy rain. The governor wants to put a super strong water pump to drain water as much as possible. He asks you to calculate maximum amount of water could be pumped out by a water pump.</p>

<p>Example</p>

<p>Suppose a line of walls in the city is shown as figure below.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13387/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-10-11%20%EC%98%A4%ED%9B%84%205.30.12.png" style="height:138px; width:425px" /><br />
After flooding by the heavy rain, water will be remained inside each pair of walls.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13387/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-10-11%20%EC%98%A4%ED%9B%84%205.30.24.png" style="height:132px; width:425px" /><br />
If the water pump is placed at the arrow marker, it can drain 7 units of water from the city.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13387/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-10-11%20%EC%98%A4%ED%9B%84%205.30.38.png" style="height:141px; width:425px" /><br />
However, one of the best positions to place the water pump is shown below at the arrow marker. 9 units of water would be drained.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13387/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-10-11%20%EC%98%A4%ED%9B%84%205.30.52.png" style="height:144px; width:425px" /><br />
Given heights of all walls, you task is to calculate maximum number of units of water could be drained by a water pump.</p>

### 입력

<p>First line contains an integer, T, represent the number of test cases. (1 &le; T &le; 20)&nbsp;<br />
For each test case, there are two lines of inputs. For i-th test case,</p>

<ul>
	<li>Line 2*i contains an integer: N represents the number of walls in the city. ( 1 &le; N &le; 100,000)</li>
	<li>Line 2*i+1 contains N integers: h<sub>1</sub>, h<sub>2</sub>,...,h<sub>N</sub> represents height of each wall. h<sub>i</sub> presents the height of i-th wall. (0 &le; h<sub>i</sub> &le; 10,000 for every i)</li>
</ul>

### 출력

<p>Answer in T lines. Each line contains an integer to answer each specific test case. Each answer shows the maximum amount of waters can be drained by a water pump.</p>