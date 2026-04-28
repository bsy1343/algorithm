# [Gold IV] Floppy Music - 11272

[문제 링크](https://www.acmicpc.net/problem/11272)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 74, 정답: 29, 맞힌 사람: 27, 정답 비율: 57.447%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Your friend&rsquo;s newest hobby is to play movie theme songs on her freshly acquired floppy drive organ. This organ is a collection of good old floppy drives, where each drive has been tampered with to produce sound of a unique frequency. The sound is produced by a step motor that moves the read/write head of the floppy drive along the radial axis of the drive&rsquo;s spin disk. The radial axis starts in the center of the spin disk and ends at the outer edge of the spin disk.</p>

<p>The sound from one drive will play continuously as long as the read/write head keeps moving in one direction; when the head changes direction, there is a brief pause of 1fs&mdash;one floppysecond, or about 100 microseconds. The read/write head must change direction when it reaches either the inner or the outer end point of the radial axis, but it can also change direction at any other point along this axis, as determined by your friend. You can make the head stay still at any time and for as long as you wish. The starting position of the read-write head can be chosen freely.</p>

<p>Your friend is a nutcase perfectionist, and will not accept any pauses where there are not supposed to be any; nor will she accept sound when there is meant to be silence. To figure out whether a given piece of music can be played&mdash;perfectly&mdash;on her organ, she has asked for your help.</p>

<p>For each frequency, you are given a list of intervals, each describing when that particular frequency should play, and you must decide if all of the frequencies can be played as intended. You can assume your friend has enough drives to cover all the required frequencies.</p>

### 입력

<p>The first line contains an integer f, 1 &le; f &le; 10, denoting the number of frequencies used. Then follow f blocks, on the format:</p>

<ul>
	<li>A single line with two integers t<sub>i</sub>, 1 &le; t<sub>i</sub> &le; 10 000 and n<sub>i</sub>, 1 &le; n<sub>i</sub> &le; 100; the number of floppyseconds it takes for the read/write head of frequency i to move between the end points of its radial axis, and the number of intervals for which frequency i should play.</li>
	<li>n<sub>i</sub> lines, where the j-th line has two integers t<sub>i,2j</sub>, t<sub>i,2j+1</sub>, where 0 &le; t<sub>i,2j</sub>, t<sub>i,2j+1</sub> &le; 1 000 000, indicating that the i-th frequency should start playing at time t<sub>i,2j</sub> and stop playing at time t<sub>i,2j+1</sub>. You can assume that these numbers are in stricly ascending order, i.e. t<sub>i,1</sub> &lt; t<sub>i,2</sub> &lt; &middot; &middot; &middot; &lt; t<sub>i,2n<sub>i</sub></sub>.</li>
</ul>

### 출력

<p>If it is possible to play all the f frequencies as intended, output &ldquo;<code>possible</code>&rdquo;. Otherwise output &ldquo;<code>impossible</code>&rdquo;.</p>