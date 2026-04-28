# [Gold II] Planning Rolling Blackouts - 4952

[문제 링크](https://www.acmicpc.net/problem/4952)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 22, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Faced with seriously tight power supply-demand balance, the electric power company for which you are working implemented rolling blackouts in this spring. It divided the servicing area into several groups of towns, and divided a day into several blackout periods. At each blackout period of a day, one of the groups, which alternates from one group to another, is cut off the electricity. By keeping the total demand of electricity used by the rest of the towns within the supply capacity, the company avoided unforeseeable large-scale blackout.</p>

<p>Working at the customer relations department, you had to listen to so many complaints from the customers, which made you think that you could have a better implementation. Most of the complaints are about the frequent cut-offs. But you could have divided the area into a larger number of groups, which resulted in less frequent cut-offs for each group. The other complaints are about the complicated grouping (in fact, someone said that the shapes of the groups are fractals), which makes it impossible to understand which town belongs to which group without closely inspecting into the grouping list publicized by the company. With the rectangular servicing area and towns located in a grid form, you could have made a simpler grouping.</p>

<p>When you talked your analysis directly to the president of the company, you are appointed to plan rolling blackouts for this summer. Be careful what you propose. Anyway, you need to divide the servicing area into as many groups as possible with keeping total demand of electricity within the supply capacity. It should also divide the towns into simple and easy to remember groups.</p>

<p>Your task is to write a program, given a demand table (a table showing electricity demand of each town) and the supply capacity, that answers a grouping of towns that satisfy the following conditions.</p>

<ol>
	<li>The grouping should be made by horizontally or vertically splitting the area in a recursive manner. In other words, the grouping must be a set of areas after applied the following splitting procedure to a set containing only the entire area for zero or more times:<br />
	(The splitting procedure) remove one area from the set, either vertically or horizontally split it into two sub-areas, and put the sub-areas into the set.</li>
	<li>The maximum suppressed demand of the grouping, which is the greatest total demand of the all but one group, is no more than the supply capacity.</li>
	<li>The grouping has the largest number of groups among the groupings that satisfy the above conditions 1 and 2.</li>
	<li>The grouping has the greatest amount of reserve power among the groupings that satisfy the above conditions 1, 2 and 3, where the reserve power of a grouping is the difference between the supply capacity and the maximum suppressed demand.</li>
</ol>

<p>Note that the condition 1 does not allow such a grouping shown in Figure E-1.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4952/E-1.png" style="height:100px; width:100px" /></p>

<p style="text-align:center">Figure E-1: A grouping that violates the condition 1&nbsp;</p>

### 입력

<p>The input consists of one or more datasets. Each dataset is given in the following format.</p>

<pre>
h w s 
u<sub>11</sub> u<sub>12</sub> ... u<sub>1w</sub>
u<sub>21</sub> u<sub>22</sub> ... u<sub>2w</sub>
... 
u<sub>h1</sub> u<sub>h2</sub> ... u<sub>hw</sub>
</pre>

<p>The first line contains three positive integer numbers, namely h, w and s, denoting the height and width of the demand table and the power supply capacity. The following h lines, each of which contains w integer numbers, denote demands of towns at respective locations. Those figures are constrained as follows.</p>

<ul>
	<li>1 &le; h, w &le; 32&nbsp;</li>
	<li>1 &le; u<sub>ij</sub> &le; 100</li>
</ul>

<p>Regrettably, you may assume that the supply capacity is less than the total demand of the area.</p>

<p>The last dataset is followed by a line containing three zeros.</p>

### 출력

<p>For each dataset, print a line having two integers indicating the number of groups in the grouping that satisfies the conditions, and the amount of the reserve power. Each line should not have any character other than those numbers and a space in between.</p>