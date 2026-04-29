# [Silver I] Family Tree - 33243

[문제 링크](https://www.acmicpc.net/problem/33243)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 73, 정답: 45, 맞힌 사람: 36, 정답 비율: 72.000%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 문자열, 자료 구조, 집합과 맵, 트리, 해시를 사용한 집합과 맵

### 문제 설명

<p>While you are attending the yearly family gathering of your family, you notice that your family keeps growing bigger and bigger. You are having a hard time remembering for every member of the family what their name is and to what part of the family they belong to. To solve this, you decide to create a family tree on a big sheet of paper. You collect a portrait picture from every member of the family and stick them onto the paper in the shape of a tree, putting pictures of children exactly one level below the picture of their parents.</p>

<p>Before actually sticking the pictures on the paper, you need to figure out how much paper you need. Environmentally aware as you are, you try to minimize the amount of paper needed. You decide to allow pictures within the same level to move to the left or right if this makes the tree less wide (see also the examples below).</p>

### 입력

<ul>
	<li>One line with one integer: $2 \leq n \leq 10^5$, the number of people in the family tree.</li>
	<li>One line that indicates the earliest ancestor that you have information about.</li>
	<li>$n - 1$ lines, each in the format "<code>A - B</code>", indicating that <code>A</code> is the parent of <code>B</code>. These lines have no particular order.</li>
</ul>

<p>The name of each person consists of at most 20 characters from the English alphabet (<code>A-Z</code> and <code>a-z</code>).</p>

### 출력

<p>The minimum width of the family tree in the number of portrait pictures.</p>