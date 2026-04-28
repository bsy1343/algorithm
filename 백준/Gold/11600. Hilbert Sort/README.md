# [Gold II] Hilbert Sort - 11600

[문제 링크](https://www.acmicpc.net/problem/11600)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 63, 정답: 27, 맞힌 사람: 25, 정답 비율: 46.296%

### 분류

분할 정복, 구현

### 문제 설명

<p>In database storage, arranging data items according to a numeric key not only makes it easier to search for a particular item, but also makes better use of a CPU&rsquo;s cache: any segment of data that&rsquo;s contiguous in memory will describe items with similar keys. This is useful if, for instance, we want to access all items whose keys are in some range. Things get more complicated if the keys represent points on a 2D grid, as might happen in a GPS guidance system. If the points (x, y) are sorted primarily by x, breaking ties by y, then points that are adjacent in memory will have similar x coordinates but not necessarily similar y, potentially placing them far apart on the grid. To better preserve distances, we may sort the data along a continuous space-filling curve.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11600/1.png" style="height:305px; width:444px" /></p>

<p>We consider one such space-filling curve called the Hilbert curve. The Hilbert curve starts at the origin (0, 0) and finishes at (S, 0), in the process traversing the entire axis-aligned square with corners at (0, 0) and (S, S). It has the following recursive construction: split the square into four quadrants meeting at (S/2, S/2), and recursively fill each of them with a suitably rotated and scaled copy of the full Hilbert curve. First, the lower-left quadrant is filled with a curve going from (0, 0) to (0, S/2). Second, the upper-left quadrant is filled from (0, S/2) to (S/2, S/2). Third, the upperright quadrant is filled from (S/2, S/2) to (S, S/2). And finally, the lower-right quadrant is filled from (S, S/2) to (S, 0). The Hilbert curve can alternatively be constructed as the mathematical limit of a sequence of curves, the first six of which are shown in the figure.</p>

<p>Given some locations of interest, you are asked to sort them according to when the Hilbert curve visits them. Note that while the curve intersects itself at infinitely many places, e.g., at (S/2, S/2); making S odd guarantees that all integer points are visited just once.</p>

### 입력

<p>The first line of input contains two space-separated integers n and S (1 &le; n &le; 200,000, 1 &le; S &lt; 10<sup>9</sup> , S is odd). This is followed by n lines. Line i + 1 describes the ith location of interest by spaceseparated integers x<sub>i</sub> and y<sub>i</sub> (0 &le; x<sub>i</sub>, y<sub>i</sub> &le; S) and an identifier string consisting of at most 46 alphanumeric characters (&lsquo;A&rsquo;&ndash;&lsquo;Z&rsquo;, &lsquo;a&rsquo;&ndash;&lsquo;z&rsquo;, &lsquo;0&rsquo;&ndash;&lsquo;9&rsquo;). No two locations will share the same position or the same identifier.</p>

### 출력

<p>Print the n identifier strings, one on each line, Hilbert-sorted according to their positions.</p>