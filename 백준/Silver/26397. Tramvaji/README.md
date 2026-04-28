# [Silver III] Tramvaji - 26397

[문제 링크](https://www.acmicpc.net/problem/26397)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 31, 맞힌 사람: 26, 정답 비율: 86.667%

### 분류

구현, 누적 합

### 문제 설명

<p>One magical night Patrik and Josip were talking about the number 42 and the meaning of life. They were interrupted by the famous lady voice in the tram: The next stop is Jordanovac. Patrik and Josip were distracted by this common sentence and started discussing:</p>

<p>Patrik: It is a very short ride between Joranovac and Maksimir, isn&rsquo;t it?</p>

<p>Josip: It is, but the ride between Ma&scaron;ićeva and Kvatrić is way shorter.</p>

<p>Patrik: Really? I disagree.</p>

<p>Josip: I wonder, which is the shortest ride between all stations?</p>

<p>Paula, a big public traffic transport, was carefully listening to their conversation. The problem of finding the shortest ride interested her so much that she stayed in the tram longer than she intended just to listen to their conversation.</p>

<p>At each station (except for the first one, when they entered the tram) one of the following two things happened:</p>

<ul>
	<li>Patrik said: t minutes have passed since we entered the tram</li>
	<li>Josip said: From station y to this station t minutes have passed</li>
</ul>

<p>But before Paula could hear their conclusion about which ride was the shortest, they left the tram! Luckily, Paula remembers all their statements. Now she needs your help! Help her find the duration of the shortest ride and between which two stations the tram drove on that ride.</p>

### 입력

<p>The first line contains the integer n (2 &le; n &le; 1 000), the number of tram stations.</p>

<p>The i-th of the following n &minus; 1 lines contains the information about station i + 1 in one of the following formats:</p>

<ul>
	<li><code>Patrik</code> t<sub>i</sub> &ndash; Duration of the ride between station 1 and station i + 1 is t<sub>i</sub> (1 &le; t<sub>i</sub> &le; 10<sup>9</sup>)</li>
	<li><code>Josip</code> y<sub>i</sub> t<sub>i</sub> &ndash; Duration of the ride between station y and station i + 1 is t<sub>i</sub> (y<sub>i</sub> &lt; i + 1, 1 &le; t<sub>i</sub> &le; 10<sup>9</sup>)</li>
</ul>

<p>Every station will be in a distinct position.</p>

### 출력

<p>In one line output three numbers: t, x<sub>1</sub>, x<sub>2</sub>, the duration of the shortest ride and the indices of the starting and ending stations of that ride.</p>

<p>If multiple solutions exist, print the one with the smallest indices of the stations.</p>

### 힌트

<p>Clarification of the first example: The tram drove for 3 minutes from the first to the second station, and 5 from the first to the third. We can conclude that from the second to the third station it took 2 minutes, which is the shortest ride.</p>

<p>Clarification of the third example: The ride between the fourth and fifth station is also 2 minutes but, because they have greater indices, only the 2 3 4 solution is accepted.</p>