# [Platinum IV] Space Golf - 10333

[문제 링크](https://www.acmicpc.net/problem/10333)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 80, 정답: 40, 맞힌 사람: 37, 정답 비율: 59.677%

### 분류

미적분학, 기하학, 수학

### 문제 설명

<p>You surely have never heard of this new planet surface exploration scheme, as it is being carried out in a project with utmost secrecy. The scheme is expected to cut costs of conventional rover-type mobile explorers considerably, using projected-type equipment nicknamed &ldquo;observation bullets&rdquo;.</p>

<p>Bullets do not have any active mobile abilities of their own, which is the main reason of their cost-efficiency. Each of the bullets, after being shot out on a launcher given its initial velocity, makes a parabolic trajectory until it touches down. It bounces on the surface and makes another parabolic trajectory. This will be repeated virtually infinitely.</p>

<p>We want each of the bullets to bounce precisely at the respective spot of interest on the planet surface, adjusting its initial velocity. A variety of sensors in the bullet can gather valuable data at this instant of bounce, and send them to the observation base. Although this may sound like a conventional target shooting practice, there are several issues that make the problem more difficult.</p>

<ul>
	<li>There may be some obstacles between the launcher and the target spot. The obstacles stand upright and are very thin that we can ignore their widths. Once the bullet touches any of the obstacles, we cannot be sure of its trajectory thereafter. So we have to plan launches to avoid these obstacles.</li>
	<li>Launching the bullet almost vertically in a speed high enough, we can easily make it hit the target without touching any of the obstacles, but giving a high initial speed is energy-consuming. Energy is extremely precious in space exploration, and the initial speed of the bullet should be minimized. Making the bullet bounce a number of times may make the bullet reach the target with lower initial speed.</li>
	<li>The bullet should bounce, however, no more than a given number of times. Although the body of the bullet is made strong enough, some of the sensors inside may not stand repetitive shocks. The allowed numbers of bounces vary on the type of the observation bullets.</li>
</ul>

<p>You are summoned engineering assistance to this project to author a smart program that tells the minimum required initial speed of the bullet to accomplish the mission.</p>

<p>Figure D.1 gives a sketch of a situation, roughly corresponding to the situation of the Sample Input 4 given below.</p>

<p style="text-align:center"><img alt="" src="/upload/images2/spacegolf.png" style="height:306px; width:730px" /></p>

<p style="text-align:center">Figure D.1. A sample situation</p>

<p>You can assume the following.</p>

<ul>
	<li>The atmosphere of the planet is so thin that atmospheric resistance can be ignored.</li>
	<li>The planet is large enough so that its surface can be approximated to be a completely flat plane.</li>
	<li>The gravity acceleration can be approximated to be constant up to the highest points a bullet can reach.</li>
</ul>

<p>These mean that the bullets fly along a perfect parabolic trajectory.</p>

<p>You can also assume the following.</p>

<ul>
	<li>The surface of the planet and the bullets are made so hard that bounces can be approximated as elastic collisions. In other words, loss of kinetic energy on bounces can be ignored. As we can also ignore the atmospheric resistance, the velocity of a bullet immediately after a bounce is equal to the velocity immediately after its launch.</li>
	<li>The bullets are made compact enough to ignore their sizes.</li>
	<li>The launcher is also built compact enough to ignore its height.</li>
</ul>

<p>You, a programming genius, may not be an expert in physics. Let us review basics of rigid-body dynamics.</p>

<p>We will describe here the velocity of the bullet \(v\)&nbsp;with its horizontal and vertical components \(v_x\)&nbsp;and \(v_y\)&nbsp;(positive meaning upward). The initial velocity has the components \(v_{ix}\)&nbsp;and \(v_{iy}\), that is, immediately after the launch of the bullet, \(v_x\)&nbsp;= \(v_{ix}\)&nbsp;and \(v_y\)&nbsp;= \(v_{iy}\)&nbsp;hold. We denote the horizontal distance of the bullet from the launcher as \(x\) and its altitude as \(y\) at time \(t\).</p>

<ul>
	<li>The horizontal velocity component of the bullet is kept constant during its flight when atmospheric resistance is ignored. Thus the horizontal distance from the launcher is proportional to the time elapsed. \begin{equation} x = v_{ix}t \end{equation}</li>
	<li>The vertical velocity component \(v_y\) is gradually decelerated by the gravity. With the gravity acceleration of \(g\), the following differential equation holds during the flight. \begin{equation} \frac{dv_y}{dt} = -g \end{equation}&nbsp;Solving this with the initial conditions of \(v_y = v_{iy}\) and \(y = 0\) when \(t = 0\), we obtain the following.&nbsp;\begin{align} y &amp; = -\frac{1}{2} gt^2 + v_{iy}t \\ &amp; = -(\frac{1}{2}gt - v_{iy}) t \end{align} The equation (4) tells that the bullet reaches the ground again when \(t = 2v_{iy}/g\). Thus, the distance of the point of the bounce from the launcher is \(2v_{ix}v_{iy}/g\). In other words, to make the bullet fly the distance of \(l\), the two components of the initial velocity should satisfy \(2v_{ix}v_{iy} = lg\).</li>
	<li>Eliminating the parameter \(t\) from the simultaneous equations above, we obtain the following equation that describes the parabolic trajectory of the bullet. \begin{equation} y = -(\frac{g}{2v_{ix}^2})x^2 + (\frac{v_{iy}}{v_{ix}})x \end{equation}</li>
</ul>

<p>For ease of computation, a special unit system is used in this project, according to which the gravity acceleration \(g\) of the planet is exactly 1.0.</p>

### 입력

<p>The input consists of a single test case with the following format.</p>

<pre>
d n b
p<sub>1</sub> h<sub>1</sub>
p<sub>2</sub> h<sub>2</sub>
.
.
.
p<sub>n</sub> h<sub>n</sub></pre>

<p>The first line contains three integers, \(d\), \(n\), and \(b\). Here, \(d\) is the distance from the launcher to the target spot (\(1 \le d \le 10000\)), \(n\) is the number of obstacles (\(1 \le n \le 10\)), and \(b\) is the maximum number of bounces allowed, not including the bounce at the target spot (\(0 \le b \le 15\)).</p>

<p>Each of the following \(n\) lines has two integers. In the \(k\)-th line, \(p_k\) is the position of the \(k\)-th obstacle, its distance from the launcher, and \(h_k\) is its height from the ground level. You can assume that \(0 &lt; p_1, p_k &lt; p_{k+1}\) for \(k = 1, \dots , n-1\), and \(p_n &lt; d\). You can also assume that \(1 \le h_k \le 10000\) for \(k = 1, \dots ,n\).</p>

### 출력

<p>Output the smallest possible initial speed \(v_i\) that makes the bullet reach the target. The initial speed \(v_i\) of the bullet is defined as follows.</p>

<p>\[v_i = \sqrt{v_{ix}^{2} + v_{iy}^{2}}\]</p>

<p>The output should not contain an error greater than 0.0001.</p>