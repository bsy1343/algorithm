# [Gold V] Floor Cleaner - 26585

[문제 링크](https://www.acmicpc.net/problem/26585)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 24, 맞힌 사람: 22, 정답 비율: 91.667%

### 분류

너비 우선 탐색, 플러드 필, 그래프 이론, 그래프 탐색

### 문제 설명

<p>You have built a floor cleaning robot and now you are writing an algorithm that will report all the locations of the house it could not clean. The robot has layout of the house that includes where the walls, furniture and flooring are. When it cleans it will log locations where it finds unexpected obstructions. Key:</p>

<ul>
	<li>&lsquo;W&rsquo; &ndash; Wall</li>
	<li>&lsquo;F&rsquo; &ndash; Furniture</li>
	<li>&lsquo;-&rsquo; &ndash; Flooring</li>
	<li>&lsquo;B&rsquo; &ndash; Base</li>
</ul>

### 입력

<p>The input will start with a 10 by 10 grid that describes the house with columns and rows numbered 0 to 9. The grid will be followed by an unknown number of locations where obstructions were found, in the following format:</p>

<pre>
(column,row)</pre>

### 출력

<p>Display all the locations that were not able to be cleaned in the following format:</p>

<pre>
(column,row)</pre>

<p>Display each location on its own line. Locations must be displayed in ascending order first by row and then by column.</p>