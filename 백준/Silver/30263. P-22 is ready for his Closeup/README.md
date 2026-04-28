# [Silver IV] P-22 is ready for his Closeup - 30263

[문제 링크](https://www.acmicpc.net/problem/30263)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 32, 정답: 26, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

구현, 자료 구조, 집합과 맵

### 문제 설명

<p>P-22 rose to national fame when Steve Winter published a photo of P-22 in front of the Hollywood Sign in National Geographic. To do so, Winter spent 15 months placing motion-activated cameras in the park, trying to understand P-22&rsquo;s movements. After all, Griffith Park is pretty big, so going to a random spot at a random time was unlikely to result in meeting P-22 &mdash; but if you repeat a random attempt often enough, there&rsquo;s a decent chance you&rsquo;ll succeed at least once. Here, you will be given a list of where Winter set up his camera at various times, and where P-22 was at various times, and you are to find out what was the most glamorous shot of P-22 that Winter captured.</p>

### 입력

<p>The first line is the number 1 &le; K &le; 100 of input data sets, followed by K data sets, each of the following form:</p>

<p>The first line contains three integers 1 &le; L &le; 1000, 0 &le; n, m &le; 500000. L is the number of locations which Winter considered, n is the number of times he set up a camera, and m is the number of recorded positions for P-22.</p>

<p>Next is a line with L integers g<sub>ℓ</sub> &gt; 0, where g<sub>ℓ</sub> is the glamour of getting a shot in location i. Next, there are n lines, each describing a (integer) time t<sub>i</sub> &gt; 0 and location ℓ<sub>i</sub> &isin; {1, . . . , L} for a camera setup. There may be multiple camera setups at the same time. Finally, there are m lines, each describing the (integer) time t<sub>j</sub> &gt; 0 and location ℓ<sub>j</sub> &isin; {1, . . . , L} where P-22 was known to have been. Here, obviously, there will not be two sightings at the same time. All input numbers will comfortably fit in a 32-bit integer.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the maximum glamour of any possible shot. A shot is possible if P-22 was in a location ℓ at the same time as a camera was set up there &mdash; in that case, the shot produced has glamour g<sub>ℓ</sub>. If P-22 was never in a spot where there was a camera, then the maximum glamour is 0.</p>

<p>Each data set should be followed by a blank line.</p>