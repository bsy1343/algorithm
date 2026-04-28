# [Platinum V] Posterize - 14638

[문제 링크](https://www.acmicpc.net/problem/14638)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 131, 정답: 75, 맞힌 사람: 59, 정답 비율: 57.282%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14638.%E2%80%85Posterize/18f414a2.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/14638.%E2%80%85Posterize/18f414a2.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14638/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:211px; width:598px" /></p>

<p>Pixels in a digital picture can be represented with three integers in the range 0 to 255 that indicate the intensity of the red, green, and blue colors. To compress an image or to create an artistic effect, many photo-editing tools include a &ldquo;posterize&rdquo; operation which works as follows. Each color channel is examined separately; this problem focuses only on the red channel. Rather than allow all integers from 0 to 255 for the red channel, a posterized image allows at most k integers from this range. Each pixel&rsquo;s original red intensity is replaced with the nearest of the allowed integers. The photo-editing tool selects a set of k integers that minimizes the sum of the squared errors introduced across all pixels in the original image. If there are n pixels that have original red values r<sub>1</sub>, . . . , r<sub>n</sub>, and k allowed integers v<sub>1</sub>, . . . , v<sub>k</sub>, the sum of squared errors is defined as</p>

<p style="text-align: center;">\(\sum_{i=1}^{n}{\min_{1 \le j \le k}{(r_i - v_j)^2}}\).</p>

<p>Your task is to compute the minimum achievable sum of squared errors, given parameter k and a description of the red intensities of an image&rsquo;s pixels.</p>

### 입력

<p>The first line of the input contains two integers d (1 &le; d &le; 256), the number of distinct red values that occur in the original image, and k (1 &le; k &le; d), the number of distinct red values allowed in the posterized image. The remaining d lines indicate the number of pixels of the image having various red values. Each such line contains two integers r (0 &le; r &le; 255) and p (1 &le; p &le; 2<sup>26</sup>), where r is a red intensity value and p is the number of pixels having red intensity r. Those d lines are given in increasing order of red value.</p>

### 출력

<p>Display the sum of the squared errors for an optimally chosen set of k allowed integer values.</p>