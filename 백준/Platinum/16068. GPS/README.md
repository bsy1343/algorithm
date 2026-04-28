# [Platinum II] GPS - 16068

[문제 링크](https://www.acmicpc.net/problem/16068)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 35, 정답: 23, 맞힌 사람: 19, 정답 비율: 73.077%

### 분류

기하학, 3차원 기하학

### 문제 설명

<p>You, like so many other people, have probably used the Global Positioning Systems (GPS), but have wondered how it actually works. GPS positioning is based on a set of satellites orbiting Earth. All satellites have a synchronized internal clock<sup>1</sup>. They continuously transmit the value of their internal clock to the surface of Earth via radio waves. A GPS receiver simultaneously<sup>2</sup> collects measurements from some satellites which are in sight. The time measurements t<sub>1</sub>, . . . , t<sub>m</sub> collected at time t are typically different, as each satellite has a different distance to the receiver. Since we know the exact orbits of all satellites, we know exactly where each satellite was when it sent its signal. Based on these positions and the distance, we can compute our position. To compute a unique position, assuming that we are on the surface of the Earth, we need at least 3 measurements from satellites.</p>

<p>Your task, however, is not to actually compute your own position, but to determine which signals you received from which satellites. To be precise: you are given your geographical coordinates on Earth and a description of all orbits of satellites and should now determine for every satellite</p>

<ul>
	<li>whether a signal sent from the satellite at a certain time will reach you (which is the case if it does not pass through the Earth).</li>
	<li>if the signal does reach you, the time it took for the signal to travel from the satellite to your position.</li>
</ul>

<p>Remember that radio waves travel in straight lines and at the speed of light, which we assume is 299 792 458 meters per second. We assume Earth to be a perfect sphere with a radius of 6 371km, and that all GPS satellites are orbiting the Earth with a fixed speed on perfect circles whose centers are identical to the center of Earth.</p>

<p><sup>1</sup>In practice the clocks are not completely synchronous &ndash; because of general relativity. In this problem we assume that these effects do not exist.</p>

<p><sup>2</sup>Another simplification.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with an integer s (1 &le; s &le; 10<sup>4</sup>), the number of satellites;</li>
	<li>one line with two real numbers ℓ<sub>o</sub>, ℓ<sub>a</sub>, the longitude and latitude of your position;</li>
	<li>s lines, each with four real numbers &phi;, &psi;, r, x describing one of the satellites.</li>
</ul>

<p>For the longitude ℓ<sub>o</sub> &isin; [&minus;180, 180], positive values represent east and negative values west. For the latitude ℓ<sub>a</sub> &isin; [&minus;90, 90], positive values represent north and negative values south.</p>

<p>The format for the satellite descriptions is as follows:</p>

<ul>
	<li>&phi; &isin; [&minus;180, 180] &ndash; the reference longitude at which the orbit intersects with the Earth&rsquo;s equator (each orbit intersects the equator (at least) twice). Positive longitude represents east, negative longitude represents west.</li>
	<li>&psi; &isin; [0, 360] &ndash; the angle between orbit and the Earth&rsquo;s eastbound equator when passing through the equator at longitude &phi;. Values between 0 and 180 indicate northbound movement while values between 180 and 360 indicate southbound movement. If the orbit is coplanar to the equator, the angle &psi; will be 0 or 180.</li>
	<li>r &isin; [7 000, 10<sup>6</sup>] &ndash; the radius of the satellite&rsquo;s orbit in kilometers.</li>
	<li>x &isin; [0, 1) &ndash; the fraction of the orbit the satellite had covered at the time when its signal was sent, starting from its intersection with the equator at &phi;.</li>
</ul>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b65504f8-a674-487b-9586-8d23e3baafe4/-/preview/" style="width: 317px; height: 470px;" /></p>

<p>Figure G.1: Schematic display of satellite coordinates. The satellite&rsquo;s orbit is shown in red, its actual position is the red dot. On Earth, the equator and the prime meridian are marked by lines. The dotted line is coplanar to the equator and has the same radius as the satellite&rsquo;s orbit. The angles &phi; and &psi; are described in the input section. The black dot is your position on Earth and you should compute the time necessary for the signal to travel the blue line.</p>

<p>Note: All real numbers in the input are given with at most 3 decimal places after the decimal point. It is guaranteed that each satellite has a distance of at least 1 meter from the tangent plane at your position (this means that you can safely use floating point arithmetic in your solution).</p>

### 출력

<p>For every satellite, output no signal if a signal sent from that satellite does not reach you. If the satellite&rsquo;s signal does reach you, output the time that the signal needs to travel from the satellite to your position, in seconds. The time must be accurate up to a relative or absolute error (whichever is lower) of 10<sup>&minus;7</sup>.</p>