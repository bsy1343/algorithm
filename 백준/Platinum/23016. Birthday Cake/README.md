# [Platinum IV] Birthday Cake - 23016

[문제 링크](https://www.acmicpc.net/problem/23016)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 17, 정답: 8, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

수학

### 문제 설명

<p>You are given a grid of R rows and C columns that corresponds to a birthday cake.</p>

<p>The rows are numbered from 1 to R starting from the top. The columns are numbered from 1 to C starting from the left. Each cell in the grid is a square of size 1&times;1.</p>

<p>You noticed that the most delicious part of the cake forms a single filled rectangle; that means all the cells inside this single rectangle will be delicious as well, but all the cells outside this rectangle are not delicious.</p>

<p>You have a knife that is long enough to make straight-line cuts of length up to K.</p>

<p>We want to make a series of cuts to extract each of the delicious cells separately, so that we can put candles on them, and enjoy the birthday party.</p>

<p>To extract each of the delicious cells separately, they must be disconnected from any other cell.</p>

<p>A cell is disconnected if no other cell is connected to it in any of the 4 directions (up, down, left, right).</p>

<p>A cut is a directed line segment which is valid if the following conditions are met:</p>

<ul>
	<li>The cut runs along one of the horizontal or vertical lines between the rows and columns of the grid.</li>
	<li>The length of the cut must not exceed K.</li>
	<li>The starting and ending points of the cut must be grid points (i.e. a corner of a cell). In addition, the starting point must be already exposed, meaning that it lies on one of the 4 sides of the grid or on one of the previous cuts.</li>
	<li>The cut must not pass through any other exposed points. It may touch an exposed point, but if it does, it must end right there.</li>
</ul>

<p>Suppose that K=4. Below you can find five examples of valid cuts.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23016.%E2%80%85Birthday%E2%80%85Cake/871e39d6.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/23016.%E2%80%85Birthday%E2%80%85Cake/871e39d6.png" data-original-src="https://upload.acmicpc.net/cd8b61ab-059a-49b7-bc37-8526301ee8aa/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 662px; height: 140px;" /></p>

<p>And here are four examples of invalid cuts</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23016.%E2%80%85Birthday%E2%80%85Cake/71ff7fa1.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/23016.%E2%80%85Birthday%E2%80%85Cake/71ff7fa1.png" data-original-src="https://upload.acmicpc.net/0cde4243-8f15-4e7e-98a2-c18d44e72712/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 662px; height: 140px;" /></p>

<ul>
	<li>In the first picture, the cut is too long (longer than 4).</li>
	<li>In the second picture, the cut starts from an unexposed point (neither one of the 4 sides of the grid nor a previous cut).</li>
	<li>In the third picture, the cut passes through an exposed point, it must stop once it touches the exposed point at length 2.</li>
	<li>The fourth picture is invalid because of the same reason as the third picture.</li>
</ul>

<p>We need to find the minimum number of cuts needed to extract all the delicious cells.</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T test cases follow.</p>

<p>Each test case starts with a line containing three integers, R, C and K.</p>

<p>The next line contains four integers, r<sub>1</sub>, c<sub>1</sub>, r<sub>2</sub>, c<sub>2</sub>, representing the top-left and bottom-right cell of the delicious rectangle respectively.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;x&nbsp;is the test case number (starting from 1) and&nbsp;y&nbsp;is the minimum number of cuts.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>1 &le; r<sub>1</sub> &le; r<sub>2</sub> &le; R.</li>
	<li>1 &le; c<sub>1</sub> &le; c<sub>2</sub> &le; C.</li>
</ul>

### 힌트

<p>In the Sample 1, the minimum number of cuts is 5. One of the possible series of cuts is as follows:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23016.%E2%80%85Birthday%E2%80%85Cake/b72645b2.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/23016.%E2%80%85Birthday%E2%80%85Cake/b72645b2.png" data-original-src="https://upload.acmicpc.net/1a3b9cc0-446d-43b6-bc72-e0727be96dbc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 175px; height: 175px;" /></p>

<p>In the Sample 2, the minimum number of cuts is 3. One of the possible series of cuts is as follows:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23016.%E2%80%85Birthday%E2%80%85Cake/a098e3a3.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/23016.%E2%80%85Birthday%E2%80%85Cake/a098e3a3.png" data-original-src="https://upload.acmicpc.net/192fdef7-ca32-4b9a-b73b-e0d7aceb57b0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 164px; height: 132px;" /></p>