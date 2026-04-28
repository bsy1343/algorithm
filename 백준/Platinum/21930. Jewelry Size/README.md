# [Platinum II] Jewelry Size - 21930

[문제 링크](https://www.acmicpc.net/problem/21930)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 115, 정답: 58, 맞힌 사람: 54, 정답 비율: 62.069%

### 분류

수학, 기하학, 이분 탐색

### 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/2eeb87e4-14f4-4c46-9797-139f73904967/-/preview/" style="width: 263px; height: 186px;" /></p>

<p style="text-align: center;">Figure E.1. Jewelry</p>

<p>She came up with a new jewelry design. The design uses two parts: a hollow circlet and a convex polygonal component. The design can be customized by specifying the edge lengths of the polygon, which should be multiples of a unit length, so that customers can embed memorial numbers in the jewelry. Note that there can be many different polygons with edges of the specified lengths. Among them, one with a circumscribed circle, that is, a circle that passes through all of its vertices, is chosen so that the polygonal component can be firmly anchored to the circlet</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="https://upload.acmicpc.net/337743bd-80e5-4938-b419-7033b4f700e7/-/crop/372x372/0,0/-/preview/" style="width: 186px; height: 186px;" /></td>
			<td><img alt="" src="https://upload.acmicpc.net/337743bd-80e5-4938-b419-7033b4f700e7/-/crop/363x372/391,0/-/preview/" style="width: 182px; height: 186px;" /></td>
			<td><img alt="" src="https://upload.acmicpc.net/337743bd-80e5-4938-b419-7033b4f700e7/-/crop/372x372/773,0/-/preview/" style="width: 186px; height: 186px;" /></td>
		</tr>
		<tr>
			<td>(a)</td>
			<td>(b)</td>
			<td>(c)</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">Figure E.2. (a) A pentagon with a circumscribed circle; (b) A pentagon with no circumscribed circle; (c) Another pentagon with no circumscribed circle</p>

<p>For example, Figure E.2(a) has a pentagon with its edge lengths of 3, 1, 6, 1, and 7 units, meaning March 16th and 17th. The radius of the circle is approximately 3.544 units. Figures E.2(b) and E.2(c) show pentagons with the same edge lengths but neither of them has a circumscribed circle.</p>

<p>To commercialize the jewelry, she needs to be able to compute the radius of the circumscribed circle from specified edge lengths. Can you help her by writing a program for this task?</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<pre>
n
x<sub>1</sub> . . . x<sub>n</sub></pre>

<p>n is an integer that indicates the number of edges (3 &le; n &le; 1000). x<sub>k</sub> (k = 1, . . . , n) is an integer that indicates the length of the k-th edge (1 &le; x<sub>k</sub> &le; 6000).</p>

<p>You may assume the existence of one or more polygons with the specified edge lengths. You can prove that one of such polygons has a circumscribed circle.</p>

### 출력

<p>Output the minimum radius of a circumscribed circle of a polygon with the specified edge lengths. Absolute/relative error of the output should be within 10<sup>&minus;7</sup>.</p>