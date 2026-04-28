# [Platinum IV] Growing Some Oobleck - 24560

[문제 링크](https://www.acmicpc.net/problem/24560)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 29, 정답: 10, 맞힌 사람: 10, 정답 비율: 35.714%

### 분류

구현, 기하학, 시뮬레이션

### 문제 설명

<p>Oobleck is a fascinating magical substance --- leave it in sunlight and it grows in an ever-expanding circle. &nbsp;If two circles ever manage to touch each other, both circles magically merge into one combined circle with area equal to the total of the combined areas of both circles and center at the midpoint of the centers of the two intersecting circles. &nbsp;The expansion rate of this new circle is the maximum rate of both colliding circles. &nbsp;An example of this is shown in Figures F.1 and F.2.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/2aa735fc-b120-4161-b875-788478e95b19/-/preview/" style="width: 169px; height: 105px;" /></p>

<p style="text-align: center;">Figure F.1:&nbsp;Circle A has center $(10,10)$, radius $6$ and area $36\pi$; circle B has center $(24,10)$, radius $8$ and area $64\pi$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/90315679-6b2d-4d5e-9ee8-72a036680575/-/preview/" style="width: 167px; height: 112px;" /></p>

<p style="text-align: center;">Figure F.2: After they merge, they are replaced by circle C with center $(17,10)$, radius $10$ and area $100\pi$.</p>

<p>After a new circle is created it may intersect other existing circles, causing a chain reaction of merges. &nbsp;This combination of an intersection followed by one or more merges is technically known as an <em>ooblection</em>. &nbsp;Ooblections occur instantaneously at the moment of the initial intersection even though they may contain a cascade of merges. &nbsp;If three or more circles are involved in a merge &nbsp;the resulting circle has its center at the average of the centers of all of the circles involved and the resulting area is the sum of all the areas of the circles involved. &nbsp;The expansion rate of the final circle after an ooblection is the maximum rate of any circle involved.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/0ce93904-4a00-4f55-8e16-6e60c01448bd/-/preview/" style="width: 462px; height: 147px;" /></p>

<p style="text-align: center;">Figure F.3: A five-circle ooblection.</p>

<p>An example of a five-circle ooblection is shown in Figure F.3 (described in Sample Input $2$). &nbsp;At time $t=1$ the circles have expanded to the point shown in Figure F.3a. &nbsp;At that time circles A and B merge to form circle F (Figure F.3b). &nbsp;Circle F intersects circles C and D, merging to form circle G (Figure F.3c). Finally circle G intersects circle E resulting in the final circle H (Figure F.3d). &nbsp;All of this takes place at time $t=1$. &nbsp;Circle H has an expansion rate equal to the maximum expansion rate of circles A through E (using the values in Sample Input 2 this maximum growth speed is 2).</p>

<p>Eventually as any set of circles grow, they will eventually ooblect into a single circle. &nbsp;Your task is to find the position and area of that circle the moment it is created.</p>

### 입력

<p>The input sequence begins with a positive integer $n$ ($n \leq 100$), the number of circles. There then follows $n$ lines, one for each circle. &nbsp;Each line consists of $4$ numbers: $x$ $y$ $r$ and $s$: &nbsp;$x$ and $y$ ($-10^9 \leq x,y \leq 10^9$) specifies the location of the radius of the circle; &nbsp;$r$ ($1 \leq r \leq 10^6$) is the initial radius of the circle; &nbsp;$s$ ($1 \leq s \leq 10^6$) is the expansion rate of the circle. No two circles listed in the input are touching. At most one ooblection begins at any given moment in time, and each ooblection starts with the touching of exactly two circles.</p>

### 출력

<p>Output two lines. &nbsp;The first line will contain two numbers $x$ $y$, the location of the center of the final circle at the moment it is created. &nbsp;The second line will contain the radius of that circle. &nbsp;Your answers should be accurate to a relative or absolute error of $10^{-6}$.</p>