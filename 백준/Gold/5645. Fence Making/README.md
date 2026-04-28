# [Gold III] Fence Making - 5645

[문제 링크](https://www.acmicpc.net/problem/5645)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 6, 맞힌 사람: 6, 정답 비율: 40.000%

### 분류

기하학

### 문제 설명

<p>The City of Haka is very famous for its traffic jam. This has given birth to many problemsetters (Those who pose questions for programming contests) as in traffic jam some people have nothing meaningful to do other than thinking about new problems. Most wide roads in Haka have fence along the divider. Perforated steel sheets (As shown in the figure on the left) are often used in these fences.</p>

<p>In this problem we will discuss the manufacturing process of one kind of perforated steel strips and ask you to solve a problem related to this building process.</p>

<p>For this problem the rectangular perforated steel strips have two circular holes in each row. Circular holes in the same row are 2d distance apart. Two consecutive circular holes in the same column are also 2d distance apart. The distance of each circle from its nearest side is d. The radius of all the circles is r. So automatically the width of the metal sheet/strip becomes (4d + 4r). The length of the initial sheet is S. Such a sheet with holes in it is shown in the picture on the right. Holes are only drilled if they can be cut according to rules mentioned above. The circular steel sheets which are obtained by cutting the holes and part of the sheet that is unused (Such as portion below the red dotted line in the figure on the right) are melted to create a new steel sheet/strip of width (4d+ 4r). Now holes are cut according to the rules mentioned above. This process is repeated until the newly created sheet is so small that two holes (In the same row) cannot be created in it following the above-mentioned restrictions. Suppose C(d, r, S) denote the total number of holes that are created. Now given the minimum possible value of r (r<sub>min</sub>), maximum possible value of r (r<sub>max</sub>), minimum possible value of d (d<sub>min</sub>) and maximum possible value of d (d<sub>max</sub>) you will have to find the total number of holes created.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5645.%E2%80%85Fence%E2%80%85Making/64cf8fbb.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/5645.%E2%80%85Fence%E2%80%85Making/64cf8fbb.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/5645/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-26%20%EC%98%A4%ED%9B%84%204.08.19.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:387px; width:380px" /></p>

<p>In other words you will have to find</p>

<p>\( \sum_{r=r_{min}}^{r_{max}}\sum_{d=d_{min}}^{d_{max}} C(d,r,S)&nbsp;\)</p>

<p>It should be clear to you now that the value of d and r are always integer. Your method should be quite efficient. You must assume that the initial given strip and the strips created later on have equal and uniform thickness in all places.</p>

### 입력

<p>Input file contains 1000 sets of inputs. The input for each set is given in a single line. Each line contains five integers r<sub>min</sub> (5, 000 &le; r<sub>min</sub> &le; 10, 000), r<sub>max</sub> (0 &le; r<sub>max</sub> &minus; r<sub>min</sub> &le; 1, 000) , d<sub>min</sub> (1 &le; d<sub>min</sub> &le; 21), d<sub>max </sub>(0 &le; d<sub>max</sub> &minus; d<sub>min</sub> &le; 100) and S (1, 000, 000 &le; S &le; 2, 000, 000, 000). By now it should be clear to you that value of r and d can only be a round number.</p>

<p>Input is terminated by a line containing five zeroes. This line should not be processed.</p>

### 출력

<p>For each set/line of input produce one line of output. This line contains an integer, which denotes the value of</p>

<p>\(&nbsp;\sum_{r=r_{min}}^{r_{max}}\sum_{d=d_{min}}^{d_{max}} C(d,r,S)&nbsp;\)</p>

<p>You can safely assume that the value of this integer will comfortably fit in a 64-bit signed integer. Errors not exceeding 10<sup>&minus;7</sup>% will be ignored.</p>