# [Gold V] Pants On Fire - 16054

[문제 링크](https://www.acmicpc.net/problem/16054)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 97, 정답: 68, 맞힌 사람: 64, 정답 비율: 71.111%

### 분류

너비 우선 탐색, 자료 구조, 깊이 우선 탐색, 플로이드–워셜, 그래프 이론, 그래프 탐색, 해시를 사용한 집합과 맵, 최단 경로, 집합과 맵

### 문제 설명

<p>Donald and Mike are the leaders of the free world and haven&rsquo;t yet (after half a year) managed to start a nuclear war. It is so great! It is so tremendous!</p>

<p>Despite the great and best success of Donald&rsquo;s Administration, there are still a few things he likes to complain about.</p>

<blockquote>
<p>The Mexican government is much smarter, much sharper, and much more cunning. And they send all these bad hombres over because they don&rsquo;t want to pay for them. They don&rsquo;t want to take care of them.</p>

<p style="text-align: right;">Donald J. Trump, First Republican Presidential Debate, August 6, 2015</p>
</blockquote>

<p>He also frequently compares Mexicans to other bad people (like Germans, since they are exporting so many expensive cars to the US). Due to the tremendous amount of statements he has made (mostly containing less than 140 characters ...) the &ldquo;Fake-News&rdquo; New York Telegraph (NYT) has to put in a lot of effort to clarify and comment on all the statements of Donald. To check a statement, they have a list of facts they deem to be true and classify Donald&rsquo;s statements into three groups: real facts (which are logical conclusions from their list of true facts), exaggerations (which do not follow, but are still consistent with the papers list of facts), and alternative facts (which contradict the knowledge of the newspaper).</p>

<p>They have asked you to write a program helping them to classify all of Donald&rsquo;s statements &ndash; after all it is hard for a journalist to go through them all and check them all, right?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line containing two integers n and m, where
	<ul>
		<li>n (1 &le; n &le; 200) is the number of facts deemed true by the NYT;</li>
		<li>m (1 &le; m &le; 200) is the number of statements uttered by the Donald.</li>
	</ul>
	</li>
	<li>n lines each containing a statement deemed true by the NYT.</li>
	<li>m lines each containing a statement uttered by the Donald.</li>
</ul>

<p>All statements are of the form a are worse than b, for some strings a and b, stating that a is (strictly) worse than b. The strings a and b are never identical. Both a and b are of length between 1 and 30 characters and contain only lowercase and uppercase letters of the English alphabet.</p>

<p>Note that Donald&rsquo;s statements may contain countries that the NYT does not know about. You may assume that worseness is transitive and that the first n lines do not contain any contradictory statement. Interestingly, Donald&rsquo;s press secretary (Grumpy Sean) has managed to convince him not to make up countries when tweeting, thus the input mentions at most 193 different countries.</p>

### 출력

<p>For every of the m statements of Donald output one line containing</p>

<ul>
	<li>Fact if the statement is true given the n facts of the NYT</li>
	<li>Alternative Fact if the inversion of the statement is true given the n facts of the NYT</li>
	<li>Pants on Fire if the statement does not follow, but neither does its inverse.</li>
</ul>