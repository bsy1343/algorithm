# [Platinum III] Bouldering - 18055

[문제 링크](https://www.acmicpc.net/problem/18055)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 88, 정답: 17, 맞힌 사람: 17, 정답 비율: 25.000%

### 분류

데이크스트라, 기하학, 그래프 이론, 피타고라스 정리, 최단 경로

### 문제 설명

<p>After a few particularly long afternoons of procrastinating in his box, playing video games all night long, Carl decided it was finally time to start his New Year&rsquo;s Resolution &ndash; going to the bouldering gym.</p>

<p>There, he took to one of the easier walls and tried to make his way up. Unfortunately, he could never quite reach the top, as he would always run out of stamina and fall down.</p>

<p>While climbing, he noticed the holds all have different shapes with some of them being much harder to hold than others, so gripping them uses up different amounts of stamina. Frustrated, he asks one of the regulars at the bouldering hall how to scale the wall &ndash; you. Show him the shortest way up that he can take without running out of stamina.</p>

<p>The bouldering wall is a rectangular grid of cells of size 1 &times; 1 where holds can be installed. For this problem we do not consider the varying sizes of the holds, so you can assume them to be the shape of a singular point exactly in the middle of the cell. Carl can only move from one hold to another if their distance (the Euclidean distance between the centres of the cells) does not exceed his arms&rsquo; reach.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/73deeb8f-a0a7-4d7c-ac24-ef88ba1844d4/-/preview/" style="width: 285px; height: 297px;" /></p>

<p style="text-align: center;">Figure B.1: Sample test case 1</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line with four integers h, w, r and s (2 &le; h &le; 25, 1 &le; w &le; 25, 1 &le; r &le; 3, 1 &le; s &le; 10<sup>9</sup>) where h and w are the height and width of the bouldering wall, r is the reach of Carl&rsquo;s arms and s is a numerical representation of Carl&rsquo;s stamina.</li>
	<li>h lines, each with w characters, describing the holds on the bouldering wall. Each character is either a digit c (1 &le; c &le; 9), which means that a hold with difficulty c is installed at this position, or &ldquo;.&rdquo;, which means there is no hold installed.</li>
</ul>

<p>The first line corresponds to the top of the bouldering wall and the last line to the bottom.</p>

<p>A sequence of holds is a valid route for Carl if the following conditions are satisfied:</p>

<ul>
	<li>The route starts at the bottommost hold and ends at the topmost hold. There will always be a unique bottommost and a unique topmost hold, and these are guaranteed to be distinct.</li>
	<li>The sum of difficulty levels of the used holds is at most s.</li>
	<li>The Euclidean distance between any two consecutive holds along the route is at most r.</li>
</ul>

### 출력

<p>Output the total length of a shortest route Carl can climb to reach the topmost hold without running out of stamina. Your answer should have an absolute or relative error of at most 10<sup>&minus;6</sup>. If it is not possible for Carl to reach the top, output impossible.</p>