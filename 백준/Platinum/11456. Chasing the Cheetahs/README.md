# [Platinum V] Chasing the Cheetahs - 11456

[문제 링크](https://www.acmicpc.net/problem/11456)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 90, 정답: 17, 맞힌 사람: 11, 정답 비율: 25.000%

### 분류

임의 정밀도 / 큰 수 연산, 삼분 탐색

### 문제 설명

<p>A National Geographic film crew is visiting the ZOO this week. They are creating a documentary about animal speed and they would like to film one or more cheetahs running at full pace. A solitary running cheetah has been filmed successfully many times. Therefore, the crew is also after a much more spectacular feat: As many as possible cheetahs sprinting on parallel tracks filmed together in one shot.</p>

<p>&ldquo;No, that is impossible,&rdquo; said the director. &ldquo;We cannot squeeze those animals into some sort of a start box, as you probably imagine, and then open the box and make them run all at once. It is clearly too dangerous and unpredictable. No.&rdquo;</p>

<p>&ldquo;Then let us make more boxes and open some of them earlier and some of them later,&rdquo; said one of the filmmakers. &ldquo;Could that work?&rdquo;</p>

<p>&ldquo;And if we open the boxes with the slower cheetahs a bit earlier then after a while the faster ones will be overtaking the slower ones and that would be a great shot,&rdquo; pointed out another filmmaker. &ldquo;We would like to see the whole pack rather short with the last animals close the leading ones. As close as possible and at least for a moment.&rdquo;</p>

<p>It was a long and difficult discussion which ensued, but in the end the circumstances of the experiment were agreed upon.</p>

<p>You are given the start time and the speed of each cheetah. The length of the pack, which is defined as the distance between the first and the last cheetah in the pack, might be different at different moments. Find the minimum length of the pack during the run, where all cheetahs must be running. You may also suppose that the track is so long that the minimum length of the pack happens at least a moment before the first cheetah reaches the finish line.</p>

<p>All start boxes will be so close that you may consider them to be in the same place. The k-th cheetah will be released from its start box at the given time t<sub>k</sub>. at the same distance form the finish line. The k-th cheetah is expected to run the whole distance at constant speed v<sub>k</sub>.</p>

### 입력

<p>There are more test cases. Each case occupies more lines. The first line of a case contains the number of cheetahs N (1 &le; N &le; 100 000). Next, there are N lines, each line contains two integers t<sub>k</sub>, v<sub>k</sub> separated by spaces and representing the start time and velocity of the k-th cheetah (1 &le; k &le; N). All input values t<sub>k</sub> and r<sub>k</sub> are positive and less than 10<sup>5</sup>. The input is terminated by a line containing zero.</p>

### 출력

<p>For each test case, print a single line with one floating point number L specifying the minimum length of the running pack. Your answer should not differ from the correct answer by more than 10<sup>&minus;2</sup>. The length of the pack is the distance between the first and the last animal in the pack. The length can be measured at any time T &ge; max(t<sub>k</sub>, k = 1, ..., N). We suppose that each cheetah is running at a constant speed for all the time from the start and also at its moment of release from the start box.</p>