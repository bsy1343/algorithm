# [Gold II] Vector Field - 16806

[문제 링크](https://www.acmicpc.net/problem/16806)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 32, 정답: 21, 맞힌 사람: 20, 정답 비율: 71.429%

### 분류

자료 구조, 브루트포스 알고리즘, 집합과 맵, 트리를 사용한 집합과 맵, 값 / 좌표 압축

### 문제 설명

<p>In 20015, JAG (Jagan Acceleration Group) has succeeded in inventing a new accelerator named &ldquo;Force Point&rdquo; for an experiment of proton collision on the two-dimensional $xy$-plane. If a proton touches a Force Point, it is accelerated to twice its speed and its movement direction is veered. A proton may be veered by a Force Field in four ways: the positive or negative directions parallel to the $x$- or the $y$-axis. The direction in which a proton veers is determined by the type of the Force Point. A Force Point can accelerate a proton only once because the Force Point disappears immediately after the acceleration. Generating many Force Points on the two-dimensional plane, which is called a 2D Force Point Field, allows us to accelerate a proton up to a target speed by sequentially accelerating the proton with the Force Points in the 2D Force Point Filed.</p>

<p>The Force Point generation method is still under experiment and JAG has the following technical limitations:</p>

<ul>
	<li>JAG cannot generate a Force Point with a specified position and a type.</li>
	<li>JAG cannot generate a Force Point after putting a proton into a 2D Force Point Field.</li>
	<li>JAG cannot move Force Points.</li>
	<li>JAG cannot change a proton&#39;s direction except by the effect of Force Points.</li>
	<li>JAG can use only one proton for a 2D Force Point Field.</li>
	<li>JAG can put a proton moving in any direction with its speed 1 at any position in a 2D Force Point Field.</li>
</ul>

<p>In order to achieve the maximum speed of a proton, the engineers at JAG have to choose the optimal initial position and the optimal initial direction of the proton so that the proton is accelerated by as many Force Points as possible, after carefully observing the generated 2D Force Point Field.</p>

<p>By observing a generated 2D Force Point Field, the number of the generated Force Points is known to be $n$. The position ($x_i$, $y_i$) and the direction veering type $d_i$ of the $i$-th point are also known. Your task is to write a program to calculate the maximum speed of a proton by acceleration on a given 2D Force Point Field when JAG puts a proton optimally.</p>

### 입력

<p>The input consists of a single test case which describes a 2D Force Point Field in the following format.</p>

<pre class="mathjax">
$n$

$x_1$ $y_1$ $d_1$

...

$x_n$ $y_n$ $d_n$</pre>

<p>The first line contains one integer $n$ ($1\le n\le 3{,}000$) which is the number of the Force Points on the 2D Force Point Field. Each of the next $n$ lines contains two integers $x_i$ and $y_i$ ($|x_i|, |y_i| \le 10^9$) and one character $d_i$ ($d_i$ is one of &#39;&gt;&#39;, &#39;v&#39;, &#39;&lt;&#39; or &#39;^&#39;). $x_i$ and $y_i$ represent a coordinate of the $i$-th Force Point, and $d_i$ is the direction veering type of the $i$-th force point. A force point with a type &#39;&gt;&#39; changes proton&rsquo;s direction to the positive direction of the $x$-axis, &#39;v&#39; represents the positive direction of the $y$-axis, &#39;&lt;&#39; represents the negative direction of the $x$-axis, and &#39;^&#39; represents the negative direction of the $y$-axis. You can assume that any two Force Points are not generated on the same coordinates.</p>

### 출력

<p>Display a line containing the integer $\log_2 v_{\mathrm{max}}$, where $v_{\mathrm{max}}$ is the proton&#39;s possible fastest speed.</p>