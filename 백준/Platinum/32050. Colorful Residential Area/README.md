# [Platinum III] Colorful Residential Area - 32050

[문제 링크](https://www.acmicpc.net/problem/32050)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 103, 정답: 41, 맞힌 사람: 39, 정답 비율: 49.367%

### 분류

구현, 애드 혹, 해 구성하기

### 문제 설명

<p>A square-shaped plot of land is divided into <i>n</i> rows and <i>n</i> columns of square sections by streets extending in the east-west and north-south directions.</p>

<p>You will build one house each on some of these sections. At least one house must be built in every row and also at least one in every column. You then paint each house in one color; there are <i>n</i> colors available, from color 1 to color <i>n</i>.</p>

<p>You are interested in the views from four directions, north, south, east, and west. When seen from one direction, <i>n</i> frontmost houses can be seen, lined up from left to right. Your goal is to build and paint the houses so that the <i>n</i> frontmost houses seen from all the four directions are in the same specified color order.</p>

<p>Figures E-1 and E-2 both show examples with <i>n</i> = 4, where the specified color order is 1, 2, 3, and 1, from left to right, which correspond to the first dataset of Sample Input. When viewing the plot in Figure E-1 from the south, the color order is 1, 2, 3, and 1, which coincides with the specified order. When viewing from the east, however, the order is 1, 3, 2, and 1, which is different. Therefore, this example does not achieve the goal. The example in Figure E-2 achieves the goal.</p>

<p>For the specified color order, determine whether there exists an arrangement of the positions of houses and their colors that achieves your goal, and if so, provide an example.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32050.%E2%80%85Colorful%E2%80%85Residential%E2%80%85Area/776ff1bb.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/32050.%E2%80%85Colorful%E2%80%85Residential%E2%80%85Area/776ff1bb.png" data-original-src="https://upload.acmicpc.net/3f393c77-0f24-4027-80cc-07f337e045ce/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> 			 </td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32050.%E2%80%85Colorful%E2%80%85Residential%E2%80%85Area/9c7f3281.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/32050.%E2%80%85Colorful%E2%80%85Residential%E2%80%85Area/9c7f3281.png" data-original-src="https://upload.acmicpc.net/ba0398ad-79cb-47b1-b041-099b441b537b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
		</tr>
		<tr>
			<td>Figure E-1: Inappropriate arrangement</td>
			<td>Figure E-2: Appropriate arrangement</td>
		</tr>
	</tbody>
</table>

### 입력

<p>The input consists of multiple datasets, each in the following format. The number of datasets does not exceed 100.</p>

<blockquote>
<p><i>n</i></p>

<p><i>c</i><sub>1</sub> ⋯ <i>c<sub>n</sub></i></p>
</blockquote>

<p>Here, <i>n</i> is an integer between 1 and 50, inclusive, indicating that the plot is divided into <i>n</i> rows and <i>n</i> columns of sections and that <i>n</i> colors, from color 1 to color <i>n</i>, are available. Each <i>c<sub>i</sub></i> (<i>i</i> = 1, &hellip;, <i>n</i>) is an integer between 1 and <i>n,</i> inclusive, meaning that the <i>i</i>-th color from the left is specified to be <i>c<sub>i</sub>.</i></p>

<p>The end of the input is indicated by a line consisting of a zero.</p>

### 출력

<p>For each dataset, if there is no arrangement of the house positions and colors that achieves the goal, output &quot;No&quot; in one line. If there are one or more arrangements, output &quot;Yes&quot; in one line, followed by one arrangement that achieves the goal in the following format.</p>

<blockquote>
<p><i>a</i><sub>1,1</sub> ⋯ <i>a</i><sub>1,<i>n</i></sub></p>

<p>⋮</p>

<p><i>a</i><sub><i>n</i>,1</sub> ⋯ <i>a</i><sub><i>n</i>,<i>n</i></sub></p>
</blockquote>

<p>Here, each <i>a<sub>i,j</sub></i> (<i>i, j</i> = 1, &hellip;, <i>n</i>) is an integer between 0 and <i>n,</i> inclusive, representing the state of the section located at the <i>i</i>-th row from the north and the <i>j</i>-th column from the west. If <i>a<sub>i,j</sub></i> = 0, it indicates that no house is built on that section. If <i>a<sub>i,j</sub></i> &gt; 0, it indicates that a house is built on that section and painted with color <i>a<sub>i,j</sub>.</i></p>

<p>If there exist multiple arrangements that achieve the goal, you may output any one of them.</p>