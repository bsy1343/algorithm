# [Gold V] Revenge of the Hot Dogs (Small) - 12499

[문제 링크](https://www.acmicpc.net/problem/12499)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 44, 정답: 21, 맞힌 사람: 20, 정답 비율: 46.512%

### 분류

이분 탐색, 매개 변수 탐색

### 문제 설명

<p>Last year, several hot dog vendors were lined up along a street, and they had a tricky algorithm to spread themselves out. Unfortunately, the algorithm was very slow and they are still going. All is not lost though! The hot dog vendors have a plan: time to try a new algorithm!</p>

<p>The problem is that multiple vendors might be selling too close to each other, and then they will take each other&#39;s business. The vendors can move along the street at 1 meter/second. To avoid interfering with each other, they want to stand so that every pair of them is separated by a distance of at least&nbsp;<strong>D</strong>&nbsp;meters.</p>

<p>Remember that the street is really long, so there is no danger of running out of space to move in either direction. Given the starting positions of all hot dog vendors, you should find the minimum time they need before all the vendors are separated (each two vendors are at least&nbsp;<strong>D</strong>&nbsp;meters apart from each other).</p>

### 입력

<p>Each point of the street is labeled with a number, positive, negative or zero. A point labeled&nbsp;<em>p</em>&nbsp;is&nbsp;<em>|p|</em>&nbsp;meters east of the point labeled&nbsp;<em>0</em>&nbsp;if&nbsp;<em>p</em>&nbsp;is positive, and&nbsp;<em>|p|</em>&nbsp;meters west of the point labeled&nbsp;<em>0</em>&nbsp;if&nbsp;<em>p</em>&nbsp;is negative. We will use this labeling system to describe the positions of the vendors in the input file.</p>

<p>The first line of the input file contains the number of cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each case begins with a line containing the number of points&nbsp;<strong>C</strong>&nbsp;that have at least one hot dog vendor in the starting configuration and an integer&nbsp;<strong>D</strong>&nbsp;-- the minimum distance they want to spread out to. The next&nbsp;<strong>C</strong>&nbsp;lines each contain a pair of space-separated integers&nbsp;<strong>P</strong>,&nbsp;<strong>V</strong>, indicating that there are&nbsp;<strong>V</strong>&nbsp;vendors at the point labeled&nbsp;<strong>P</strong>.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50.</li>
	<li>All the values&nbsp;<strong>P</strong>&nbsp;are integers in the range [-10<sup>5</sup>, 10<sup>5</sup>].</li>
	<li>Within each test case all&nbsp;<strong>P</strong>&nbsp;values are distinct and given in an increasing order. The limit on the sum of&nbsp;<strong>V</strong>&nbsp;values is listed below. All the&nbsp;<strong>V</strong>&nbsp;values are positive integers.</li>
	<li>1 &le;&nbsp;<strong>D</strong>&nbsp;&le; 5</li>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 20.</li>
	<li>The sum of all the&nbsp;<strong>V</strong>&nbsp;values in one test case does not exceed 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the minimum amount of time it will take for the vendors to spread out apart on the street. Answers with relative or absolute error of at most 10<sup>-6</sup>&nbsp;will be accepted.</p>