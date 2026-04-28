# [Platinum I] Advise National Security! - 30136

[문제 링크](https://www.acmicpc.net/problem/30136)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 2, 맞힌 사람: 2, 정답 비율: 18.182%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>It&#39;s 2015. Terrorists are still largely on the prowl. Governments however have decided to be smarter. Now, they monitor each highway, airway and seaway. Across each road, they built several cameras which can capture images ahead of them.</p>

<p>More specifically, there are N uniformly spaced cameras per kilometer along a highway of length M kms, making in total M*N cameras (there is no camera at the end of the M kms). The highway is one-way and goes from North to South. The cameras have a special property: </p>

<ul>
	<li>They use direct vision to watch the next N (or less if the highway ends) cameras to their South thus covering 1 km.</li>
	<li>They communicate via satellite with all the cameras beyond the next N southern cameras thus knowing their video feed. </li>
	<li>They do not communicate with the next N southern cameras and only depend on their vision.</li>
</ul>

<p>A camera being destroyed by a terrorist will be caught by cameras to its north. Corrupt politicians have sold this secret to the terrorists and they know that they can&#39;t destroy a camera unless they are sure that this camera is no longer communicating or being watched by a camera to its North. There is one further complication: Corrupt technicians have not properly installed the direct vision equipment. Thus, some of the cameras are substandard and deficient. These cameras have perfectly good communication with far off cameras (i.e. after the first N cameras), but cannot see some of the next N cameras. However, the saving grace was that there were no more than 10 deficient cameras in any 1 km stretch (among any contiguous N cameras).</p>

<p>As Anti Corruption Task force, you, a non corrupt patriot have to submit a security report. For that, you need to solve the following problem: If exactly two terrorists decide to destroy all the cameras on the highway without being caught, how long would it take them? Each terrorist can destroy one camera in one FULL minute. They can work simultaneously. Of course, they cannot destroy two cameras A and B at the same time if A can watch B or B can watch A.</p>

<p>The cameras are numbered 1 to M*N North to South.</p>

<p>Note that C<sub>i</sub> cannot watch or get the video feed of C<sub>j</sub> if i &gt; j where C<sub>i</sub> is the camera numbered i. </p>

### 입력

<p>Input will be a sequence of cases. Each case starts with M and N on a single line (1 &le; M &le; 15 ,1 &le; N &le; 20). M*N - 1 lines follow. The Cth line describes camera number C. It starts with a number k. If k = -1 camera C is not deficient and there are no more numbers on this line. Otherwise, k numbers, a<sub>j</sub> (1 &le; j &le; k) (C+1 &le; a<sub>j</sub> &le; C+N and a<sub>j</sub> &le; M*N) follow on the same line meaning that camera C can watch camera aj. Note that camera C can always watch cameras C + N + 1 and later using satellite and will not be mentioned here. </p>

<p>The last case will be followed by a line containing two zeroes. </p>

### 출력

<p>Output one line per case, the minimum number of minutes required by two terrorists working in tandem to destroy all the cameras without being caught. </p>

### 힌트

<p>Camera i is referred to as C<sub>i</sub>. </p>

<p>There are a total of 6 cameras, 3 per km. </p>

<ul>
	<li>C<sub>1</sub> can watch C<sub>4</sub> and later but not C<sub>2</sub> or C<sub>3</sub></li>
	<li>C<sub>2</sub> can watch C<sub>4</sub> and later, but not C<sub>3</sub> </li>
	<li>C<sub>3</sub> can watch C<sub>4</sub> and C<sub>5</sub> but not C<sub>6</sub></li>
	<li>C<sub>4</sub> can watch C<sub>6</sub> but not C<sub>5</sub></li>
	<li>C<sub>5</sub> can watch C<sub>6</sub></li>
	<li>C<sub>6</sub> cannot watching anything. </li>
	<li>T = 1: Destroy C<sub>1</sub> and C<sub>2</sub></li>
	<li>T = 2: Destroy C<sub>3</sub> </li>
	<li>T = 3: Destroy C<sub>4</sub> and C<sub>5</sub></li>
	<li>T = 4: Destroy C<sub>6</sub></li>
</ul>