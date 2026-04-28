# [Gold I] Vin Diagrams - 15076

[문제 링크](https://www.acmicpc.net/problem/15076)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

자료 구조, 분리 집합, 플러드 필, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Venn diagrams were invented by the great logician John Venn as a way of categorizing elements belonging to different sets. Given two sets A and B, two overlapping circles are drawn &ndash; a circle representing the elements of A, and another representing the elements of B. The overlapping region of the circles represents element that belong to both A and B, i.e., the intersection of the two sets A &cap; B. A classic Venn diagram might look like this:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15076.%E2%80%85Vin%E2%80%85Diagrams/b0d017dd.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15076/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:100px; width:107px" /></p>

<p style="text-align:center">Figure H.1</p>

<p>One of John&rsquo;s biggest fans was his grandson, Vin Vaughn Venn. Vin was inspired by his grandfather&rsquo;s diagrams, but Vin was a very creative individual. Simple overlapping circles struck Vin as too boring of a way to visualize the sometimes messy intersections of categories, so he set out to make his grandfather&rsquo;s diagrams more interesting. Just like Venn diagrams, Vin diagrams are used as a way of categorizing elements belonging to different sets A and B, but the representation of each set is not required to be a circle. In fact, each set can have any shape as long as there is single overlapping section for elements in the intersection of A and B.</p>

<p>In this problem, Vin diagrams will be laid out on a grid. Each set representation is a loop of &lsquo;X&rsquo; characters, with one &lsquo;X&rsquo; in each loop replaced by an &lsquo;A&rsquo; or &lsquo;B&rsquo; to identify the loop. All empty positions (both inside and outside of the loops) are represented by period (&lsquo;.&rsquo;) characters, and the set of positions inside a loop is contiguous. Each loop character touches exactly two other loop characters either vertically or horizontally. Loops do not self-intersect, and other than the allowed horizontal/vertical paths and right angle connections, different parts of the loop do not touch (see Figures H.2 and H.3 below).</p>

<table class="table" style="width:100%">
	<tbody>
		<tr>
			<td style="text-align:center; width:50%"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15076.%E2%80%85Vin%E2%80%85Diagrams/f8ec0c18.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15076/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:128px; width:199px" /></td>
			<td style="text-align:center; width:50%"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15076.%E2%80%85Vin%E2%80%85Diagrams/0957e0b0.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15076/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:126px; width:196px" /></td>
		</tr>
		<tr>
			<td style="text-align:center; width:50%">Figure H.2: Two legal loops</td>
			<td style="text-align:center; width:50%">Figure H.3: Two illegal loops</td>
		</tr>
	</tbody>
</table>

<p>Loops A and B intersect at exactly two points. Loop intersection points always follow the pattern shown in Figure H.4 (including the four &lsquo;.&rsquo; positions around the intersection). No loop makes a right angle turn at an intersection point but always flows straight through the intersection, either vertically or horizontally. An example of legally intersecting loops is shown in Figure H.5.</p>

<table class="table" style="width:100%">
	<tbody>
		<tr>
			<td style="text-align:center; width:50%"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15076.%E2%80%85Vin%E2%80%85Diagrams/831f95a8.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15076/4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:126px; width:197px" /></td>
			<td style="text-align:center; width:50%"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15076.%E2%80%85Vin%E2%80%85Diagrams/2ceb124e.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15076/5.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:126px; width:196px" /></td>
		</tr>
		<tr>
			<td style="text-align:center; width:50%">Figure H.4: Intersection point and&nbsp;surrounding positions</td>
			<td style="text-align:center; width:50%">Figure&nbsp;H.5: Legally intersecting loops</td>
		</tr>
	</tbody>
</table>

### 입력

<p>The input starts with two integers r c describing the number of rows and columns in the Vin diagram (7 &le; r, c &le; 100). The following r rows each contain a string of c characters. All positions that are not part of loop A or loop B are marked with a period (&lsquo;.&rsquo;) character. The loop labels &lsquo;A&rsquo; and &lsquo;B&rsquo; are placed somewhere around the loops&rsquo; perimeters at non-intersection positions and are never on the same loop.</p>

### 출력

<p>Display, in order, the area of the Vin diagram exclusive to set A, the area exclusive to set B, and the area of the intersection. Given the representation of Vin diagrams, the area of a section is defined as the number of periods (&lsquo;.&rsquo;) it encloses.</p>