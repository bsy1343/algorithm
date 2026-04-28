# [Gold II] Kind of a Blur - 4897

[문제 링크](https://www.acmicpc.net/problem/4897)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 74, 정답: 14, 맞힌 사람: 10, 정답 비율: 20.408%

### 분류

가우스 소거법, 구현, 선형대수학, 수학, 시뮬레이션

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4897.%E2%80%85Kind%E2%80%85of%E2%80%85a%E2%80%85Blur/1ce3d23e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4897.%E2%80%85Kind%E2%80%85of%E2%80%85a%E2%80%85Blur/1ce3d23e.png" data-original-src="https://www.acmicpc.net/upload/images2/blur.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:563px; width:163px" />Image blurring occurs when the object being captured is out of the camera&rsquo;s focus. The top two figures on the right are an example of an image and its blurred version. Restoring the original image given only the blurred version is one of the most interesting topics in image processing. This process is called deblurring, which will be your task for this problem.</p>

<p>In this problem, all images are in grey-scale (no colours). Images are represented as a 2 dimensional matrix of real numbers, where each cell corresponds to the brightness of the corresponding pixel. Although not mathematically accurate, one way to describe a blurred image is through averaging all the pixels that are within (less than or equal to) a certain Manhattan distance<sup>&dagger;</sup> from each pixel (including the pixel itself ). Here&rsquo;s an example of how to calculate the blurring of a 3x3 image with a blurring distance of 1:</p>

<p>\(\text{blur}\begin{pmatrix}\begin{bmatrix} 2 &amp; 30 &amp; 17 \\ &nbsp;25 &amp; 7 &amp; 13 \\ 14 &amp; 0 &amp; 35 \end{bmatrix} &nbsp; \end{pmatrix} \\ = \begin{bmatrix} \frac{2+30+25}{3} &amp; \frac{2+30+17+7}{4} &amp; \frac{30+17+13}{3} \\ \frac{2+25+7+14}{4} &amp; \frac{30+25+7+13+0}{5} &amp; \frac{17+7+13+35}{4} \\ \frac{25+14+0}{3} &amp; \frac{7+14+0+35}{4} &amp; \frac{13+0+35}{3} \end{bmatrix} \\ = \begin{bmatrix} 19 &amp; 14 &amp; 20 \\ 12 &amp; 15 &amp; 18 \\ 13 &amp; 14 &nbsp;&amp; 16 \end{bmatrix}\)</p>

<p>Given the blurred version of an image, we are interested in reconstructing the original version assuming that the image was blurred as explained above.</p>

<p><sup>&dagger;</sup>The Manhattan Distance (sometimes called the Taxicab distance) between two points is the sum of the (absolute) difference of their coordinates. The grid on the lower right illustrates the Manhattan distances from the grayed cell.</p>

### 입력

<p>Input consists of several test cases. Each case is specified on H + 1 lines. The first line specifies three non negative integers specifying the width W, the height H of the blurred image and the blurring distance D respectively where (1 &le; W, H &le; 10) and (D &le; min(W/2, H/2)). The remaining H lines specify the gray-level of each pixel in the blurred image. Each line specifies W non-negative real numbers given up to the 2nd decimal place. The value of all the given real numbers will be less than 100.</p>

<p>Zero or more lines (made entirely of white spaces) may appear between cases. The last line of the input file consists of three zeros.</p>

### 출력

<p>For each test case, print a W &times; H matrix of real numbers specifying the deblurred version of the image. Each element in the matrix should be approximated to 2 decimal places and right justified in a field of width 8. Separate the output of each two consecutive test cases by an empty line. Do not print an empty line after the last test case. It is guaranteed that there is exactly one unique solution for every test case.</p>