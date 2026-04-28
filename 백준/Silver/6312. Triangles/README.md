# [Silver III] Triangles - 6312

[문제 링크](https://www.acmicpc.net/problem/6312)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 170, 정답: 45, 맞힌 사람: 29, 정답 비율: 22.308%

### 분류

브루트포스 알고리즘, 기하학

### 문제 설명

<p>It is always very nice to have little brothers or sisters. You can tease them, lock them in the bathroom or put red hot chili in their sandwiches. But there is also a time when all meanness comes back!</p>

<p>As you know, in one month it is Christmas and this year you are honored to make the big star that will be stuck on the top of the Christmas tree. But when you get the triangle-patterned silver paper you realize that there are many holes in it. Your little sister has already cut out smaller triangles for the normal Christmas stars. Your only chance is to find an algorithm that tells you for each piece of silver paper the size of the largest remaining triangle.</p>

<p>Given a triangle structure with white and black fields inside you must find the largest triangle area of white fields, as shown in the following figure.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/6312.%E2%80%85Triangles/b397a4b6.png" data-original-src="https://www.acmicpc.net/upload/images2/triangle(1).png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:165px; width:214px" /></p>

### 입력

<p>The input file contains several triangle descriptions. The first line of each description contains an integer n (1 &le; n &le; 100), which gives the height of the triangle. The next n lines contain characters of the set space, #, - representing the rows of the triangle, where &lsquo;#&rsquo; is a black and &lsquo;-&rsquo; a white field. The spaces are used only to keep the triangle shape in the input by padding at the left end of the lines. (Compare with the sample input. The first test case corresponds to the figure.)</p>

<p>For each triangle, the number of the characters &lsquo;#&rsquo; and &lsquo;-&rsquo; per line is odd and decreases from 2n-1 down to 1.</p>

<p>The input is terminated by a description starting with n 0.</p>

### 출력

<p>For each triangle in the input, first output the number of the triangle, as shown in the sample output. Then print the line &ldquo;The largest triangle area is a.&rdquo;, where a is the number of fields inside the largest triangle that consists only of white fields. Note that the largest triangle can have its point at the top, as in the second case of the sample input.</p>

<p>Output a blank line after each test case.</p>