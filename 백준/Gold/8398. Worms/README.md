# [Gold II] Worms - 8398

[문제 링크](https://www.acmicpc.net/problem/8398)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 6, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

그래프 이론, 그래프 탐색, 트리, 너비 우선 탐색, 깊이 우선 탐색, 트리의 지름

### 문제 설명

<p>In the Mysterious Land of Worms there are many worm-houses. Not all of them are inhabited. It is known however, that at most one worm lives in each house. Some pairs of houses are connected with a path. For any pair of two different houses there exists exactly one route consisting of paths, so that none of the paths repeats on the route.</p>

<p>One day, all of the worms decided to meet in one of the houses. They agreed that every hour each of them will move along a path leaving the house it is presently in and will go to the other house at the opposite end of that path (walking along any path in the Mysterious Land of Worms takes exactly one hour). Worms intend to continue their travel untill the moment, when all of them meet in the same house (they need to be in that house exactly in the same time).</p>

<p>Unfortunately, worms have not foreseen that it may take a long period of time to meet if they apply this method of movement. Sometimes it is even impossible to meet. That is why worms asked you for help with verifying whether their meeting can be arranged and if so, how long it will take to meet in the best case.</p>

<p>Write a program which:</p>

<ul>
	<li>reads the description of the Mysterious Land of Worms from the standard input,</li>
	<li>checks whether the worms can meet and if so, how long it will take in the best case,</li>
	<li>writes the answer to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains two integers <em>n</em>&nbsp;and <em>m</em>&nbsp;(2 &le; <em>n</em> &le; 50 000, 1 &le; <em>m</em> &le; 50 000), separated with a single space and denoting accordingly the number of houses and the number of paths in the Mysterious Land of Worms. Houses are numbered with natural numbers ranging from 1&nbsp;to <em>n</em>. Following <em>m</em>&nbsp;lines contain descriptions of paths. Each of them consists of two integers <em>a</em>&nbsp;and <em>b</em>&nbsp;(1 &le; <em>a</em>, <em>b</em> &le; <em>n</em>), separated with a single space and denoting numbers of houses connected with a given path. Description of paths is followed by a line containing one integer <em>k</em>&nbsp;(2 &le; <em>k</em> &le; <em>n</em>), denoting the number of worms living in the Mysterious Land of Worms. Each of the following <em>k</em>&nbsp;lines contains one integer <em>d</em>&nbsp;(1 &le; <em>d</em> &le; <em>n</em>) denoting the house where the <em>k</em>-th worm lives.</p>

### 출력

<p>The first and only line of standard output should contain only one word&nbsp;<code>NIE</code>&nbsp;(i.e.&nbsp;<i>no</i>&nbsp;in Polish), if worms cannot meet while moving according to the rules, or one integer equal to the number of hours required by all worms to get to the meeting place.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8398.%E2%80%85Worms/01f23906.png" data-original-src="https://upload.acmicpc.net/c226a844-954a-4ab0-9887-da8c8626e386/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>