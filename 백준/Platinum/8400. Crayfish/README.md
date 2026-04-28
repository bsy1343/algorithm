# [Platinum III] Crayfish - 8400

[문제 링크](https://www.acmicpc.net/problem/8400)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

그래프 이론, 강한 연결 요소

### 문제 설명

<p>In Byteland there is a pond occupied by <em>n</em>&nbsp;turtles. In this pond there are also&nbsp;<em>n</em>&nbsp;houses, numbered from 1&nbsp;to&nbsp;<em>n</em>. In each of these houses lives exactly one turtle. Soon the crayfish migrant (who lives in Bytemerica) will come to Byteland. This crayfish is very social and all turtles are his friends. During his visit, the crayfish plans to stay at one of his friend&#39;s house. But the problem is, in which house he should stay.</p>

<p>Crayfish migrant is interested in houses which will allow him to visit as many friends as possible. One could think, that visiting friends is not a problem, but in a Byteland pond it is harder that is seems. Firstly, in order to visit someone, one must reach his house. Secondly, one must also get back. We assume, that the crayfish migrant will not visit the turtle, in whose house he will stay.</p>

<p>Crayfish moves according to the following rules:</p>

<ol>
	<li>Between houses the crayfish may only move using particular&nbsp;<i>routes</i>.</li>
	<li>Each route is one-way, and connects two distinct houses. There could be more than one route connecting the same houses.</li>
	<li>Crayfish can move&nbsp;<i>normally</i>&nbsp;or&nbsp;<i>backwards</i>. Being in house <em>A</em>&nbsp;and moving normally, the crayfish can move to house <em>B</em>, if there exist a route from house <i>A</i>&nbsp;to house&nbsp;<em>B</em>. If the crayfish is moving backwards, then he can go from house <em>A</em>&nbsp;to <em>B</em>&nbsp;if there exist a route from <em>B</em>&nbsp;to <em>A</em>.</li>
	<li>Some of the routes are&nbsp;<i>special</i>. Just after using such route the crayfish changes his moving style - if he was moving normally, then he starts moving backwards and if he was moving backwards he starts moving normally. The crayfish cannot change its moving style anywhere else.</li>
	<li>At the beginning of his migrations, the crayfish migrant moves backwards. When visiting a friend, the crayfish does not change moving style. At the end of his migration, the crayfish must move backwards (if the last route was special, just before entering this route the crayfish should move&nbsp;<i>normally</i>).</li>
</ol>

<p>Write a program which:</p>

<ul>
	<li>reads the description of routes in a Byteland pond,</li>
	<li>for each house computes the number of friends the crayfish could visit, if he stayed at that house,</li>
	<li>writes the answer to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains two integers <em>n</em>&nbsp;and <em>m</em>&nbsp;(1 &le; <em>n</em> &le; 10 000, 1 &le; <em>m</em> &le; 100 000). These numbers denote respectively: the number of houses and the number of routes. In the following <em>m</em>&nbsp;lines there are descriptions of particular routes, each on a separate line. Each description consists of three integers <em>a</em>, <em>b</em>&nbsp;and <em>s</em>&nbsp;(1 &le; <em>a</em>, <em>b</em> &le; <em>n</em>, <em>s</em>&nbsp;&isin; {0, 1}). Integer <em>a</em>&nbsp;denotes the starting house number,&nbsp;<em>b</em>&nbsp;denotes ending house number. Route is special if and only if <em>s</em> = 1.</p>

### 출력

<p>Exactly <em>n</em>&nbsp;lines are to be written to the standard output. In the <em>i</em>-th line exactly one integer is to be written, this integer is the number of friends the crayfish could visit, if he stayed at house number&nbsp;<em>i</em>.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8400.%E2%80%85Crayfish/47544fdf.png" data-original-src="https://upload.acmicpc.net/325a6226-bad8-4160-b10f-74d5ab0697d6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Staying at house number 1 the crayfish can visit friends from houses 2, 3, 4. Staying at house number 2 the crayfish can visit friends from houses 3, 4, 5. Staying at house number 3 the crayfish can visit friends from houses 2, 4, 5. Staying at house number 4 the crayfish can visit friends from houses 2, 3, 5. Staying at house number 5 the crayfish can visit none of his friends.</p>