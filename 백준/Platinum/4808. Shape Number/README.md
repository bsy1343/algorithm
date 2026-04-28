# [Platinum III] Shape Number - 4808

[문제 링크](https://www.acmicpc.net/problem/4808)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 41, 정답: 21, 맞힌 사람: 9, 정답 비율: 33.333%

### 분류

문자열, 해싱, 접미사 배열과 LCP 배열

### 문제 설명

<p>In computer vision, a chain code is a sequence of numbers representing directions when following the contour of an object. For example, the following figure shows the contour represented by the chain code 22234446466001207560 (starting at the upper-left corner).</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4808.%E2%80%85Shape%E2%80%85Number/4d8c0ae7.png" data-original-src="https://www.acmicpc.net/upload/images2/shapenum.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:241px; width:580px" /></p>

<p>Two chain codes may represent the same shape if the shape has been rotated, or if a different starting point is chosen for the contour. To normalize the code for rotation, we can compute the first difference of the chain code instead. The first difference is obtained by counting the number of direction changes in counterclockwise direction between consecutive elements in the chain code (the last element is consecutive with the first one). In the above code, the first difference is</p>

<pre>
00110026202011676122</pre>

<p>Finally, to normalize for the starting point, we consider all cyclic rotations of the first difference and choose among them the lexicographically smallest such code. The resulting code is called the shape number.</p>

<pre>
00110026202011676122
01100262020116761220
11002620201167612200
...
20011002620201167612</pre>

<p>In this case, 00110026202011676122 is the shape number of the shape above.</p>

### 입력

<p>The input consists of a number of cases. The input of each case is given in one line, consisting of a chain code of a shape. The length of the chain code is at most 300,000, and all digits in the code are between 0 and 7 inclusive. The contour may intersect itself and needs not trace back to the starting point.</p>

### 출력

<p>For each case, print the resulting shape number after the normalizations discussed above are performed.</p>