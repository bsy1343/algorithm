# [Gold I] Shoring Up the Levees - 4116

[문제 링크](https://www.acmicpc.net/problem/4116)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 7, 맞힌 사람: 5, 정답 비율: 33.333%

### 분류

기하학, 선분 교차 판정, 다각형의 넓이

### 문제 설명

<p>The tiny country of Waterlogged is protected by a series of levees that form a quadrilateral as shown below:&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4116.%E2%80%85Shoring%E2%80%85Up%E2%80%85the%E2%80%85Levees/612fec5e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4116.%E2%80%85Shoring%E2%80%85Up%E2%80%85the%E2%80%85Levees/612fec5e.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4116/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:245px; width:367px" /></p>

<p>The quadrilateral is defined by four vertices. The levees partition the country into four quadrants. Each quadrant is identified by a pair of vertices representing the outside edge of that quadrant. For example, Quadrant 1 shown below is defined by the points (x1,y1) and (x2,y2).&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4116.%E2%80%85Shoring%E2%80%85Up%E2%80%85the%E2%80%85Levees/f10b4577.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4116.%E2%80%85Shoring%E2%80%85Up%E2%80%85the%E2%80%85Levees/f10b4577.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4116/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:247px; width:376px" /></p>

<p>It happens very often that the country of Waterlogged becomes flooded, and the levees need to be reinforced, but their country is poor and they have limited resources. They would like to be able to reinforce those levees that encompass the largest area first, then the next largest second, then the next largest third, and the smallest area fourth.&nbsp;</p>

<p>Help Waterlogged identify which quadrants are the largest, and the length of the levees around them&nbsp;</p>

### 입력

<p>There will be several sets of input. Each set will consist of eight real numbers, on a single line. Those numbers will represent, in order:</p>

<pre>
X1 Y1 X2 Y2 X3 Y3 X4 Y4</pre>

<p>The four points are guaranteed to form a convex quadrilateral when taken in order &ndash; that is, there will be no concavities, and no lines crossing. Every number will be in the range from -1000.0 to 1000.0 inclusive. No Quadrant will have an area or a perimeter smaller than 0.001. End of the input will be a line with eight 0.0&rsquo;s.</p>

### 출력

<p>For each input set, print a single line with eight floating point numbers. These represent the areas and perimeters of the four Quadrants, like this:</p>

<pre>A1 P1 A2 P2 A3 P3 A4 P4</pre>

<p>Print them in order from largest area to smallest &ndash; so A1 is the largest area. If two Quadrants have the same area when rounded to 3 decimal places, output the one with the largest perimeter first. Print all values with 3 decimal places of precision (rounded). Print spaces between numbers. Do not print any blank lines between outputs.&nbsp;</p>