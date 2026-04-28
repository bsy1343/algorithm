# [Platinum III] Paragliders and Aircraft - 25836

[문제 링크](https://www.acmicpc.net/problem/25836)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 1, 맞힌 사람: 1, 정답 비율: 12.500%

### 분류

구현, 기하학, 3차원 기하학

### 문제 설명

<p>A friend of yours is a paraglider pilot who flies at Tiger Mountain outside of Seattle, WA. The site is popular and, unfortunately, also in the landing approach patterns of some flights heading to Sea-Tac airport or Boeing field. This could obviously lead to dangerous situations involving highflying paragliders and low-flying jets. Your friend, knowing you&#39;re a code guru, has asked for your help in developing an early warning system to let paraglider pilots know when jet traffic might intrude upon their airspace.</p>

<p>You&#39;ve researched and found a web API that can give you real-time flight data on nearby air traffic, and another that lets you send text messages to the pilots. Now all you have to do is to figure out which flights could cause a problem.</p>

<p>Treat the airspace as a 3D coordinate space measured in feet. (This is reasonable because, for small distances, you can interpret latitude and longitude as coordinates on a plane.) You can assume the paragliders will stay in a 3D cylinder with a center, a radius, and lower and upper altitude bounds. Flight data will contain each aircraft&#39;s position, altitude, heading, velocity, and descent rate. Heading is in degrees where 0 degrees is along the positive x axis and 90 degrees is along the positive y axis. Airspeed is in feet per second, along vector s in the diagram; descent is along vector d.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25836.%E2%80%85Paragliders%E2%80%85and%E2%80%85Aircraft/ac1184bd.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25836.%E2%80%85Paragliders%E2%80%85and%E2%80%85Aircraft/ac1184bd.png" data-original-src="https://upload.acmicpc.net/cf35b5a2-db4d-4da9-8698-c5f1712df998/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 470px; height: 231px;" /></p>

<p>If an aircraft&#39;s flight path will intersect the bounded cylinder, compute the entry and exit time in seconds from the current time, and output a message with those times. Otherwise, output a message to ignore the aircraft.</p>

### 입력

<p>The first input line describes the airspace; it contains five floating point numbers: the (x<sub>c</sub>, y<sub>c</sub>) coordinates of the center of the cylinder in feet (-50,000 &le; x<sub>c</sub>, y<sub>c</sub> &le; 50,000), the radius (r) of the cylinder in feet (1 &le; r &le; 10,000), and the lower (l) and upper (u) bounds of the cylinder in feet (0 &le; l &lt; u &le; 10,000).</p>

<p>The second input line contains a single integer, n (1 &le; n &le; 100), indicating the number of aircraft to process.</p>

<p>The next n input lines describe the incoming aircraft. Each line provides data about an aircraft and contains seven numbers: an integer flight number f (1,000 &le; f &le; 9,999), the (xa, ya) position of the aircraft (-200,000 &le; x<sub>a</sub>, y<sub>a</sub> &le; 200,000), the heading (h) of the aircraft in degrees (0 &le; h &lt; 360), the altitude (a) in feet (1,000 &le; a &le; 35,000), the speed (s) in feet per second (100 &le; s &le;10,000), and the descent rate (d) in feet per second (0 &le; d &le; s). All inputs for the incoming aircraft, other than the flight number, are given in floating point.</p>

<p>Assume that the aircraft will never start inside the cylinder. Also assume that, if an aircraft enters the paragliders&#39; cylinder, it will be within the cylinder at multiple points.</p>

### 출력

<p>If the aircraft will not enter the cylinder, print the message:</p>

<pre>
Flight f is safe.</pre>

<p>where <code>f</code> is the flight number.</p>

<p>If the aircraft will intersect the cylinder, print the message:</p>

<pre>
Incoming! Flight f enters at t<sub>0</sub> and exits at t<sub>1</sub>.</pre>

<p>where <code>f</code> is the flight number, <code>t<sub>0</sub></code> is the time in seconds when the aircraft will enter the cylinder, and <code>t<sub>1</sub></code> is the time in seconds when the aircraft will exit the cylinder. Print the times rounded to two decimal places (i.e., the time 0.274 would be printed as 0.27; the time 0.275 would be printed as 0.28). If the aircraft grazes the cylinder (with an error of 10<sup>-6</sup>), it is considered to have entered and exited.</p>