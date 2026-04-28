# [Gold II] Reservoir - 17058

[문제 링크](https://www.acmicpc.net/problem/17058)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 10, 맞힌 사람: 9, 정답 비율: 39.130%

### 분류

수학, 자료 구조, 이분 탐색, 누적 합, 스택

### 문제 설명

<p>A big reservoir was built in Red river using a dam. Assume that the reservoir is a rectangular box with unit length width. The reservoir consists of many tanks. An example a cross section of an empty reservoir along its length and height dimensions is shown in the picture below:&nbsp;</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/20984629-371a-4053-9aba-b19a15905697/-/preview/" style="width: 288px; height: 213px;" /></p>

<p>Water flows in from the top left gate into the reservoir. The tanks in the resevoir are constructed using water resistant walls. Each wall is one unit length thick (along the width dimention) and has its height smaller than the height of the reservoir.</p>

<p>Given the location and the height of the walls and the unit volume K of water flowing in, your task is to figure out the last wall water flows over.</p>

### 입력

<p>The input consists of several datasets. The first line of the input contains the number of datasets which is a positive integer and is not greater than 20. The following lines describe the datasets.</p>

<p>Each dataset is described by the following lines:</p>

<ul>
	<li>The first line contains one positive integer N that is the number of walls separating the tanks (N &le; 10<sup>5</sup>).</li>
	<li>The second line contains N positive integers L<sub>i</sub> where L<sub>i</sub> is the horizonal location (along the length dimention of the reservoir) of the i<sup>th</sup> wall (1 &le; L<sub>i</sub> &le; 10<sup>9</sup>, L<sub>i</sub> &gt; L<sub>i-1</sub>&nbsp;+ 1 for i &gt; 1).</li>
	<li>The third line contains N positive integers H<sub>i</sub> where H<sub>i</sub>&nbsp;is the height in unit length of the i<sup>th</sup> wall (1 &le; H<sub>i</sub> &le; 10<sup>5</sup>).</li>
	<li>The fourth line contains an integer Q that is a number of queries (Q&nbsp;&le; 10<sup>5</sup>).</li>
	<li>In the next Q lines, each line contains a positive integer K&nbsp;that is the unit volume of water flowing in the reservoir (K &le; 10<sup>15</sup>)</li>
</ul>

### 출력

<p>For each dataset, write out Q lines where the i<sup>th</sup> line contains the index of the last wall that water flows over for the i<sup>th</sup> query. If there is no wall that water flows over, output 0.</p>

### 힌트

<p>Explanations:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b8895c44-b22f-43a5-bb6f-20ed1b47a8fb/-/preview/" style="width: 591px; height: 466px;" /></p>