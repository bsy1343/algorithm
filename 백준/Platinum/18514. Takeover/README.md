# [Platinum I] Takeover - 18514

[문제 링크](https://www.acmicpc.net/problem/18514)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 42, 정답: 14, 맞힌 사람: 13, 정답 비율: 44.828%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 많은 조건 분기, 우선순위 큐

### 문제 설명

<p>A new IT company has recently founded their office in the city! Their headquarters are located at the point (0, 0), and the campus is a rectangle with corners at (0, 0) and (1, 1). The campus is very small and has no facilities yet. However, there are many facilities in the neighborhood. Why not to enlarge the campus and have them all inside?</p>

<p>The facilities will be captured and added to the campus one by one. After taking control of each facility, the company has to rebuild the fence around the campus. The fence should be the smallest rectangle with sides parallel to coordinate axes that contains the headquarters and all captured facilities.</p>

<p>It is possible to reuse material from the previous fence, but sometimes the total length of the fence may increase. In this case it is necessary to buy some new material. If the length of the fence before the capture was a meters, and after the capture it became b meters, b &minus; a units of material should be bought.</p>

<p>It is hard to justify the needs for huge buys. Find the order of capturing the facilities such that the maximum increase in the length of the fence after the capture is minimized.</p>

<p>The material required for building the initial fence (of size 4) is not considered an increase, as it is initially present.</p>

### 입력

<p>In the first line of input, there is an integer n (1 &le; n &le; 3 &middot; 10<sup>5</sup>), the number of facilities. In each of the next n lines, there are two integers, x<sub>i</sub> and y<sub>i</sub> (1 &le; x<sub>i</sub>, y<sub>i</sub> &le; 10<sup>9</sup>), the coordinates of the i-th facility.</p>

<p>It is allowed for two facilities to be located at the same position, and for any facility to be already inside the campus initially.</p>

### 출력

<p>Print a permutation of numbers from 1 to n: the order in which the facilities should be captured. This order should minimize the maximum increase in the length of the fence after the capture. The facilities are numbered from 1 to n in the order they are given in the input.</p>

<p>If there are multiple answers, print any one of them.</p>