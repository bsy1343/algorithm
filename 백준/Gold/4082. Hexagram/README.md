# [Gold IV] Hexagram - 4082

[문제 링크](https://www.acmicpc.net/problem/4082)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 13, 맞힌 사람: 10, 정답 비율: 41.667%

### 분류

백트래킹

### 문제 설명

<p>A Hexagram is a 6-pointed star, sometimes called the Star of David. Given these numbers:</p>

<pre>
3 17 15 18 11 22 12 23 21 7 9 13</pre>

<p>There are four unique ways of assigning the numbers to vertices of the hexagram such that all of the sets of four numbers along the lines have the same sum (57 in this case). All other ways may be obtained from these by rotation and/or reflection.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4082.%E2%80%85Hexagram/e6cedb00.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4082.%E2%80%85Hexagram/e6cedb00.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4082/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:157px; width:587px" /></p>

<p>Given 12 distinct numbers, in how many ways, disregarding rotations and reflections, can you assign the numbers to the vertices such that the sum of the numbers along each of 6 straight lines passing through 4 vertices is the same?</p>

### 입력

<p>There will be several test cases in the input. Each test case will consist of twelve unique positive integers on a single line, with single spaces separating them. All of the numbers will be less than 1,000,000. The input will end with a line with twelve 0s.</p>

### 출력

<p>For each test case, output the number of ways the numbers can be assigned to vertices such that the sum along each line of the hexagram is the same. Put each answer on its own line. Output no extra spaces, and do not separate answers with blank lines.</p>