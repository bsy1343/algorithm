# [Silver I] Annoying painting tool - 6510

[문제 링크](https://www.acmicpc.net/problem/6510)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 46, 정답: 30, 맞힌 사람: 26, 정답 비율: 78.788%

### 분류

그리디 알고리즘

### 문제 설명

<p>Maybe you wonder what an annoying painting tool is? First of all, the painting tool we speak of supports only black and white. Therefore, a picture consists of a rectangular area of pixels, which are either black or white. Second, there is only one operation how to change the colour of pixels:</p>

<p>Select a rectangular area of r rows and c columns of pixels, which is completely inside the picture. As a result of the operation, each pixel inside the selected rectangle changes its colour (from black to white, or from white to black).</p>

<p>Initially, all pixels are white. To create a picture, the operation described above can be applied several times. Can you paint a certain picture which you have in mind?</p>

### 입력

<p>The input contains several test cases. Each test case starts with one line containing four integers n, m, r and c. (<em>1 &le; r &le; n &le; 100, 1 &le; c &le; m &le; 100</em>), The following n lines each describe one row of pixels of the painting you want to create. The i<sup>th</sup> line consists of m characters describing the desired pixel values of the i<sup>th</sup> row in the finished painting (&#39;0&#39; indicates white, &#39;1&#39; indicates black).</p>

<p>The last test case is followed by a line containing four zeros.</p>

### 출력

<p>For each test case, print the minimum number of operations needed to create the painting, or -1 if it is impossible.</p>