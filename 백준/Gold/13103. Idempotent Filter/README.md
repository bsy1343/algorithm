# [Gold II] Idempotent Filter - 13103

[문제 링크](https://www.acmicpc.net/problem/13103)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 80, 정답: 64, 맞힌 사람: 20, 정답 비율: 74.074%

### 분류

구현, 브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>Let&#39;s consider operations on monochrome images that consist of hexagonal pixels, each of which is colored in either black or white. Because of the shape of pixels, each of them has exactly six neighbors (e.g. pixels that share an edge with it.)</p>

<p>&quot;Filtering&quot; is an operation to determine the color of a pixel from the colors of itself and its six neighbors. Examples of filterings are shown below.</p>

<p>Example 1: Color a pixel in white when all of its neighboring pixels are white. Otherwise the color will not change.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13103/NoiseCanceller.png" style="height:235px; width:488px" /></p>

<p>Performing this operation on all the pixels simultaneously results in &quot;noise canceling,&quot; which removes isolated black pixels.</p>

<p>Example 2: Color a pixel in white when its all neighboring pixels are black. Otherwise the color will not change.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13103/EdgeDetector.png" style="height:235px; width:488px" /></p>

<p>Performing this operation on all the pixels simultaneously results in &quot;edge detection,&quot; which leaves only the edges of filled areas.</p>

<p>Example 3: Color a pixel with the color of the pixel just below it, ignoring any other neighbors.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13103/MoveUp.png" /></p>

<p>Performing this operation on all the pixels simultaneously results in &quot;shifting up&quot; the whole image by one pixel.</p>

<p>Applying some filter, such as &quot;noise canceling&quot; and &quot;edge detection,&quot; twice to any image yields the exactly same result as if they were applied only once. We call such filters idempotent. The &quot;shifting up&quot; filter is not idempotent since every repeated application shifts the image up by one pixel.</p>

<p>Your task is to determine whether the given filter is idempotent or not.</p>

### 입력

<p>The input consists of multiple datasets. The number of dataset is less than 100. Each dataset is a string representing a filter and has the following format (without spaces between digits).</p>

<pre>
 c<sub>0</sub>c<sub>1</sub>⋯c<sub>127</sub></pre>

<p>c<sub>i</sub> is either &#39;0&#39; (represents black) or &#39;1&#39; (represents white), which indicates the output of the filter for a pixel when the binary representation of the pixel and its neighboring six pixels is i. The mapping from the pixels to the bits is as following:</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13103/Bit.png" style="height:235px; width:226px" /></p>

<p>and the binary representation i is defined as i=&sum;<sup>6</sup><sub>j=0</sub>bit<sub>j</sub>&times;2<sup>j</sup>, where bit<sub>j</sub> is 0 or 1 if the corresponding pixel is in black or white, respectively. Note that the filter is applied on the center pixel, denoted as bit 3.</p>

<p>The input ends with a line that contains only a single &quot;#&quot;.</p>

### 출력

<p>For each dataset, print &quot;yes&quot; in a line if the given filter is idempotent, or &quot;no&quot; otherwise (quotes are for clarity).</p>