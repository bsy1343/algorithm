# [Gold IV] Ropeway - 22575

[문제 링크](https://www.acmicpc.net/problem/22575)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

수학, 재귀

### 문제 설명

<p>On a small island, there are two towns Darkside and Sunnyside, with steep mountains between them. There&rsquo;s a company Intertown Company of Package Conveyance; they own a ropeway car between Darkside and Sunnyside and are running a transportation business. They want maximize the revenue by loading as much package as possible on the ropeway car.</p>

<p>The ropeway car looks like the following. It&rsquo;s&nbsp;<i>L</i>&nbsp;length long, and the center of it is hung from the rope. Let&rsquo;s suppose the car to be a 1-dimensional line segment, and a package to be a point lying on the line. You can put packages at anywhere including the edge of the car, as long as the distance between the package and the center of the car is greater than or equal to R and the car doesn&rsquo;t fall down.</p>

<p>The car will fall down when the following condition holds:</p>

<p>$$\left|\sum_{i=0}^{N-1}{m_ix_i}\right| &gt; M\text{.}$$</p>

<p>Here&nbsp;<i>N</i>&nbsp;is the number of packages;&nbsp;<i>m<sub>i</sub></i>&nbsp;the weight of the&nbsp;<i>i</i>-th package;&nbsp;<i>x<sub>i</sub></i>&nbsp;is the position of the&nbsp;<i>i</i>-th package relative to the center of the car.</p>

<p>You, a Darkside programmer, are hired as an engineer of the company. Your task is to write a program which reads a list of package and checks if all the packages can be loaded in the listed order without the car falling down at any point.</p>

### 입력

<p>The input has two lines, describing one test case. The first line contains four integers&nbsp;<i>N</i>,&nbsp;<i>L</i>,&nbsp;<i>M</i>,&nbsp;<i>R</i>. The second line contains&nbsp;<i>N</i>&nbsp;integers&nbsp;<i>m</i><sub>0</sub>,&nbsp;<i>m</i><sub>1</sub>, ...&nbsp;<i>m</i><sub><i>N</i>-1</sub>. The integers are separated by a space.</p>

### 출력

<p>If there is a way to load all the packages, output &ldquo;Yes&rdquo; in one line, without the quotes. Otherwise, output &ldquo;No&rdquo;.</p>