# [Platinum I] Let There Be Light - 3831

[문제 링크](https://www.acmicpc.net/problem/3831)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 80, 정답: 23, 맞힌 사람: 19, 정답 비율: 40.426%

### 분류

기하학, 3차원 기하학, 비트 집합

### 문제 설명

<p>Suppose that there are some light sources and many spherical balloons. All light sources have sizes small enough to be modeled as point light sources, and they emit light in all directions. The surfaces of the balloons absorb light and do not reflect light. Surprisingly in this world, balloons may overlap.</p>

<p>You want the total illumination intensity at an objective point as high as possible. For this purpose, some of the balloons obstructing lights can be removed. Because of the removal costs, however, there is a certain limit on the number of balloons to be removed. Thus, you would like to remove an appropriate set of balloons so as to maximize the illumination intensity at the objective point.</p>

<p>The following figure illustrates the configuration specified in the first dataset of the sample input given below. The figure shows the xy-plane, which is enough because, in this dataset, the z-coordinates of all the light sources, balloon centers, and the objective point are zero. In the figure, light sources are shown as stars and balloons as circles. The objective point is at the origin, and you may remove up to 4 balloons. In this case, the dashed circles in the figure correspond to the balloons to be removed.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3831.%E2%80%85Let%E2%80%85There%E2%80%85Be%E2%80%85Light/5cceab88.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/3831.%E2%80%85Let%E2%80%85There%E2%80%85Be%E2%80%85Light/5cceab88.png" data-original-src="https://www.acmicpc.net/upload/imagesa/FigureG1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:364px; width:402px" /></p>

<p style="text-align:center">Figure 1: First dataset of the sample input.</p>

### 입력

<p>The input is a sequence of datasets. Each dataset is formatted as follows.</p>

<pre>
N M R
S<sub>1x</sub> S<sub>1y</sub> S<sub>1z</sub> S<sub>1r</sub>
...
S<sub>Nx</sub> S<sub>Ny</sub> S<sub>Nz</sub> S<sub>Nr</sub>
T<sub>1x</sub> T<sub>1y</sub> T<sub>1z</sub> T<sub>1b</sub>
...
T<sub>Mx</sub> T<sub>My</sub> T<sub>Mz</sub> T<sub>Mb</sub>
E<sub>x</sub> E<sub>y</sub> E<sub>z</sub></pre>

<p>The first line of a dataset contains three positive integers, N, M and R, separated by a single space. N means the number of balloons that does not exceed 2000. M means the number of light sources that does not exceed 15. R means the number of balloons that may be removed, which does not exceed N.</p>

<p>Each of the N lines following the first line contains four integers separated by a single space. (\(S_{ix}\), \(S_{iy}\), \(S_{iz}\)) means the center position of the i-th balloon and \(S_{ir}\) means its radius.</p>

<p>Each of the following M lines contains four integers separated by a single space. (\(T_{jx}\),&nbsp;\(T_{jy}\), \(T_{jz}\) ) means the position of the j-th light source and \(T_{jb}\) means its brightness.</p>

<p>The last line of a dataset contains three integers separated by a single space. (\(E_{x}\), \(E_{y}\),\(E_{z}\)) means the position of the objective point.</p>

<p>\(S_{ix}\), \(S_{iy}\), \(S_{iz}\), \(T_{jx}\), \(T_{jy}\), \(T_{jz}\), \(E_{x}\), \(E_{y}\) and \(E_{z}\) are greater than &minus;500, and less than 500. \(S_{ir}\) is greater than 0, and less than 500. \(T_{jb}\) is greater than 0, and less than 80000.</p>

<p>At the objective point, the intensity of the light from the j-th light source is in inverse proportion to the square of the distance, namely</p>

<p>\[\frac{ T_{jb} }{ (T_{jx} - E_{x})^2 + (T_{jy} - E_y)^2 + (T_{jz} - E_{z})^2}\]</p>

<p>if there is no balloon interrupting the light. The total illumination intensity is the sum of the above.</p>

<p>You may assume the following.</p>

<ul>
	<li>The distance between the objective point and any light source is not less than 1.</li>
	<li>For every i and j, even if Sir changes by &epsilon; (|&epsilon;| &lt; 0.01), whether the i-th balloon hides the j-th light or not does not change.</li>
</ul>

<p>The end of the input is indicated by a line of three zeros.</p>

### 출력

<p>For each dataset, output a line containing a decimal fraction which means the highest possible illumination intensity at the objective point after removing R balloons. The output should not contain an error greater than 0.0001.</p>