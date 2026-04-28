# [Platinum IV] Rainfall - 11484

[문제 링크](https://www.acmicpc.net/problem/11484)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 9, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

수학, 브루트포스 알고리즘, 누적 합, 미적분학

### 문제 설명

<p>About to leave the university to go home, you notice dark clouds packed in the distance. Since you&rsquo;re travelling by bicycle, you&rsquo;re not looking forward to getting wet in the rain. Maybe if you race home quickly you might avert the rain. But then you&rsquo;d get wet from sweat. . .</p>

<p>Facing this dilemma, you decide to consider this problem properly with all data available. First you look up the rain radar image that shows you precisely the predicted intensity of rainfall in the upcoming hours. You know at what time you want to be home at the latest. Also, you came up with a good estimate of how much you sweat depending on your cycling speed. Now the question remains: what is the best strategy to get home as dry as possible?</p>

<p>The rain is given for each minute interval in millilitres, indicating how wet you get from cycling through this &mdash; note that you can cycle just a fraction of a whole minute interval at the start and end of your trip: then only that fraction of the rain during that interval affects you. Sweating makes you wet at a rate of s = c &middot; v<sup>2</sup> per minute where v is your speed in km/h and c is a positive constant you have determined. You have to cover the distance to your home in a given time (you don&rsquo;t want to wait forever for it to become dry), but otherwise you can choose your strategy of when to leave and how fast to cycle (and even change speeds) as you wish. What is the least wet you can get from the combination of rain and sweat?</p>

### 입력

<ul>
	<li>One line containing a single positive integer T (0 &lt; T &le; 10 000), the number of minutes from now you want to be home by at the latest.</li>
	<li>Another line with two positive floating point numbers: c (0.01 &le; c &le; 10), the constant determining your sweating and d (1 &le; d &le; 50) the distance from university to home in kilometres.</li>
	<li>T more lines, where each line contains an integer r<sub>i</sub> (0 &le; r<sub>i</sub> &le; 100) the number of millilitres of rain during the i-th minute interval (zero-based).</li>
</ul>

### 출력

<p>On a single line print a floating point number: the number of millilitres of rain and sweat you get wet from when optimally planning your cycle home. Your answer should be correct up to an absolute or relative precision of 10<sup>&minus;6</sup>.</p>