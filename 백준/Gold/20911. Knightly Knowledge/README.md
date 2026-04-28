# [Gold III] Knightly Knowledge - 20911

[문제 링크](https://www.acmicpc.net/problem/20911)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 149, 정답: 51, 맞힌 사람: 40, 정답 비율: 34.783%

### 분류

브루트포스 알고리즘, 그리디 알고리즘

### 문제 설명

<p>Ancient cultures had an enormous and mostly unexpected knowledge of the earth and geometry. When they were building monuments, they did not place them at arbitrary locations. Instead, each building spot was carefully selected and calculated. Nowadays we can observe this in the form of so-called <em>ley lines</em>. A ley line is a horizontal or vertical straight line of infinite length that runs through at least two ancient monuments. Ley lines are expected to be a source of some kind of magic energy and every church built along such a line is a <em>mighty church</em>.</p>

<p>There are already several monuments and churches. An ancient culture is planning to construct a new monument, but the location is yet to be determined. They are looking for the spot that will turn the most ordinary churches into mighty churches. The monument can be co-located with a church or an existing monument -- in that case, the new monument will simply be built around the church or monument.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20911.%E2%80%85Knightly%E2%80%85Knowledge/c6e379e3.png" data-original-src="https://upload.acmicpc.net/aa052f47-679b-46ec-9a81-1043324249b8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 371px; height: 230px;" /></p>

<p style="text-align: center;">Figure K.1: Illustration of Sample 2 with 2 ley lines (<span style="color:#0000ff;">|</span>), 6 monuments (<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20911.%E2%80%85Knightly%E2%80%85Knowledge/0f517ae6.png" data-original-src="https://upload.acmicpc.net/6263d8d0-5d89-4dec-8d96-114100f59393/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 28px; height: 10px;" />), 2 mighty churches (<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20911.%E2%80%85Knightly%E2%80%85Knowledge/39cb2d4e.png" data-original-src="https://upload.acmicpc.net/2f6388cd-0eab-4ec2-835a-d0c477205a95/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 20px; width: 17px;" />)&nbsp;and 3 ordinary churches (<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20911.%E2%80%85Knightly%E2%80%85Knowledge/e61ef0b6.png" data-original-src="https://upload.acmicpc.net/207770cb-16ef-4912-b213-c03381934344/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 12px; height: 20px;" />)&nbsp;that are turned into mighty churches when building the dashed monument.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $m$ and $c$ ($0 \le m, c \le 1\,000$), the number of already built monuments and churches.</li>
	<li>$m$ lines with the coordinates of the monuments.</li>
	<li>$c$ lines with the coordinates of the churches.</li>
</ul>

<p>All coordinates are given as two integers $x$ and $y$ ($-10^6 \le x, y \le 10^6$). None of the given coordinate pairs coincide with one another, but any may coincide with the location of the new monument.</p>

### 출력

<p>Output three integers: the coordinates for where to build the new monument and the number of ordinary churches that will be turned into mighty churches with this new monument. The coordinates should be in the range ($-10^6 \le x, y \le 10^6$). If there are multiple optimal solutions, you may output any one of them.</p>