# [Silver II] Wikipedia Black Hole - 34377

[문제 링크](https://www.acmicpc.net/problem/34377)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 60, 정답: 32, 맞힌 사람: 27, 정답 비율: 50.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>You have found yourself on Wikipedia reading the article about black holes. You don't understand everything on the page, but there are links to other articles to explain the unfamiliar concepts. There are so many links to choose from, but you decide to click on the link to the article about "general relativity" (such light reading). You read a little bit about it, but realize that you'll need to learn about "partial differential equations" before you can understand any of the mathematics behind general relativity, so you click on that article.</p>

<p>As you keep clicking, you wonder if it's possible for you to eventually end up back on the original article about black holes. It would be bad if that was the case because it would mean you could keep clicking through the same articles forever. To avoid this fate, you decide to write a program that will tell you if it's possible to end up back on the article you started on, and if so, the fewest number of clicks it would take. Note that there could be loops of links that do not lead back to the original article, but you can ignore those loops.</p>

<p>In the first sample input, the fewest clicks to get back to the original article (listed on the second line) is $3$. The path is "black_holes" $\rightarrow$ "general_relativity" $\rightarrow$ "albert_einstein" $\rightarrow$ "black_holes". Note that there is another way to get back to black holes that is $4$ clicks ("black_holes" $\rightarrow$ "escape_velocity" $\rightarrow$ "speed_of_light" $\rightarrow$ "gravitational_wave" $\rightarrow$ "black_holes"), but you only want to know the path with the fewest number of clicks.</p>

### 입력

<p>The first line of input will be $1 \leq N \leq 10\,000$, the number of links to follow.</p>

<p>The second line of input contains the name of the article you started on. <strong>Article names</strong> are strings whose length is between $1$ and $30$, consisting of only lower-case letters (a-z) and underscores (_).</p>

<p>The next $N$ lines will each contain the information about a single link. Each of these lines will have two space-separated article names (as defined in the previous paragraph). The first word represents the <em>source</em> article of the link, and the second word represents the <em>destination</em> article. For example, if there is a link on the article about "black_holes" to the article on "general_relativity", then the source would be "black_holes" and the destination would be "general_relativity".</p>

<p>Input Restrictions</p>

<ul>
	<li>You are guaranteed the source and destination of each link will be a different article.</li>
	<li>You are guaranteed that each link is unique. That is, a source article will not contain more than one link to the same destination article.</li>
	<li>It <strong>is</strong> possible for an article to not contain any links, and thus not be the source article for any link.</li>
	<li>Conversely, it <strong>is</strong> possible for one source article to have links to several destination articles.</li>
</ul>

### 출력

<p>If you can get back to the original article by following the links, output the smallest number of links that must be clicked to get back to the original article. If you cannot get back to the original article, output "NO BLACK HOLE".</p>