# [Gold IV] Degrees of Separation - 6814

[문제 링크](https://www.acmicpc.net/problem/6814)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 43, 정답: 25, 맞힌 사람: 23, 정답 비율: 56.098%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 런타임 전의 전처리

### 문제 설명

<p>The main socializing tool for students today is Facebook. There are many interesting computational questions connected to Facebook, such as the &ldquo;degree of separation&rdquo; between two people.</p>

<p>For example, in the diagram below, there are many different paths between Abby and Alberto. Some of these paths are:</p>

<ul>
	<li>Abby &rarr; Zoey &rarr; Alberto</li>
	<li>Abby &rarr; Natalie &rarr; Zoey &rarr; Alberto</li>
	<li>Abby &rarr; George &rarr; Ali &rarr; Kara &rarr; Richardo &rarr; Jeff &rarr; Alberto</li>
</ul>

<p>The shortest path between Abby and Alberto has two steps (Abby &rarr; Zoey, and Zoey &rarr; Alberto), so we say the degree of separation is 2. Additionally, Alberto would be a friend of a friend of Abby</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6814.%E2%80%85Degrees%E2%80%85of%E2%80%85Separation/be713a36.png" data-original-src="https://upload.acmicpc.net/185c3872-cc4a-4855-b053-0b9e16a6ffdf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 570px; height: 469px;" /></p>

<p>You can assume an initial configuration of who is friends with who as outlined in the diagram above. You will need to store these relationships in your program. These relationships can change though, and your program needs to handle these changes. In particular, friendships can begin, possibly with new people. Friendships can end. You should be able to find friends of friends and determine the degree of separation between two people.</p>

### 입력



### 출력

