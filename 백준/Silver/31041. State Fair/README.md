# [Silver I] State Fair - 31041

[문제 링크](https://www.acmicpc.net/problem/31041)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 29, 정답: 21, 맞힌 사람: 15, 정답 비율: 75.000%

### 분류

기하학

### 문제 설명

<p>&quot;Kooky Kenny&quot; (as the carnies call him) is setting up a park attraction at the state fair.</p>

<p>He has already set up the tent for the circus performance he wishes to put up. What he wants to know is how to construct the barrier around the tent.</p>

<p>He knows he wants an isoceles triangle, with the shorter side being the side where he&#39;ll set up the ticket booth. Therefore people will be deterred from going along the longer sides, since park patrons hate walking.</p>

<p>While he knows how long he wants to make the shorter side, he wants to use the minimum amount of tape to make the other edges.</p>

<p>Putting on a circus is a costly business! Expenses need to be minimized and profits need to be maximized! Therefore the shorter side will be just long enough to encompass the circus tent.</p>

<p>Being the park&#39;s problem solver, can you help figure out the other side lengths for Kenny? Assuming the tent is a perfect circle of course.</p>

### 입력

<p>You will be given the number of test cases. <code>1 &lt; tc &le; 100</code></p>

<p>For each test case you will be given the radius of the circus tent <code>r</code> and the length of the shortest side <code>c</code> of the attraction. The radius will be bounded by <code>c</code>, <code>1 &le; r &lt; c/2 &le; 100</code>. Note: <code>r</code> and <code>c</code> are both integers.</p>

### 출력

<p>Your program should echo out the minimum length of the other side that still encompasses the circus tent and satisfies the triangle. Round your answer to <code>3</code> digits. Separate separate cases with a new line.</p>