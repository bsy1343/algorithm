# [Silver I] Item Selection - 31511

[문제 링크](https://www.acmicpc.net/problem/31511)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 82, 정답: 38, 맞힌 사람: 33, 정답 비율: 44.000%

### 분류

구현, 그리디 알고리즘, 시뮬레이션

### 문제 설명

<p>You are browsing a website that lists items for sale. The website has a paging UI that displays a fixed number of items per page, one page at a time.</p>

<p>For example, if there are $55$ items and the page displays exactly $20$ at a time, then there are $3$ pages in total. Items $1$ through $20$ are on page $1$, items $21$ through $40$ are on page $2$, and items $41$ through $55$ are on page $3$. </p>

<p>You may navigate and select items using these UI elements:</p>

<ul>
	<li>A checkbox for every item on the current page.  After you click a checkbox, a selected item becomes unselected, and an unselected item becomes selected. You cannot click a checkbox for an item that is not on the current page.</li>
	<li>A &quot;Select All&quot; button. All unselected items on the current page become selected after you click this button.</li>
	<li>A &quot;Deselect All&quot; button. All selected items on the current page become unselected after you click this button.</li>
	<li>A &quot;Next Page&quot; button. Clicking it navigates to the next page and increments the current page number by one. This button is disabled on the last page.</li>
	<li>A &quot;Previous Page&quot; button. Clicking it navigates to the previous page and decrements the current page number by one. This button is disabled on the first page.</li>
</ul>

<p>The website has pre-selected some items for you based on its machine learning recommendation algorithm. The recommendation may or may not work for you. You know exactly the items that you want to purchase, which may differ from the pre-selected items. What is the minimum number of checkbox and button clicks required to select exactly the items you actually want?</p>

### 입력

<p>The first line of input has five integers $n, m$ ($1 \leq m \leq n \leq 10^3$), $s$ ($1 \leq s \leq \lceil \frac{n}{m} \rceil$), $p, q$ ($0 \leq p, q \leq n$), where:</p>

<ul>
	<li>$n$ is the number of items. The items have item numbers from $1$ to $n$.</li>
	<li>$m$ is the fixed number of items displayed per page.</li>
	<li>$s$ is the number of the page currently displayed.</li>
	<li>$p$ is the number of preselected items.</li>
	<li>$q$ is the number of items you want.</li>
</ul>

<p>Each of the next $p$ lines contains an integer $i$ ($1 \le i \le n$). These are the item numbers of the preselected items. These $p$ items are distinct and are listed in increasing order. It is possible that the website has pre-selected none of the items ($p = 0$), in which case the input has no lines for pre-selected items.</p>

<p>Each of the next $q$ lines contains an integer $j$ ($1 \le j \le n$). These are the item numbers of the items you want to buy. These $q$ items are distinct and are listed in increasing order. It is possible that you want to buy none of the items ($q = 0$), in which case the input has no lines for items you want.</p>

### 출력

<p>Output a single integer, which is the minimum number of checkbox and button clicks required to select exactly the items you want.</p>