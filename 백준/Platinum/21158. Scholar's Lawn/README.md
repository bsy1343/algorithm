# [Platinum III] Scholar's Lawn - 21158

[문제 링크](https://www.acmicpc.net/problem/21158)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 69, 정답: 9, 맞힌 사람: 8, 정답 비율: 12.698%

### 분류

데이크스트라, 기하학, 그래프 이론, 선분 교차 판정, 정렬, 최단 경로

### 문제 설명

<p>Famously at Cambridge, and often copied at other schools, is the tradition of the &quot;Scholar&#39;s Lawn&quot; -- an area of grass where Fellows of the school, or other distinguished entities, can walk, but regular students cannot.</p>

<p>So, if a student spies a Fellow walking across campus, and wishes to ambush $\ldots$, er, meet up with them, the student is restricted to walking along a set of narrow paved walkways laid out in various places within the grassy areas, hoping to reach the Fellow&#39;s path at the same time or before the Fellow arrives. At the end of the Fellow&#39;s path is the Sacred Grove of Academe, off-limits to students, so if the Fellow reaches it before the student, the student is out of luck.</p>

<p>For instance, Figure 1 shows an area of lawn together with the fixed set of paved walkways (solid lines) and the path taken by a Fellow of the university (dotted line); $F$ and $S$ denote the initial positions of the Fellow and student, respectively. If both travel at the same speed (say, one meter per second), then after $17.67767$ seconds the Fellow will find the student waiting to have a chat at location $(22.5,12.5)$ (marked by the small open circle &quot;$\large\circ$&quot;).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/21158.%E2%80%85Scholar's%E2%80%85Lawn/3766f265.png" data-original-src="https://upload.acmicpc.net/5b6ae0f0-bd58-4e7a-b042-6eafe1da61ba/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 352px;" /></p>

<p style="text-align: center;">Figure 1:&nbsp;Sample Input 1</p>

### 입력

<p>Input begins with an integer $n$, $1 \le n \le 500$, the number of straight-line walkways. There will then follow $n$ lines, each with $4$ integers, denoting the $(x,y)$ coordinates of the endpoints of each walkway. After that is a line containing three real values $x_s$, $y_s$, $v_s$, where $(x_s,y_s)$ is the position of the student and $v_s$, $0 &lt; v_s \leq 1\,000$, is the student&#39;s walking speed. The point $(x_s,y_s)$ is guaranteed to lie on one of the $n$ paved walkways. The final line contains $5$ numbers. The first $4$ numbers are real numbers $x_{1f}$, $y_{1f}$, $x_{2f}$, $y_{2f}$, $-10\,000 \le x_{1f}, y_{1f},x_{2f},y_{2f} \le 10\,000$, giving the starting position $(x_{1f}, y_{1f})$ of the Fellow and the ending position $(x_{2f}, y_{2f})$ of the Fellow (the last point where the student can reach the Fellow). The final number is a real value $v_f$, $0 &lt; v_f \leq 1\,000$, giving the Fellow&#39;s walking speed. All real-valued inputs will have at most four digits after the decimal point.</p>

<p>The Fellow always walks in a straight line. &nbsp;The student can walk only along walkways, which are assumed to have zero width. If a walkway intersects with another walkway or the Fellow&#39;s path, it will do so at a single point. Collinear walkways never intersect one another; similarly, if the Fellow&#39;s path and a walkway are collinear, they will not intersect.</p>

### 출력

<p>Output the earliest time $t$ when the student&#39;s position and the Fellow&#39;s position can coincide at an intersection of a walkway and the Fellow&#39;s path. If this is impossible, output the word &quot;<code>Impossible</code>&quot;. Numeric answers should be accurate to within an absolute or relative error of $10^{-6}$.</p>