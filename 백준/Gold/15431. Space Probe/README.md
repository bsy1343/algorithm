# [Gold I] Space Probe - 15431

[문제 링크](https://www.acmicpc.net/problem/15431)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 79, 정답: 27, 맞힌 사람: 22, 정답 비율: 47.826%

### 분류

정렬, 스위핑

### 문제 설명

<p>The space probe is out of control! It&rsquo;s going to start its measurement sequence sometime between two given times t<sub>1</sub> and t<sub>2</sub> (measured in seconds), but we don&rsquo;t know when. We do know that all possible start times t &isin; [t<sub>1</sub>, t<sub>2</sub>] are equally probable.</p>

<p>The measurement sequence is pre-programmed and cannot be changed. It consists of n successive measurements which have timings m<sub>1</sub>, m<sub>2</sub>, . . . , m<sub>n</sub> that are fixed. If t is the time that the probe starts the measurement sequence, the first measurement occurs at time t + m<sub>1</sub>, the second at time t + m<sub>2</sub>, and so on. The last measurement occurs at time t + m<sub>n</sub>.</p>

<p>The measurements are instantaneous events &mdash; each happens in a very short time, so we consider the duration of any measurement to be 0 seconds.</p>

<p>The probe is rotating in space and cannot be controlled. Due to its rotation, there are intervals of time when measurement devices are pointed at the Sun. If the probe were to use a measurement device while the device is pointed at the Sun, the device&rsquo;s sensors would be destroyed and the whole probe would be lost. We do know the trajectory and the rotation of the probe and therefore there is a set of k time intervals [b<sub>1</sub>, e<sub>1</sub>], [b<sub>2</sub>, e<sub>2</sub>], . . . , [b<sub>k</sub>, e<sub>k</sub>] during any of which no measurement may be made.</p>

<p>Find the probability that the probe makes all measurements successfully and is not lost due to solar radiation damage!</p>

<p>Note that in this problem, all known times and time interval lengths are expressed as integers. However, the time of the start of the measurement sequence is unknown and we suppose that it may be expressed as any real number in the interval [t<sub>1</sub>, t<sub>2</sub>].</p>

### 입력

<p>The first input line contains four integers n, k, t<sub>1</sub>, and t<sub>2</sub>. The value n represents the number of measurements, k represents the number of time intervals in which no measurement may be made, and t<sub>1</sub> and t<sub>2</sub> represent the time limits in which the measurement sequence can begin. The second input line contains n integers representing the sequence m<sub>1</sub>, m<sub>2</sub>, . . . , m<sub>n</sub> of pre-programmed time moments in which measurements are made after the measurement sequence has begun. The sequence m<sub>i</sub> is strictly increasing. Finally, there are k input lines which each have two integers b<sub>j</sub> and e<sub>j</sub> describing one time interval [b<sub>j</sub>, e<sub>j</sub>] in which no measurement may be made. It&rsquo;s guaranteed that b<sub>j</sub> &lt; e<sub>j</sub>, and the intervals do not overlap, i.e., e<sub>j&minus;1</sub> &lt; b<sub>j</sub> for all j &gt; 1.</p>

<p>We know that 1 &le; n &le; 10 000, 1 &le; k &le; 10 000, n &middot; k &le; 10<sup>7</sup> , and 0 &le; t<sub>1</sub> &lt; t<sub>2</sub> &le; 10<sup>16</sup>. All values m<sub>1</sub>, . . . , m<sub>n</sub> and b<sub>1</sub>, e<sub>1</sub>, . . . , b<sub>k</sub>, e<sub>k</sub> are non-negative and less than 10<sup>16</sup>. All values are separated by single spaces.</p>

### 출력

<p>Output the probability of the probe&rsquo;s survival, that is, the probability that no measurement will be made during any of the intervals in which the Sun could damage the sensors. Your answer must be within an absolute or relative error of 10<sup>&minus;6</sup> of the correct answer.</p>