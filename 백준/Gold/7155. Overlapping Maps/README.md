# [Gold II] Overlapping Maps - 7155

[문제 링크](https://www.acmicpc.net/problem/7155)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 37, 정답: 20, 맞힌 사람: 14, 정답 비율: 73.684%

### 분류

수학, 기하학

### 문제 설명

<p>Fred and Sam are traveling together. Both have maps of the area. The maps cover exactly the same territory, and have exactly the same ratio of width to height, but Sam&rsquo;s is at a smaller scale than Fred&rsquo;s, so it&rsquo;s a bit smaller. Fred puts his map on a table. Sam throws his map on top of it. The smaller map is offset and rotated, but it still fits entirely on top of the bigger map. Fred sticks a pin in the smaller map. The pin goes all the way through to the bigger map. Sam is amazed! He says &ldquo;Wow! Do you realize that the position of that pin represents the same place on BOTH maps?&rdquo; Fred says &ldquo;it&rsquo;s really not so amazing. There has to be one such point!&rdquo;</p>

<p>Given the dimensions of a large map, and the offset, scale and rotation of a smaller map that is entirely on top of the larger map, find the single point that represents the same place on both maps.&nbsp;</p>

### 입력

<p>There will be several test cases in the input. Each test case will consist of a single line with six integers:</p>

<pre>
w h x y s r</pre>

<p>The first two integers w and h (0&lt;w,h&le;1,000) are the width and height of the larger map. The larger map will be on a plane, with the southwest corner at the origin, the northwest corner at (0,h), the southeast corner at (w,0), and the northeast corner at (w,h).</p>

<p>The next two integers, x and y (0&le;x&le;w, 0&le;y&le;h), represent the (x,y) coordinate on the plane of the southwest corner of the smaller map.</p>

<p>The integer s (0&lt;s&lt;100) represents the scale of smaller map as a percentage of the larger map (s=50 means that the smaller map has half the width and half the height of the larger map).</p>

<p>The integer r (0&le;r&lt;360) is the angle, in degrees, of counter-clockwise rotation of the smaller map around its southwest corner (r=90 means that the southeast corner is rotated to be due north of the southwest corner).</p>

<p>The smaller map is guaranteed to lie completely within the borders of the larger map. The input will end with a line with six 0s.</p>

### 출력

<p>For each test case, output two real numbers, x and y, representing the (x,y) coordinate of the point where both maps represent the same place. Output the numbers to two decimal places of accuracy, with a single space between them. Do not output any extra spaces. Do not put blank lines between answers for different cases.</p>